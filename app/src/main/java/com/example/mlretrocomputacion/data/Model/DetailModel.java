package com.example.mlretrocomputacion.data.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DetailModel {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("site_id")
    @Expose
    private String siteId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("subtitle")
    @Expose
    private Object subtitle;
    @SerializedName("seller_id")
    @Expose
    private Integer sellerId;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("official_store_id")
    @Expose
    private Object officialStoreId;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("base_price")
    @Expose
    private Double basePrice;
    @SerializedName("original_price")
    @Expose
    private Object originalPrice;
    @SerializedName("currency_id")
    @Expose
    private String currencyId;
    @SerializedName("initial_quantity")
    @Expose
    private Integer initialQuantity;
    @SerializedName("available_quantity")
    @Expose
    private Integer availableQuantity;
    @SerializedName("sold_quantity")
    @Expose
    private Integer soldQuantity;
    @SerializedName("sale_terms")
    @Expose
    private List<SaleTerm> saleTerms = null;
    @SerializedName("buying_mode")
    @Expose
    private String buyingMode;
    @SerializedName("listing_type_id")
    @Expose
    private String listingTypeId;
    @SerializedName("start_time")
    @Expose
    private String startTime;
    @SerializedName("stop_time")
    @Expose
    private String stopTime;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("thumbnail_id")
    @Expose
    private String thumbnailId;
    @SerializedName("thumbnail")
    @Expose
    private String thumbnail;
    @SerializedName("secure_thumbnail")
    @Expose
    private String secureThumbnail;
    @SerializedName("pictures")
    @Expose
    private List<Picture> pictures = null;
    @SerializedName("video_id")
    @Expose
    private Object videoId;
    @SerializedName("descriptions")
    @Expose
    private List<Description> descriptions = null;
    @SerializedName("accepts_mercadopago")
    @Expose
    private Boolean acceptsMercadopago;
    @SerializedName("non_mercado_pago_payment_methods")
    @Expose
    private List<Object> nonMercadoPagoPaymentMethods = null;
    @SerializedName("shipping")
    @Expose
    private Shipping shipping;
    @SerializedName("international_delivery_mode")
    @Expose
    private String internationalDeliveryMode;
    @SerializedName("seller_address")
    @Expose
    private SellerAddress sellerAddress;
    @SerializedName("seller_contact")
    @Expose
    private Object sellerContact;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("coverage_areas")
    @Expose
    private List<Object> coverageAreas = null;
    @SerializedName("attributes")
    @Expose
    private List<Attribute> attributes = null;
    @SerializedName("warnings")
    @Expose
    private List<Object> warnings = null;
    @SerializedName("listing_source")
    @Expose
    private String listingSource;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("sub_status")
    @Expose
    private List<Object> subStatus = null;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("warranty")
    @Expose
    private String warranty;
    @SerializedName("catalog_product_id")
    @Expose
    private Object catalogProductId;
    @SerializedName("domain_id")
    @Expose
    private String domainId;
    @SerializedName("parent_item_id")
    @Expose
    private Object parentItemId;
    @SerializedName("differential_pricing")
    @Expose
    private Object differentialPricing;
    @SerializedName("deal_ids")
    @Expose
    private List<Object> dealIds = null;
    @SerializedName("automatic_relist")
    @Expose
    private Boolean automaticRelist;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("last_updated")
    @Expose
    private String lastUpdated;
    @SerializedName("health")
    @Expose
    private Double health;
    @SerializedName("catalog_listing")
    @Expose
    private Boolean catalogListing;

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

    public Object getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(Object subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public Object getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Object originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getInitialQuantity() {
        return initialQuantity;
    }

    public void setInitialQuantity(Integer initialQuantity) {
        this.initialQuantity = initialQuantity;
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

    public List<SaleTerm> getSaleTerms() {
        return saleTerms;
    }

    public void setSaleTerms(List<SaleTerm> saleTerms) {
        this.saleTerms = saleTerms;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
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

    public String getThumbnailId() {
        return thumbnailId;
    }

    public void setThumbnailId(String thumbnailId) {
        this.thumbnailId = thumbnailId;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getSecureThumbnail() {
        return secureThumbnail;
    }

    public void setSecureThumbnail(String secureThumbnail) {
        this.secureThumbnail = secureThumbnail;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public Object getVideoId() {
        return videoId;
    }

    public void setVideoId(Object videoId) {
        this.videoId = videoId;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public Boolean getAcceptsMercadopago() {
        return acceptsMercadopago;
    }

    public void setAcceptsMercadopago(Boolean acceptsMercadopago) {
        this.acceptsMercadopago = acceptsMercadopago;
    }

    public List<Object> getNonMercadoPagoPaymentMethods() {
        return nonMercadoPagoPaymentMethods;
    }

    public void setNonMercadoPagoPaymentMethods(List<Object> nonMercadoPagoPaymentMethods) {
        this.nonMercadoPagoPaymentMethods = nonMercadoPagoPaymentMethods;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public String getInternationalDeliveryMode() {
        return internationalDeliveryMode;
    }

    public void setInternationalDeliveryMode(String internationalDeliveryMode) {
        this.internationalDeliveryMode = internationalDeliveryMode;
    }

    public SellerAddress getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(SellerAddress sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public Object getSellerContact() {
        return sellerContact;
    }

    public void setSellerContact(Object sellerContact) {
        this.sellerContact = sellerContact;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Object> getCoverageAreas() {
        return coverageAreas;
    }

    public void setCoverageAreas(List<Object> coverageAreas) {
        this.coverageAreas = coverageAreas;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<Object> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<Object> warnings) {
        this.warnings = warnings;
    }

    public String getListingSource() {
        return listingSource;
    }

    public void setListingSource(String listingSource) {
        this.listingSource = listingSource;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Object> getSubStatus() {
        return subStatus;
    }

    public void setSubStatus(List<Object> subStatus) {
        this.subStatus = subStatus;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public Object getCatalogProductId() {
        return catalogProductId;
    }

    public void setCatalogProductId(Object catalogProductId) {
        this.catalogProductId = catalogProductId;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public Object getParentItemId() {
        return parentItemId;
    }

    public void setParentItemId(Object parentItemId) {
        this.parentItemId = parentItemId;
    }

    public Object getDifferentialPricing() {
        return differentialPricing;
    }

    public void setDifferentialPricing(Object differentialPricing) {
        this.differentialPricing = differentialPricing;
    }

    public List<Object> getDealIds() {
        return dealIds;
    }

    public void setDealIds(List<Object> dealIds) {
        this.dealIds = dealIds;
    }

    public Boolean getAutomaticRelist() {
        return automaticRelist;
    }

    public void setAutomaticRelist(Boolean automaticRelist) {
        this.automaticRelist = automaticRelist;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public Boolean getCatalogListing() {
        return catalogListing;
    }

    public void setCatalogListing(Boolean catalogListing) {
        this.catalogListing = catalogListing;
    }

    public class Attribute {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("value_id")
        @Expose
        private String valueId;
        @SerializedName("value_name")
        @Expose
        private Object valueName;
        @SerializedName("value_struct")
        @Expose
        private Object valueStruct;
        @SerializedName("values")
        @Expose
        private List<Value_> values = null;
        @SerializedName("attribute_group_id")
        @Expose
        private String attributeGroupId;
        @SerializedName("attribute_group_name")
        @Expose
        private String attributeGroupName;

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

        public String getValueId() {
            return valueId;
        }

        public void setValueId(String valueId) {
            this.valueId = valueId;
        }

        public Object getValueName() {
            return valueName;
        }

        public void setValueName(Object valueName) {
            this.valueName = valueName;
        }

        public Object getValueStruct() {
            return valueStruct;
        }

        public void setValueStruct(Object valueStruct) {
            this.valueStruct = valueStruct;
        }

        public List<Value_> getValues() {
            return values;
        }

        public void setValues(List<Value_> values) {
            this.values = values;
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
    }

    public class AttributeCombination {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("value_id")
        @Expose
        private String valueId;
        @SerializedName("value_name")
        @Expose
        private String valueName;
        @SerializedName("value_struct")
        @Expose
        private Object valueStruct;
        @SerializedName("values")
        @Expose
        private List<Value__> values = null;

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

        public String getValueId() {
            return valueId;
        }

        public void setValueId(String valueId) {
            this.valueId = valueId;
        }

        public String getValueName() {
            return valueName;
        }

        public void setValueName(String valueName) {
            this.valueName = valueName;
        }

        public Object getValueStruct() {
            return valueStruct;
        }

        public void setValueStruct(Object valueStruct) {
            this.valueStruct = valueStruct;
        }

        public List<Value__> getValues() {
            return values;
        }

        public void setValues(List<Value__> values) {
            this.values = values;
        }
    }

    public class City {

        @SerializedName("name")
        @Expose
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public class City_ {

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

    public class Description {

        @SerializedName("id")
        @Expose
        private String id;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public class FreeMethod {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("rule")
        @Expose
        private Rule rule;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Rule getRule() {
            return rule;
        }

        public void setRule(Rule rule) {
            this.rule = rule;
        }
    }

    public class Location {


    }

    public class Neighborhood {

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

    public class Picture {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("secure_url")
        @Expose
        private String secureUrl;
        @SerializedName("size")
        @Expose
        private String size;
        @SerializedName("max_size")
        @Expose
        private String maxSize;
        @SerializedName("quality")
        @Expose
        private String quality;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getSecureUrl() {
            return secureUrl;
        }

        public void setSecureUrl(String secureUrl) {
            this.secureUrl = secureUrl;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getMaxSize() {
            return maxSize;
        }

        public void setMaxSize(String maxSize) {
            this.maxSize = maxSize;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }
    }

    public class Rule {

        @SerializedName("default")
        @Expose
        private Boolean _default;
        @SerializedName("free_mode")
        @Expose
        private String freeMode;
        @SerializedName("free_shipping_flag")
        @Expose
        private Boolean freeShippingFlag;
        @SerializedName("value")
        @Expose
        private Object value;

        public Boolean getDefault() {
            return _default;
        }

        public void setDefault(Boolean _default) {
            this._default = _default;
        }

        public String getFreeMode() {
            return freeMode;
        }

        public void setFreeMode(String freeMode) {
            this.freeMode = freeMode;
        }

        public Boolean getFreeShippingFlag() {
            return freeShippingFlag;
        }

        public void setFreeShippingFlag(Boolean freeShippingFlag) {
            this.freeShippingFlag = freeShippingFlag;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }
    }

    public class SaleTerm {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("value_id")
        @Expose
        private String valueId;
        @SerializedName("value_name")
        @Expose
        private String valueName;
        @SerializedName("value_struct")
        @Expose
        private Object valueStruct;
        @SerializedName("values")
        @Expose
        private List<Value> values = null;

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

        public String getValueId() {
            return valueId;
        }

        public void setValueId(String valueId) {
            this.valueId = valueId;
        }

        public String getValueName() {
            return valueName;
        }

        public void setValueName(String valueName) {
            this.valueName = valueName;
        }

        public Object getValueStruct() {
            return valueStruct;
        }

        public void setValueStruct(Object valueStruct) {
            this.valueStruct = valueStruct;
        }

        public List<Value> getValues() {
            return values;
        }

        public void setValues(List<Value> values) {
            this.values = values;
        }
    }

    public class SearchLocation {

        @SerializedName("neighborhood")
        @Expose
        private Neighborhood neighborhood;
        @SerializedName("city")
        @Expose
        private City_ city;
        @SerializedName("state")
        @Expose
        private State_ state;

        public Neighborhood getNeighborhood() {
            return neighborhood;
        }

        public void setNeighborhood(Neighborhood neighborhood) {
            this.neighborhood = neighborhood;
        }

        public City_ getCity() {
            return city;
        }

        public void setCity(City_ city) {
            this.city = city;
        }

        public State_ getState() {
            return state;
        }

        public void setState(State_ state) {
            this.state = state;
        }
    }

    public class SellerAddress {

        @SerializedName("city")
        @Expose
        private City city;
        @SerializedName("state")
        @Expose
        private State state;
        @SerializedName("country")
        @Expose
        private Country country;
        @SerializedName("search_location")
        @Expose
        private SearchLocation searchLocation;
        @SerializedName("id")
        @Expose
        private Integer id;

        public City getCity() {
            return city;
        }

        public void setCity(City city) {
            this.city = city;
        }

        public State getState() {
            return state;
        }

        public void setState(State state) {
            this.state = state;
        }

        public Country getCountry() {
            return country;
        }

        public void setCountry(Country country) {
            this.country = country;
        }

        public SearchLocation getSearchLocation() {
            return searchLocation;
        }

        public void setSearchLocation(SearchLocation searchLocation) {
            this.searchLocation = searchLocation;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
    }

    public class Shipping {

        @SerializedName("mode")
        @Expose
        private String mode;
        @SerializedName("free_methods")
        @Expose
        private List<FreeMethod> freeMethods = null;
        @SerializedName("tags")
        @Expose
        private List<Object> tags = null;
        @SerializedName("dimensions")
        @Expose
        private Object dimensions;
        @SerializedName("local_pick_up")
        @Expose
        private Boolean localPickUp;
        @SerializedName("free_shipping")
        @Expose
        private Boolean freeShipping;
        @SerializedName("logistic_type")
        @Expose
        private String logisticType;
        @SerializedName("store_pick_up")
        @Expose
        private Boolean storePickUp;

        public String getMode() {
            return mode;
        }

        public void setMode(String mode) {
            this.mode = mode;
        }

        public List<FreeMethod> getFreeMethods() {
            return freeMethods;
        }

        public void setFreeMethods(List<FreeMethod> freeMethods) {
            this.freeMethods = freeMethods;
        }

        public List<Object> getTags() {
            return tags;
        }

        public void setTags(List<Object> tags) {
            this.tags = tags;
        }

        public Object getDimensions() {
            return dimensions;
        }

        public void setDimensions(Object dimensions) {
            this.dimensions = dimensions;
        }

        public Boolean getLocalPickUp() {
            return localPickUp;
        }

        public void setLocalPickUp(Boolean localPickUp) {
            this.localPickUp = localPickUp;
        }

        public Boolean getFreeShipping() {
            return freeShipping;
        }

        public void setFreeShipping(Boolean freeShipping) {
            this.freeShipping = freeShipping;
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

    public class State_ {

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

    public class Value {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("struct")
        @Expose
        private Object struct;

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

        public Object getStruct() {
            return struct;
        }

        public void setStruct(Object struct) {
            this.struct = struct;
        }
    }

    public class Value_ {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private Object name;
        @SerializedName("struct")
        @Expose
        private Object struct;

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
    }

    public class Value__ {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("struct")
        @Expose
        private Object struct;

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

        public Object getStruct() {
            return struct;
        }

        public void setStruct(Object struct) {
            this.struct = struct;
        }
    }
}


