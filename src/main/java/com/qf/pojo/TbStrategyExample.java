package com.qf.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbStrategyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbStrategyExample() {
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

        public Criteria andStrIdIsNull() {
            addCriterion("STR_ID is null");
            return (Criteria) this;
        }

        public Criteria andStrIdIsNotNull() {
            addCriterion("STR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStrIdEqualTo(BigDecimal value) {
            addCriterion("STR_ID =", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdNotEqualTo(BigDecimal value) {
            addCriterion("STR_ID <>", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdGreaterThan(BigDecimal value) {
            addCriterion("STR_ID >", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STR_ID >=", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdLessThan(BigDecimal value) {
            addCriterion("STR_ID <", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STR_ID <=", value, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdIn(List<BigDecimal> values) {
            addCriterion("STR_ID in", values, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdNotIn(List<BigDecimal> values) {
            addCriterion("STR_ID not in", values, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STR_ID between", value1, value2, "strId");
            return (Criteria) this;
        }

        public Criteria andStrIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STR_ID not between", value1, value2, "strId");
            return (Criteria) this;
        }

        public Criteria andStrTitleIsNull() {
            addCriterion("STR_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andStrTitleIsNotNull() {
            addCriterion("STR_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andStrTitleEqualTo(String value) {
            addCriterion("STR_TITLE =", value, "strTitle");
            return (Criteria) this;
        }

        public Criteria andStrTitleNotEqualTo(String value) {
            addCriterion("STR_TITLE <>", value, "strTitle");
            return (Criteria) this;
        }

        public Criteria andStrTitleGreaterThan(String value) {
            addCriterion("STR_TITLE >", value, "strTitle");
            return (Criteria) this;
        }

        public Criteria andStrTitleGreaterThanOrEqualTo(String value) {
            addCriterion("STR_TITLE >=", value, "strTitle");
            return (Criteria) this;
        }

        public Criteria andStrTitleLessThan(String value) {
            addCriterion("STR_TITLE <", value, "strTitle");
            return (Criteria) this;
        }

        public Criteria andStrTitleLessThanOrEqualTo(String value) {
            addCriterion("STR_TITLE <=", value, "strTitle");
            return (Criteria) this;
        }

        public Criteria andStrTitleLike(String value) {
            addCriterion("STR_TITLE like", value, "strTitle");
            return (Criteria) this;
        }

        public Criteria andStrTitleNotLike(String value) {
            addCriterion("STR_TITLE not like", value, "strTitle");
            return (Criteria) this;
        }

        public Criteria andStrTitleIn(List<String> values) {
            addCriterion("STR_TITLE in", values, "strTitle");
            return (Criteria) this;
        }

        public Criteria andStrTitleNotIn(List<String> values) {
            addCriterion("STR_TITLE not in", values, "strTitle");
            return (Criteria) this;
        }

        public Criteria andStrTitleBetween(String value1, String value2) {
            addCriterion("STR_TITLE between", value1, value2, "strTitle");
            return (Criteria) this;
        }

        public Criteria andStrTitleNotBetween(String value1, String value2) {
            addCriterion("STR_TITLE not between", value1, value2, "strTitle");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIsNull() {
            addCriterion("SCENIC_SPOT is null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIsNotNull() {
            addCriterion("SCENIC_SPOT is not null");
            return (Criteria) this;
        }

        public Criteria andScenicSpotEqualTo(String value) {
            addCriterion("SCENIC_SPOT =", value, "scenicSpot");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNotEqualTo(String value) {
            addCriterion("SCENIC_SPOT <>", value, "scenicSpot");
            return (Criteria) this;
        }

        public Criteria andScenicSpotGreaterThan(String value) {
            addCriterion("SCENIC_SPOT >", value, "scenicSpot");
            return (Criteria) this;
        }

        public Criteria andScenicSpotGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_SPOT >=", value, "scenicSpot");
            return (Criteria) this;
        }

        public Criteria andScenicSpotLessThan(String value) {
            addCriterion("SCENIC_SPOT <", value, "scenicSpot");
            return (Criteria) this;
        }

        public Criteria andScenicSpotLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_SPOT <=", value, "scenicSpot");
            return (Criteria) this;
        }

        public Criteria andScenicSpotLike(String value) {
            addCriterion("SCENIC_SPOT like", value, "scenicSpot");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNotLike(String value) {
            addCriterion("SCENIC_SPOT not like", value, "scenicSpot");
            return (Criteria) this;
        }

        public Criteria andScenicSpotIn(List<String> values) {
            addCriterion("SCENIC_SPOT in", values, "scenicSpot");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNotIn(List<String> values) {
            addCriterion("SCENIC_SPOT not in", values, "scenicSpot");
            return (Criteria) this;
        }

        public Criteria andScenicSpotBetween(String value1, String value2) {
            addCriterion("SCENIC_SPOT between", value1, value2, "scenicSpot");
            return (Criteria) this;
        }

        public Criteria andScenicSpotNotBetween(String value1, String value2) {
            addCriterion("SCENIC_SPOT not between", value1, value2, "scenicSpot");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(BigDecimal value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(BigDecimal value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(BigDecimal value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(BigDecimal value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<BigDecimal> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<BigDecimal> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAppropriateCrowdIsNull() {
            addCriterion("APPROPRIATE_CROWD is null");
            return (Criteria) this;
        }

        public Criteria andAppropriateCrowdIsNotNull() {
            addCriterion("APPROPRIATE_CROWD is not null");
            return (Criteria) this;
        }

        public Criteria andAppropriateCrowdEqualTo(String value) {
            addCriterion("APPROPRIATE_CROWD =", value, "appropriateCrowd");
            return (Criteria) this;
        }

        public Criteria andAppropriateCrowdNotEqualTo(String value) {
            addCriterion("APPROPRIATE_CROWD <>", value, "appropriateCrowd");
            return (Criteria) this;
        }

        public Criteria andAppropriateCrowdGreaterThan(String value) {
            addCriterion("APPROPRIATE_CROWD >", value, "appropriateCrowd");
            return (Criteria) this;
        }

        public Criteria andAppropriateCrowdGreaterThanOrEqualTo(String value) {
            addCriterion("APPROPRIATE_CROWD >=", value, "appropriateCrowd");
            return (Criteria) this;
        }

        public Criteria andAppropriateCrowdLessThan(String value) {
            addCriterion("APPROPRIATE_CROWD <", value, "appropriateCrowd");
            return (Criteria) this;
        }

        public Criteria andAppropriateCrowdLessThanOrEqualTo(String value) {
            addCriterion("APPROPRIATE_CROWD <=", value, "appropriateCrowd");
            return (Criteria) this;
        }

        public Criteria andAppropriateCrowdLike(String value) {
            addCriterion("APPROPRIATE_CROWD like", value, "appropriateCrowd");
            return (Criteria) this;
        }

        public Criteria andAppropriateCrowdNotLike(String value) {
            addCriterion("APPROPRIATE_CROWD not like", value, "appropriateCrowd");
            return (Criteria) this;
        }

        public Criteria andAppropriateCrowdIn(List<String> values) {
            addCriterion("APPROPRIATE_CROWD in", values, "appropriateCrowd");
            return (Criteria) this;
        }

        public Criteria andAppropriateCrowdNotIn(List<String> values) {
            addCriterion("APPROPRIATE_CROWD not in", values, "appropriateCrowd");
            return (Criteria) this;
        }

        public Criteria andAppropriateCrowdBetween(String value1, String value2) {
            addCriterion("APPROPRIATE_CROWD between", value1, value2, "appropriateCrowd");
            return (Criteria) this;
        }

        public Criteria andAppropriateCrowdNotBetween(String value1, String value2) {
            addCriterion("APPROPRIATE_CROWD not between", value1, value2, "appropriateCrowd");
            return (Criteria) this;
        }

        public Criteria andAppropriateTimeIsNull() {
            addCriterion("APPROPRIATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAppropriateTimeIsNotNull() {
            addCriterion("APPROPRIATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAppropriateTimeEqualTo(String value) {
            addCriterion("APPROPRIATE_TIME =", value, "appropriateTime");
            return (Criteria) this;
        }

        public Criteria andAppropriateTimeNotEqualTo(String value) {
            addCriterion("APPROPRIATE_TIME <>", value, "appropriateTime");
            return (Criteria) this;
        }

        public Criteria andAppropriateTimeGreaterThan(String value) {
            addCriterion("APPROPRIATE_TIME >", value, "appropriateTime");
            return (Criteria) this;
        }

        public Criteria andAppropriateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("APPROPRIATE_TIME >=", value, "appropriateTime");
            return (Criteria) this;
        }

        public Criteria andAppropriateTimeLessThan(String value) {
            addCriterion("APPROPRIATE_TIME <", value, "appropriateTime");
            return (Criteria) this;
        }

        public Criteria andAppropriateTimeLessThanOrEqualTo(String value) {
            addCriterion("APPROPRIATE_TIME <=", value, "appropriateTime");
            return (Criteria) this;
        }

        public Criteria andAppropriateTimeLike(String value) {
            addCriterion("APPROPRIATE_TIME like", value, "appropriateTime");
            return (Criteria) this;
        }

        public Criteria andAppropriateTimeNotLike(String value) {
            addCriterion("APPROPRIATE_TIME not like", value, "appropriateTime");
            return (Criteria) this;
        }

        public Criteria andAppropriateTimeIn(List<String> values) {
            addCriterion("APPROPRIATE_TIME in", values, "appropriateTime");
            return (Criteria) this;
        }

        public Criteria andAppropriateTimeNotIn(List<String> values) {
            addCriterion("APPROPRIATE_TIME not in", values, "appropriateTime");
            return (Criteria) this;
        }

        public Criteria andAppropriateTimeBetween(String value1, String value2) {
            addCriterion("APPROPRIATE_TIME between", value1, value2, "appropriateTime");
            return (Criteria) this;
        }

        public Criteria andAppropriateTimeNotBetween(String value1, String value2) {
            addCriterion("APPROPRIATE_TIME not between", value1, value2, "appropriateTime");
            return (Criteria) this;
        }

        public Criteria andNecessaryEquipmentIsNull() {
            addCriterion("NECESSARY_EQUIPMENT is null");
            return (Criteria) this;
        }

        public Criteria andNecessaryEquipmentIsNotNull() {
            addCriterion("NECESSARY_EQUIPMENT is not null");
            return (Criteria) this;
        }

        public Criteria andNecessaryEquipmentEqualTo(String value) {
            addCriterion("NECESSARY_EQUIPMENT =", value, "necessaryEquipment");
            return (Criteria) this;
        }

        public Criteria andNecessaryEquipmentNotEqualTo(String value) {
            addCriterion("NECESSARY_EQUIPMENT <>", value, "necessaryEquipment");
            return (Criteria) this;
        }

        public Criteria andNecessaryEquipmentGreaterThan(String value) {
            addCriterion("NECESSARY_EQUIPMENT >", value, "necessaryEquipment");
            return (Criteria) this;
        }

        public Criteria andNecessaryEquipmentGreaterThanOrEqualTo(String value) {
            addCriterion("NECESSARY_EQUIPMENT >=", value, "necessaryEquipment");
            return (Criteria) this;
        }

        public Criteria andNecessaryEquipmentLessThan(String value) {
            addCriterion("NECESSARY_EQUIPMENT <", value, "necessaryEquipment");
            return (Criteria) this;
        }

        public Criteria andNecessaryEquipmentLessThanOrEqualTo(String value) {
            addCriterion("NECESSARY_EQUIPMENT <=", value, "necessaryEquipment");
            return (Criteria) this;
        }

        public Criteria andNecessaryEquipmentLike(String value) {
            addCriterion("NECESSARY_EQUIPMENT like", value, "necessaryEquipment");
            return (Criteria) this;
        }

        public Criteria andNecessaryEquipmentNotLike(String value) {
            addCriterion("NECESSARY_EQUIPMENT not like", value, "necessaryEquipment");
            return (Criteria) this;
        }

        public Criteria andNecessaryEquipmentIn(List<String> values) {
            addCriterion("NECESSARY_EQUIPMENT in", values, "necessaryEquipment");
            return (Criteria) this;
        }

        public Criteria andNecessaryEquipmentNotIn(List<String> values) {
            addCriterion("NECESSARY_EQUIPMENT not in", values, "necessaryEquipment");
            return (Criteria) this;
        }

        public Criteria andNecessaryEquipmentBetween(String value1, String value2) {
            addCriterion("NECESSARY_EQUIPMENT between", value1, value2, "necessaryEquipment");
            return (Criteria) this;
        }

        public Criteria andNecessaryEquipmentNotBetween(String value1, String value2) {
            addCriterion("NECESSARY_EQUIPMENT not between", value1, value2, "necessaryEquipment");
            return (Criteria) this;
        }

        public Criteria andMattersNeedAttentionIsNull() {
            addCriterion("MATTERS_NEED_ATTENTION is null");
            return (Criteria) this;
        }

        public Criteria andMattersNeedAttentionIsNotNull() {
            addCriterion("MATTERS_NEED_ATTENTION is not null");
            return (Criteria) this;
        }

        public Criteria andMattersNeedAttentionEqualTo(String value) {
            addCriterion("MATTERS_NEED_ATTENTION =", value, "mattersNeedAttention");
            return (Criteria) this;
        }

        public Criteria andMattersNeedAttentionNotEqualTo(String value) {
            addCriterion("MATTERS_NEED_ATTENTION <>", value, "mattersNeedAttention");
            return (Criteria) this;
        }

        public Criteria andMattersNeedAttentionGreaterThan(String value) {
            addCriterion("MATTERS_NEED_ATTENTION >", value, "mattersNeedAttention");
            return (Criteria) this;
        }

        public Criteria andMattersNeedAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("MATTERS_NEED_ATTENTION >=", value, "mattersNeedAttention");
            return (Criteria) this;
        }

        public Criteria andMattersNeedAttentionLessThan(String value) {
            addCriterion("MATTERS_NEED_ATTENTION <", value, "mattersNeedAttention");
            return (Criteria) this;
        }

        public Criteria andMattersNeedAttentionLessThanOrEqualTo(String value) {
            addCriterion("MATTERS_NEED_ATTENTION <=", value, "mattersNeedAttention");
            return (Criteria) this;
        }

        public Criteria andMattersNeedAttentionLike(String value) {
            addCriterion("MATTERS_NEED_ATTENTION like", value, "mattersNeedAttention");
            return (Criteria) this;
        }

        public Criteria andMattersNeedAttentionNotLike(String value) {
            addCriterion("MATTERS_NEED_ATTENTION not like", value, "mattersNeedAttention");
            return (Criteria) this;
        }

        public Criteria andMattersNeedAttentionIn(List<String> values) {
            addCriterion("MATTERS_NEED_ATTENTION in", values, "mattersNeedAttention");
            return (Criteria) this;
        }

        public Criteria andMattersNeedAttentionNotIn(List<String> values) {
            addCriterion("MATTERS_NEED_ATTENTION not in", values, "mattersNeedAttention");
            return (Criteria) this;
        }

        public Criteria andMattersNeedAttentionBetween(String value1, String value2) {
            addCriterion("MATTERS_NEED_ATTENTION between", value1, value2, "mattersNeedAttention");
            return (Criteria) this;
        }

        public Criteria andMattersNeedAttentionNotBetween(String value1, String value2) {
            addCriterion("MATTERS_NEED_ATTENTION not between", value1, value2, "mattersNeedAttention");
            return (Criteria) this;
        }

        public Criteria andParticularsIsNull() {
            addCriterion("PARTICULARS is null");
            return (Criteria) this;
        }

        public Criteria andParticularsIsNotNull() {
            addCriterion("PARTICULARS is not null");
            return (Criteria) this;
        }

        public Criteria andParticularsEqualTo(String value) {
            addCriterion("PARTICULARS =", value, "particulars");
            return (Criteria) this;
        }

        public Criteria andParticularsNotEqualTo(String value) {
            addCriterion("PARTICULARS <>", value, "particulars");
            return (Criteria) this;
        }

        public Criteria andParticularsGreaterThan(String value) {
            addCriterion("PARTICULARS >", value, "particulars");
            return (Criteria) this;
        }

        public Criteria andParticularsGreaterThanOrEqualTo(String value) {
            addCriterion("PARTICULARS >=", value, "particulars");
            return (Criteria) this;
        }

        public Criteria andParticularsLessThan(String value) {
            addCriterion("PARTICULARS <", value, "particulars");
            return (Criteria) this;
        }

        public Criteria andParticularsLessThanOrEqualTo(String value) {
            addCriterion("PARTICULARS <=", value, "particulars");
            return (Criteria) this;
        }

        public Criteria andParticularsLike(String value) {
            addCriterion("PARTICULARS like", value, "particulars");
            return (Criteria) this;
        }

        public Criteria andParticularsNotLike(String value) {
            addCriterion("PARTICULARS not like", value, "particulars");
            return (Criteria) this;
        }

        public Criteria andParticularsIn(List<String> values) {
            addCriterion("PARTICULARS in", values, "particulars");
            return (Criteria) this;
        }

        public Criteria andParticularsNotIn(List<String> values) {
            addCriterion("PARTICULARS not in", values, "particulars");
            return (Criteria) this;
        }

        public Criteria andParticularsBetween(String value1, String value2) {
            addCriterion("PARTICULARS between", value1, value2, "particulars");
            return (Criteria) this;
        }

        public Criteria andParticularsNotBetween(String value1, String value2) {
            addCriterion("PARTICULARS not between", value1, value2, "particulars");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("IMG is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("IMG is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("IMG =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("IMG <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("IMG >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("IMG >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("IMG <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("IMG <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("IMG like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("IMG not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("IMG in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("IMG not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("IMG between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("IMG not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andChengshiIsNull() {
            addCriterion("CHENGSHI is null");
            return (Criteria) this;
        }

        public Criteria andChengshiIsNotNull() {
            addCriterion("CHENGSHI is not null");
            return (Criteria) this;
        }

        public Criteria andChengshiEqualTo(String value) {
            addCriterion("CHENGSHI =", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiNotEqualTo(String value) {
            addCriterion("CHENGSHI <>", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiGreaterThan(String value) {
            addCriterion("CHENGSHI >", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiGreaterThanOrEqualTo(String value) {
            addCriterion("CHENGSHI >=", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiLessThan(String value) {
            addCriterion("CHENGSHI <", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiLessThanOrEqualTo(String value) {
            addCriterion("CHENGSHI <=", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiLike(String value) {
            addCriterion("CHENGSHI like", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiNotLike(String value) {
            addCriterion("CHENGSHI not like", value, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiIn(List<String> values) {
            addCriterion("CHENGSHI in", values, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiNotIn(List<String> values) {
            addCriterion("CHENGSHI not in", values, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiBetween(String value1, String value2) {
            addCriterion("CHENGSHI between", value1, value2, "chengshi");
            return (Criteria) this;
        }

        public Criteria andChengshiNotBetween(String value1, String value2) {
            addCriterion("CHENGSHI not between", value1, value2, "chengshi");
            return (Criteria) this;
        }

        public Criteria andFabutimeIsNull() {
            addCriterion("FABUTIME is null");
            return (Criteria) this;
        }

        public Criteria andFabutimeIsNotNull() {
            addCriterion("FABUTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFabutimeEqualTo(String value) {
            addCriterion("FABUTIME =", value, "fabutime");
            return (Criteria) this;
        }

        public Criteria andFabutimeNotEqualTo(String value) {
            addCriterion("FABUTIME <>", value, "fabutime");
            return (Criteria) this;
        }

        public Criteria andFabutimeGreaterThan(String value) {
            addCriterion("FABUTIME >", value, "fabutime");
            return (Criteria) this;
        }

        public Criteria andFabutimeGreaterThanOrEqualTo(String value) {
            addCriterion("FABUTIME >=", value, "fabutime");
            return (Criteria) this;
        }

        public Criteria andFabutimeLessThan(String value) {
            addCriterion("FABUTIME <", value, "fabutime");
            return (Criteria) this;
        }

        public Criteria andFabutimeLessThanOrEqualTo(String value) {
            addCriterion("FABUTIME <=", value, "fabutime");
            return (Criteria) this;
        }

        public Criteria andFabutimeLike(String value) {
            addCriterion("FABUTIME like", value, "fabutime");
            return (Criteria) this;
        }

        public Criteria andFabutimeNotLike(String value) {
            addCriterion("FABUTIME not like", value, "fabutime");
            return (Criteria) this;
        }

        public Criteria andFabutimeIn(List<String> values) {
            addCriterion("FABUTIME in", values, "fabutime");
            return (Criteria) this;
        }

        public Criteria andFabutimeNotIn(List<String> values) {
            addCriterion("FABUTIME not in", values, "fabutime");
            return (Criteria) this;
        }

        public Criteria andFabutimeBetween(String value1, String value2) {
            addCriterion("FABUTIME between", value1, value2, "fabutime");
            return (Criteria) this;
        }

        public Criteria andFabutimeNotBetween(String value1, String value2) {
            addCriterion("FABUTIME not between", value1, value2, "fabutime");
            return (Criteria) this;
        }

        public Criteria andFaburenIsNull() {
            addCriterion("FABUREN is null");
            return (Criteria) this;
        }

        public Criteria andFaburenIsNotNull() {
            addCriterion("FABUREN is not null");
            return (Criteria) this;
        }

        public Criteria andFaburenEqualTo(String value) {
            addCriterion("FABUREN =", value, "faburen");
            return (Criteria) this;
        }

        public Criteria andFaburenNotEqualTo(String value) {
            addCriterion("FABUREN <>", value, "faburen");
            return (Criteria) this;
        }

        public Criteria andFaburenGreaterThan(String value) {
            addCriterion("FABUREN >", value, "faburen");
            return (Criteria) this;
        }

        public Criteria andFaburenGreaterThanOrEqualTo(String value) {
            addCriterion("FABUREN >=", value, "faburen");
            return (Criteria) this;
        }

        public Criteria andFaburenLessThan(String value) {
            addCriterion("FABUREN <", value, "faburen");
            return (Criteria) this;
        }

        public Criteria andFaburenLessThanOrEqualTo(String value) {
            addCriterion("FABUREN <=", value, "faburen");
            return (Criteria) this;
        }

        public Criteria andFaburenLike(String value) {
            addCriterion("FABUREN like", value, "faburen");
            return (Criteria) this;
        }

        public Criteria andFaburenNotLike(String value) {
            addCriterion("FABUREN not like", value, "faburen");
            return (Criteria) this;
        }

        public Criteria andFaburenIn(List<String> values) {
            addCriterion("FABUREN in", values, "faburen");
            return (Criteria) this;
        }

        public Criteria andFaburenNotIn(List<String> values) {
            addCriterion("FABUREN not in", values, "faburen");
            return (Criteria) this;
        }

        public Criteria andFaburenBetween(String value1, String value2) {
            addCriterion("FABUREN between", value1, value2, "faburen");
            return (Criteria) this;
        }

        public Criteria andFaburenNotBetween(String value1, String value2) {
            addCriterion("FABUREN not between", value1, value2, "faburen");
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