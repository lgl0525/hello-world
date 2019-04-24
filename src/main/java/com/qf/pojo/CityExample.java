package com.qf.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCityIdIsNull() {
            addCriterion("CITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("CITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(BigDecimal value) {
            addCriterion("CITY_ID =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(BigDecimal value) {
            addCriterion("CITY_ID <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(BigDecimal value) {
            addCriterion("CITY_ID >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CITY_ID >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(BigDecimal value) {
            addCriterion("CITY_ID <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CITY_ID <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<BigDecimal> values) {
            addCriterion("CITY_ID in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<BigDecimal> values) {
            addCriterion("CITY_ID not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CITY_ID between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CITY_ID not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("CITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("CITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("CITY_NAME =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("CITY_NAME <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("CITY_NAME >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_NAME >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("CITY_NAME <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("CITY_NAME <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("CITY_NAME like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("CITY_NAME not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("CITY_NAME in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("CITY_NAME not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("CITY_NAME between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("CITY_NAME not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityUrlIsNull() {
            addCriterion("CITY_URL is null");
            return (Criteria) this;
        }

        public Criteria andCityUrlIsNotNull() {
            addCriterion("CITY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCityUrlEqualTo(String value) {
            addCriterion("CITY_URL =", value, "cityUrl");
            return (Criteria) this;
        }

        public Criteria andCityUrlNotEqualTo(String value) {
            addCriterion("CITY_URL <>", value, "cityUrl");
            return (Criteria) this;
        }

        public Criteria andCityUrlGreaterThan(String value) {
            addCriterion("CITY_URL >", value, "cityUrl");
            return (Criteria) this;
        }

        public Criteria andCityUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_URL >=", value, "cityUrl");
            return (Criteria) this;
        }

        public Criteria andCityUrlLessThan(String value) {
            addCriterion("CITY_URL <", value, "cityUrl");
            return (Criteria) this;
        }

        public Criteria andCityUrlLessThanOrEqualTo(String value) {
            addCriterion("CITY_URL <=", value, "cityUrl");
            return (Criteria) this;
        }

        public Criteria andCityUrlLike(String value) {
            addCriterion("CITY_URL like", value, "cityUrl");
            return (Criteria) this;
        }

        public Criteria andCityUrlNotLike(String value) {
            addCriterion("CITY_URL not like", value, "cityUrl");
            return (Criteria) this;
        }

        public Criteria andCityUrlIn(List<String> values) {
            addCriterion("CITY_URL in", values, "cityUrl");
            return (Criteria) this;
        }

        public Criteria andCityUrlNotIn(List<String> values) {
            addCriterion("CITY_URL not in", values, "cityUrl");
            return (Criteria) this;
        }

        public Criteria andCityUrlBetween(String value1, String value2) {
            addCriterion("CITY_URL between", value1, value2, "cityUrl");
            return (Criteria) this;
        }

        public Criteria andCityUrlNotBetween(String value1, String value2) {
            addCriterion("CITY_URL not between", value1, value2, "cityUrl");
            return (Criteria) this;
        }

        public Criteria andCitySynopsisIsNull() {
            addCriterion("CITY_SYNOPSIS is null");
            return (Criteria) this;
        }

        public Criteria andCitySynopsisIsNotNull() {
            addCriterion("CITY_SYNOPSIS is not null");
            return (Criteria) this;
        }

        public Criteria andCitySynopsisEqualTo(String value) {
            addCriterion("CITY_SYNOPSIS =", value, "citySynopsis");
            return (Criteria) this;
        }

        public Criteria andCitySynopsisNotEqualTo(String value) {
            addCriterion("CITY_SYNOPSIS <>", value, "citySynopsis");
            return (Criteria) this;
        }

        public Criteria andCitySynopsisGreaterThan(String value) {
            addCriterion("CITY_SYNOPSIS >", value, "citySynopsis");
            return (Criteria) this;
        }

        public Criteria andCitySynopsisGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_SYNOPSIS >=", value, "citySynopsis");
            return (Criteria) this;
        }

        public Criteria andCitySynopsisLessThan(String value) {
            addCriterion("CITY_SYNOPSIS <", value, "citySynopsis");
            return (Criteria) this;
        }

        public Criteria andCitySynopsisLessThanOrEqualTo(String value) {
            addCriterion("CITY_SYNOPSIS <=", value, "citySynopsis");
            return (Criteria) this;
        }

        public Criteria andCitySynopsisLike(String value) {
            addCriterion("CITY_SYNOPSIS like", value, "citySynopsis");
            return (Criteria) this;
        }

        public Criteria andCitySynopsisNotLike(String value) {
            addCriterion("CITY_SYNOPSIS not like", value, "citySynopsis");
            return (Criteria) this;
        }

        public Criteria andCitySynopsisIn(List<String> values) {
            addCriterion("CITY_SYNOPSIS in", values, "citySynopsis");
            return (Criteria) this;
        }

        public Criteria andCitySynopsisNotIn(List<String> values) {
            addCriterion("CITY_SYNOPSIS not in", values, "citySynopsis");
            return (Criteria) this;
        }

        public Criteria andCitySynopsisBetween(String value1, String value2) {
            addCriterion("CITY_SYNOPSIS between", value1, value2, "citySynopsis");
            return (Criteria) this;
        }

        public Criteria andCitySynopsisNotBetween(String value1, String value2) {
            addCriterion("CITY_SYNOPSIS not between", value1, value2, "citySynopsis");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}