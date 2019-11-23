package com.qunar.qtalk.ss.sift.entity;

import java.io.Serializable;
import java.math.BigInteger;


/**
 * @auth dongzd.zhang
 * @Date 2018/10/18 13:54
 */
public class HostUsers implements Serializable{

    private BigInteger id;
    private BigInteger hostId;
    private String userId;
    private String userName;
    private String department;
    private String tel;
    private String email;
    private String dep1;
    private String dep2;
    private String dep3;
    private String dep4;
    private String dep5;
    private String pinyin;
    private Integer frozenFlag;
    private Integer version;
    private String userType;
    private Integer hireFlag;
    private Integer gender;
    private String password;
    private Integer initialpwd;
    private String psDeptid;



    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getHostId() {
        return hostId;
    }

    public void setHostId(BigInteger hostId) {
        this.hostId = hostId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDep1() {
        return dep1;
    }

    public void setDep1(String dep1) {
        this.dep1 = dep1;
    }

    public String getDep2() {
        return dep2;
    }

    public void setDep2(String dep2) {
        this.dep2 = dep2;
    }

    public String getDep3() {
        return dep3;
    }

    public void setDep3(String dep3) {
        this.dep3 = dep3;
    }

    public String getDep4() {
        return dep4;
    }

    public void setDep4(String dep4) {
        this.dep4 = dep4;
    }

    public String getDep5() {
        return dep5;
    }

    public void setDep5(String dep5) {
        this.dep5 = dep5;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public Integer getFrozenFlag() {
        return frozenFlag;
    }

    public void setFrozenFlag(Integer frozenFlag) {
        this.frozenFlag = frozenFlag;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getHireFlag() {
        return hireFlag;
    }

    public void setHireFlag(Integer hireFlag) {
        this.hireFlag = hireFlag;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getInitialpwd() {
        return initialpwd;
    }

    public void setInitialpwd(Integer initialpwd) {
        this.initialpwd = initialpwd;
    }

    public String getPsDeptid() {
        return psDeptid;
    }

    public void setPsDeptid(String psDeptid) {
        this.psDeptid = psDeptid;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

}
