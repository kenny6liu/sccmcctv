package com.kennysoft.model;

import java.util.ArrayList;
import java.util.List;

public class KsRoleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public KsRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andKsNameIsNull() {
            addCriterion("ks_name is null");
            return (Criteria) this;
        }

        public Criteria andKsNameIsNotNull() {
            addCriterion("ks_name is not null");
            return (Criteria) this;
        }

        public Criteria andKsNameEqualTo(String value) {
            addCriterion("ks_name =", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameNotEqualTo(String value) {
            addCriterion("ks_name <>", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameGreaterThan(String value) {
            addCriterion("ks_name >", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameGreaterThanOrEqualTo(String value) {
            addCriterion("ks_name >=", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameLessThan(String value) {
            addCriterion("ks_name <", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameLessThanOrEqualTo(String value) {
            addCriterion("ks_name <=", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameLike(String value) {
            addCriterion("ks_name like", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameNotLike(String value) {
            addCriterion("ks_name not like", value, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameIn(List<String> values) {
            addCriterion("ks_name in", values, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameNotIn(List<String> values) {
            addCriterion("ks_name not in", values, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameBetween(String value1, String value2) {
            addCriterion("ks_name between", value1, value2, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsNameNotBetween(String value1, String value2) {
            addCriterion("ks_name not between", value1, value2, "ksName");
            return (Criteria) this;
        }

        public Criteria andKsCodeIsNull() {
            addCriterion("ks_code is null");
            return (Criteria) this;
        }

        public Criteria andKsCodeIsNotNull() {
            addCriterion("ks_code is not null");
            return (Criteria) this;
        }

        public Criteria andKsCodeEqualTo(String value) {
            addCriterion("ks_code =", value, "ksCode");
            return (Criteria) this;
        }

        public Criteria andKsCodeNotEqualTo(String value) {
            addCriterion("ks_code <>", value, "ksCode");
            return (Criteria) this;
        }

        public Criteria andKsCodeGreaterThan(String value) {
            addCriterion("ks_code >", value, "ksCode");
            return (Criteria) this;
        }

        public Criteria andKsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ks_code >=", value, "ksCode");
            return (Criteria) this;
        }

        public Criteria andKsCodeLessThan(String value) {
            addCriterion("ks_code <", value, "ksCode");
            return (Criteria) this;
        }

        public Criteria andKsCodeLessThanOrEqualTo(String value) {
            addCriterion("ks_code <=", value, "ksCode");
            return (Criteria) this;
        }

        public Criteria andKsCodeLike(String value) {
            addCriterion("ks_code like", value, "ksCode");
            return (Criteria) this;
        }

        public Criteria andKsCodeNotLike(String value) {
            addCriterion("ks_code not like", value, "ksCode");
            return (Criteria) this;
        }

        public Criteria andKsCodeIn(List<String> values) {
            addCriterion("ks_code in", values, "ksCode");
            return (Criteria) this;
        }

        public Criteria andKsCodeNotIn(List<String> values) {
            addCriterion("ks_code not in", values, "ksCode");
            return (Criteria) this;
        }

        public Criteria andKsCodeBetween(String value1, String value2) {
            addCriterion("ks_code between", value1, value2, "ksCode");
            return (Criteria) this;
        }

        public Criteria andKsCodeNotBetween(String value1, String value2) {
            addCriterion("ks_code not between", value1, value2, "ksCode");
            return (Criteria) this;
        }

        public Criteria andKsValueIsNull() {
            addCriterion("ks_value is null");
            return (Criteria) this;
        }

        public Criteria andKsValueIsNotNull() {
            addCriterion("ks_value is not null");
            return (Criteria) this;
        }

        public Criteria andKsValueEqualTo(String value) {
            addCriterion("ks_value =", value, "ksValue");
            return (Criteria) this;
        }

        public Criteria andKsValueNotEqualTo(String value) {
            addCriterion("ks_value <>", value, "ksValue");
            return (Criteria) this;
        }

        public Criteria andKsValueGreaterThan(String value) {
            addCriterion("ks_value >", value, "ksValue");
            return (Criteria) this;
        }

        public Criteria andKsValueGreaterThanOrEqualTo(String value) {
            addCriterion("ks_value >=", value, "ksValue");
            return (Criteria) this;
        }

        public Criteria andKsValueLessThan(String value) {
            addCriterion("ks_value <", value, "ksValue");
            return (Criteria) this;
        }

        public Criteria andKsValueLessThanOrEqualTo(String value) {
            addCriterion("ks_value <=", value, "ksValue");
            return (Criteria) this;
        }

        public Criteria andKsValueLike(String value) {
            addCriterion("ks_value like", value, "ksValue");
            return (Criteria) this;
        }

        public Criteria andKsValueNotLike(String value) {
            addCriterion("ks_value not like", value, "ksValue");
            return (Criteria) this;
        }

        public Criteria andKsValueIn(List<String> values) {
            addCriterion("ks_value in", values, "ksValue");
            return (Criteria) this;
        }

        public Criteria andKsValueNotIn(List<String> values) {
            addCriterion("ks_value not in", values, "ksValue");
            return (Criteria) this;
        }

        public Criteria andKsValueBetween(String value1, String value2) {
            addCriterion("ks_value between", value1, value2, "ksValue");
            return (Criteria) this;
        }

        public Criteria andKsValueNotBetween(String value1, String value2) {
            addCriterion("ks_value not between", value1, value2, "ksValue");
            return (Criteria) this;
        }

        public Criteria andKsDescriptionIsNull() {
            addCriterion("ks_description is null");
            return (Criteria) this;
        }

        public Criteria andKsDescriptionIsNotNull() {
            addCriterion("ks_description is not null");
            return (Criteria) this;
        }

        public Criteria andKsDescriptionEqualTo(String value) {
            addCriterion("ks_description =", value, "ksDescription");
            return (Criteria) this;
        }

        public Criteria andKsDescriptionNotEqualTo(String value) {
            addCriterion("ks_description <>", value, "ksDescription");
            return (Criteria) this;
        }

        public Criteria andKsDescriptionGreaterThan(String value) {
            addCriterion("ks_description >", value, "ksDescription");
            return (Criteria) this;
        }

        public Criteria andKsDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("ks_description >=", value, "ksDescription");
            return (Criteria) this;
        }

        public Criteria andKsDescriptionLessThan(String value) {
            addCriterion("ks_description <", value, "ksDescription");
            return (Criteria) this;
        }

        public Criteria andKsDescriptionLessThanOrEqualTo(String value) {
            addCriterion("ks_description <=", value, "ksDescription");
            return (Criteria) this;
        }

        public Criteria andKsDescriptionLike(String value) {
            addCriterion("ks_description like", value, "ksDescription");
            return (Criteria) this;
        }

        public Criteria andKsDescriptionNotLike(String value) {
            addCriterion("ks_description not like", value, "ksDescription");
            return (Criteria) this;
        }

        public Criteria andKsDescriptionIn(List<String> values) {
            addCriterion("ks_description in", values, "ksDescription");
            return (Criteria) this;
        }

        public Criteria andKsDescriptionNotIn(List<String> values) {
            addCriterion("ks_description not in", values, "ksDescription");
            return (Criteria) this;
        }

        public Criteria andKsDescriptionBetween(String value1, String value2) {
            addCriterion("ks_description between", value1, value2, "ksDescription");
            return (Criteria) this;
        }

        public Criteria andKsDescriptionNotBetween(String value1, String value2) {
            addCriterion("ks_description not between", value1, value2, "ksDescription");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ks_role
     *
     * @mbg.generated do_not_delete_during_merge Thu Dec 13 15:19:45 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
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