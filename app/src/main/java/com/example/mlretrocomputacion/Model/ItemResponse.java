package com.example.mlretrocomputacion.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemResponse {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("site_id")
    @Expose
    private String siteId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("seller")
    @Expose
    private Seller seller;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("prices")
    @Expose
    private Prices prices;
    @SerializedName("sale_price")
    @Expose
    private Object salePrice;
    @SerializedName("currency_id")
    @Expose
    private String currencyId;
    @SerializedName("available_quantity")
    @Expose
    private Integer availableQuantity;
    @SerializedName("sold_quantity")
    @Expose
    private Integer soldQuantity;
    @SerializedName("buying_mode")
    @Expose
    private String buyingMode;
    @SerializedName("listing_type_id")
    @Expose
    private String listingTypeId;
    @SerializedName("stop_time")
    @Expose
    private String stopTime;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("accepts_mercadopago")
    @Expose
    private Boolean acceptsMercadopago;
    @SerializedName("installments")
    @Expose
    private Installments installments;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("shipping")
    @Expose
    private Shipping shipping;
    @SerializedName("seller_address")
    @Expose
    private SellerAddress sellerAddress;
    @SerializedName("attributes")
    @Expose
    private List<Attribute> attributes = null;
    @SerializedName("original_price")
    @Expose
    private Object originalPrice;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("official_store_id")
    @Expose
    private Object officialStoreId;
    @SerializedName("domain_id")
    @Expose
    private String domainId;
    @SerializedName("catalog_product_id")
    @Expose
    private Object catalogProductId;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("order_backend")
    @Expose
    private Integer orderBackend;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Prices getPrices() {
        return prices;
    }

    public void setPrices(Prices prices) {
        this.prices = prices;
    }

    public Object getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Object salePrice) {
        this.salePrice = salePrice;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Integer getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(Integer soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public String getBuyingMode() {
        return buyingMode;
    }

    public void setBuyingMode(String buyingMode) {
        this.buyingMode = buyingMode;
    }

    public String getListingTypeId() {
        return listingTypeId;
    }

    public void setListingTypeId(String listingTypeId) {
        this.listingTypeId = listingTypeId;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Boolean getAcceptsMercadopago() {
        return acceptsMercadopago;
    }

    public void setAcceptsMercadopago(Boolean acceptsMercadopago) {
        this.acceptsMercadopago = acceptsMercadopago;
    }

    public Installments getInstallments() {
        return installments;
    }

    public void setInstallments(Installments installments) {
        this.installments = installments;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public SellerAddress getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(SellerAddress sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Object getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Object originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Object getOfficialStoreId() {
        return officialStoreId;
    }

    public void setOfficialStoreId(Object officialStoreId) {
        this.officialStoreId = officialStoreId;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public Object getCatalogProductId() {
        return catalogProductId;
    }

    public void setCatalogProductId(Object catalogProductId) {
        this.catalogProductId = catalogProductId;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Integer getOrderBackend() {
        return orderBackend;
    }

    public void setOrderBackend(Integer orderBackend) {
        this.orderBackend = orderBackend;
    }

    public class Address {

        @SerializedName("state_id")
        @Expose
        private String stateId;
        @SerializedName("state_name")
        @Expose
        private String stateName;
        @SerializedName("city_id")
        @Expose
        private String cityId;
        @SerializedName("city_name")
        @Expose
        private String cityName;

        public String getStateId() {
            return stateId;
        }

        public void setStateId(String stateId) {
            this.stateId = stateId;
        }

        public String getStateName() {
            return stateName;
        }

        public void setStateName(String stateName) {
            this.stateName = stateName;
        }

        public String getCityId() {
            return cityId;
        }

        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public String getCityName() {
            return cityName;
        }

        public void setCityName(String cityName) {
            this.cityName = cityName;
        }

    }

    public class Attribute {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("value_name")
        @Expose
        private Object valueName;
        @SerializedName("values")
        @Expose
        private List<Value> values = null;
        @SerializedName("value_id")
        @Expose
        private String valueId;
        @SerializedName("value_struct")
        @Expose
        private Object valueStruct;
        @SerializedName("attribute_group_id")
        @Expose
        private String attributeGroupId;
        @SerializedName("attribute_group_name")
        @Expose
        private String attributeGroupName;
        @SerializedName("source")
        @Expose
        private Integer source;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Object getValueName() {
            return valueName;
        }

        public void setValueName(Object valueName) {
            this.valueName = valueName;
        }

        public List<Value> getValues() {
            return values;
        }

        public void setValues(List<Value> values) {
            this.values = values;
        }

        public String getValueId() {
            return valueId;
        }

        public void setValueId(String valueId) {
            this.valueId = valueId;
        }

        public Object getValueStruct() {
            return valueStruct;
        }

        public void setValueStruct(Object valueStruct) {
            this.valueStruct = valueStruct;
        }

        public String getAttributeGroupId() {
            return attributeGroupId;
        }

        public void setAttributeGroupId(String attributeGroupId) {
            this.attributeGroupId = attributeGroupId;
        }

        public String getAttributeGroupName() {
            return attributeGroupName;
        }

        public void setAttributeGroupName(String attributeGroupName) {
            this.attributeGroupName = attributeGroupName;
        }

        public Integer getSource() {
            return source;
        }

        public void setSource(Integer source) {
            this.source = source;
        }

    }

    public class Cancellations {

        @SerializedName("rate")
        @Expose
        private Integer rate;
        @SerializedName("value")
        @Expose
        private Integer value;
        @SerializedName("period")
        @Expose
        private String period;

        public Integer getRate() {
            return rate;
        }

        public void setRate(Integer rate) {
            this.rate = rate;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getPeriod() {
            return period;
        }

        public void setPeriod(String period) {
            this.period = period;
        }

    }

    public class City {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public class Claims {

        @SerializedName("rate")
        @Expose
        private Integer rate;
        @SerializedName("value")
        @Expose
        private Integer value;
        @SerializedName("period")
        @Expose
        private String period;

        public Integer getRate() {
            return rate;
        }

        public void setRate(Integer rate) {
            this.rate = rate;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getPeriod() {
            return period;
        }

        public void setPeriod(String period) {
            this.period = period;
        }

    }

    public class Country {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public class DelayedHandlingTime {

        @SerializedName("rate")
        @Expose
        private Integer rate;
        @SerializedName("excluded")
        @Expose
        private Excluded excluded;
        @SerializedName("value")
        @Expose
        private Integer value;
        @SerializedName("period")
        @Expose
        private String period;

        public Integer getRate() {
            return rate;
        }

        public void setRate(Integer rate) {
            this.rate = rate;
        }

        public Excluded getExcluded() {
            return excluded;
        }

        public void setExcluded(Excluded excluded) {
            this.excluded = excluded;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public String getPeriod() {
            return period;
        }

        public void setPeriod(String period) {
            this.period = period;
        }

    }

    public class Eshop {

        @SerializedName("nick_name")
        @Expose
        private String nickName;
        @SerializedName("eshop_rubro")
        @Expose
        private Object eshopRubro;
        @SerializedName("eshop_id")
        @Expose
        private Integer eshopId;
        @SerializedName("eshop_locations")
        @Expose
        private List<Object> eshopLocations = null;
        @SerializedName("site_id")
        @Expose
        private String siteId;
        @SerializedName("eshop_logo_url")
        @Expose
        private String eshopLogoUrl;
        @SerializedName("eshop_status_id")
        @Expose
        private Integer eshopStatusId;
        @SerializedName("seller")
        @Expose
        private Integer seller;
        @SerializedName("eshop_experience")
        @Expose
        private Integer eshopExperience;

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public Object getEshopRubro() {
            return eshopRubro;
        }

        public void setEshopRubro(Object eshopRubro) {
            this.eshopRubro = eshopRubro;
        }

        public Integer getEshopId() {
            return eshopId;
        }

        public void setEshopId(Integer eshopId) {
            this.eshopId = eshopId;
        }

        public List<Object> getEshopLocations() {
            return eshopLocations;
        }

        public void setEshopLocations(List<Object> eshopLocations) {
            this.eshopLocations = eshopLocations;
        }

        public String getSiteId() {
            return siteId;
        }

        public void setSiteId(String siteId) {
            this.siteId = siteId;
        }

        public String getEshopLogoUrl() {
            return eshopLogoUrl;
        }

        public void setEshopLogoUrl(String eshopLogoUrl) {
            this.eshopLogoUrl = eshopLogoUrl;
        }

        public Integer getEshopStatusId() {
            return eshopStatusId;
        }

        public void setEshopStatusId(Integer eshopStatusId) {
            this.eshopStatusId = eshopStatusId;
        }

        public Integer getSeller() {
            return seller;
        }

        public void setSeller(Integer seller) {
            this.seller = seller;
        }

        public Integer getEshopExperience() {
            return eshopExperience;
        }

        public void setEshopExperience(Integer eshopExperience) {
            this.eshopExperience = eshopExperience;
        }

    }

    public class Excluded {

        @SerializedName("real_rate")
        @Expose
        private Double realRate;
        @SerializedName("real_value")
        @Expose
        private Integer realValue;

        public Double getRealRate() {
            return realRate;
        }

        public void setRealRate(Double realRate) {
            this.realRate = realRate;
        }

        public Integer getRealValue() {
            return realValue;
        }

        public void setRealValue(Integer realValue) {
            this.realValue = realValue;
        }

    }

    public class Installments {

        @SerializedName("quantity")
        @Expose
        private Integer quantity;
        @SerializedName("amount")
        @Expose
        private Double amount;
        @SerializedName("rate")
        @Expose
        private Double rate;
        @SerializedName("currency_id")
        @Expose
        private String currencyId;

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }

        public Double getAmount() {
            return amount;
        }

        public void setAmount(Double amount) {
            this.amount = amount;
        }

        public Double getRate() {
            return rate;
        }

        public void setRate(Double rate) {
            this.rate = rate;
        }

        public String getCurrencyId() {
            return currencyId;
        }

        public void setCurrencyId(String currencyId) {
            this.currencyId = currencyId;
        }

    }

    public class Metrics {

        @SerializedName("claims")
        @Expose
        private Claims claims;
        @SerializedName("delayed_handling_time")
        @Expose
        private DelayedHandlingTime delayedHandlingTime;
        @SerializedName("sales")
        @Expose
        private Sales sales;
        @SerializedName("cancellations")
        @Expose
        private Cancellations cancellations;

        public Claims getClaims() {
            return claims;
        }

        public void setClaims(Claims claims) {
            this.claims = claims;
        }

        public DelayedHandlingTime getDelayedHandlingTime() {
            return delayedHandlingTime;
        }

        public void setDelayedHandlingTime(DelayedHandlingTime delayedHandlingTime) {
            this.delayedHandlingTime = delayedHandlingTime;
        }

        public Sales getSales() {
            return sales;
        }

        public void setSales(Sales sales) {
            this.sales = sales;
        }

        public Cancellations getCancellations() {
            return cancellations;
        }

        public void setCancellations(Cancellations cancellations) {
            this.cancellations = cancellations;
        }

    }

    public class Prices {}

    public class Ratings {

        @SerializedName("negative")
        @Expose
        private Integer negative;
        @SerializedName("positive")
        @Expose
        private Double positive;
        @SerializedName("neutral")
        @Expose
        private Double neutral;

        public Integer getNegative() {
            return negative;
        }

        public void setNegative(Integer negative) {
            this.negative = negative;
        }

        public Double getPositive() {
            return positive;
        }

        public void setPositive(Double positive) {
            this.positive = positive;
        }

        public Double getNeutral() {
            return neutral;
        }

        public void setNeutral(Double neutral) {
            this.neutral = neutral;
        }

    }

    public class Sales {

        @SerializedName("period")
        @Expose
        private String period;
        @SerializedName("completed")
        @Expose
        private Integer completed;

        public String getPeriod() {
            return period;
        }

        public void setPeriod(String period) {
            this.period = period;
        }

        public Integer getCompleted() {
            return completed;
        }

        public void setCompleted(Integer completed) {
            this.completed = completed;
        }

    }

    public class Seller {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("permalink")
        @Expose
        private String permalink;
        @SerializedName("registration_date")
        @Expose
        private String registrationDate;
        @SerializedName("car_dealer")
        @Expose
        private Boolean carDealer;
        @SerializedName("real_estate_agency")
        @Expose
        private Boolean realEstateAgency;
        @SerializedName("tags")
        @Expose
        private List<String> tags = null;
        @SerializedName("eshop")
        @Expose
        private Eshop eshop;
        @SerializedName("seller_reputation")
        @Expose
        private SellerReputation sellerReputation;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getPermalink() {
            return permalink;
        }

        public void setPermalink(String permalink) {
            this.permalink = permalink;
        }

        public String getRegistrationDate() {
            return registrationDate;
        }

        public void setRegistrationDate(String registrationDate) {
            this.registrationDate = registrationDate;
        }

        public Boolean getCarDealer() {
            return carDealer;
        }

        public void setCarDealer(Boolean carDealer) {
            this.carDealer = carDealer;
        }

        public Boolean getRealEstateAgency() {
            return realEstateAgency;
        }

        public void setRealEstateAgency(Boolean realEstateAgency) {
            this.realEstateAgency = realEstateAgency;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public Eshop getEshop() {
            return eshop;
        }

        public void setEshop(Eshop eshop) {
            this.eshop = eshop;
        }

        public SellerReputation getSellerReputation() {
            return sellerReputation;
        }

        public void setSellerReputation(SellerReputation sellerReputation) {
            this.sellerReputation = sellerReputation;
        }

    }

    public class SellerAddress {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("comment")
        @Expose
        private String comment;
        @SerializedName("address_line")
        @Expose
        private String addressLine;
        @SerializedName("zip_code")
        @Expose
        private String zipCode;
        @SerializedName("country")
        @Expose
        private Country country;
        @SerializedName("state")
        @Expose
        private State state;
        @SerializedName("city")
        @Expose
        private City city;
        @SerializedName("latitude")
        @Expose
        private String latitude;
        @SerializedName("longitude")
        @Expose
        private String longitude;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getAddressLine() {
            return addressLine;
        }

        public void setAddressLine(String addressLine) {
            this.addressLine = addressLine;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public State getState() {
            return state;
        }

        public void setState(State state) {
            this.state = state;
        }

        public City getCity() {
            return city;
        }

        public void setCity(City city) {
            this.city = city;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

    }

    public class SellerReputation {

        @SerializedName("transactions")
        @Expose
        private Transactions transactions;
        @SerializedName("power_seller_status")
        @Expose
        private String powerSellerStatus;
        @SerializedName("metrics")
        @Expose
        private Metrics metrics;
        @SerializedName("level_id")
        @Expose
        private String levelId;

        public Transactions getTransactions() {
            return transactions;
        }

        public void setTransactions(Transactions transactions) {
            this.transactions = transactions;
        }

        public String getPowerSellerStatus() {
            return powerSellerStatus;
        }

        public void setPowerSellerStatus(String powerSellerStatus) {
            this.powerSellerStatus = powerSellerStatus;
        }

        public Metrics getMetrics() {
            return metrics;
        }

        public void setMetrics(Metrics metrics) {
            this.metrics = metrics;
        }

        public String getLevelId() {
            return levelId;
        }

        public void setLevelId(String levelId) {
            this.levelId = levelId;
        }

    }

    public class Shipping {

        @SerializedName("free_shipping")
        @Expose
        private Boolean freeShipping;
        @SerializedName("mode")
        @Expose
        private String mode;
        @SerializedName("tags")
        @Expose
        private List<String> tags = null;
        @SerializedName("logistic_type")
        @Expose
        private String logisticType;
        @SerializedName("store_pick_up")
        @Expose
        private Boolean storePickUp;

        public Boolean getFreeShipping() {
            return freeShipping;
        }

        public void setFreeShipping(Boolean freeShipping) {
            this.freeShipping = freeShipping;
        }

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public String getLogisticType() {
            return logisticType;
        }

        public void setLogisticType(String logisticType) {
            this.logisticType = logisticType;
        }

        public Boolean getStorePickUp() {
            return storePickUp;
        }

        public void setStorePickUp(Boolean storePickUp) {
            this.storePickUp = storePickUp;
        }

    }

    public class State {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public class Transactions {

        @SerializedName("total")
        @Expose
        private Integer total;
        @SerializedName("canceled")
        @Expose
        private Integer canceled;
        @SerializedName("period")
        @Expose
        private String period;
        @SerializedName("ratings")
        @Expose
        private Ratings ratings;
        @SerializedName("completed")
        @Expose
        private Integer completed;

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public Integer getCanceled() {
            return canceled;
        }

        public void setCanceled(Integer canceled) {
            this.canceled = canceled;
        }

        public String getPeriod() {
            return period;
        }

        public void setPeriod(String period) {
            this.period = period;
        }

        public Ratings getRatings() {
            return ratings;
        }

        public void setRatings(Ratings ratings) {
            this.ratings = ratings;
        }

        public Integer getCompleted() {
            return completed;
        }

        public void setCompleted(Integer completed) {
            this.completed = completed;
        }

    }

    public class Value {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private Object name;
        @SerializedName("struct")
        @Expose
        private Object struct;
        @SerializedName("source")
        @Expose
        private Integer source;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Object getName() {
            return name;
        }

        public void setName(Object name) {
            this.name = name;
        }

        public Object getStruct() {
            return struct;
        }

        public void setStruct(Object struct) {
            this.struct = struct;
        }

        public Integer getSource() {
            return source;
        }

        public void setSource(Integer source) {
            this.source = source;
        }

    }
}



