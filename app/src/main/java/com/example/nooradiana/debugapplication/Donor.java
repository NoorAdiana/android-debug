package com.example.nooradiana.debugapplication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Donor {
    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("donor_number")
    @Expose
    private String donorNumber;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("mobile")
    @Expose
    private String mobile;

    @SerializedName("address")
    @Expose
    private Object address;

    @SerializedName("rt")
    @Expose
    private Object rt;

    @SerializedName("rw")
    @Expose
    private Object rw;

    @SerializedName("sub_district")
    @Expose
    private Object subDistrict;

    @SerializedName("district")
    @Expose
    private Object district;

    @SerializedName("regency")
    @Expose
    private Object regency;

    @SerializedName("province")
    @Expose
    private Object province;

    @SerializedName("postal_code")
    @Expose
    private Object postalCode;

    @SerializedName("donor_type")
    @Expose
    private String donorType;

    @SerializedName("marketer_id")
    @Expose
    private Object marketerId;

    @SerializedName("branch_id")
    @Expose
    private Object branchId;

    @SerializedName("partner_id")
    @Expose
    private Object partnerId;

    @SerializedName("intranet_donor_id")
    @Expose
    private Object intranetDonorId;

    @SerializedName("nik")
    @Expose
    private String nik;

    @SerializedName("npwp_number")
    @Expose
    private String npwpNumber;

    @SerializedName("npwp_name")
    @Expose
    private String npwpName;

    @SerializedName("npwp_address")
    @Expose
    private String npwpAddress;

    @SerializedName("npwp_office")
    @Expose
    private String npwpOffice;

    @SerializedName("deleted_at")
    @Expose
    private Object deletedAt;

    @SerializedName("created_at")
    @Expose
    private String createdAt;

    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDonorNumber() {
        return donorNumber;
    }

    public void setDonorNumber(String donorNumber) {
        this.donorNumber = donorNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getRt() {
        return rt;
    }

    public void setRt(Object rt) {
        this.rt = rt;
    }

    public Object getRw() {
        return rw;
    }

    public void setRw(Object rw) {
        this.rw = rw;
    }

    public Object getSubDistrict() {
        return subDistrict;
    }

    public void setSubDistrict(Object subDistrict) {
        this.subDistrict = subDistrict;
    }

    public Object getDistrict() {
        return district;
    }

    public void setDistrict(Object district) {
        this.district = district;
    }

    public Object getRegency() {
        return regency;
    }

    public void setRegency(Object regency) {
        this.regency = regency;
    }

    public Object getProvince() {
        return province;
    }

    public void setProvince(Object province) {
        this.province = province;
    }

    public Object getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Object postalCode) {
        this.postalCode = postalCode;
    }

    public String getDonorType() {
        return donorType;
    }

    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }

    public Object getMarketerId() {
        return marketerId;
    }

    public void setMarketerId(Object marketerId) {
        this.marketerId = marketerId;
    }

    public Object getBranchId() {
        return branchId;
    }

    public void setBranchId(Object branchId) {
        this.branchId = branchId;
    }

    public Object getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(Object partnerId) {
        this.partnerId = partnerId;
    }

    public Object getIntranetDonorId() {
        return intranetDonorId;
    }

    public void setIntranetDonorId(Object intranetDonorId) {
        this.intranetDonorId = intranetDonorId;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNpwpNumber() {
        return npwpNumber;
    }

    public void setNpwpNumber(String npwpNumber) {
        this.npwpNumber = npwpNumber;
    }

    public String getNpwpName() {
        return npwpName;
    }

    public void setNpwpName(String npwpName) {
        this.npwpName = npwpName;
    }

    public String getNpwpAddress() {
        return npwpAddress;
    }

    public void setNpwpAddress(String npwpAddress) {
        this.npwpAddress = npwpAddress;
    }

    public String getNpwpOffice() {
        return npwpOffice;
    }

    public void setNpwpOffice(String npwpOffice) {
        this.npwpOffice = npwpOffice;
    }

    public Object getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Object deletedAt) {
        this.deletedAt = deletedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Donor{" +
                "id='" + id + '\'' +
                ", donorNumber='" + donorNumber + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address=" + address +
                ", rt=" + rt +
                ", rw=" + rw +
                ", subDistrict=" + subDistrict +
                ", district=" + district +
                ", regency=" + regency +
                ", province=" + province +
                ", postalCode=" + postalCode +
                ", donorType='" + donorType + '\'' +
                ", marketerId=" + marketerId +
                ", branchId=" + branchId +
                ", partnerId=" + partnerId +
                ", intranetDonorId=" + intranetDonorId +
                ", nik='" + nik + '\'' +
                ", npwpNumber='" + npwpNumber + '\'' +
                ", npwpName='" + npwpName + '\'' +
                ", npwpAddress='" + npwpAddress + '\'' +
                ", npwpOffice='" + npwpOffice + '\'' +
                ", deletedAt=" + deletedAt +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
