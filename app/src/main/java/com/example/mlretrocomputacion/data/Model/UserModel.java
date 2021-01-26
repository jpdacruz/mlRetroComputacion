package com.example.mlretrocomputacion.data.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/*
model class to receive all the information about users
 */
public class UserModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("nickname")
    @Expose
    private String nickname;
    @SerializedName("registration_date")
    @Expose
    private String registrationDate;
    @SerializedName("country_id")
    @Expose
    private String countryId;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("user_type")
    @Expose
    private String userType;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("logo")
    @Expose
    private Object logo;
    @SerializedName("points")
    @Expose
    private Integer points;
    @SerializedName("site_id")
    @Expose
    private String siteId;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("seller_reputation")
    @Expose
    private SellerReputation sellerReputation;

    @SerializedName("status")
    @Expose
    private Status status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Object getLogo() {
        return logo;
    }

    public void setLogo(Object logo) {
        this.logo = logo;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public SellerReputation getSellerReputation() {
        return sellerReputation;
    }

    public void setSellerReputation(SellerReputation sellerReputation) {
        this.sellerReputation = sellerReputation;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public class Address {

        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("state")
        @Expose
        private String state;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }

    public class SellerReputation {

        @SerializedName("level_id")
        @Expose
        private String levelId;
        @SerializedName("power_seller_status")
        @Expose
        private String powerSellerStatus;
        @SerializedName("transactions")
        @Expose
        private Transactions transactions;

        public String getLevelId() {
            return levelId;
        }

        public void setLevelId(String levelId) {
            this.levelId = levelId;
        }

        public String getPowerSellerStatus() {
            return powerSellerStatus;
        }

        public void setPowerSellerStatus(String powerSellerStatus) {
            this.powerSellerStatus = powerSellerStatus;
        }

        public Transactions getTransactions() {
            return transactions;
        }

        public void setTransactions(Transactions transactions) {
            this.transactions = transactions;
        }
    }

    public class Status {

        @SerializedName("site_status")
        @Expose
        private String siteStatus;

        public String getSiteStatus() {
            return siteStatus;
        }

        public void setSiteStatus(String siteStatus) {
            this.siteStatus = siteStatus;
        }
    }

    public class Transactions {

        @SerializedName("canceled")
        @Expose
        private Integer canceled;
        @SerializedName("completed")
        @Expose
        private Integer completed;
        @SerializedName("period")
        @Expose
        private String period;
        @SerializedName("total")
        @Expose
        private Integer total;

        public Integer getCanceled() {
            return canceled;
        }

        public void setCanceled(Integer canceled) {
            this.canceled = canceled;
        }

        public Integer getCompleted() {
            return completed;
        }

        public void setCompleted(Integer completed) {
            this.completed = completed;
        }

        public String getPeriod() {
            return period;
        }

        public void setPeriod(String period) {
            this.period = period;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }
    }
}

