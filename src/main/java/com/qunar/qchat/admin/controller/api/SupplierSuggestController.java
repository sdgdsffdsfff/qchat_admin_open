package com.qunar.qchat.admin.controller.api;

import com.google.common.base.Strings;
import com.qunar.qchat.admin.model.SupplierSeatGroup;
import com.qunar.qchat.admin.service.ISupplierNewService;
import com.qunar.qchat.admin.util.AuthorityUtil;
import com.qunar.qchat.admin.vo.conf.JsonData;
import com.qunar.qtalk.ss.sift.service.ShopService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by yinmengwang on 17-5-27.
 */
@Slf4j
@Controller
@RequestMapping(value = "/api/supplier")
public class SupplierSuggestController {

    @Autowired
    private ISupplierNewService supplierNewService;

    @Autowired
    ShopService shopService;

    @RequestMapping(value = "/name/suggest.json")
    @ResponseBody
    public JsonData suggest(@RequestParam(value = "qunarName", required = false) String qunarName,
            @RequestParam(value = "query") String query, HttpServletRequest request) {
        if (Strings.isNullOrEmpty(query)) {
            return JsonData.error("参数错误");
        }
        if (Strings.isNullOrEmpty(qunarName)) {
            qunarName = AuthorityUtil.getThirdPartyUserName(request);
        }
        try {
            return supplierNewService.supplierSuggest(qunarName, query);
        } catch (Exception e) {
            log.error("跨域供应商name suggest出错,qunarName:{},query:{}", qunarName, query, e);
        }
        return JsonData.error("系统错误");
    }

    @RequestMapping(value = "/organization.json")
    @ResponseBody
    public JsonData organization(@RequestParam(value = "qunarName", required = false) String qunarName,
            @RequestParam(value = "id") long supplierId, HttpServletRequest request) {
        if (supplierId <= 0) {
            return JsonData.error("供应商id错误");
        }
        if (Strings.isNullOrEmpty(qunarName)) {
            qunarName = AuthorityUtil.getThirdPartyUserName(request);
        }
        try {
            return supplierNewService.queryOrganization(qunarName, supplierId);
        } catch (Exception e) {
            log.error("查询{}可转移的{}店铺的客服信息出错", qunarName, supplierId, e);
        }
        return JsonData.error("系统错误");
    }

    @RequestMapping(value = "/supplierConfig.json", method = RequestMethod.GET)
    @ResponseBody
    public JsonData supplierConfig() {
        List<SupplierSeatGroup> supplierSeatGroups = shopService.selectSupplierGroup();
        return JsonData.success(supplierSeatGroups);
    }
}
