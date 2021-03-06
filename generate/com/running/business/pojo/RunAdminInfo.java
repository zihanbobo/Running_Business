package com.running.business.pojo;

public class RunAdminInfo {
    private Integer adminId;

    private String adminName;

    private String adminPhone;

    public RunAdminInfo(Integer adminId, String adminName, String adminPhone) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPhone = adminPhone;
    }

    public RunAdminInfo() {
        super();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }
}