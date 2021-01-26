package com.example.mlretrocomputacion.data.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/*
Model class to help with server response.
Receive all the information about the questions asked to an item
 */
public class QuestionModel {

    private static final String TAG = "QuestionModel";
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("limit")
    @Expose
    private Integer limit;
    @SerializedName("questions")
    @Expose
    private List<Object> questions = null;
    @SerializedName("filters")
    @Expose
    private Filters filters;
    @SerializedName("available_filters")
    @Expose
    private List<AvailableFilter> availableFilters = null;
    @SerializedName("available_sorts")
    @Expose
    private List<String> availableSorts = null;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public List<Object> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Object> questions) {
        this.questions = questions;
    }

    public Filters getFilters() {
        return filters;
    }

    public void setFilters(Filters filters) {
        this.filters = filters;
    }

    public List<AvailableFilter> getAvailableFilters() {
        return availableFilters;
    }

    public void setAvailableFilters(List<AvailableFilter> availableFilters) {
        this.availableFilters = availableFilters;
    }

    public List<String> getAvailableSorts() {
        return availableSorts;
    }

    public void setAvailableSorts(List<String> availableSorts) {
        this.availableSorts = availableSorts;
    }
    public class AvailableFilter {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("values")
        @Expose
        private List<String> values = null;

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

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<String> getValues() {
            return values;
        }

        public void setValues(List<String> values) {
            this.values = values;
        }
    }

    public class Filters {

        @SerializedName("limit")
        @Expose
        private Integer limit;
        @SerializedName("offset")
        @Expose
        private Integer offset;
        @SerializedName("api_version")
        @Expose
        private String apiVersion;
        @SerializedName("is_admin")
        @Expose
        private Boolean isAdmin;
        @SerializedName("sorts")
        @Expose
        private List<Object> sorts = null;
        @SerializedName("caller")
        @Expose
        private Object caller;
        @SerializedName("item")
        @Expose
        private String item;

        public Integer getLimit() {
            return limit;
        }

        public void setLimit(Integer limit) {
            this.limit = limit;
        }

        public Integer getOffset() {
            return offset;
        }

        public void setOffset(Integer offset) {
            this.offset = offset;
        }

        public String getApiVersion() {
            return apiVersion;
        }

        public void setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
        }

        public Boolean getIsAdmin() {
            return isAdmin;
        }

        public void setIsAdmin(Boolean isAdmin) {
            this.isAdmin = isAdmin;
        }

        public List<Object> getSorts() {
            return sorts;
        }

        public void setSorts(List<Object> sorts) {
            this.sorts = sorts;
        }

        public Object getCaller() {
            return caller;
        }

        public void setCaller(Object caller) {
            this.caller = caller;
        }

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }
    }
}
