package com.eliteams.quick4j.web.model;

import java.util.ArrayList;
import java.util.List;

public class PollFactoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PollFactoryExample() {
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

        public Criteria andTjnfIsNull() {
            addCriterion("TJNF is null");
            return (Criteria) this;
        }

        public Criteria andTjnfIsNotNull() {
            addCriterion("TJNF is not null");
            return (Criteria) this;
        }

        public Criteria andTjnfEqualTo(Integer value) {
            addCriterion("TJNF =", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotEqualTo(Integer value) {
            addCriterion("TJNF <>", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfGreaterThan(Integer value) {
            addCriterion("TJNF >", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfGreaterThanOrEqualTo(Integer value) {
            addCriterion("TJNF >=", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfLessThan(Integer value) {
            addCriterion("TJNF <", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfLessThanOrEqualTo(Integer value) {
            addCriterion("TJNF <=", value, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfIn(List<Integer> values) {
            addCriterion("TJNF in", values, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotIn(List<Integer> values) {
            addCriterion("TJNF not in", values, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfBetween(Integer value1, Integer value2) {
            addCriterion("TJNF between", value1, value2, "tjnf");
            return (Criteria) this;
        }

        public Criteria andTjnfNotBetween(Integer value1, Integer value2) {
            addCriterion("TJNF not between", value1, value2, "tjnf");
            return (Criteria) this;
        }

        public Criteria andXzqhdmIsNull() {
            addCriterion("XZQHDM is null");
            return (Criteria) this;
        }

        public Criteria andXzqhdmIsNotNull() {
            addCriterion("XZQHDM is not null");
            return (Criteria) this;
        }

        public Criteria andXzqhdmEqualTo(String value) {
            addCriterion("XZQHDM =", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotEqualTo(String value) {
            addCriterion("XZQHDM <>", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmGreaterThan(String value) {
            addCriterion("XZQHDM >", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmGreaterThanOrEqualTo(String value) {
            addCriterion("XZQHDM >=", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmLessThan(String value) {
            addCriterion("XZQHDM <", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmLessThanOrEqualTo(String value) {
            addCriterion("XZQHDM <=", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmLike(String value) {
            addCriterion("XZQHDM like", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotLike(String value) {
            addCriterion("XZQHDM not like", value, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmIn(List<String> values) {
            addCriterion("XZQHDM in", values, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotIn(List<String> values) {
            addCriterion("XZQHDM not in", values, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmBetween(String value1, String value2) {
            addCriterion("XZQHDM between", value1, value2, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhdmNotBetween(String value1, String value2) {
            addCriterion("XZQHDM not between", value1, value2, "xzqhdm");
            return (Criteria) this;
        }

        public Criteria andXzqhmcIsNull() {
            addCriterion("XZQHMC is null");
            return (Criteria) this;
        }

        public Criteria andXzqhmcIsNotNull() {
            addCriterion("XZQHMC is not null");
            return (Criteria) this;
        }

        public Criteria andXzqhmcEqualTo(String value) {
            addCriterion("XZQHMC =", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotEqualTo(String value) {
            addCriterion("XZQHMC <>", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcGreaterThan(String value) {
            addCriterion("XZQHMC >", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcGreaterThanOrEqualTo(String value) {
            addCriterion("XZQHMC >=", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcLessThan(String value) {
            addCriterion("XZQHMC <", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcLessThanOrEqualTo(String value) {
            addCriterion("XZQHMC <=", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcLike(String value) {
            addCriterion("XZQHMC like", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotLike(String value) {
            addCriterion("XZQHMC not like", value, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcIn(List<String> values) {
            addCriterion("XZQHMC in", values, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotIn(List<String> values) {
            addCriterion("XZQHMC not in", values, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcBetween(String value1, String value2) {
            addCriterion("XZQHMC between", value1, value2, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andXzqhmcNotBetween(String value1, String value2) {
            addCriterion("XZQHMC not between", value1, value2, "xzqhmc");
            return (Criteria) this;
        }

        public Criteria andShxydmIsNull() {
            addCriterion("SHXYDM is null");
            return (Criteria) this;
        }

        public Criteria andShxydmIsNotNull() {
            addCriterion("SHXYDM is not null");
            return (Criteria) this;
        }

        public Criteria andShxydmEqualTo(String value) {
            addCriterion("SHXYDM =", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmNotEqualTo(String value) {
            addCriterion("SHXYDM <>", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmGreaterThan(String value) {
            addCriterion("SHXYDM >", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmGreaterThanOrEqualTo(String value) {
            addCriterion("SHXYDM >=", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmLessThan(String value) {
            addCriterion("SHXYDM <", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmLessThanOrEqualTo(String value) {
            addCriterion("SHXYDM <=", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmLike(String value) {
            addCriterion("SHXYDM like", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmNotLike(String value) {
            addCriterion("SHXYDM not like", value, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmIn(List<String> values) {
            addCriterion("SHXYDM in", values, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmNotIn(List<String> values) {
            addCriterion("SHXYDM not in", values, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmBetween(String value1, String value2) {
            addCriterion("SHXYDM between", value1, value2, "shxydm");
            return (Criteria) this;
        }

        public Criteria andShxydmNotBetween(String value1, String value2) {
            addCriterion("SHXYDM not between", value1, value2, "shxydm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIsNull() {
            addCriterion("ZZJGDM is null");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIsNotNull() {
            addCriterion("ZZJGDM is not null");
            return (Criteria) this;
        }

        public Criteria andZzjgdmEqualTo(String value) {
            addCriterion("ZZJGDM =", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotEqualTo(String value) {
            addCriterion("ZZJGDM <>", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmGreaterThan(String value) {
            addCriterion("ZZJGDM >", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmGreaterThanOrEqualTo(String value) {
            addCriterion("ZZJGDM >=", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLessThan(String value) {
            addCriterion("ZZJGDM <", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLessThanOrEqualTo(String value) {
            addCriterion("ZZJGDM <=", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmLike(String value) {
            addCriterion("ZZJGDM like", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotLike(String value) {
            addCriterion("ZZJGDM not like", value, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmIn(List<String> values) {
            addCriterion("ZZJGDM in", values, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotIn(List<String> values) {
            addCriterion("ZZJGDM not in", values, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmBetween(String value1, String value2) {
            addCriterion("ZZJGDM between", value1, value2, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andZzjgdmNotBetween(String value1, String value2) {
            addCriterion("ZZJGDM not between", value1, value2, "zzjgdm");
            return (Criteria) this;
        }

        public Criteria andDwmcGzIsNull() {
            addCriterion("DWMC_GZ is null");
            return (Criteria) this;
        }

        public Criteria andDwmcGzIsNotNull() {
            addCriterion("DWMC_GZ is not null");
            return (Criteria) this;
        }

        public Criteria andDwmcGzEqualTo(String value) {
            addCriterion("DWMC_GZ =", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzNotEqualTo(String value) {
            addCriterion("DWMC_GZ <>", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzGreaterThan(String value) {
            addCriterion("DWMC_GZ >", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzGreaterThanOrEqualTo(String value) {
            addCriterion("DWMC_GZ >=", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzLessThan(String value) {
            addCriterion("DWMC_GZ <", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzLessThanOrEqualTo(String value) {
            addCriterion("DWMC_GZ <=", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzLike(String value) {
            addCriterion("DWMC_GZ like", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzNotLike(String value) {
            addCriterion("DWMC_GZ not like", value, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzIn(List<String> values) {
            addCriterion("DWMC_GZ in", values, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzNotIn(List<String> values) {
            addCriterion("DWMC_GZ not in", values, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzBetween(String value1, String value2) {
            addCriterion("DWMC_GZ between", value1, value2, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andDwmcGzNotBetween(String value1, String value2) {
            addCriterion("DWMC_GZ not between", value1, value2, "dwmcGz");
            return (Criteria) this;
        }

        public Criteria andSsdmIsNull() {
            addCriterion("SSDM is null");
            return (Criteria) this;
        }

        public Criteria andSsdmIsNotNull() {
            addCriterion("SSDM is not null");
            return (Criteria) this;
        }

        public Criteria andSsdmEqualTo(String value) {
            addCriterion("SSDM =", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmNotEqualTo(String value) {
            addCriterion("SSDM <>", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmGreaterThan(String value) {
            addCriterion("SSDM >", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmGreaterThanOrEqualTo(String value) {
            addCriterion("SSDM >=", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmLessThan(String value) {
            addCriterion("SSDM <", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmLessThanOrEqualTo(String value) {
            addCriterion("SSDM <=", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmLike(String value) {
            addCriterion("SSDM like", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmNotLike(String value) {
            addCriterion("SSDM not like", value, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmIn(List<String> values) {
            addCriterion("SSDM in", values, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmNotIn(List<String> values) {
            addCriterion("SSDM not in", values, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmBetween(String value1, String value2) {
            addCriterion("SSDM between", value1, value2, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSsdmNotBetween(String value1, String value2) {
            addCriterion("SSDM not between", value1, value2, "ssdm");
            return (Criteria) this;
        }

        public Criteria andSskzdyIsNull() {
            addCriterion("SSKZDY is null");
            return (Criteria) this;
        }

        public Criteria andSskzdyIsNotNull() {
            addCriterion("SSKZDY is not null");
            return (Criteria) this;
        }

        public Criteria andSskzdyEqualTo(String value) {
            addCriterion("SSKZDY =", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyNotEqualTo(String value) {
            addCriterion("SSKZDY <>", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyGreaterThan(String value) {
            addCriterion("SSKZDY >", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyGreaterThanOrEqualTo(String value) {
            addCriterion("SSKZDY >=", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyLessThan(String value) {
            addCriterion("SSKZDY <", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyLessThanOrEqualTo(String value) {
            addCriterion("SSKZDY <=", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyLike(String value) {
            addCriterion("SSKZDY like", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyNotLike(String value) {
            addCriterion("SSKZDY not like", value, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyIn(List<String> values) {
            addCriterion("SSKZDY in", values, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyNotIn(List<String> values) {
            addCriterion("SSKZDY not in", values, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyBetween(String value1, String value2) {
            addCriterion("SSKZDY between", value1, value2, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andSskzdyNotBetween(String value1, String value2) {
            addCriterion("SSKZDY not between", value1, value2, "sskzdy");
            return (Criteria) this;
        }

        public Criteria andYydwmcIsNull() {
            addCriterion("YYDWMC is null");
            return (Criteria) this;
        }

        public Criteria andYydwmcIsNotNull() {
            addCriterion("YYDWMC is not null");
            return (Criteria) this;
        }

        public Criteria andYydwmcEqualTo(String value) {
            addCriterion("YYDWMC =", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcNotEqualTo(String value) {
            addCriterion("YYDWMC <>", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcGreaterThan(String value) {
            addCriterion("YYDWMC >", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcGreaterThanOrEqualTo(String value) {
            addCriterion("YYDWMC >=", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcLessThan(String value) {
            addCriterion("YYDWMC <", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcLessThanOrEqualTo(String value) {
            addCriterion("YYDWMC <=", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcLike(String value) {
            addCriterion("YYDWMC like", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcNotLike(String value) {
            addCriterion("YYDWMC not like", value, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcIn(List<String> values) {
            addCriterion("YYDWMC in", values, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcNotIn(List<String> values) {
            addCriterion("YYDWMC not in", values, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcBetween(String value1, String value2) {
            addCriterion("YYDWMC between", value1, value2, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andYydwmcNotBetween(String value1, String value2) {
            addCriterion("YYDWMC not between", value1, value2, "yydwmc");
            return (Criteria) this;
        }

        public Criteria andFddbrIsNull() {
            addCriterion("FDDBR is null");
            return (Criteria) this;
        }

        public Criteria andFddbrIsNotNull() {
            addCriterion("FDDBR is not null");
            return (Criteria) this;
        }

        public Criteria andFddbrEqualTo(String value) {
            addCriterion("FDDBR =", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotEqualTo(String value) {
            addCriterion("FDDBR <>", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrGreaterThan(String value) {
            addCriterion("FDDBR >", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrGreaterThanOrEqualTo(String value) {
            addCriterion("FDDBR >=", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrLessThan(String value) {
            addCriterion("FDDBR <", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrLessThanOrEqualTo(String value) {
            addCriterion("FDDBR <=", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrLike(String value) {
            addCriterion("FDDBR like", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotLike(String value) {
            addCriterion("FDDBR not like", value, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrIn(List<String> values) {
            addCriterion("FDDBR in", values, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotIn(List<String> values) {
            addCriterion("FDDBR not in", values, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrBetween(String value1, String value2) {
            addCriterion("FDDBR between", value1, value2, "fddbr");
            return (Criteria) this;
        }

        public Criteria andFddbrNotBetween(String value1, String value2) {
            addCriterion("FDDBR not between", value1, value2, "fddbr");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsIsNull() {
            addCriterion("QYXXDZ_S_ZZQ_ZXS is null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsIsNotNull() {
            addCriterion("QYXXDZ_S_ZZQ_ZXS is not null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsEqualTo(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS =", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsNotEqualTo(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS <>", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsGreaterThan(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS >", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsGreaterThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS >=", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsLessThan(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS <", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsLessThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS <=", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsLike(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS like", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsNotLike(String value) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS not like", value, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsIn(List<String> values) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS in", values, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsNotIn(List<String> values) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS not in", values, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsBetween(String value1, String value2) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS between", value1, value2, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzSZzqZxsNotBetween(String value1, String value2) {
            addCriterion("QYXXDZ_S_ZZQ_ZXS not between", value1, value2, "qyxxdzSZzqZxs");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMIsNull() {
            addCriterion("QYXXDZ_DQ_S_Z_M is null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMIsNotNull() {
            addCriterion("QYXXDZ_DQ_S_Z_M is not null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMEqualTo(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M =", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMNotEqualTo(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M <>", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMGreaterThan(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M >", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMGreaterThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M >=", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMLessThan(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M <", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMLessThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M <=", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMLike(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M like", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMNotLike(String value) {
            addCriterion("QYXXDZ_DQ_S_Z_M not like", value, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMIn(List<String> values) {
            addCriterion("QYXXDZ_DQ_S_Z_M in", values, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMNotIn(List<String> values) {
            addCriterion("QYXXDZ_DQ_S_Z_M not in", values, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMBetween(String value1, String value2) {
            addCriterion("QYXXDZ_DQ_S_Z_M between", value1, value2, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzDqSZMNotBetween(String value1, String value2) {
            addCriterion("QYXXDZ_DQ_S_Z_M not between", value1, value2, "qyxxdzDqSZM");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQIsNull() {
            addCriterion("QYXXDZ_X_Q_S_Q is null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQIsNotNull() {
            addCriterion("QYXXDZ_X_Q_S_Q is not null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQEqualTo(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q =", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQNotEqualTo(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q <>", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQGreaterThan(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q >", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQGreaterThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q >=", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQLessThan(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q <", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQLessThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q <=", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQLike(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q like", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQNotLike(String value) {
            addCriterion("QYXXDZ_X_Q_S_Q not like", value, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQIn(List<String> values) {
            addCriterion("QYXXDZ_X_Q_S_Q in", values, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQNotIn(List<String> values) {
            addCriterion("QYXXDZ_X_Q_S_Q not in", values, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQBetween(String value1, String value2) {
            addCriterion("QYXXDZ_X_Q_S_Q between", value1, value2, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXQSQNotBetween(String value1, String value2) {
            addCriterion("QYXXDZ_X_Q_S_Q not between", value1, value2, "qyxxdzXQSQ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZIsNull() {
            addCriterion("QYXXDZ_X_Z is null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZIsNotNull() {
            addCriterion("QYXXDZ_X_Z is not null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZEqualTo(String value) {
            addCriterion("QYXXDZ_X_Z =", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZNotEqualTo(String value) {
            addCriterion("QYXXDZ_X_Z <>", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZGreaterThan(String value) {
            addCriterion("QYXXDZ_X_Z >", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZGreaterThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_X_Z >=", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZLessThan(String value) {
            addCriterion("QYXXDZ_X_Z <", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZLessThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_X_Z <=", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZLike(String value) {
            addCriterion("QYXXDZ_X_Z like", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZNotLike(String value) {
            addCriterion("QYXXDZ_X_Z not like", value, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZIn(List<String> values) {
            addCriterion("QYXXDZ_X_Z in", values, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZNotIn(List<String> values) {
            addCriterion("QYXXDZ_X_Z not in", values, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZBetween(String value1, String value2) {
            addCriterion("QYXXDZ_X_Z between", value1, value2, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzXZNotBetween(String value1, String value2) {
            addCriterion("QYXXDZ_X_Z not between", value1, value2, "qyxxdzXZ");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphIsNull() {
            addCriterion("QYXXDZ_J_C_MPH is null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphIsNotNull() {
            addCriterion("QYXXDZ_J_C_MPH is not null");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphEqualTo(String value) {
            addCriterion("QYXXDZ_J_C_MPH =", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphNotEqualTo(String value) {
            addCriterion("QYXXDZ_J_C_MPH <>", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphGreaterThan(String value) {
            addCriterion("QYXXDZ_J_C_MPH >", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphGreaterThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_J_C_MPH >=", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphLessThan(String value) {
            addCriterion("QYXXDZ_J_C_MPH <", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphLessThanOrEqualTo(String value) {
            addCriterion("QYXXDZ_J_C_MPH <=", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphLike(String value) {
            addCriterion("QYXXDZ_J_C_MPH like", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphNotLike(String value) {
            addCriterion("QYXXDZ_J_C_MPH not like", value, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphIn(List<String> values) {
            addCriterion("QYXXDZ_J_C_MPH in", values, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphNotIn(List<String> values) {
            addCriterion("QYXXDZ_J_C_MPH not in", values, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphBetween(String value1, String value2) {
            addCriterion("QYXXDZ_J_C_MPH between", value1, value2, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andQyxxdzJCMphNotBetween(String value1, String value2) {
            addCriterion("QYXXDZ_J_C_MPH not between", value1, value2, "qyxxdzJCMph");
            return (Criteria) this;
        }

        public Criteria andZxjdDIsNull() {
            addCriterion("ZXJD_D is null");
            return (Criteria) this;
        }

        public Criteria andZxjdDIsNotNull() {
            addCriterion("ZXJD_D is not null");
            return (Criteria) this;
        }

        public Criteria andZxjdDEqualTo(Integer value) {
            addCriterion("ZXJD_D =", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDNotEqualTo(Integer value) {
            addCriterion("ZXJD_D <>", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDGreaterThan(Integer value) {
            addCriterion("ZXJD_D >", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZXJD_D >=", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDLessThan(Integer value) {
            addCriterion("ZXJD_D <", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDLessThanOrEqualTo(Integer value) {
            addCriterion("ZXJD_D <=", value, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDIn(List<Integer> values) {
            addCriterion("ZXJD_D in", values, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDNotIn(List<Integer> values) {
            addCriterion("ZXJD_D not in", values, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDBetween(Integer value1, Integer value2) {
            addCriterion("ZXJD_D between", value1, value2, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdDNotBetween(Integer value1, Integer value2) {
            addCriterion("ZXJD_D not between", value1, value2, "zxjdD");
            return (Criteria) this;
        }

        public Criteria andZxjdFIsNull() {
            addCriterion("ZXJD_F is null");
            return (Criteria) this;
        }

        public Criteria andZxjdFIsNotNull() {
            addCriterion("ZXJD_F is not null");
            return (Criteria) this;
        }

        public Criteria andZxjdFEqualTo(Integer value) {
            addCriterion("ZXJD_F =", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFNotEqualTo(Integer value) {
            addCriterion("ZXJD_F <>", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFGreaterThan(Integer value) {
            addCriterion("ZXJD_F >", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZXJD_F >=", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFLessThan(Integer value) {
            addCriterion("ZXJD_F <", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFLessThanOrEqualTo(Integer value) {
            addCriterion("ZXJD_F <=", value, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFIn(List<Integer> values) {
            addCriterion("ZXJD_F in", values, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFNotIn(List<Integer> values) {
            addCriterion("ZXJD_F not in", values, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFBetween(Integer value1, Integer value2) {
            addCriterion("ZXJD_F between", value1, value2, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdFNotBetween(Integer value1, Integer value2) {
            addCriterion("ZXJD_F not between", value1, value2, "zxjdF");
            return (Criteria) this;
        }

        public Criteria andZxjdMIsNull() {
            addCriterion("ZXJD_M is null");
            return (Criteria) this;
        }

        public Criteria andZxjdMIsNotNull() {
            addCriterion("ZXJD_M is not null");
            return (Criteria) this;
        }

        public Criteria andZxjdMEqualTo(Integer value) {
            addCriterion("ZXJD_M =", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMNotEqualTo(Integer value) {
            addCriterion("ZXJD_M <>", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMGreaterThan(Integer value) {
            addCriterion("ZXJD_M >", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZXJD_M >=", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMLessThan(Integer value) {
            addCriterion("ZXJD_M <", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMLessThanOrEqualTo(Integer value) {
            addCriterion("ZXJD_M <=", value, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMIn(List<Integer> values) {
            addCriterion("ZXJD_M in", values, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMNotIn(List<Integer> values) {
            addCriterion("ZXJD_M not in", values, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMBetween(Integer value1, Integer value2) {
            addCriterion("ZXJD_M between", value1, value2, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andZxjdMNotBetween(Integer value1, Integer value2) {
            addCriterion("ZXJD_M not between", value1, value2, "zxjdM");
            return (Criteria) this;
        }

        public Criteria andJdIsNull() {
            addCriterion("JD is null");
            return (Criteria) this;
        }

        public Criteria andJdIsNotNull() {
            addCriterion("JD is not null");
            return (Criteria) this;
        }

        public Criteria andJdEqualTo(Double value) {
            addCriterion("JD =", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotEqualTo(Double value) {
            addCriterion("JD <>", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdGreaterThan(Double value) {
            addCriterion("JD >", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdGreaterThanOrEqualTo(Double value) {
            addCriterion("JD >=", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLessThan(Double value) {
            addCriterion("JD <", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdLessThanOrEqualTo(Double value) {
            addCriterion("JD <=", value, "jd");
            return (Criteria) this;
        }

        public Criteria andJdIn(List<Double> values) {
            addCriterion("JD in", values, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotIn(List<Double> values) {
            addCriterion("JD not in", values, "jd");
            return (Criteria) this;
        }

        public Criteria andJdBetween(Double value1, Double value2) {
            addCriterion("JD between", value1, value2, "jd");
            return (Criteria) this;
        }

        public Criteria andJdNotBetween(Double value1, Double value2) {
            addCriterion("JD not between", value1, value2, "jd");
            return (Criteria) this;
        }

        public Criteria andZxwdDIsNull() {
            addCriterion("ZXWD_D is null");
            return (Criteria) this;
        }

        public Criteria andZxwdDIsNotNull() {
            addCriterion("ZXWD_D is not null");
            return (Criteria) this;
        }

        public Criteria andZxwdDEqualTo(Integer value) {
            addCriterion("ZXWD_D =", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDNotEqualTo(Integer value) {
            addCriterion("ZXWD_D <>", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDGreaterThan(Integer value) {
            addCriterion("ZXWD_D >", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZXWD_D >=", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDLessThan(Integer value) {
            addCriterion("ZXWD_D <", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDLessThanOrEqualTo(Integer value) {
            addCriterion("ZXWD_D <=", value, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDIn(List<Integer> values) {
            addCriterion("ZXWD_D in", values, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDNotIn(List<Integer> values) {
            addCriterion("ZXWD_D not in", values, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDBetween(Integer value1, Integer value2) {
            addCriterion("ZXWD_D between", value1, value2, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdDNotBetween(Integer value1, Integer value2) {
            addCriterion("ZXWD_D not between", value1, value2, "zxwdD");
            return (Criteria) this;
        }

        public Criteria andZxwdFIsNull() {
            addCriterion("ZXWD_F is null");
            return (Criteria) this;
        }

        public Criteria andZxwdFIsNotNull() {
            addCriterion("ZXWD_F is not null");
            return (Criteria) this;
        }

        public Criteria andZxwdFEqualTo(Integer value) {
            addCriterion("ZXWD_F =", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFNotEqualTo(Integer value) {
            addCriterion("ZXWD_F <>", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFGreaterThan(Integer value) {
            addCriterion("ZXWD_F >", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZXWD_F >=", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFLessThan(Integer value) {
            addCriterion("ZXWD_F <", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFLessThanOrEqualTo(Integer value) {
            addCriterion("ZXWD_F <=", value, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFIn(List<Integer> values) {
            addCriterion("ZXWD_F in", values, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFNotIn(List<Integer> values) {
            addCriterion("ZXWD_F not in", values, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFBetween(Integer value1, Integer value2) {
            addCriterion("ZXWD_F between", value1, value2, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdFNotBetween(Integer value1, Integer value2) {
            addCriterion("ZXWD_F not between", value1, value2, "zxwdF");
            return (Criteria) this;
        }

        public Criteria andZxwdMIsNull() {
            addCriterion("ZXWD_M is null");
            return (Criteria) this;
        }

        public Criteria andZxwdMIsNotNull() {
            addCriterion("ZXWD_M is not null");
            return (Criteria) this;
        }

        public Criteria andZxwdMEqualTo(Integer value) {
            addCriterion("ZXWD_M =", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMNotEqualTo(Integer value) {
            addCriterion("ZXWD_M <>", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMGreaterThan(Integer value) {
            addCriterion("ZXWD_M >", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZXWD_M >=", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMLessThan(Integer value) {
            addCriterion("ZXWD_M <", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMLessThanOrEqualTo(Integer value) {
            addCriterion("ZXWD_M <=", value, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMIn(List<Integer> values) {
            addCriterion("ZXWD_M in", values, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMNotIn(List<Integer> values) {
            addCriterion("ZXWD_M not in", values, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMBetween(Integer value1, Integer value2) {
            addCriterion("ZXWD_M between", value1, value2, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andZxwdMNotBetween(Integer value1, Integer value2) {
            addCriterion("ZXWD_M not between", value1, value2, "zxwdM");
            return (Criteria) this;
        }

        public Criteria andWdIsNull() {
            addCriterion("WD is null");
            return (Criteria) this;
        }

        public Criteria andWdIsNotNull() {
            addCriterion("WD is not null");
            return (Criteria) this;
        }

        public Criteria andWdEqualTo(Double value) {
            addCriterion("WD =", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotEqualTo(Double value) {
            addCriterion("WD <>", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdGreaterThan(Double value) {
            addCriterion("WD >", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdGreaterThanOrEqualTo(Double value) {
            addCriterion("WD >=", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLessThan(Double value) {
            addCriterion("WD <", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdLessThanOrEqualTo(Double value) {
            addCriterion("WD <=", value, "wd");
            return (Criteria) this;
        }

        public Criteria andWdIn(List<Double> values) {
            addCriterion("WD in", values, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotIn(List<Double> values) {
            addCriterion("WD not in", values, "wd");
            return (Criteria) this;
        }

        public Criteria andWdBetween(Double value1, Double value2) {
            addCriterion("WD between", value1, value2, "wd");
            return (Criteria) this;
        }

        public Criteria andWdNotBetween(Double value1, Double value2) {
            addCriterion("WD not between", value1, value2, "wd");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmIsNull() {
            addCriterion("LXFSDHHM is null");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmIsNotNull() {
            addCriterion("LXFSDHHM is not null");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmEqualTo(String value) {
            addCriterion("LXFSDHHM =", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmNotEqualTo(String value) {
            addCriterion("LXFSDHHM <>", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmGreaterThan(String value) {
            addCriterion("LXFSDHHM >", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmGreaterThanOrEqualTo(String value) {
            addCriterion("LXFSDHHM >=", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmLessThan(String value) {
            addCriterion("LXFSDHHM <", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmLessThanOrEqualTo(String value) {
            addCriterion("LXFSDHHM <=", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmLike(String value) {
            addCriterion("LXFSDHHM like", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmNotLike(String value) {
            addCriterion("LXFSDHHM not like", value, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmIn(List<String> values) {
            addCriterion("LXFSDHHM in", values, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmNotIn(List<String> values) {
            addCriterion("LXFSDHHM not in", values, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmBetween(String value1, String value2) {
            addCriterion("LXFSDHHM between", value1, value2, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfsdhhmNotBetween(String value1, String value2) {
            addCriterion("LXFSDHHM not between", value1, value2, "lxfsdhhm");
            return (Criteria) this;
        }

        public Criteria andLxfslxrIsNull() {
            addCriterion("LXFSLXR is null");
            return (Criteria) this;
        }

        public Criteria andLxfslxrIsNotNull() {
            addCriterion("LXFSLXR is not null");
            return (Criteria) this;
        }

        public Criteria andLxfslxrEqualTo(String value) {
            addCriterion("LXFSLXR =", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrNotEqualTo(String value) {
            addCriterion("LXFSLXR <>", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrGreaterThan(String value) {
            addCriterion("LXFSLXR >", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrGreaterThanOrEqualTo(String value) {
            addCriterion("LXFSLXR >=", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrLessThan(String value) {
            addCriterion("LXFSLXR <", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrLessThanOrEqualTo(String value) {
            addCriterion("LXFSLXR <=", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrLike(String value) {
            addCriterion("LXFSLXR like", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrNotLike(String value) {
            addCriterion("LXFSLXR not like", value, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrIn(List<String> values) {
            addCriterion("LXFSLXR in", values, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrNotIn(List<String> values) {
            addCriterion("LXFSLXR not in", values, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrBetween(String value1, String value2) {
            addCriterion("LXFSLXR between", value1, value2, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfslxrNotBetween(String value1, String value2) {
            addCriterion("LXFSLXR not between", value1, value2, "lxfslxr");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmIsNull() {
            addCriterion("LXFSCZHM is null");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmIsNotNull() {
            addCriterion("LXFSCZHM is not null");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmEqualTo(String value) {
            addCriterion("LXFSCZHM =", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmNotEqualTo(String value) {
            addCriterion("LXFSCZHM <>", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmGreaterThan(String value) {
            addCriterion("LXFSCZHM >", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmGreaterThanOrEqualTo(String value) {
            addCriterion("LXFSCZHM >=", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmLessThan(String value) {
            addCriterion("LXFSCZHM <", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmLessThanOrEqualTo(String value) {
            addCriterion("LXFSCZHM <=", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmLike(String value) {
            addCriterion("LXFSCZHM like", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmNotLike(String value) {
            addCriterion("LXFSCZHM not like", value, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmIn(List<String> values) {
            addCriterion("LXFSCZHM in", values, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmNotIn(List<String> values) {
            addCriterion("LXFSCZHM not in", values, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmBetween(String value1, String value2) {
            addCriterion("LXFSCZHM between", value1, value2, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsczhmNotBetween(String value1, String value2) {
            addCriterion("LXFSCZHM not between", value1, value2, "lxfsczhm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmIsNull() {
            addCriterion("LXFSYZBM is null");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmIsNotNull() {
            addCriterion("LXFSYZBM is not null");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmEqualTo(String value) {
            addCriterion("LXFSYZBM =", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmNotEqualTo(String value) {
            addCriterion("LXFSYZBM <>", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmGreaterThan(String value) {
            addCriterion("LXFSYZBM >", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmGreaterThanOrEqualTo(String value) {
            addCriterion("LXFSYZBM >=", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmLessThan(String value) {
            addCriterion("LXFSYZBM <", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmLessThanOrEqualTo(String value) {
            addCriterion("LXFSYZBM <=", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmLike(String value) {
            addCriterion("LXFSYZBM like", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmNotLike(String value) {
            addCriterion("LXFSYZBM not like", value, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmIn(List<String> values) {
            addCriterion("LXFSYZBM in", values, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmNotIn(List<String> values) {
            addCriterion("LXFSYZBM not in", values, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmBetween(String value1, String value2) {
            addCriterion("LXFSYZBM between", value1, value2, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andLxfsyzbmNotBetween(String value1, String value2) {
            addCriterion("LXFSYZBM not between", value1, value2, "lxfsyzbm");
            return (Criteria) this;
        }

        public Criteria andWsclsslxIsNull() {
            addCriterion("WSCLSSLX is null");
            return (Criteria) this;
        }

        public Criteria andWsclsslxIsNotNull() {
            addCriterion("WSCLSSLX is not null");
            return (Criteria) this;
        }

        public Criteria andWsclsslxEqualTo(String value) {
            addCriterion("WSCLSSLX =", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxNotEqualTo(String value) {
            addCriterion("WSCLSSLX <>", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxGreaterThan(String value) {
            addCriterion("WSCLSSLX >", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxGreaterThanOrEqualTo(String value) {
            addCriterion("WSCLSSLX >=", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxLessThan(String value) {
            addCriterion("WSCLSSLX <", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxLessThanOrEqualTo(String value) {
            addCriterion("WSCLSSLX <=", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxLike(String value) {
            addCriterion("WSCLSSLX like", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxNotLike(String value) {
            addCriterion("WSCLSSLX not like", value, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxIn(List<String> values) {
            addCriterion("WSCLSSLX in", values, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxNotIn(List<String> values) {
            addCriterion("WSCLSSLX not in", values, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxBetween(String value1, String value2) {
            addCriterion("WSCLSSLX between", value1, value2, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclsslxNotBetween(String value1, String value2) {
            addCriterion("WSCLSSLX not between", value1, value2, "wsclsslx");
            return (Criteria) this;
        }

        public Criteria andWsclcsmcIsNull() {
            addCriterion("WSCLCSMC is null");
            return (Criteria) this;
        }

        public Criteria andWsclcsmcIsNotNull() {
            addCriterion("WSCLCSMC is not null");
            return (Criteria) this;
        }

        public Criteria andWsclcsmcEqualTo(String value) {
            addCriterion("WSCLCSMC =", value, "wsclcsmc");
            return (Criteria) this;
        }

        public Criteria andWsclcsmcNotEqualTo(String value) {
            addCriterion("WSCLCSMC <>", value, "wsclcsmc");
            return (Criteria) this;
        }

        public Criteria andWsclcsmcGreaterThan(String value) {
            addCriterion("WSCLCSMC >", value, "wsclcsmc");
            return (Criteria) this;
        }

        public Criteria andWsclcsmcGreaterThanOrEqualTo(String value) {
            addCriterion("WSCLCSMC >=", value, "wsclcsmc");
            return (Criteria) this;
        }

        public Criteria andWsclcsmcLessThan(String value) {
            addCriterion("WSCLCSMC <", value, "wsclcsmc");
            return (Criteria) this;
        }

        public Criteria andWsclcsmcLessThanOrEqualTo(String value) {
            addCriterion("WSCLCSMC <=", value, "wsclcsmc");
            return (Criteria) this;
        }

        public Criteria andWsclcsmcLike(String value) {
            addCriterion("WSCLCSMC like", value, "wsclcsmc");
            return (Criteria) this;
        }

        public Criteria andWsclcsmcNotLike(String value) {
            addCriterion("WSCLCSMC not like", value, "wsclcsmc");
            return (Criteria) this;
        }

        public Criteria andWsclcsmcIn(List<String> values) {
            addCriterion("WSCLCSMC in", values, "wsclcsmc");
            return (Criteria) this;
        }

        public Criteria andWsclcsmcNotIn(List<String> values) {
            addCriterion("WSCLCSMC not in", values, "wsclcsmc");
            return (Criteria) this;
        }

        public Criteria andWsclcsmcBetween(String value1, String value2) {
            addCriterion("WSCLCSMC between", value1, value2, "wsclcsmc");
            return (Criteria) this;
        }

        public Criteria andWsclcsmcNotBetween(String value1, String value2) {
            addCriterion("WSCLCSMC not between", value1, value2, "wsclcsmc");
            return (Criteria) this;
        }

        public Criteria andJcsjIsNull() {
            addCriterion("JCSJ is null");
            return (Criteria) this;
        }

        public Criteria andJcsjIsNotNull() {
            addCriterion("JCSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJcsjEqualTo(Integer value) {
            addCriterion("JCSJ =", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjNotEqualTo(Integer value) {
            addCriterion("JCSJ <>", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjGreaterThan(Integer value) {
            addCriterion("JCSJ >", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjGreaterThanOrEqualTo(Integer value) {
            addCriterion("JCSJ >=", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjLessThan(Integer value) {
            addCriterion("JCSJ <", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjLessThanOrEqualTo(Integer value) {
            addCriterion("JCSJ <=", value, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjIn(List<Integer> values) {
            addCriterion("JCSJ in", values, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjNotIn(List<Integer> values) {
            addCriterion("JCSJ not in", values, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjBetween(Integer value1, Integer value2) {
            addCriterion("JCSJ between", value1, value2, "jcsj");
            return (Criteria) this;
        }

        public Criteria andJcsjNotBetween(Integer value1, Integer value2) {
            addCriterion("JCSJ not between", value1, value2, "jcsj");
            return (Criteria) this;
        }

        public Criteria andWscljbIsNull() {
            addCriterion("WSCLJB is null");
            return (Criteria) this;
        }

        public Criteria andWscljbIsNotNull() {
            addCriterion("WSCLJB is not null");
            return (Criteria) this;
        }

        public Criteria andWscljbEqualTo(String value) {
            addCriterion("WSCLJB =", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbNotEqualTo(String value) {
            addCriterion("WSCLJB <>", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbGreaterThan(String value) {
            addCriterion("WSCLJB >", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbGreaterThanOrEqualTo(String value) {
            addCriterion("WSCLJB >=", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbLessThan(String value) {
            addCriterion("WSCLJB <", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbLessThanOrEqualTo(String value) {
            addCriterion("WSCLJB <=", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbLike(String value) {
            addCriterion("WSCLJB like", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbNotLike(String value) {
            addCriterion("WSCLJB not like", value, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbIn(List<String> values) {
            addCriterion("WSCLJB in", values, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbNotIn(List<String> values) {
            addCriterion("WSCLJB not in", values, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbBetween(String value1, String value2) {
            addCriterion("WSCLJB between", value1, value2, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWscljbNotBetween(String value1, String value2) {
            addCriterion("WSCLJB not between", value1, value2, "wscljb");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1IsNull() {
            addCriterion("WSCLFFMC1 is null");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1IsNotNull() {
            addCriterion("WSCLFFMC1 is not null");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1EqualTo(String value) {
            addCriterion("WSCLFFMC1 =", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1NotEqualTo(String value) {
            addCriterion("WSCLFFMC1 <>", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1GreaterThan(String value) {
            addCriterion("WSCLFFMC1 >", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1GreaterThanOrEqualTo(String value) {
            addCriterion("WSCLFFMC1 >=", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1LessThan(String value) {
            addCriterion("WSCLFFMC1 <", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1LessThanOrEqualTo(String value) {
            addCriterion("WSCLFFMC1 <=", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1Like(String value) {
            addCriterion("WSCLFFMC1 like", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1NotLike(String value) {
            addCriterion("WSCLFFMC1 not like", value, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1In(List<String> values) {
            addCriterion("WSCLFFMC1 in", values, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1NotIn(List<String> values) {
            addCriterion("WSCLFFMC1 not in", values, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1Between(String value1, String value2) {
            addCriterion("WSCLFFMC1 between", value1, value2, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc1NotBetween(String value1, String value2) {
            addCriterion("WSCLFFMC1 not between", value1, value2, "wsclffmc1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1IsNull() {
            addCriterion("WSCLFFDM1 is null");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1IsNotNull() {
            addCriterion("WSCLFFDM1 is not null");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1EqualTo(String value) {
            addCriterion("WSCLFFDM1 =", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1NotEqualTo(String value) {
            addCriterion("WSCLFFDM1 <>", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1GreaterThan(String value) {
            addCriterion("WSCLFFDM1 >", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1GreaterThanOrEqualTo(String value) {
            addCriterion("WSCLFFDM1 >=", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1LessThan(String value) {
            addCriterion("WSCLFFDM1 <", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1LessThanOrEqualTo(String value) {
            addCriterion("WSCLFFDM1 <=", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1Like(String value) {
            addCriterion("WSCLFFDM1 like", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1NotLike(String value) {
            addCriterion("WSCLFFDM1 not like", value, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1In(List<String> values) {
            addCriterion("WSCLFFDM1 in", values, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1NotIn(List<String> values) {
            addCriterion("WSCLFFDM1 not in", values, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1Between(String value1, String value2) {
            addCriterion("WSCLFFDM1 between", value1, value2, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffdm1NotBetween(String value1, String value2) {
            addCriterion("WSCLFFDM1 not between", value1, value2, "wsclffdm1");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2IsNull() {
            addCriterion("WSCLFFMC2 is null");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2IsNotNull() {
            addCriterion("WSCLFFMC2 is not null");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2EqualTo(String value) {
            addCriterion("WSCLFFMC2 =", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2NotEqualTo(String value) {
            addCriterion("WSCLFFMC2 <>", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2GreaterThan(String value) {
            addCriterion("WSCLFFMC2 >", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2GreaterThanOrEqualTo(String value) {
            addCriterion("WSCLFFMC2 >=", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2LessThan(String value) {
            addCriterion("WSCLFFMC2 <", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2LessThanOrEqualTo(String value) {
            addCriterion("WSCLFFMC2 <=", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2Like(String value) {
            addCriterion("WSCLFFMC2 like", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2NotLike(String value) {
            addCriterion("WSCLFFMC2 not like", value, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2In(List<String> values) {
            addCriterion("WSCLFFMC2 in", values, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2NotIn(List<String> values) {
            addCriterion("WSCLFFMC2 not in", values, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2Between(String value1, String value2) {
            addCriterion("WSCLFFMC2 between", value1, value2, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc2NotBetween(String value1, String value2) {
            addCriterion("WSCLFFMC2 not between", value1, value2, "wsclffmc2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2IsNull() {
            addCriterion("WSCLFFDM2 is null");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2IsNotNull() {
            addCriterion("WSCLFFDM2 is not null");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2EqualTo(String value) {
            addCriterion("WSCLFFDM2 =", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2NotEqualTo(String value) {
            addCriterion("WSCLFFDM2 <>", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2GreaterThan(String value) {
            addCriterion("WSCLFFDM2 >", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2GreaterThanOrEqualTo(String value) {
            addCriterion("WSCLFFDM2 >=", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2LessThan(String value) {
            addCriterion("WSCLFFDM2 <", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2LessThanOrEqualTo(String value) {
            addCriterion("WSCLFFDM2 <=", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2Like(String value) {
            addCriterion("WSCLFFDM2 like", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2NotLike(String value) {
            addCriterion("WSCLFFDM2 not like", value, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2In(List<String> values) {
            addCriterion("WSCLFFDM2 in", values, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2NotIn(List<String> values) {
            addCriterion("WSCLFFDM2 not in", values, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2Between(String value1, String value2) {
            addCriterion("WSCLFFDM2 between", value1, value2, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffdm2NotBetween(String value1, String value2) {
            addCriterion("WSCLFFDM2 not between", value1, value2, "wsclffdm2");
            return (Criteria) this;
        }

        public Criteria andWsclffmc3IsNull() {
            addCriterion("WSCLFFMC3 is null");
            return (Criteria) this;
        }

        public Criteria andWsclffmc3IsNotNull() {
            addCriterion("WSCLFFMC3 is not null");
            return (Criteria) this;
        }

        public Criteria andWsclffmc3EqualTo(String value) {
            addCriterion("WSCLFFMC3 =", value, "wsclffmc3");
            return (Criteria) this;
        }

        public Criteria andWsclffmc3NotEqualTo(String value) {
            addCriterion("WSCLFFMC3 <>", value, "wsclffmc3");
            return (Criteria) this;
        }

        public Criteria andWsclffmc3GreaterThan(String value) {
            addCriterion("WSCLFFMC3 >", value, "wsclffmc3");
            return (Criteria) this;
        }

        public Criteria andWsclffmc3GreaterThanOrEqualTo(String value) {
            addCriterion("WSCLFFMC3 >=", value, "wsclffmc3");
            return (Criteria) this;
        }

        public Criteria andWsclffmc3LessThan(String value) {
            addCriterion("WSCLFFMC3 <", value, "wsclffmc3");
            return (Criteria) this;
        }

        public Criteria andWsclffmc3LessThanOrEqualTo(String value) {
            addCriterion("WSCLFFMC3 <=", value, "wsclffmc3");
            return (Criteria) this;
        }

        public Criteria andWsclffmc3Like(String value) {
            addCriterion("WSCLFFMC3 like", value, "wsclffmc3");
            return (Criteria) this;
        }

        public Criteria andWsclffmc3NotLike(String value) {
            addCriterion("WSCLFFMC3 not like", value, "wsclffmc3");
            return (Criteria) this;
        }

        public Criteria andWsclffmc3In(List<String> values) {
            addCriterion("WSCLFFMC3 in", values, "wsclffmc3");
            return (Criteria) this;
        }

        public Criteria andWsclffmc3NotIn(List<String> values) {
            addCriterion("WSCLFFMC3 not in", values, "wsclffmc3");
            return (Criteria) this;
        }

        public Criteria andWsclffmc3Between(String value1, String value2) {
            addCriterion("WSCLFFMC3 between", value1, value2, "wsclffmc3");
            return (Criteria) this;
        }

        public Criteria andWsclffmc3NotBetween(String value1, String value2) {
            addCriterion("WSCLFFMC3 not between", value1, value2, "wsclffmc3");
            return (Criteria) this;
        }

        public Criteria andWsclffdm3IsNull() {
            addCriterion("WSCLFFDM3 is null");
            return (Criteria) this;
        }

        public Criteria andWsclffdm3IsNotNull() {
            addCriterion("WSCLFFDM3 is not null");
            return (Criteria) this;
        }

        public Criteria andWsclffdm3EqualTo(String value) {
            addCriterion("WSCLFFDM3 =", value, "wsclffdm3");
            return (Criteria) this;
        }

        public Criteria andWsclffdm3NotEqualTo(String value) {
            addCriterion("WSCLFFDM3 <>", value, "wsclffdm3");
            return (Criteria) this;
        }

        public Criteria andWsclffdm3GreaterThan(String value) {
            addCriterion("WSCLFFDM3 >", value, "wsclffdm3");
            return (Criteria) this;
        }

        public Criteria andWsclffdm3GreaterThanOrEqualTo(String value) {
            addCriterion("WSCLFFDM3 >=", value, "wsclffdm3");
            return (Criteria) this;
        }

        public Criteria andWsclffdm3LessThan(String value) {
            addCriterion("WSCLFFDM3 <", value, "wsclffdm3");
            return (Criteria) this;
        }

        public Criteria andWsclffdm3LessThanOrEqualTo(String value) {
            addCriterion("WSCLFFDM3 <=", value, "wsclffdm3");
            return (Criteria) this;
        }

        public Criteria andWsclffdm3Like(String value) {
            addCriterion("WSCLFFDM3 like", value, "wsclffdm3");
            return (Criteria) this;
        }

        public Criteria andWsclffdm3NotLike(String value) {
            addCriterion("WSCLFFDM3 not like", value, "wsclffdm3");
            return (Criteria) this;
        }

        public Criteria andWsclffdm3In(List<String> values) {
            addCriterion("WSCLFFDM3 in", values, "wsclffdm3");
            return (Criteria) this;
        }

        public Criteria andWsclffdm3NotIn(List<String> values) {
            addCriterion("WSCLFFDM3 not in", values, "wsclffdm3");
            return (Criteria) this;
        }

        public Criteria andWsclffdm3Between(String value1, String value2) {
            addCriterion("WSCLFFDM3 between", value1, value2, "wsclffdm3");
            return (Criteria) this;
        }

        public Criteria andWsclffdm3NotBetween(String value1, String value2) {
            addCriterion("WSCLFFDM3 not between", value1, value2, "wsclffdm3");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcIsNull() {
            addCriterion("PSQXLXMC is null");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcIsNotNull() {
            addCriterion("PSQXLXMC is not null");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcEqualTo(String value) {
            addCriterion("PSQXLXMC =", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcNotEqualTo(String value) {
            addCriterion("PSQXLXMC <>", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcGreaterThan(String value) {
            addCriterion("PSQXLXMC >", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcGreaterThanOrEqualTo(String value) {
            addCriterion("PSQXLXMC >=", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcLessThan(String value) {
            addCriterion("PSQXLXMC <", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcLessThanOrEqualTo(String value) {
            addCriterion("PSQXLXMC <=", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcLike(String value) {
            addCriterion("PSQXLXMC like", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcNotLike(String value) {
            addCriterion("PSQXLXMC not like", value, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcIn(List<String> values) {
            addCriterion("PSQXLXMC in", values, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcNotIn(List<String> values) {
            addCriterion("PSQXLXMC not in", values, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcBetween(String value1, String value2) {
            addCriterion("PSQXLXMC between", value1, value2, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxmcNotBetween(String value1, String value2) {
            addCriterion("PSQXLXMC not between", value1, value2, "psqxlxmc");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmIsNull() {
            addCriterion("PSQXLXDM is null");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmIsNotNull() {
            addCriterion("PSQXLXDM is not null");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmEqualTo(String value) {
            addCriterion("PSQXLXDM =", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmNotEqualTo(String value) {
            addCriterion("PSQXLXDM <>", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmGreaterThan(String value) {
            addCriterion("PSQXLXDM >", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmGreaterThanOrEqualTo(String value) {
            addCriterion("PSQXLXDM >=", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmLessThan(String value) {
            addCriterion("PSQXLXDM <", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmLessThanOrEqualTo(String value) {
            addCriterion("PSQXLXDM <=", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmLike(String value) {
            addCriterion("PSQXLXDM like", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmNotLike(String value) {
            addCriterion("PSQXLXDM not like", value, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmIn(List<String> values) {
            addCriterion("PSQXLXDM in", values, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmNotIn(List<String> values) {
            addCriterion("PSQXLXDM not in", values, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmBetween(String value1, String value2) {
            addCriterion("PSQXLXDM between", value1, value2, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andPsqxlxdmNotBetween(String value1, String value2) {
            addCriterion("PSQXLXDM not between", value1, value2, "psqxlxdm");
            return (Criteria) this;
        }

        public Criteria andSnstmcIsNull() {
            addCriterion("SNSTMC is null");
            return (Criteria) this;
        }

        public Criteria andSnstmcIsNotNull() {
            addCriterion("SNSTMC is not null");
            return (Criteria) this;
        }

        public Criteria andSnstmcEqualTo(String value) {
            addCriterion("SNSTMC =", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotEqualTo(String value) {
            addCriterion("SNSTMC <>", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcGreaterThan(String value) {
            addCriterion("SNSTMC >", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcGreaterThanOrEqualTo(String value) {
            addCriterion("SNSTMC >=", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcLessThan(String value) {
            addCriterion("SNSTMC <", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcLessThanOrEqualTo(String value) {
            addCriterion("SNSTMC <=", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcLike(String value) {
            addCriterion("SNSTMC like", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotLike(String value) {
            addCriterion("SNSTMC not like", value, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcIn(List<String> values) {
            addCriterion("SNSTMC in", values, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotIn(List<String> values) {
            addCriterion("SNSTMC not in", values, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcBetween(String value1, String value2) {
            addCriterion("SNSTMC between", value1, value2, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstmcNotBetween(String value1, String value2) {
            addCriterion("SNSTMC not between", value1, value2, "snstmc");
            return (Criteria) this;
        }

        public Criteria andSnstdmIsNull() {
            addCriterion("SNSTDM is null");
            return (Criteria) this;
        }

        public Criteria andSnstdmIsNotNull() {
            addCriterion("SNSTDM is not null");
            return (Criteria) this;
        }

        public Criteria andSnstdmEqualTo(String value) {
            addCriterion("SNSTDM =", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotEqualTo(String value) {
            addCriterion("SNSTDM <>", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmGreaterThan(String value) {
            addCriterion("SNSTDM >", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmGreaterThanOrEqualTo(String value) {
            addCriterion("SNSTDM >=", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmLessThan(String value) {
            addCriterion("SNSTDM <", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmLessThanOrEqualTo(String value) {
            addCriterion("SNSTDM <=", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmLike(String value) {
            addCriterion("SNSTDM like", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotLike(String value) {
            addCriterion("SNSTDM not like", value, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmIn(List<String> values) {
            addCriterion("SNSTDM in", values, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotIn(List<String> values) {
            addCriterion("SNSTDM not in", values, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmBetween(String value1, String value2) {
            addCriterion("SNSTDM between", value1, value2, "snstdm");
            return (Criteria) this;
        }

        public Criteria andSnstdmNotBetween(String value1, String value2) {
            addCriterion("SNSTDM not between", value1, value2, "snstdm");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzIsNull() {
            addCriterion("WNYYXHZZ is null");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzIsNotNull() {
            addCriterion("WNYYXHZZ is not null");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzEqualTo(String value) {
            addCriterion("WNYYXHZZ =", value, "wnyyxhzz");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzNotEqualTo(String value) {
            addCriterion("WNYYXHZZ <>", value, "wnyyxhzz");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzGreaterThan(String value) {
            addCriterion("WNYYXHZZ >", value, "wnyyxhzz");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzGreaterThanOrEqualTo(String value) {
            addCriterion("WNYYXHZZ >=", value, "wnyyxhzz");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzLessThan(String value) {
            addCriterion("WNYYXHZZ <", value, "wnyyxhzz");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzLessThanOrEqualTo(String value) {
            addCriterion("WNYYXHZZ <=", value, "wnyyxhzz");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzLike(String value) {
            addCriterion("WNYYXHZZ like", value, "wnyyxhzz");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzNotLike(String value) {
            addCriterion("WNYYXHZZ not like", value, "wnyyxhzz");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzIn(List<String> values) {
            addCriterion("WNYYXHZZ in", values, "wnyyxhzz");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzNotIn(List<String> values) {
            addCriterion("WNYYXHZZ not in", values, "wnyyxhzz");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzBetween(String value1, String value2) {
            addCriterion("WNYYXHZZ between", value1, value2, "wnyyxhzz");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzNotBetween(String value1, String value2) {
            addCriterion("WNYYXHZZ not between", value1, value2, "wnyyxhzz");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzmcIsNull() {
            addCriterion("WNYYXHZZMC is null");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzmcIsNotNull() {
            addCriterion("WNYYXHZZMC is not null");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzmcEqualTo(String value) {
            addCriterion("WNYYXHZZMC =", value, "wnyyxhzzmc");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzmcNotEqualTo(String value) {
            addCriterion("WNYYXHZZMC <>", value, "wnyyxhzzmc");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzmcGreaterThan(String value) {
            addCriterion("WNYYXHZZMC >", value, "wnyyxhzzmc");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzmcGreaterThanOrEqualTo(String value) {
            addCriterion("WNYYXHZZMC >=", value, "wnyyxhzzmc");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzmcLessThan(String value) {
            addCriterion("WNYYXHZZMC <", value, "wnyyxhzzmc");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzmcLessThanOrEqualTo(String value) {
            addCriterion("WNYYXHZZMC <=", value, "wnyyxhzzmc");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzmcLike(String value) {
            addCriterion("WNYYXHZZMC like", value, "wnyyxhzzmc");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzmcNotLike(String value) {
            addCriterion("WNYYXHZZMC not like", value, "wnyyxhzzmc");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzmcIn(List<String> values) {
            addCriterion("WNYYXHZZMC in", values, "wnyyxhzzmc");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzmcNotIn(List<String> values) {
            addCriterion("WNYYXHZZMC not in", values, "wnyyxhzzmc");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzmcBetween(String value1, String value2) {
            addCriterion("WNYYXHZZMC between", value1, value2, "wnyyxhzzmc");
            return (Criteria) this;
        }

        public Criteria andWnyyxhzzmcNotBetween(String value1, String value2) {
            addCriterion("WNYYXHZZMC not between", value1, value2, "wnyyxhzzmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzIsNull() {
            addCriterion("ZXPFBZ is null");
            return (Criteria) this;
        }

        public Criteria andZxpfbzIsNotNull() {
            addCriterion("ZXPFBZ is not null");
            return (Criteria) this;
        }

        public Criteria andZxpfbzEqualTo(String value) {
            addCriterion("ZXPFBZ =", value, "zxpfbz");
            return (Criteria) this;
        }

        public Criteria andZxpfbzNotEqualTo(String value) {
            addCriterion("ZXPFBZ <>", value, "zxpfbz");
            return (Criteria) this;
        }

        public Criteria andZxpfbzGreaterThan(String value) {
            addCriterion("ZXPFBZ >", value, "zxpfbz");
            return (Criteria) this;
        }

        public Criteria andZxpfbzGreaterThanOrEqualTo(String value) {
            addCriterion("ZXPFBZ >=", value, "zxpfbz");
            return (Criteria) this;
        }

        public Criteria andZxpfbzLessThan(String value) {
            addCriterion("ZXPFBZ <", value, "zxpfbz");
            return (Criteria) this;
        }

        public Criteria andZxpfbzLessThanOrEqualTo(String value) {
            addCriterion("ZXPFBZ <=", value, "zxpfbz");
            return (Criteria) this;
        }

        public Criteria andZxpfbzLike(String value) {
            addCriterion("ZXPFBZ like", value, "zxpfbz");
            return (Criteria) this;
        }

        public Criteria andZxpfbzNotLike(String value) {
            addCriterion("ZXPFBZ not like", value, "zxpfbz");
            return (Criteria) this;
        }

        public Criteria andZxpfbzIn(List<String> values) {
            addCriterion("ZXPFBZ in", values, "zxpfbz");
            return (Criteria) this;
        }

        public Criteria andZxpfbzNotIn(List<String> values) {
            addCriterion("ZXPFBZ not in", values, "zxpfbz");
            return (Criteria) this;
        }

        public Criteria andZxpfbzBetween(String value1, String value2) {
            addCriterion("ZXPFBZ between", value1, value2, "zxpfbz");
            return (Criteria) this;
        }

        public Criteria andZxpfbzNotBetween(String value1, String value2) {
            addCriterion("ZXPFBZ not between", value1, value2, "zxpfbz");
            return (Criteria) this;
        }

        public Criteria andZxpfbzmcIsNull() {
            addCriterion("ZXPFBZMC is null");
            return (Criteria) this;
        }

        public Criteria andZxpfbzmcIsNotNull() {
            addCriterion("ZXPFBZMC is not null");
            return (Criteria) this;
        }

        public Criteria andZxpfbzmcEqualTo(String value) {
            addCriterion("ZXPFBZMC =", value, "zxpfbzmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzmcNotEqualTo(String value) {
            addCriterion("ZXPFBZMC <>", value, "zxpfbzmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzmcGreaterThan(String value) {
            addCriterion("ZXPFBZMC >", value, "zxpfbzmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzmcGreaterThanOrEqualTo(String value) {
            addCriterion("ZXPFBZMC >=", value, "zxpfbzmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzmcLessThan(String value) {
            addCriterion("ZXPFBZMC <", value, "zxpfbzmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzmcLessThanOrEqualTo(String value) {
            addCriterion("ZXPFBZMC <=", value, "zxpfbzmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzmcLike(String value) {
            addCriterion("ZXPFBZMC like", value, "zxpfbzmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzmcNotLike(String value) {
            addCriterion("ZXPFBZMC not like", value, "zxpfbzmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzmcIn(List<String> values) {
            addCriterion("ZXPFBZMC in", values, "zxpfbzmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzmcNotIn(List<String> values) {
            addCriterion("ZXPFBZMC not in", values, "zxpfbzmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzmcBetween(String value1, String value2) {
            addCriterion("ZXPFBZMC between", value1, value2, "zxpfbzmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzmcNotBetween(String value1, String value2) {
            addCriterion("ZXPFBZMC not between", value1, value2, "zxpfbzmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbIsNull() {
            addCriterion("ZXPFBZXZJB is null");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbIsNotNull() {
            addCriterion("ZXPFBZXZJB is not null");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbEqualTo(String value) {
            addCriterion("ZXPFBZXZJB =", value, "zxpfbzxzjb");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbNotEqualTo(String value) {
            addCriterion("ZXPFBZXZJB <>", value, "zxpfbzxzjb");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbGreaterThan(String value) {
            addCriterion("ZXPFBZXZJB >", value, "zxpfbzxzjb");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbGreaterThanOrEqualTo(String value) {
            addCriterion("ZXPFBZXZJB >=", value, "zxpfbzxzjb");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbLessThan(String value) {
            addCriterion("ZXPFBZXZJB <", value, "zxpfbzxzjb");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbLessThanOrEqualTo(String value) {
            addCriterion("ZXPFBZXZJB <=", value, "zxpfbzxzjb");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbLike(String value) {
            addCriterion("ZXPFBZXZJB like", value, "zxpfbzxzjb");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbNotLike(String value) {
            addCriterion("ZXPFBZXZJB not like", value, "zxpfbzxzjb");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbIn(List<String> values) {
            addCriterion("ZXPFBZXZJB in", values, "zxpfbzxzjb");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbNotIn(List<String> values) {
            addCriterion("ZXPFBZXZJB not in", values, "zxpfbzxzjb");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbBetween(String value1, String value2) {
            addCriterion("ZXPFBZXZJB between", value1, value2, "zxpfbzxzjb");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbNotBetween(String value1, String value2) {
            addCriterion("ZXPFBZXZJB not between", value1, value2, "zxpfbzxzjb");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbmcIsNull() {
            addCriterion("ZXPFBZXZJBMC is null");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbmcIsNotNull() {
            addCriterion("ZXPFBZXZJBMC is not null");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbmcEqualTo(String value) {
            addCriterion("ZXPFBZXZJBMC =", value, "zxpfbzxzjbmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbmcNotEqualTo(String value) {
            addCriterion("ZXPFBZXZJBMC <>", value, "zxpfbzxzjbmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbmcGreaterThan(String value) {
            addCriterion("ZXPFBZXZJBMC >", value, "zxpfbzxzjbmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbmcGreaterThanOrEqualTo(String value) {
            addCriterion("ZXPFBZXZJBMC >=", value, "zxpfbzxzjbmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbmcLessThan(String value) {
            addCriterion("ZXPFBZXZJBMC <", value, "zxpfbzxzjbmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbmcLessThanOrEqualTo(String value) {
            addCriterion("ZXPFBZXZJBMC <=", value, "zxpfbzxzjbmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbmcLike(String value) {
            addCriterion("ZXPFBZXZJBMC like", value, "zxpfbzxzjbmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbmcNotLike(String value) {
            addCriterion("ZXPFBZXZJBMC not like", value, "zxpfbzxzjbmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbmcIn(List<String> values) {
            addCriterion("ZXPFBZXZJBMC in", values, "zxpfbzxzjbmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbmcNotIn(List<String> values) {
            addCriterion("ZXPFBZXZJBMC not in", values, "zxpfbzxzjbmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbmcBetween(String value1, String value2) {
            addCriterion("ZXPFBZXZJBMC between", value1, value2, "zxpfbzxzjbmc");
            return (Criteria) this;
        }

        public Criteria andZxpfbzxzjbmcNotBetween(String value1, String value2) {
            addCriterion("ZXPFBZXZJBMC not between", value1, value2, "zxpfbzxzjbmc");
            return (Criteria) this;
        }

        public Criteria andYxtsTIsNull() {
            addCriterion("YXTS_T is null");
            return (Criteria) this;
        }

        public Criteria andYxtsTIsNotNull() {
            addCriterion("YXTS_T is not null");
            return (Criteria) this;
        }

        public Criteria andYxtsTEqualTo(Integer value) {
            addCriterion("YXTS_T =", value, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTNotEqualTo(Integer value) {
            addCriterion("YXTS_T <>", value, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTGreaterThan(Integer value) {
            addCriterion("YXTS_T >", value, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTGreaterThanOrEqualTo(Integer value) {
            addCriterion("YXTS_T >=", value, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTLessThan(Integer value) {
            addCriterion("YXTS_T <", value, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTLessThanOrEqualTo(Integer value) {
            addCriterion("YXTS_T <=", value, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTIn(List<Integer> values) {
            addCriterion("YXTS_T in", values, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTNotIn(List<Integer> values) {
            addCriterion("YXTS_T not in", values, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTBetween(Integer value1, Integer value2) {
            addCriterion("YXTS_T between", value1, value2, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andYxtsTNotBetween(Integer value1, Integer value2) {
            addCriterion("YXTS_T not between", value1, value2, "yxtsT");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyIsNull() {
            addCriterion("LJWCTZ_WY is null");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyIsNotNull() {
            addCriterion("LJWCTZ_WY is not null");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyEqualTo(Double value) {
            addCriterion("LJWCTZ_WY =", value, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyNotEqualTo(Double value) {
            addCriterion("LJWCTZ_WY <>", value, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyGreaterThan(Double value) {
            addCriterion("LJWCTZ_WY >", value, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyGreaterThanOrEqualTo(Double value) {
            addCriterion("LJWCTZ_WY >=", value, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyLessThan(Double value) {
            addCriterion("LJWCTZ_WY <", value, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyLessThanOrEqualTo(Double value) {
            addCriterion("LJWCTZ_WY <=", value, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyIn(List<Double> values) {
            addCriterion("LJWCTZ_WY in", values, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyNotIn(List<Double> values) {
            addCriterion("LJWCTZ_WY not in", values, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyBetween(Double value1, Double value2) {
            addCriterion("LJWCTZ_WY between", value1, value2, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andLjwctzWyNotBetween(Double value1, Double value2) {
            addCriterion("LJWCTZ_WY not between", value1, value2, "ljwctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyIsNull() {
            addCriterion("XZGDZCTZ_WY is null");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyIsNotNull() {
            addCriterion("XZGDZCTZ_WY is not null");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyEqualTo(Double value) {
            addCriterion("XZGDZCTZ_WY =", value, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyNotEqualTo(Double value) {
            addCriterion("XZGDZCTZ_WY <>", value, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyGreaterThan(Double value) {
            addCriterion("XZGDZCTZ_WY >", value, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyGreaterThanOrEqualTo(Double value) {
            addCriterion("XZGDZCTZ_WY >=", value, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyLessThan(Double value) {
            addCriterion("XZGDZCTZ_WY <", value, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyLessThanOrEqualTo(Double value) {
            addCriterion("XZGDZCTZ_WY <=", value, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyIn(List<Double> values) {
            addCriterion("XZGDZCTZ_WY in", values, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyNotIn(List<Double> values) {
            addCriterion("XZGDZCTZ_WY not in", values, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyBetween(Double value1, Double value2) {
            addCriterion("XZGDZCTZ_WY between", value1, value2, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andXzgdzctzWyNotBetween(Double value1, Double value2) {
            addCriterion("XZGDZCTZ_WY not between", value1, value2, "xzgdzctzWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyIsNull() {
            addCriterion("YXFY_WY is null");
            return (Criteria) this;
        }

        public Criteria andYxfyWyIsNotNull() {
            addCriterion("YXFY_WY is not null");
            return (Criteria) this;
        }

        public Criteria andYxfyWyEqualTo(Double value) {
            addCriterion("YXFY_WY =", value, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyNotEqualTo(Double value) {
            addCriterion("YXFY_WY <>", value, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyGreaterThan(Double value) {
            addCriterion("YXFY_WY >", value, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyGreaterThanOrEqualTo(Double value) {
            addCriterion("YXFY_WY >=", value, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyLessThan(Double value) {
            addCriterion("YXFY_WY <", value, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyLessThanOrEqualTo(Double value) {
            addCriterion("YXFY_WY <=", value, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyIn(List<Double> values) {
            addCriterion("YXFY_WY in", values, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyNotIn(List<Double> values) {
            addCriterion("YXFY_WY not in", values, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyBetween(Double value1, Double value2) {
            addCriterion("YXFY_WY between", value1, value2, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYxfyWyNotBetween(Double value1, Double value2) {
            addCriterion("YXFY_WY not between", value1, value2, "yxfyWy");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsIsNull() {
            addCriterion("YDL_WQWS is null");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsIsNotNull() {
            addCriterion("YDL_WQWS is not null");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsEqualTo(Long value) {
            addCriterion("YDL_WQWS =", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsNotEqualTo(Long value) {
            addCriterion("YDL_WQWS <>", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsGreaterThan(Long value) {
            addCriterion("YDL_WQWS >", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsGreaterThanOrEqualTo(Long value) {
            addCriterion("YDL_WQWS >=", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsLessThan(Long value) {
            addCriterion("YDL_WQWS <", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsLessThanOrEqualTo(Long value) {
            addCriterion("YDL_WQWS <=", value, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsIn(List<Long> values) {
            addCriterion("YDL_WQWS in", values, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsNotIn(List<Long> values) {
            addCriterion("YDL_WQWS not in", values, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsBetween(Long value1, Long value2) {
            addCriterion("YDL_WQWS between", value1, value2, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andYdlWqwsNotBetween(Long value1, Long value2) {
            addCriterion("YDL_WQWS not between", value1, value2, "ydlWqws");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRIsNull() {
            addCriterion("WSSJCLNL_D_R is null");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRIsNotNull() {
            addCriterion("WSSJCLNL_D_R is not null");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDREqualTo(Double value) {
            addCriterion("WSSJCLNL_D_R =", value, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRNotEqualTo(Double value) {
            addCriterion("WSSJCLNL_D_R <>", value, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRGreaterThan(Double value) {
            addCriterion("WSSJCLNL_D_R >", value, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRGreaterThanOrEqualTo(Double value) {
            addCriterion("WSSJCLNL_D_R >=", value, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRLessThan(Double value) {
            addCriterion("WSSJCLNL_D_R <", value, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRLessThanOrEqualTo(Double value) {
            addCriterion("WSSJCLNL_D_R <=", value, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRIn(List<Double> values) {
            addCriterion("WSSJCLNL_D_R in", values, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRNotIn(List<Double> values) {
            addCriterion("WSSJCLNL_D_R not in", values, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRBetween(Double value1, Double value2) {
            addCriterion("WSSJCLNL_D_R between", value1, value2, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjclnlDRNotBetween(Double value1, Double value2) {
            addCriterion("WSSJCLNL_D_R not between", value1, value2, "wssjclnlDR");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdIsNull() {
            addCriterion("WSSJCLL_WD is null");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdIsNotNull() {
            addCriterion("WSSJCLL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdEqualTo(Double value) {
            addCriterion("WSSJCLL_WD =", value, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdNotEqualTo(Double value) {
            addCriterion("WSSJCLL_WD <>", value, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdGreaterThan(Double value) {
            addCriterion("WSSJCLL_WD >", value, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdGreaterThanOrEqualTo(Double value) {
            addCriterion("WSSJCLL_WD >=", value, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdLessThan(Double value) {
            addCriterion("WSSJCLL_WD <", value, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdLessThanOrEqualTo(Double value) {
            addCriterion("WSSJCLL_WD <=", value, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdIn(List<Double> values) {
            addCriterion("WSSJCLL_WD in", values, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdNotIn(List<Double> values) {
            addCriterion("WSSJCLL_WD not in", values, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdBetween(Double value1, Double value2) {
            addCriterion("WSSJCLL_WD between", value1, value2, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andWssjcllWdNotBetween(Double value1, Double value2) {
            addCriterion("WSSJCLL_WD not between", value1, value2, "wssjcllWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdIsNull() {
            addCriterion("QZ_CLSHWSL_WD is null");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdIsNotNull() {
            addCriterion("QZ_CLSHWSL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdEqualTo(Double value) {
            addCriterion("QZ_CLSHWSL_WD =", value, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdNotEqualTo(Double value) {
            addCriterion("QZ_CLSHWSL_WD <>", value, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdGreaterThan(Double value) {
            addCriterion("QZ_CLSHWSL_WD >", value, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_CLSHWSL_WD >=", value, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdLessThan(Double value) {
            addCriterion("QZ_CLSHWSL_WD <", value, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdLessThanOrEqualTo(Double value) {
            addCriterion("QZ_CLSHWSL_WD <=", value, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdIn(List<Double> values) {
            addCriterion("QZ_CLSHWSL_WD in", values, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdNotIn(List<Double> values) {
            addCriterion("QZ_CLSHWSL_WD not in", values, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdBetween(Double value1, Double value2) {
            addCriterion("QZ_CLSHWSL_WD between", value1, value2, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClshwslWdNotBetween(Double value1, Double value2) {
            addCriterion("QZ_CLSHWSL_WD not between", value1, value2, "qzClshwslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdIsNull() {
            addCriterion("QZ_CLGYFSL_WD is null");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdIsNotNull() {
            addCriterion("QZ_CLGYFSL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdEqualTo(Double value) {
            addCriterion("QZ_CLGYFSL_WD =", value, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdNotEqualTo(Double value) {
            addCriterion("QZ_CLGYFSL_WD <>", value, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdGreaterThan(Double value) {
            addCriterion("QZ_CLGYFSL_WD >", value, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_CLGYFSL_WD >=", value, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdLessThan(Double value) {
            addCriterion("QZ_CLGYFSL_WD <", value, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdLessThanOrEqualTo(Double value) {
            addCriterion("QZ_CLGYFSL_WD <=", value, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdIn(List<Double> values) {
            addCriterion("QZ_CLGYFSL_WD in", values, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdNotIn(List<Double> values) {
            addCriterion("QZ_CLGYFSL_WD not in", values, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdBetween(Double value1, Double value2) {
            addCriterion("QZ_CLGYFSL_WD between", value1, value2, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClgyfslWdNotBetween(Double value1, Double value2) {
            addCriterion("QZ_CLGYFSL_WD not between", value1, value2, "qzClgyfslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdIsNull() {
            addCriterion("QZ_CLBXQWDSL_WD is null");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdIsNotNull() {
            addCriterion("QZ_CLBXQWDSL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdEqualTo(Double value) {
            addCriterion("QZ_CLBXQWDSL_WD =", value, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdNotEqualTo(Double value) {
            addCriterion("QZ_CLBXQWDSL_WD <>", value, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdGreaterThan(Double value) {
            addCriterion("QZ_CLBXQWDSL_WD >", value, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_CLBXQWDSL_WD >=", value, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdLessThan(Double value) {
            addCriterion("QZ_CLBXQWDSL_WD <", value, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdLessThanOrEqualTo(Double value) {
            addCriterion("QZ_CLBXQWDSL_WD <=", value, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdIn(List<Double> values) {
            addCriterion("QZ_CLBXQWDSL_WD in", values, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdNotIn(List<Double> values) {
            addCriterion("QZ_CLBXQWDSL_WD not in", values, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdBetween(Double value1, Double value2) {
            addCriterion("QZ_CLBXQWDSL_WD between", value1, value2, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andQzClbxqwdslWdNotBetween(Double value1, Double value2) {
            addCriterion("QZ_CLBXQWDSL_WD not between", value1, value2, "qzClbxqwdslWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdIsNull() {
            addCriterion("ZSSSCL_WD is null");
            return (Criteria) this;
        }

        public Criteria andZsssclWdIsNotNull() {
            addCriterion("ZSSSCL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andZsssclWdEqualTo(Double value) {
            addCriterion("ZSSSCL_WD =", value, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdNotEqualTo(Double value) {
            addCriterion("ZSSSCL_WD <>", value, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdGreaterThan(Double value) {
            addCriterion("ZSSSCL_WD >", value, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdGreaterThanOrEqualTo(Double value) {
            addCriterion("ZSSSCL_WD >=", value, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdLessThan(Double value) {
            addCriterion("ZSSSCL_WD <", value, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdLessThanOrEqualTo(Double value) {
            addCriterion("ZSSSCL_WD <=", value, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdIn(List<Double> values) {
            addCriterion("ZSSSCL_WD in", values, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdNotIn(List<Double> values) {
            addCriterion("ZSSSCL_WD not in", values, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdBetween(Double value1, Double value2) {
            addCriterion("ZSSSCL_WD between", value1, value2, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsssclWdNotBetween(Double value1, Double value2) {
            addCriterion("ZSSSCL_WD not between", value1, value2, "zsssclWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdIsNull() {
            addCriterion("ZSSLYL_WD is null");
            return (Criteria) this;
        }

        public Criteria andZsslylWdIsNotNull() {
            addCriterion("ZSSLYL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andZsslylWdEqualTo(Double value) {
            addCriterion("ZSSLYL_WD =", value, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdNotEqualTo(Double value) {
            addCriterion("ZSSLYL_WD <>", value, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdGreaterThan(Double value) {
            addCriterion("ZSSLYL_WD >", value, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdGreaterThanOrEqualTo(Double value) {
            addCriterion("ZSSLYL_WD >=", value, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdLessThan(Double value) {
            addCriterion("ZSSLYL_WD <", value, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdLessThanOrEqualTo(Double value) {
            addCriterion("ZSSLYL_WD <=", value, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdIn(List<Double> values) {
            addCriterion("ZSSLYL_WD in", values, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdNotIn(List<Double> values) {
            addCriterion("ZSSLYL_WD not in", values, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdBetween(Double value1, Double value2) {
            addCriterion("ZSSLYL_WD between", value1, value2, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andZsslylWdNotBetween(Double value1, Double value2) {
            addCriterion("ZSSLYL_WD not between", value1, value2, "zsslylWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdIsNull() {
            addCriterion("QZ_GYYSL_WD is null");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdIsNotNull() {
            addCriterion("QZ_GYYSL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdEqualTo(Double value) {
            addCriterion("QZ_GYYSL_WD =", value, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdNotEqualTo(Double value) {
            addCriterion("QZ_GYYSL_WD <>", value, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdGreaterThan(Double value) {
            addCriterion("QZ_GYYSL_WD >", value, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_GYYSL_WD >=", value, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdLessThan(Double value) {
            addCriterion("QZ_GYYSL_WD <", value, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdLessThanOrEqualTo(Double value) {
            addCriterion("QZ_GYYSL_WD <=", value, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdIn(List<Double> values) {
            addCriterion("QZ_GYYSL_WD in", values, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdNotIn(List<Double> values) {
            addCriterion("QZ_GYYSL_WD not in", values, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdBetween(Double value1, Double value2) {
            addCriterion("QZ_GYYSL_WD between", value1, value2, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzGyyslWdNotBetween(Double value1, Double value2) {
            addCriterion("QZ_GYYSL_WD not between", value1, value2, "qzGyyslWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdIsNull() {
            addCriterion("QZ_SZYS_WD is null");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdIsNotNull() {
            addCriterion("QZ_SZYS_WD is not null");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdEqualTo(Double value) {
            addCriterion("QZ_SZYS_WD =", value, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdNotEqualTo(Double value) {
            addCriterion("QZ_SZYS_WD <>", value, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdGreaterThan(Double value) {
            addCriterion("QZ_SZYS_WD >", value, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_SZYS_WD >=", value, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdLessThan(Double value) {
            addCriterion("QZ_SZYS_WD <", value, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdLessThanOrEqualTo(Double value) {
            addCriterion("QZ_SZYS_WD <=", value, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdIn(List<Double> values) {
            addCriterion("QZ_SZYS_WD in", values, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdNotIn(List<Double> values) {
            addCriterion("QZ_SZYS_WD not in", values, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdBetween(Double value1, Double value2) {
            addCriterion("QZ_SZYS_WD between", value1, value2, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzSzysWdNotBetween(Double value1, Double value2) {
            addCriterion("QZ_SZYS_WD not between", value1, value2, "qzSzysWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdIsNull() {
            addCriterion("QZ_JGYSL_WD is null");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdIsNotNull() {
            addCriterion("QZ_JGYSL_WD is not null");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdEqualTo(Double value) {
            addCriterion("QZ_JGYSL_WD =", value, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdNotEqualTo(Double value) {
            addCriterion("QZ_JGYSL_WD <>", value, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdGreaterThan(Double value) {
            addCriterion("QZ_JGYSL_WD >", value, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_JGYSL_WD >=", value, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdLessThan(Double value) {
            addCriterion("QZ_JGYSL_WD <", value, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdLessThanOrEqualTo(Double value) {
            addCriterion("QZ_JGYSL_WD <=", value, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdIn(List<Double> values) {
            addCriterion("QZ_JGYSL_WD in", values, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdNotIn(List<Double> values) {
            addCriterion("QZ_JGYSL_WD not in", values, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdBetween(Double value1, Double value2) {
            addCriterion("QZ_JGYSL_WD between", value1, value2, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andQzJgyslWdNotBetween(Double value1, Double value2) {
            addCriterion("QZ_JGYSL_WD not between", value1, value2, "qzJgyslWd");
            return (Criteria) this;
        }

        public Criteria andWncslDIsNull() {
            addCriterion("WNCSL_D is null");
            return (Criteria) this;
        }

        public Criteria andWncslDIsNotNull() {
            addCriterion("WNCSL_D is not null");
            return (Criteria) this;
        }

        public Criteria andWncslDEqualTo(Double value) {
            addCriterion("WNCSL_D =", value, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDNotEqualTo(Double value) {
            addCriterion("WNCSL_D <>", value, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDGreaterThan(Double value) {
            addCriterion("WNCSL_D >", value, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDGreaterThanOrEqualTo(Double value) {
            addCriterion("WNCSL_D >=", value, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDLessThan(Double value) {
            addCriterion("WNCSL_D <", value, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDLessThanOrEqualTo(Double value) {
            addCriterion("WNCSL_D <=", value, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDIn(List<Double> values) {
            addCriterion("WNCSL_D in", values, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDNotIn(List<Double> values) {
            addCriterion("WNCSL_D not in", values, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDBetween(Double value1, Double value2) {
            addCriterion("WNCSL_D between", value1, value2, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWncslDNotBetween(Double value1, Double value2) {
            addCriterion("WNCSL_D not between", value1, value2, "wncslD");
            return (Criteria) this;
        }

        public Criteria andWnczlDIsNull() {
            addCriterion("WNCZL_D is null");
            return (Criteria) this;
        }

        public Criteria andWnczlDIsNotNull() {
            addCriterion("WNCZL_D is not null");
            return (Criteria) this;
        }

        public Criteria andWnczlDEqualTo(Double value) {
            addCriterion("WNCZL_D =", value, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDNotEqualTo(Double value) {
            addCriterion("WNCZL_D <>", value, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDGreaterThan(Double value) {
            addCriterion("WNCZL_D >", value, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDGreaterThanOrEqualTo(Double value) {
            addCriterion("WNCZL_D >=", value, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDLessThan(Double value) {
            addCriterion("WNCZL_D <", value, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDLessThanOrEqualTo(Double value) {
            addCriterion("WNCZL_D <=", value, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDIn(List<Double> values) {
            addCriterion("WNCZL_D in", values, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDNotIn(List<Double> values) {
            addCriterion("WNCZL_D not in", values, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDBetween(Double value1, Double value2) {
            addCriterion("WNCZL_D between", value1, value2, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andWnczlDNotBetween(Double value1, Double value2) {
            addCriterion("WNCZL_D not between", value1, value2, "wnczlD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDIsNull() {
            addCriterion("QZ_TDLYL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDIsNotNull() {
            addCriterion("QZ_TDLYL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDEqualTo(Double value) {
            addCriterion("QZ_TDLYL_D =", value, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDNotEqualTo(Double value) {
            addCriterion("QZ_TDLYL_D <>", value, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDGreaterThan(Double value) {
            addCriterion("QZ_TDLYL_D >", value, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_TDLYL_D >=", value, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDLessThan(Double value) {
            addCriterion("QZ_TDLYL_D <", value, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDLessThanOrEqualTo(Double value) {
            addCriterion("QZ_TDLYL_D <=", value, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDIn(List<Double> values) {
            addCriterion("QZ_TDLYL_D in", values, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDNotIn(List<Double> values) {
            addCriterion("QZ_TDLYL_D not in", values, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDBetween(Double value1, Double value2) {
            addCriterion("QZ_TDLYL_D between", value1, value2, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTdlylDNotBetween(Double value1, Double value2) {
            addCriterion("QZ_TDLYL_D not between", value1, value2, "qzTdlylD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDIsNull() {
            addCriterion("QZ_TMCZL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDIsNotNull() {
            addCriterion("QZ_TMCZL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDEqualTo(Double value) {
            addCriterion("QZ_TMCZL_D =", value, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDNotEqualTo(Double value) {
            addCriterion("QZ_TMCZL_D <>", value, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDGreaterThan(Double value) {
            addCriterion("QZ_TMCZL_D >", value, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_TMCZL_D >=", value, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDLessThan(Double value) {
            addCriterion("QZ_TMCZL_D <", value, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDLessThanOrEqualTo(Double value) {
            addCriterion("QZ_TMCZL_D <=", value, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDIn(List<Double> values) {
            addCriterion("QZ_TMCZL_D in", values, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDNotIn(List<Double> values) {
            addCriterion("QZ_TMCZL_D not in", values, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDBetween(Double value1, Double value2) {
            addCriterion("QZ_TMCZL_D between", value1, value2, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzTmczlDNotBetween(Double value1, Double value2) {
            addCriterion("QZ_TMCZL_D not between", value1, value2, "qzTmczlD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDIsNull() {
            addCriterion("QZ_JZCLLYL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDIsNotNull() {
            addCriterion("QZ_JZCLLYL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDEqualTo(Double value) {
            addCriterion("QZ_JZCLLYL_D =", value, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDNotEqualTo(Double value) {
            addCriterion("QZ_JZCLLYL_D <>", value, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDGreaterThan(Double value) {
            addCriterion("QZ_JZCLLYL_D >", value, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_JZCLLYL_D >=", value, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDLessThan(Double value) {
            addCriterion("QZ_JZCLLYL_D <", value, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDLessThanOrEqualTo(Double value) {
            addCriterion("QZ_JZCLLYL_D <=", value, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDIn(List<Double> values) {
            addCriterion("QZ_JZCLLYL_D in", values, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDNotIn(List<Double> values) {
            addCriterion("QZ_JZCLLYL_D not in", values, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDBetween(Double value1, Double value2) {
            addCriterion("QZ_JZCLLYL_D between", value1, value2, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzJzcllylDNotBetween(Double value1, Double value2) {
            addCriterion("QZ_JZCLLYL_D not between", value1, value2, "qzJzcllylD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDIsNull() {
            addCriterion("QZ_FSCZL_D is null");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDIsNotNull() {
            addCriterion("QZ_FSCZL_D is not null");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDEqualTo(Double value) {
            addCriterion("QZ_FSCZL_D =", value, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDNotEqualTo(Double value) {
            addCriterion("QZ_FSCZL_D <>", value, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDGreaterThan(Double value) {
            addCriterion("QZ_FSCZL_D >", value, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDGreaterThanOrEqualTo(Double value) {
            addCriterion("QZ_FSCZL_D >=", value, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDLessThan(Double value) {
            addCriterion("QZ_FSCZL_D <", value, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDLessThanOrEqualTo(Double value) {
            addCriterion("QZ_FSCZL_D <=", value, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDIn(List<Double> values) {
            addCriterion("QZ_FSCZL_D in", values, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDNotIn(List<Double> values) {
            addCriterion("QZ_FSCZL_D not in", values, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDBetween(Double value1, Double value2) {
            addCriterion("QZ_FSCZL_D between", value1, value2, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andQzFsczlDNotBetween(Double value1, Double value2) {
            addCriterion("QZ_FSCZL_D not between", value1, value2, "qzFsczlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDIsNull() {
            addCriterion("WNQDDQL_D is null");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDIsNotNull() {
            addCriterion("WNQDDQL_D is not null");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDEqualTo(Double value) {
            addCriterion("WNQDDQL_D =", value, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDNotEqualTo(Double value) {
            addCriterion("WNQDDQL_D <>", value, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDGreaterThan(Double value) {
            addCriterion("WNQDDQL_D >", value, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDGreaterThanOrEqualTo(Double value) {
            addCriterion("WNQDDQL_D >=", value, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDLessThan(Double value) {
            addCriterion("WNQDDQL_D <", value, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDLessThanOrEqualTo(Double value) {
            addCriterion("WNQDDQL_D <=", value, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDIn(List<Double> values) {
            addCriterion("WNQDDQL_D in", values, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDNotIn(List<Double> values) {
            addCriterion("WNQDDQL_D not in", values, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDBetween(Double value1, Double value2) {
            addCriterion("WNQDDQL_D between", value1, value2, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnqddqlDNotBetween(Double value1, Double value2) {
            addCriterion("WNQDDQL_D not between", value1, value2, "wnqddqlD");
            return (Criteria) this;
        }

        public Criteria andWnyyxhcqlLfmIsNull() {
            addCriterion("WNYYXHCQL_LFM is null");
            return (Criteria) this;
        }

        public Criteria andWnyyxhcqlLfmIsNotNull() {
            addCriterion("WNYYXHCQL_LFM is not null");
            return (Criteria) this;
        }

        public Criteria andWnyyxhcqlLfmEqualTo(Double value) {
            addCriterion("WNYYXHCQL_LFM =", value, "wnyyxhcqlLfm");
            return (Criteria) this;
        }

        public Criteria andWnyyxhcqlLfmNotEqualTo(Double value) {
            addCriterion("WNYYXHCQL_LFM <>", value, "wnyyxhcqlLfm");
            return (Criteria) this;
        }

        public Criteria andWnyyxhcqlLfmGreaterThan(Double value) {
            addCriterion("WNYYXHCQL_LFM >", value, "wnyyxhcqlLfm");
            return (Criteria) this;
        }

        public Criteria andWnyyxhcqlLfmGreaterThanOrEqualTo(Double value) {
            addCriterion("WNYYXHCQL_LFM >=", value, "wnyyxhcqlLfm");
            return (Criteria) this;
        }

        public Criteria andWnyyxhcqlLfmLessThan(Double value) {
            addCriterion("WNYYXHCQL_LFM <", value, "wnyyxhcqlLfm");
            return (Criteria) this;
        }

        public Criteria andWnyyxhcqlLfmLessThanOrEqualTo(Double value) {
            addCriterion("WNYYXHCQL_LFM <=", value, "wnyyxhcqlLfm");
            return (Criteria) this;
        }

        public Criteria andWnyyxhcqlLfmIn(List<Double> values) {
            addCriterion("WNYYXHCQL_LFM in", values, "wnyyxhcqlLfm");
            return (Criteria) this;
        }

        public Criteria andWnyyxhcqlLfmNotIn(List<Double> values) {
            addCriterion("WNYYXHCQL_LFM not in", values, "wnyyxhcqlLfm");
            return (Criteria) this;
        }

        public Criteria andWnyyxhcqlLfmBetween(Double value1, Double value2) {
            addCriterion("WNYYXHCQL_LFM between", value1, value2, "wnyyxhcqlLfm");
            return (Criteria) this;
        }

        public Criteria andWnyyxhcqlLfmNotBetween(Double value1, Double value2) {
            addCriterion("WNYYXHCQL_LFM not between", value1, value2, "wnyyxhcqlLfm");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDIsNull() {
            addCriterion("HXXYLQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDIsNotNull() {
            addCriterion("HXXYLQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDEqualTo(Double value) {
            addCriterion("HXXYLQCL_D =", value, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDNotEqualTo(Double value) {
            addCriterion("HXXYLQCL_D <>", value, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDGreaterThan(Double value) {
            addCriterion("HXXYLQCL_D >", value, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDGreaterThanOrEqualTo(Double value) {
            addCriterion("HXXYLQCL_D >=", value, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDLessThan(Double value) {
            addCriterion("HXXYLQCL_D <", value, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDLessThanOrEqualTo(Double value) {
            addCriterion("HXXYLQCL_D <=", value, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDIn(List<Double> values) {
            addCriterion("HXXYLQCL_D in", values, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDNotIn(List<Double> values) {
            addCriterion("HXXYLQCL_D not in", values, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDBetween(Double value1, Double value2) {
            addCriterion("HXXYLQCL_D between", value1, value2, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxylqclDNotBetween(Double value1, Double value2) {
            addCriterion("HXXYLQCL_D not between", value1, value2, "hxxylqclD");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSIsNull() {
            addCriterion("HXXYLJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSIsNotNull() {
            addCriterion("HXXYLJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSEqualTo(Double value) {
            addCriterion("HXXYLJKND_HK_S =", value, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSNotEqualTo(Double value) {
            addCriterion("HXXYLJKND_HK_S <>", value, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSGreaterThan(Double value) {
            addCriterion("HXXYLJKND_HK_S >", value, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("HXXYLJKND_HK_S >=", value, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSLessThan(Double value) {
            addCriterion("HXXYLJKND_HK_S <", value, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("HXXYLJKND_HK_S <=", value, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSIn(List<Double> values) {
            addCriterion("HXXYLJKND_HK_S in", values, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSNotIn(List<Double> values) {
            addCriterion("HXXYLJKND_HK_S not in", values, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSBetween(Double value1, Double value2) {
            addCriterion("HXXYLJKND_HK_S between", value1, value2, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxyljkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("HXXYLJKND_HK_S not between", value1, value2, "hxxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSIsNull() {
            addCriterion("HXXYLCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSIsNotNull() {
            addCriterion("HXXYLCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSEqualTo(Double value) {
            addCriterion("HXXYLCKND_HK_S =", value, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSNotEqualTo(Double value) {
            addCriterion("HXXYLCKND_HK_S <>", value, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSGreaterThan(Double value) {
            addCriterion("HXXYLCKND_HK_S >", value, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("HXXYLCKND_HK_S >=", value, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSLessThan(Double value) {
            addCriterion("HXXYLCKND_HK_S <", value, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("HXXYLCKND_HK_S <=", value, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSIn(List<Double> values) {
            addCriterion("HXXYLCKND_HK_S in", values, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSNotIn(List<Double> values) {
            addCriterion("HXXYLCKND_HK_S not in", values, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSBetween(Double value1, Double value2) {
            addCriterion("HXXYLCKND_HK_S between", value1, value2, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andHxxylckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("HXXYLCKND_HK_S not between", value1, value2, "hxxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andShxylqclDIsNull() {
            addCriterion("SHXYLQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andShxylqclDIsNotNull() {
            addCriterion("SHXYLQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andShxylqclDEqualTo(Double value) {
            addCriterion("SHXYLQCL_D =", value, "shxylqclD");
            return (Criteria) this;
        }

        public Criteria andShxylqclDNotEqualTo(Double value) {
            addCriterion("SHXYLQCL_D <>", value, "shxylqclD");
            return (Criteria) this;
        }

        public Criteria andShxylqclDGreaterThan(Double value) {
            addCriterion("SHXYLQCL_D >", value, "shxylqclD");
            return (Criteria) this;
        }

        public Criteria andShxylqclDGreaterThanOrEqualTo(Double value) {
            addCriterion("SHXYLQCL_D >=", value, "shxylqclD");
            return (Criteria) this;
        }

        public Criteria andShxylqclDLessThan(Double value) {
            addCriterion("SHXYLQCL_D <", value, "shxylqclD");
            return (Criteria) this;
        }

        public Criteria andShxylqclDLessThanOrEqualTo(Double value) {
            addCriterion("SHXYLQCL_D <=", value, "shxylqclD");
            return (Criteria) this;
        }

        public Criteria andShxylqclDIn(List<Double> values) {
            addCriterion("SHXYLQCL_D in", values, "shxylqclD");
            return (Criteria) this;
        }

        public Criteria andShxylqclDNotIn(List<Double> values) {
            addCriterion("SHXYLQCL_D not in", values, "shxylqclD");
            return (Criteria) this;
        }

        public Criteria andShxylqclDBetween(Double value1, Double value2) {
            addCriterion("SHXYLQCL_D between", value1, value2, "shxylqclD");
            return (Criteria) this;
        }

        public Criteria andShxylqclDNotBetween(Double value1, Double value2) {
            addCriterion("SHXYLQCL_D not between", value1, value2, "shxylqclD");
            return (Criteria) this;
        }

        public Criteria andShxyljkndHkSIsNull() {
            addCriterion("SHXYLJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andShxyljkndHkSIsNotNull() {
            addCriterion("SHXYLJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andShxyljkndHkSEqualTo(Double value) {
            addCriterion("SHXYLJKND_HK_S =", value, "shxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andShxyljkndHkSNotEqualTo(Double value) {
            addCriterion("SHXYLJKND_HK_S <>", value, "shxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andShxyljkndHkSGreaterThan(Double value) {
            addCriterion("SHXYLJKND_HK_S >", value, "shxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andShxyljkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("SHXYLJKND_HK_S >=", value, "shxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andShxyljkndHkSLessThan(Double value) {
            addCriterion("SHXYLJKND_HK_S <", value, "shxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andShxyljkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("SHXYLJKND_HK_S <=", value, "shxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andShxyljkndHkSIn(List<Double> values) {
            addCriterion("SHXYLJKND_HK_S in", values, "shxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andShxyljkndHkSNotIn(List<Double> values) {
            addCriterion("SHXYLJKND_HK_S not in", values, "shxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andShxyljkndHkSBetween(Double value1, Double value2) {
            addCriterion("SHXYLJKND_HK_S between", value1, value2, "shxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andShxyljkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("SHXYLJKND_HK_S not between", value1, value2, "shxyljkndHkS");
            return (Criteria) this;
        }

        public Criteria andShxylckndHkSIsNull() {
            addCriterion("SHXYLCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andShxylckndHkSIsNotNull() {
            addCriterion("SHXYLCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andShxylckndHkSEqualTo(Double value) {
            addCriterion("SHXYLCKND_HK_S =", value, "shxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andShxylckndHkSNotEqualTo(Double value) {
            addCriterion("SHXYLCKND_HK_S <>", value, "shxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andShxylckndHkSGreaterThan(Double value) {
            addCriterion("SHXYLCKND_HK_S >", value, "shxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andShxylckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("SHXYLCKND_HK_S >=", value, "shxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andShxylckndHkSLessThan(Double value) {
            addCriterion("SHXYLCKND_HK_S <", value, "shxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andShxylckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("SHXYLCKND_HK_S <=", value, "shxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andShxylckndHkSIn(List<Double> values) {
            addCriterion("SHXYLCKND_HK_S in", values, "shxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andShxylckndHkSNotIn(List<Double> values) {
            addCriterion("SHXYLCKND_HK_S not in", values, "shxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andShxylckndHkSBetween(Double value1, Double value2) {
            addCriterion("SHXYLCKND_HK_S between", value1, value2, "shxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andShxylckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("SHXYLCKND_HK_S not between", value1, value2, "shxylckndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwqclDIsNull() {
            addCriterion("XFWQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andXfwqclDIsNotNull() {
            addCriterion("XFWQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andXfwqclDEqualTo(Double value) {
            addCriterion("XFWQCL_D =", value, "xfwqclD");
            return (Criteria) this;
        }

        public Criteria andXfwqclDNotEqualTo(Double value) {
            addCriterion("XFWQCL_D <>", value, "xfwqclD");
            return (Criteria) this;
        }

        public Criteria andXfwqclDGreaterThan(Double value) {
            addCriterion("XFWQCL_D >", value, "xfwqclD");
            return (Criteria) this;
        }

        public Criteria andXfwqclDGreaterThanOrEqualTo(Double value) {
            addCriterion("XFWQCL_D >=", value, "xfwqclD");
            return (Criteria) this;
        }

        public Criteria andXfwqclDLessThan(Double value) {
            addCriterion("XFWQCL_D <", value, "xfwqclD");
            return (Criteria) this;
        }

        public Criteria andXfwqclDLessThanOrEqualTo(Double value) {
            addCriterion("XFWQCL_D <=", value, "xfwqclD");
            return (Criteria) this;
        }

        public Criteria andXfwqclDIn(List<Double> values) {
            addCriterion("XFWQCL_D in", values, "xfwqclD");
            return (Criteria) this;
        }

        public Criteria andXfwqclDNotIn(List<Double> values) {
            addCriterion("XFWQCL_D not in", values, "xfwqclD");
            return (Criteria) this;
        }

        public Criteria andXfwqclDBetween(Double value1, Double value2) {
            addCriterion("XFWQCL_D between", value1, value2, "xfwqclD");
            return (Criteria) this;
        }

        public Criteria andXfwqclDNotBetween(Double value1, Double value2) {
            addCriterion("XFWQCL_D not between", value1, value2, "xfwqclD");
            return (Criteria) this;
        }

        public Criteria andXfwjkndHkSIsNull() {
            addCriterion("XFWJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andXfwjkndHkSIsNotNull() {
            addCriterion("XFWJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andXfwjkndHkSEqualTo(Double value) {
            addCriterion("XFWJKND_HK_S =", value, "xfwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwjkndHkSNotEqualTo(Double value) {
            addCriterion("XFWJKND_HK_S <>", value, "xfwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwjkndHkSGreaterThan(Double value) {
            addCriterion("XFWJKND_HK_S >", value, "xfwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("XFWJKND_HK_S >=", value, "xfwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwjkndHkSLessThan(Double value) {
            addCriterion("XFWJKND_HK_S <", value, "xfwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("XFWJKND_HK_S <=", value, "xfwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwjkndHkSIn(List<Double> values) {
            addCriterion("XFWJKND_HK_S in", values, "xfwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwjkndHkSNotIn(List<Double> values) {
            addCriterion("XFWJKND_HK_S not in", values, "xfwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwjkndHkSBetween(Double value1, Double value2) {
            addCriterion("XFWJKND_HK_S between", value1, value2, "xfwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("XFWJKND_HK_S not between", value1, value2, "xfwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwckndHkSIsNull() {
            addCriterion("XFWCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andXfwckndHkSIsNotNull() {
            addCriterion("XFWCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andXfwckndHkSEqualTo(Double value) {
            addCriterion("XFWCKND_HK_S =", value, "xfwckndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwckndHkSNotEqualTo(Double value) {
            addCriterion("XFWCKND_HK_S <>", value, "xfwckndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwckndHkSGreaterThan(Double value) {
            addCriterion("XFWCKND_HK_S >", value, "xfwckndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("XFWCKND_HK_S >=", value, "xfwckndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwckndHkSLessThan(Double value) {
            addCriterion("XFWCKND_HK_S <", value, "xfwckndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("XFWCKND_HK_S <=", value, "xfwckndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwckndHkSIn(List<Double> values) {
            addCriterion("XFWCKND_HK_S in", values, "xfwckndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwckndHkSNotIn(List<Double> values) {
            addCriterion("XFWCKND_HK_S not in", values, "xfwckndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwckndHkSBetween(Double value1, Double value2) {
            addCriterion("XFWCKND_HK_S between", value1, value2, "xfwckndHkS");
            return (Criteria) this;
        }

        public Criteria andXfwckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("XFWCKND_HK_S not between", value1, value2, "xfwckndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyqclDIsNull() {
            addCriterion("DZWYQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andDzwyqclDIsNotNull() {
            addCriterion("DZWYQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andDzwyqclDEqualTo(Double value) {
            addCriterion("DZWYQCL_D =", value, "dzwyqclD");
            return (Criteria) this;
        }

        public Criteria andDzwyqclDNotEqualTo(Double value) {
            addCriterion("DZWYQCL_D <>", value, "dzwyqclD");
            return (Criteria) this;
        }

        public Criteria andDzwyqclDGreaterThan(Double value) {
            addCriterion("DZWYQCL_D >", value, "dzwyqclD");
            return (Criteria) this;
        }

        public Criteria andDzwyqclDGreaterThanOrEqualTo(Double value) {
            addCriterion("DZWYQCL_D >=", value, "dzwyqclD");
            return (Criteria) this;
        }

        public Criteria andDzwyqclDLessThan(Double value) {
            addCriterion("DZWYQCL_D <", value, "dzwyqclD");
            return (Criteria) this;
        }

        public Criteria andDzwyqclDLessThanOrEqualTo(Double value) {
            addCriterion("DZWYQCL_D <=", value, "dzwyqclD");
            return (Criteria) this;
        }

        public Criteria andDzwyqclDIn(List<Double> values) {
            addCriterion("DZWYQCL_D in", values, "dzwyqclD");
            return (Criteria) this;
        }

        public Criteria andDzwyqclDNotIn(List<Double> values) {
            addCriterion("DZWYQCL_D not in", values, "dzwyqclD");
            return (Criteria) this;
        }

        public Criteria andDzwyqclDBetween(Double value1, Double value2) {
            addCriterion("DZWYQCL_D between", value1, value2, "dzwyqclD");
            return (Criteria) this;
        }

        public Criteria andDzwyqclDNotBetween(Double value1, Double value2) {
            addCriterion("DZWYQCL_D not between", value1, value2, "dzwyqclD");
            return (Criteria) this;
        }

        public Criteria andDzwyjkndHkSIsNull() {
            addCriterion("DZWYJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andDzwyjkndHkSIsNotNull() {
            addCriterion("DZWYJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andDzwyjkndHkSEqualTo(Double value) {
            addCriterion("DZWYJKND_HK_S =", value, "dzwyjkndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyjkndHkSNotEqualTo(Double value) {
            addCriterion("DZWYJKND_HK_S <>", value, "dzwyjkndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyjkndHkSGreaterThan(Double value) {
            addCriterion("DZWYJKND_HK_S >", value, "dzwyjkndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("DZWYJKND_HK_S >=", value, "dzwyjkndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyjkndHkSLessThan(Double value) {
            addCriterion("DZWYJKND_HK_S <", value, "dzwyjkndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("DZWYJKND_HK_S <=", value, "dzwyjkndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyjkndHkSIn(List<Double> values) {
            addCriterion("DZWYJKND_HK_S in", values, "dzwyjkndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyjkndHkSNotIn(List<Double> values) {
            addCriterion("DZWYJKND_HK_S not in", values, "dzwyjkndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyjkndHkSBetween(Double value1, Double value2) {
            addCriterion("DZWYJKND_HK_S between", value1, value2, "dzwyjkndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("DZWYJKND_HK_S not between", value1, value2, "dzwyjkndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyckndHkSIsNull() {
            addCriterion("DZWYCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andDzwyckndHkSIsNotNull() {
            addCriterion("DZWYCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andDzwyckndHkSEqualTo(Double value) {
            addCriterion("DZWYCKND_HK_S =", value, "dzwyckndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyckndHkSNotEqualTo(Double value) {
            addCriterion("DZWYCKND_HK_S <>", value, "dzwyckndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyckndHkSGreaterThan(Double value) {
            addCriterion("DZWYCKND_HK_S >", value, "dzwyckndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("DZWYCKND_HK_S >=", value, "dzwyckndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyckndHkSLessThan(Double value) {
            addCriterion("DZWYCKND_HK_S <", value, "dzwyckndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("DZWYCKND_HK_S <=", value, "dzwyckndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyckndHkSIn(List<Double> values) {
            addCriterion("DZWYCKND_HK_S in", values, "dzwyckndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyckndHkSNotIn(List<Double> values) {
            addCriterion("DZWYCKND_HK_S not in", values, "dzwyckndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyckndHkSBetween(Double value1, Double value2) {
            addCriterion("DZWYCKND_HK_S between", value1, value2, "dzwyckndHkS");
            return (Criteria) this;
        }

        public Criteria andDzwyckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("DZWYCKND_HK_S not between", value1, value2, "dzwyckndHkS");
            return (Criteria) this;
        }

        public Criteria andSylqclDIsNull() {
            addCriterion("SYLQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andSylqclDIsNotNull() {
            addCriterion("SYLQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andSylqclDEqualTo(Double value) {
            addCriterion("SYLQCL_D =", value, "sylqclD");
            return (Criteria) this;
        }

        public Criteria andSylqclDNotEqualTo(Double value) {
            addCriterion("SYLQCL_D <>", value, "sylqclD");
            return (Criteria) this;
        }

        public Criteria andSylqclDGreaterThan(Double value) {
            addCriterion("SYLQCL_D >", value, "sylqclD");
            return (Criteria) this;
        }

        public Criteria andSylqclDGreaterThanOrEqualTo(Double value) {
            addCriterion("SYLQCL_D >=", value, "sylqclD");
            return (Criteria) this;
        }

        public Criteria andSylqclDLessThan(Double value) {
            addCriterion("SYLQCL_D <", value, "sylqclD");
            return (Criteria) this;
        }

        public Criteria andSylqclDLessThanOrEqualTo(Double value) {
            addCriterion("SYLQCL_D <=", value, "sylqclD");
            return (Criteria) this;
        }

        public Criteria andSylqclDIn(List<Double> values) {
            addCriterion("SYLQCL_D in", values, "sylqclD");
            return (Criteria) this;
        }

        public Criteria andSylqclDNotIn(List<Double> values) {
            addCriterion("SYLQCL_D not in", values, "sylqclD");
            return (Criteria) this;
        }

        public Criteria andSylqclDBetween(Double value1, Double value2) {
            addCriterion("SYLQCL_D between", value1, value2, "sylqclD");
            return (Criteria) this;
        }

        public Criteria andSylqclDNotBetween(Double value1, Double value2) {
            addCriterion("SYLQCL_D not between", value1, value2, "sylqclD");
            return (Criteria) this;
        }

        public Criteria andSyljkndHkSIsNull() {
            addCriterion("SYLJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andSyljkndHkSIsNotNull() {
            addCriterion("SYLJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andSyljkndHkSEqualTo(Double value) {
            addCriterion("SYLJKND_HK_S =", value, "syljkndHkS");
            return (Criteria) this;
        }

        public Criteria andSyljkndHkSNotEqualTo(Double value) {
            addCriterion("SYLJKND_HK_S <>", value, "syljkndHkS");
            return (Criteria) this;
        }

        public Criteria andSyljkndHkSGreaterThan(Double value) {
            addCriterion("SYLJKND_HK_S >", value, "syljkndHkS");
            return (Criteria) this;
        }

        public Criteria andSyljkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("SYLJKND_HK_S >=", value, "syljkndHkS");
            return (Criteria) this;
        }

        public Criteria andSyljkndHkSLessThan(Double value) {
            addCriterion("SYLJKND_HK_S <", value, "syljkndHkS");
            return (Criteria) this;
        }

        public Criteria andSyljkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("SYLJKND_HK_S <=", value, "syljkndHkS");
            return (Criteria) this;
        }

        public Criteria andSyljkndHkSIn(List<Double> values) {
            addCriterion("SYLJKND_HK_S in", values, "syljkndHkS");
            return (Criteria) this;
        }

        public Criteria andSyljkndHkSNotIn(List<Double> values) {
            addCriterion("SYLJKND_HK_S not in", values, "syljkndHkS");
            return (Criteria) this;
        }

        public Criteria andSyljkndHkSBetween(Double value1, Double value2) {
            addCriterion("SYLJKND_HK_S between", value1, value2, "syljkndHkS");
            return (Criteria) this;
        }

        public Criteria andSyljkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("SYLJKND_HK_S not between", value1, value2, "syljkndHkS");
            return (Criteria) this;
        }

        public Criteria andSylckndHkSIsNull() {
            addCriterion("SYLCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andSylckndHkSIsNotNull() {
            addCriterion("SYLCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andSylckndHkSEqualTo(Double value) {
            addCriterion("SYLCKND_HK_S =", value, "sylckndHkS");
            return (Criteria) this;
        }

        public Criteria andSylckndHkSNotEqualTo(Double value) {
            addCriterion("SYLCKND_HK_S <>", value, "sylckndHkS");
            return (Criteria) this;
        }

        public Criteria andSylckndHkSGreaterThan(Double value) {
            addCriterion("SYLCKND_HK_S >", value, "sylckndHkS");
            return (Criteria) this;
        }

        public Criteria andSylckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("SYLCKND_HK_S >=", value, "sylckndHkS");
            return (Criteria) this;
        }

        public Criteria andSylckndHkSLessThan(Double value) {
            addCriterion("SYLCKND_HK_S <", value, "sylckndHkS");
            return (Criteria) this;
        }

        public Criteria andSylckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("SYLCKND_HK_S <=", value, "sylckndHkS");
            return (Criteria) this;
        }

        public Criteria andSylckndHkSIn(List<Double> values) {
            addCriterion("SYLCKND_HK_S in", values, "sylckndHkS");
            return (Criteria) this;
        }

        public Criteria andSylckndHkSNotIn(List<Double> values) {
            addCriterion("SYLCKND_HK_S not in", values, "sylckndHkS");
            return (Criteria) this;
        }

        public Criteria andSylckndHkSBetween(Double value1, Double value2) {
            addCriterion("SYLCKND_HK_S between", value1, value2, "sylckndHkS");
            return (Criteria) this;
        }

        public Criteria andSylckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("SYLCKND_HK_S not between", value1, value2, "sylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjqclDIsNull() {
            addCriterion("YLZHXJQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andYlzhxjqclDIsNotNull() {
            addCriterion("YLZHXJQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andYlzhxjqclDEqualTo(Double value) {
            addCriterion("YLZHXJQCL_D =", value, "ylzhxjqclD");
            return (Criteria) this;
        }

        public Criteria andYlzhxjqclDNotEqualTo(Double value) {
            addCriterion("YLZHXJQCL_D <>", value, "ylzhxjqclD");
            return (Criteria) this;
        }

        public Criteria andYlzhxjqclDGreaterThan(Double value) {
            addCriterion("YLZHXJQCL_D >", value, "ylzhxjqclD");
            return (Criteria) this;
        }

        public Criteria andYlzhxjqclDGreaterThanOrEqualTo(Double value) {
            addCriterion("YLZHXJQCL_D >=", value, "ylzhxjqclD");
            return (Criteria) this;
        }

        public Criteria andYlzhxjqclDLessThan(Double value) {
            addCriterion("YLZHXJQCL_D <", value, "ylzhxjqclD");
            return (Criteria) this;
        }

        public Criteria andYlzhxjqclDLessThanOrEqualTo(Double value) {
            addCriterion("YLZHXJQCL_D <=", value, "ylzhxjqclD");
            return (Criteria) this;
        }

        public Criteria andYlzhxjqclDIn(List<Double> values) {
            addCriterion("YLZHXJQCL_D in", values, "ylzhxjqclD");
            return (Criteria) this;
        }

        public Criteria andYlzhxjqclDNotIn(List<Double> values) {
            addCriterion("YLZHXJQCL_D not in", values, "ylzhxjqclD");
            return (Criteria) this;
        }

        public Criteria andYlzhxjqclDBetween(Double value1, Double value2) {
            addCriterion("YLZHXJQCL_D between", value1, value2, "ylzhxjqclD");
            return (Criteria) this;
        }

        public Criteria andYlzhxjqclDNotBetween(Double value1, Double value2) {
            addCriterion("YLZHXJQCL_D not between", value1, value2, "ylzhxjqclD");
            return (Criteria) this;
        }

        public Criteria andYlzhxjjkndHkSIsNull() {
            addCriterion("YLZHXJJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andYlzhxjjkndHkSIsNotNull() {
            addCriterion("YLZHXJJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andYlzhxjjkndHkSEqualTo(Double value) {
            addCriterion("YLZHXJJKND_HK_S =", value, "ylzhxjjkndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjjkndHkSNotEqualTo(Double value) {
            addCriterion("YLZHXJJKND_HK_S <>", value, "ylzhxjjkndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjjkndHkSGreaterThan(Double value) {
            addCriterion("YLZHXJJKND_HK_S >", value, "ylzhxjjkndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("YLZHXJJKND_HK_S >=", value, "ylzhxjjkndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjjkndHkSLessThan(Double value) {
            addCriterion("YLZHXJJKND_HK_S <", value, "ylzhxjjkndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("YLZHXJJKND_HK_S <=", value, "ylzhxjjkndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjjkndHkSIn(List<Double> values) {
            addCriterion("YLZHXJJKND_HK_S in", values, "ylzhxjjkndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjjkndHkSNotIn(List<Double> values) {
            addCriterion("YLZHXJJKND_HK_S not in", values, "ylzhxjjkndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjjkndHkSBetween(Double value1, Double value2) {
            addCriterion("YLZHXJJKND_HK_S between", value1, value2, "ylzhxjjkndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("YLZHXJJKND_HK_S not between", value1, value2, "ylzhxjjkndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjckndHkSIsNull() {
            addCriterion("YLZHXJCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andYlzhxjckndHkSIsNotNull() {
            addCriterion("YLZHXJCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andYlzhxjckndHkSEqualTo(Double value) {
            addCriterion("YLZHXJCKND_HK_S =", value, "ylzhxjckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjckndHkSNotEqualTo(Double value) {
            addCriterion("YLZHXJCKND_HK_S <>", value, "ylzhxjckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjckndHkSGreaterThan(Double value) {
            addCriterion("YLZHXJCKND_HK_S >", value, "ylzhxjckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("YLZHXJCKND_HK_S >=", value, "ylzhxjckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjckndHkSLessThan(Double value) {
            addCriterion("YLZHXJCKND_HK_S <", value, "ylzhxjckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("YLZHXJCKND_HK_S <=", value, "ylzhxjckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjckndHkSIn(List<Double> values) {
            addCriterion("YLZHXJCKND_HK_S in", values, "ylzhxjckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjckndHkSNotIn(List<Double> values) {
            addCriterion("YLZHXJCKND_HK_S not in", values, "ylzhxjckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjckndHkSBetween(Double value1, Double value2) {
            addCriterion("YLZHXJCKND_HK_S between", value1, value2, "ylzhxjckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlzhxjckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("YLZHXJCKND_HK_S not between", value1, value2, "ylzhxjckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdqclDIsNull() {
            addCriterion("ADQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andAdqclDIsNotNull() {
            addCriterion("ADQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andAdqclDEqualTo(Double value) {
            addCriterion("ADQCL_D =", value, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDNotEqualTo(Double value) {
            addCriterion("ADQCL_D <>", value, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDGreaterThan(Double value) {
            addCriterion("ADQCL_D >", value, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDGreaterThanOrEqualTo(Double value) {
            addCriterion("ADQCL_D >=", value, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDLessThan(Double value) {
            addCriterion("ADQCL_D <", value, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDLessThanOrEqualTo(Double value) {
            addCriterion("ADQCL_D <=", value, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDIn(List<Double> values) {
            addCriterion("ADQCL_D in", values, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDNotIn(List<Double> values) {
            addCriterion("ADQCL_D not in", values, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDBetween(Double value1, Double value2) {
            addCriterion("ADQCL_D between", value1, value2, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdqclDNotBetween(Double value1, Double value2) {
            addCriterion("ADQCL_D not between", value1, value2, "adqclD");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSIsNull() {
            addCriterion("ADJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSIsNotNull() {
            addCriterion("ADJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSEqualTo(Double value) {
            addCriterion("ADJKND_HK_S =", value, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSNotEqualTo(Double value) {
            addCriterion("ADJKND_HK_S <>", value, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSGreaterThan(Double value) {
            addCriterion("ADJKND_HK_S >", value, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("ADJKND_HK_S >=", value, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSLessThan(Double value) {
            addCriterion("ADJKND_HK_S <", value, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("ADJKND_HK_S <=", value, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSIn(List<Double> values) {
            addCriterion("ADJKND_HK_S in", values, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSNotIn(List<Double> values) {
            addCriterion("ADJKND_HK_S not in", values, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSBetween(Double value1, Double value2) {
            addCriterion("ADJKND_HK_S between", value1, value2, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("ADJKND_HK_S not between", value1, value2, "adjkndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSIsNull() {
            addCriterion("ADCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSIsNotNull() {
            addCriterion("ADCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSEqualTo(Double value) {
            addCriterion("ADCKND_HK_S =", value, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSNotEqualTo(Double value) {
            addCriterion("ADCKND_HK_S <>", value, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSGreaterThan(Double value) {
            addCriterion("ADCKND_HK_S >", value, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("ADCKND_HK_S >=", value, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSLessThan(Double value) {
            addCriterion("ADCKND_HK_S <", value, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("ADCKND_HK_S <=", value, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSIn(List<Double> values) {
            addCriterion("ADCKND_HK_S in", values, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSNotIn(List<Double> values) {
            addCriterion("ADCKND_HK_S not in", values, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSBetween(Double value1, Double value2) {
            addCriterion("ADCKND_HK_S between", value1, value2, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andAdckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("ADCKND_HK_S not between", value1, value2, "adckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlqclDIsNull() {
            addCriterion("YLQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andYlqclDIsNotNull() {
            addCriterion("YLQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andYlqclDEqualTo(Double value) {
            addCriterion("YLQCL_D =", value, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDNotEqualTo(Double value) {
            addCriterion("YLQCL_D <>", value, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDGreaterThan(Double value) {
            addCriterion("YLQCL_D >", value, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDGreaterThanOrEqualTo(Double value) {
            addCriterion("YLQCL_D >=", value, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDLessThan(Double value) {
            addCriterion("YLQCL_D <", value, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDLessThanOrEqualTo(Double value) {
            addCriterion("YLQCL_D <=", value, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDIn(List<Double> values) {
            addCriterion("YLQCL_D in", values, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDNotIn(List<Double> values) {
            addCriterion("YLQCL_D not in", values, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDBetween(Double value1, Double value2) {
            addCriterion("YLQCL_D between", value1, value2, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYlqclDNotBetween(Double value1, Double value2) {
            addCriterion("YLQCL_D not between", value1, value2, "ylqclD");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSIsNull() {
            addCriterion("YLJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSIsNotNull() {
            addCriterion("YLJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSEqualTo(Double value) {
            addCriterion("YLJKND_HK_S =", value, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSNotEqualTo(Double value) {
            addCriterion("YLJKND_HK_S <>", value, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSGreaterThan(Double value) {
            addCriterion("YLJKND_HK_S >", value, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("YLJKND_HK_S >=", value, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSLessThan(Double value) {
            addCriterion("YLJKND_HK_S <", value, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("YLJKND_HK_S <=", value, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSIn(List<Double> values) {
            addCriterion("YLJKND_HK_S in", values, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSNotIn(List<Double> values) {
            addCriterion("YLJKND_HK_S not in", values, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSBetween(Double value1, Double value2) {
            addCriterion("YLJKND_HK_S between", value1, value2, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYljkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("YLJKND_HK_S not between", value1, value2, "yljkndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSIsNull() {
            addCriterion("YLCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSIsNotNull() {
            addCriterion("YLCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSEqualTo(Double value) {
            addCriterion("YLCKND_HK_S =", value, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSNotEqualTo(Double value) {
            addCriterion("YLCKND_HK_S <>", value, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSGreaterThan(Double value) {
            addCriterion("YLCKND_HK_S >", value, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("YLCKND_HK_S >=", value, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSLessThan(Double value) {
            addCriterion("YLCKND_HK_S <", value, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("YLCKND_HK_S <=", value, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSIn(List<Double> values) {
            addCriterion("YLCKND_HK_S in", values, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSNotIn(List<Double> values) {
            addCriterion("YLCKND_HK_S not in", values, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSBetween(Double value1, Double value2) {
            addCriterion("YLCKND_HK_S between", value1, value2, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andYlckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("YLCKND_HK_S not between", value1, value2, "ylckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdqclDIsNull() {
            addCriterion("ZDQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andZdqclDIsNotNull() {
            addCriterion("ZDQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andZdqclDEqualTo(Double value) {
            addCriterion("ZDQCL_D =", value, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDNotEqualTo(Double value) {
            addCriterion("ZDQCL_D <>", value, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDGreaterThan(Double value) {
            addCriterion("ZDQCL_D >", value, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDGreaterThanOrEqualTo(Double value) {
            addCriterion("ZDQCL_D >=", value, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDLessThan(Double value) {
            addCriterion("ZDQCL_D <", value, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDLessThanOrEqualTo(Double value) {
            addCriterion("ZDQCL_D <=", value, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDIn(List<Double> values) {
            addCriterion("ZDQCL_D in", values, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDNotIn(List<Double> values) {
            addCriterion("ZDQCL_D not in", values, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDBetween(Double value1, Double value2) {
            addCriterion("ZDQCL_D between", value1, value2, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdqclDNotBetween(Double value1, Double value2) {
            addCriterion("ZDQCL_D not between", value1, value2, "zdqclD");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSIsNull() {
            addCriterion("ZDJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSIsNotNull() {
            addCriterion("ZDJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSEqualTo(Double value) {
            addCriterion("ZDJKND_HK_S =", value, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSNotEqualTo(Double value) {
            addCriterion("ZDJKND_HK_S <>", value, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSGreaterThan(Double value) {
            addCriterion("ZDJKND_HK_S >", value, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("ZDJKND_HK_S >=", value, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSLessThan(Double value) {
            addCriterion("ZDJKND_HK_S <", value, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("ZDJKND_HK_S <=", value, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSIn(List<Double> values) {
            addCriterion("ZDJKND_HK_S in", values, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSNotIn(List<Double> values) {
            addCriterion("ZDJKND_HK_S not in", values, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSBetween(Double value1, Double value2) {
            addCriterion("ZDJKND_HK_S between", value1, value2, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("ZDJKND_HK_S not between", value1, value2, "zdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSIsNull() {
            addCriterion("ZDCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSIsNotNull() {
            addCriterion("ZDCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSEqualTo(Double value) {
            addCriterion("ZDCKND_HK_S =", value, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSNotEqualTo(Double value) {
            addCriterion("ZDCKND_HK_S <>", value, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSGreaterThan(Double value) {
            addCriterion("ZDCKND_HK_S >", value, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("ZDCKND_HK_S >=", value, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSLessThan(Double value) {
            addCriterion("ZDCKND_HK_S <", value, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("ZDCKND_HK_S <=", value, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSIn(List<Double> values) {
            addCriterion("ZDCKND_HK_S in", values, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSNotIn(List<Double> values) {
            addCriterion("ZDCKND_HK_S not in", values, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSBetween(Double value1, Double value2) {
            addCriterion("ZDCKND_HK_S between", value1, value2, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZdckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("ZDCKND_HK_S not between", value1, value2, "zdckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlqclQkIsNull() {
            addCriterion("ZLQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andZlqclQkIsNotNull() {
            addCriterion("ZLQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andZlqclQkEqualTo(Double value) {
            addCriterion("ZLQCL_QK =", value, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkNotEqualTo(Double value) {
            addCriterion("ZLQCL_QK <>", value, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkGreaterThan(Double value) {
            addCriterion("ZLQCL_QK >", value, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkGreaterThanOrEqualTo(Double value) {
            addCriterion("ZLQCL_QK >=", value, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkLessThan(Double value) {
            addCriterion("ZLQCL_QK <", value, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkLessThanOrEqualTo(Double value) {
            addCriterion("ZLQCL_QK <=", value, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkIn(List<Double> values) {
            addCriterion("ZLQCL_QK in", values, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkNotIn(List<Double> values) {
            addCriterion("ZLQCL_QK not in", values, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkBetween(Double value1, Double value2) {
            addCriterion("ZLQCL_QK between", value1, value2, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZlqclQkNotBetween(Double value1, Double value2) {
            addCriterion("ZLQCL_QK not between", value1, value2, "zlqclQk");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSIsNull() {
            addCriterion("ZLJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSIsNotNull() {
            addCriterion("ZLJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSEqualTo(Double value) {
            addCriterion("ZLJKND_HK_S =", value, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSNotEqualTo(Double value) {
            addCriterion("ZLJKND_HK_S <>", value, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSGreaterThan(Double value) {
            addCriterion("ZLJKND_HK_S >", value, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("ZLJKND_HK_S >=", value, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSLessThan(Double value) {
            addCriterion("ZLJKND_HK_S <", value, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("ZLJKND_HK_S <=", value, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSIn(List<Double> values) {
            addCriterion("ZLJKND_HK_S in", values, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSNotIn(List<Double> values) {
            addCriterion("ZLJKND_HK_S not in", values, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSBetween(Double value1, Double value2) {
            addCriterion("ZLJKND_HK_S between", value1, value2, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZljkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("ZLJKND_HK_S not between", value1, value2, "zljkndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSIsNull() {
            addCriterion("ZLCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSIsNotNull() {
            addCriterion("ZLCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSEqualTo(Double value) {
            addCriterion("ZLCKND_HK_S =", value, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSNotEqualTo(Double value) {
            addCriterion("ZLCKND_HK_S <>", value, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSGreaterThan(Double value) {
            addCriterion("ZLCKND_HK_S >", value, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("ZLCKND_HK_S >=", value, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSLessThan(Double value) {
            addCriterion("ZLCKND_HK_S <", value, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("ZLCKND_HK_S <=", value, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSIn(List<Double> values) {
            addCriterion("ZLCKND_HK_S in", values, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSNotIn(List<Double> values) {
            addCriterion("ZLCKND_HK_S not in", values, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSBetween(Double value1, Double value2) {
            addCriterion("ZLCKND_HK_S between", value1, value2, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andZlckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("ZLCKND_HK_S not between", value1, value2, "zlckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffqclQkIsNull() {
            addCriterion("HFFQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andHffqclQkIsNotNull() {
            addCriterion("HFFQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andHffqclQkEqualTo(Double value) {
            addCriterion("HFFQCL_QK =", value, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkNotEqualTo(Double value) {
            addCriterion("HFFQCL_QK <>", value, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkGreaterThan(Double value) {
            addCriterion("HFFQCL_QK >", value, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkGreaterThanOrEqualTo(Double value) {
            addCriterion("HFFQCL_QK >=", value, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkLessThan(Double value) {
            addCriterion("HFFQCL_QK <", value, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkLessThanOrEqualTo(Double value) {
            addCriterion("HFFQCL_QK <=", value, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkIn(List<Double> values) {
            addCriterion("HFFQCL_QK in", values, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkNotIn(List<Double> values) {
            addCriterion("HFFQCL_QK not in", values, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkBetween(Double value1, Double value2) {
            addCriterion("HFFQCL_QK between", value1, value2, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffqclQkNotBetween(Double value1, Double value2) {
            addCriterion("HFFQCL_QK not between", value1, value2, "hffqclQk");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSIsNull() {
            addCriterion("HFFJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSIsNotNull() {
            addCriterion("HFFJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSEqualTo(Double value) {
            addCriterion("HFFJKND_HK_S =", value, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSNotEqualTo(Double value) {
            addCriterion("HFFJKND_HK_S <>", value, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSGreaterThan(Double value) {
            addCriterion("HFFJKND_HK_S >", value, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("HFFJKND_HK_S >=", value, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSLessThan(Double value) {
            addCriterion("HFFJKND_HK_S <", value, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("HFFJKND_HK_S <=", value, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSIn(List<Double> values) {
            addCriterion("HFFJKND_HK_S in", values, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSNotIn(List<Double> values) {
            addCriterion("HFFJKND_HK_S not in", values, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSBetween(Double value1, Double value2) {
            addCriterion("HFFJKND_HK_S between", value1, value2, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("HFFJKND_HK_S not between", value1, value2, "hffjkndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSIsNull() {
            addCriterion("HFFCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSIsNotNull() {
            addCriterion("HFFCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSEqualTo(Double value) {
            addCriterion("HFFCKND_HK_S =", value, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSNotEqualTo(Double value) {
            addCriterion("HFFCKND_HK_S <>", value, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSGreaterThan(Double value) {
            addCriterion("HFFCKND_HK_S >", value, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("HFFCKND_HK_S >=", value, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSLessThan(Double value) {
            addCriterion("HFFCKND_HK_S <", value, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("HFFCKND_HK_S <=", value, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSIn(List<Double> values) {
            addCriterion("HFFCKND_HK_S in", values, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSNotIn(List<Double> values) {
            addCriterion("HFFCKND_HK_S not in", values, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSBetween(Double value1, Double value2) {
            addCriterion("HFFCKND_HK_S between", value1, value2, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andHffckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("HFFCKND_HK_S not between", value1, value2, "hffckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkIsNull() {
            addCriterion("QHWQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkIsNotNull() {
            addCriterion("QHWQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkEqualTo(Double value) {
            addCriterion("QHWQCL_QK =", value, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkNotEqualTo(Double value) {
            addCriterion("QHWQCL_QK <>", value, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkGreaterThan(Double value) {
            addCriterion("QHWQCL_QK >", value, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkGreaterThanOrEqualTo(Double value) {
            addCriterion("QHWQCL_QK >=", value, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkLessThan(Double value) {
            addCriterion("QHWQCL_QK <", value, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkLessThanOrEqualTo(Double value) {
            addCriterion("QHWQCL_QK <=", value, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkIn(List<Double> values) {
            addCriterion("QHWQCL_QK in", values, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkNotIn(List<Double> values) {
            addCriterion("QHWQCL_QK not in", values, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkBetween(Double value1, Double value2) {
            addCriterion("QHWQCL_QK between", value1, value2, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwqclQkNotBetween(Double value1, Double value2) {
            addCriterion("QHWQCL_QK not between", value1, value2, "qhwqclQk");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSIsNull() {
            addCriterion("QHWJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSIsNotNull() {
            addCriterion("QHWJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSEqualTo(Double value) {
            addCriterion("QHWJKND_HK_S =", value, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSNotEqualTo(Double value) {
            addCriterion("QHWJKND_HK_S <>", value, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSGreaterThan(Double value) {
            addCriterion("QHWJKND_HK_S >", value, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("QHWJKND_HK_S >=", value, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSLessThan(Double value) {
            addCriterion("QHWJKND_HK_S <", value, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("QHWJKND_HK_S <=", value, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSIn(List<Double> values) {
            addCriterion("QHWJKND_HK_S in", values, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSNotIn(List<Double> values) {
            addCriterion("QHWJKND_HK_S not in", values, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSBetween(Double value1, Double value2) {
            addCriterion("QHWJKND_HK_S between", value1, value2, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("QHWJKND_HK_S not between", value1, value2, "qhwjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSIsNull() {
            addCriterion("QHWCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSIsNotNull() {
            addCriterion("QHWCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSEqualTo(Double value) {
            addCriterion("QHWCKND_HK_S =", value, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSNotEqualTo(Double value) {
            addCriterion("QHWCKND_HK_S <>", value, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSGreaterThan(Double value) {
            addCriterion("QHWCKND_HK_S >", value, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("QHWCKND_HK_S >=", value, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSLessThan(Double value) {
            addCriterion("QHWCKND_HK_S <", value, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("QHWCKND_HK_S <=", value, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSIn(List<Double> values) {
            addCriterion("QHWCKND_HK_S in", values, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSNotIn(List<Double> values) {
            addCriterion("QHWCKND_HK_S not in", values, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSBetween(Double value1, Double value2) {
            addCriterion("QHWCKND_HK_S between", value1, value2, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andQhwckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("QHWCKND_HK_S not between", value1, value2, "qhwckndHkS");
            return (Criteria) this;
        }

        public Criteria andSqclQkIsNull() {
            addCriterion("SQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andSqclQkIsNotNull() {
            addCriterion("SQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andSqclQkEqualTo(Double value) {
            addCriterion("SQCL_QK =", value, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkNotEqualTo(Double value) {
            addCriterion("SQCL_QK <>", value, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkGreaterThan(Double value) {
            addCriterion("SQCL_QK >", value, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkGreaterThanOrEqualTo(Double value) {
            addCriterion("SQCL_QK >=", value, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkLessThan(Double value) {
            addCriterion("SQCL_QK <", value, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkLessThanOrEqualTo(Double value) {
            addCriterion("SQCL_QK <=", value, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkIn(List<Double> values) {
            addCriterion("SQCL_QK in", values, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkNotIn(List<Double> values) {
            addCriterion("SQCL_QK not in", values, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkBetween(Double value1, Double value2) {
            addCriterion("SQCL_QK between", value1, value2, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSqclQkNotBetween(Double value1, Double value2) {
            addCriterion("SQCL_QK not between", value1, value2, "sqclQk");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSIsNull() {
            addCriterion("SJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSIsNotNull() {
            addCriterion("SJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSEqualTo(Double value) {
            addCriterion("SJKND_HK_S =", value, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSNotEqualTo(Double value) {
            addCriterion("SJKND_HK_S <>", value, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSGreaterThan(Double value) {
            addCriterion("SJKND_HK_S >", value, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("SJKND_HK_S >=", value, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSLessThan(Double value) {
            addCriterion("SJKND_HK_S <", value, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("SJKND_HK_S <=", value, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSIn(List<Double> values) {
            addCriterion("SJKND_HK_S in", values, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSNotIn(List<Double> values) {
            addCriterion("SJKND_HK_S not in", values, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSBetween(Double value1, Double value2) {
            addCriterion("SJKND_HK_S between", value1, value2, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("SJKND_HK_S not between", value1, value2, "sjkndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSIsNull() {
            addCriterion("SCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andSckndHkSIsNotNull() {
            addCriterion("SCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andSckndHkSEqualTo(Double value) {
            addCriterion("SCKND_HK_S =", value, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSNotEqualTo(Double value) {
            addCriterion("SCKND_HK_S <>", value, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSGreaterThan(Double value) {
            addCriterion("SCKND_HK_S >", value, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("SCKND_HK_S >=", value, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSLessThan(Double value) {
            addCriterion("SCKND_HK_S <", value, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("SCKND_HK_S <=", value, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSIn(List<Double> values) {
            addCriterion("SCKND_HK_S in", values, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSNotIn(List<Double> values) {
            addCriterion("SCKND_HK_S not in", values, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSBetween(Double value1, Double value2) {
            addCriterion("SCKND_HK_S between", value1, value2, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andSckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("SCKND_HK_S not between", value1, value2, "sckndHkS");
            return (Criteria) this;
        }

        public Criteria andQqclQkIsNull() {
            addCriterion("QQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andQqclQkIsNotNull() {
            addCriterion("QQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andQqclQkEqualTo(Double value) {
            addCriterion("QQCL_QK =", value, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkNotEqualTo(Double value) {
            addCriterion("QQCL_QK <>", value, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkGreaterThan(Double value) {
            addCriterion("QQCL_QK >", value, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkGreaterThanOrEqualTo(Double value) {
            addCriterion("QQCL_QK >=", value, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkLessThan(Double value) {
            addCriterion("QQCL_QK <", value, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkLessThanOrEqualTo(Double value) {
            addCriterion("QQCL_QK <=", value, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkIn(List<Double> values) {
            addCriterion("QQCL_QK in", values, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkNotIn(List<Double> values) {
            addCriterion("QQCL_QK not in", values, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkBetween(Double value1, Double value2) {
            addCriterion("QQCL_QK between", value1, value2, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQqclQkNotBetween(Double value1, Double value2) {
            addCriterion("QQCL_QK not between", value1, value2, "qqclQk");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSIsNull() {
            addCriterion("QJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSIsNotNull() {
            addCriterion("QJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSEqualTo(Double value) {
            addCriterion("QJKND_HK_S =", value, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSNotEqualTo(Double value) {
            addCriterion("QJKND_HK_S <>", value, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSGreaterThan(Double value) {
            addCriterion("QJKND_HK_S >", value, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("QJKND_HK_S >=", value, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSLessThan(Double value) {
            addCriterion("QJKND_HK_S <", value, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("QJKND_HK_S <=", value, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSIn(List<Double> values) {
            addCriterion("QJKND_HK_S in", values, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSNotIn(List<Double> values) {
            addCriterion("QJKND_HK_S not in", values, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSBetween(Double value1, Double value2) {
            addCriterion("QJKND_HK_S between", value1, value2, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("QJKND_HK_S not between", value1, value2, "qjkndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSIsNull() {
            addCriterion("QCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andQckndHkSIsNotNull() {
            addCriterion("QCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andQckndHkSEqualTo(Double value) {
            addCriterion("QCKND_HK_S =", value, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSNotEqualTo(Double value) {
            addCriterion("QCKND_HK_S <>", value, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSGreaterThan(Double value) {
            addCriterion("QCKND_HK_S >", value, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("QCKND_HK_S >=", value, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSLessThan(Double value) {
            addCriterion("QCKND_HK_S <", value, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("QCKND_HK_S <=", value, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSIn(List<Double> values) {
            addCriterion("QCKND_HK_S in", values, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSNotIn(List<Double> values) {
            addCriterion("QCKND_HK_S not in", values, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSBetween(Double value1, Double value2) {
            addCriterion("QCKND_HK_S between", value1, value2, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andQckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("QCKND_HK_S not between", value1, value2, "qckndHkS");
            return (Criteria) this;
        }

        public Criteria andGqclQkIsNull() {
            addCriterion("GQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andGqclQkIsNotNull() {
            addCriterion("GQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andGqclQkEqualTo(Double value) {
            addCriterion("GQCL_QK =", value, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkNotEqualTo(Double value) {
            addCriterion("GQCL_QK <>", value, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkGreaterThan(Double value) {
            addCriterion("GQCL_QK >", value, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkGreaterThanOrEqualTo(Double value) {
            addCriterion("GQCL_QK >=", value, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkLessThan(Double value) {
            addCriterion("GQCL_QK <", value, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkLessThanOrEqualTo(Double value) {
            addCriterion("GQCL_QK <=", value, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkIn(List<Double> values) {
            addCriterion("GQCL_QK in", values, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkNotIn(List<Double> values) {
            addCriterion("GQCL_QK not in", values, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkBetween(Double value1, Double value2) {
            addCriterion("GQCL_QK between", value1, value2, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGqclQkNotBetween(Double value1, Double value2) {
            addCriterion("GQCL_QK not between", value1, value2, "gqclQk");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSIsNull() {
            addCriterion("GJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSIsNotNull() {
            addCriterion("GJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSEqualTo(Double value) {
            addCriterion("GJKND_HK_S =", value, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSNotEqualTo(Double value) {
            addCriterion("GJKND_HK_S <>", value, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSGreaterThan(Double value) {
            addCriterion("GJKND_HK_S >", value, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("GJKND_HK_S >=", value, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSLessThan(Double value) {
            addCriterion("GJKND_HK_S <", value, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("GJKND_HK_S <=", value, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSIn(List<Double> values) {
            addCriterion("GJKND_HK_S in", values, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSNotIn(List<Double> values) {
            addCriterion("GJKND_HK_S not in", values, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSBetween(Double value1, Double value2) {
            addCriterion("GJKND_HK_S between", value1, value2, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("GJKND_HK_S not between", value1, value2, "gjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSIsNull() {
            addCriterion("GCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andGckndHkSIsNotNull() {
            addCriterion("GCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGckndHkSEqualTo(Double value) {
            addCriterion("GCKND_HK_S =", value, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSNotEqualTo(Double value) {
            addCriterion("GCKND_HK_S <>", value, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSGreaterThan(Double value) {
            addCriterion("GCKND_HK_S >", value, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("GCKND_HK_S >=", value, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSLessThan(Double value) {
            addCriterion("GCKND_HK_S <", value, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("GCKND_HK_S <=", value, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSIn(List<Double> values) {
            addCriterion("GCKND_HK_S in", values, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSNotIn(List<Double> values) {
            addCriterion("GCKND_HK_S not in", values, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSBetween(Double value1, Double value2) {
            addCriterion("GCKND_HK_S between", value1, value2, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("GCKND_HK_S not between", value1, value2, "gckndHkS");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1IsNull() {
            addCriterion("GQCL_QK_dup1 is null");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1IsNotNull() {
            addCriterion("GQCL_QK_dup1 is not null");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1EqualTo(Double value) {
            addCriterion("GQCL_QK_dup1 =", value, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1NotEqualTo(Double value) {
            addCriterion("GQCL_QK_dup1 <>", value, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1GreaterThan(Double value) {
            addCriterion("GQCL_QK_dup1 >", value, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1GreaterThanOrEqualTo(Double value) {
            addCriterion("GQCL_QK_dup1 >=", value, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1LessThan(Double value) {
            addCriterion("GQCL_QK_dup1 <", value, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1LessThanOrEqualTo(Double value) {
            addCriterion("GQCL_QK_dup1 <=", value, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1In(List<Double> values) {
            addCriterion("GQCL_QK_dup1 in", values, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1NotIn(List<Double> values) {
            addCriterion("GQCL_QK_dup1 not in", values, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1Between(Double value1, Double value2) {
            addCriterion("GQCL_QK_dup1 between", value1, value2, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGqclQkDup1NotBetween(Double value1, Double value2) {
            addCriterion("GQCL_QK_dup1 not between", value1, value2, "gqclQkDup1");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSIsNull() {
            addCriterion("GJKND_WK_S is null");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSIsNotNull() {
            addCriterion("GJKND_WK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSEqualTo(Double value) {
            addCriterion("GJKND_WK_S =", value, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSNotEqualTo(Double value) {
            addCriterion("GJKND_WK_S <>", value, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSGreaterThan(Double value) {
            addCriterion("GJKND_WK_S >", value, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSGreaterThanOrEqualTo(Double value) {
            addCriterion("GJKND_WK_S >=", value, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSLessThan(Double value) {
            addCriterion("GJKND_WK_S <", value, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSLessThanOrEqualTo(Double value) {
            addCriterion("GJKND_WK_S <=", value, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSIn(List<Double> values) {
            addCriterion("GJKND_WK_S in", values, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSNotIn(List<Double> values) {
            addCriterion("GJKND_WK_S not in", values, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSBetween(Double value1, Double value2) {
            addCriterion("GJKND_WK_S between", value1, value2, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGjkndWkSNotBetween(Double value1, Double value2) {
            addCriterion("GJKND_WK_S not between", value1, value2, "gjkndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSIsNull() {
            addCriterion("GCKND_WK_S is null");
            return (Criteria) this;
        }

        public Criteria andGckndWkSIsNotNull() {
            addCriterion("GCKND_WK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGckndWkSEqualTo(Double value) {
            addCriterion("GCKND_WK_S =", value, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSNotEqualTo(Double value) {
            addCriterion("GCKND_WK_S <>", value, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSGreaterThan(Double value) {
            addCriterion("GCKND_WK_S >", value, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSGreaterThanOrEqualTo(Double value) {
            addCriterion("GCKND_WK_S >=", value, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSLessThan(Double value) {
            addCriterion("GCKND_WK_S <", value, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSLessThanOrEqualTo(Double value) {
            addCriterion("GCKND_WK_S <=", value, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSIn(List<Double> values) {
            addCriterion("GCKND_WK_S in", values, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSNotIn(List<Double> values) {
            addCriterion("GCKND_WK_S not in", values, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSBetween(Double value1, Double value2) {
            addCriterion("GCKND_WK_S between", value1, value2, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andGckndWkSNotBetween(Double value1, Double value2) {
            addCriterion("GCKND_WK_S not between", value1, value2, "gckndWkS");
            return (Criteria) this;
        }

        public Criteria andZgqclQkIsNull() {
            addCriterion("ZGQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andZgqclQkIsNotNull() {
            addCriterion("ZGQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andZgqclQkEqualTo(Double value) {
            addCriterion("ZGQCL_QK =", value, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkNotEqualTo(Double value) {
            addCriterion("ZGQCL_QK <>", value, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkGreaterThan(Double value) {
            addCriterion("ZGQCL_QK >", value, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkGreaterThanOrEqualTo(Double value) {
            addCriterion("ZGQCL_QK >=", value, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkLessThan(Double value) {
            addCriterion("ZGQCL_QK <", value, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkLessThanOrEqualTo(Double value) {
            addCriterion("ZGQCL_QK <=", value, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkIn(List<Double> values) {
            addCriterion("ZGQCL_QK in", values, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkNotIn(List<Double> values) {
            addCriterion("ZGQCL_QK not in", values, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkBetween(Double value1, Double value2) {
            addCriterion("ZGQCL_QK between", value1, value2, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgqclQkNotBetween(Double value1, Double value2) {
            addCriterion("ZGQCL_QK not between", value1, value2, "zgqclQk");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSIsNull() {
            addCriterion("ZGJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSIsNotNull() {
            addCriterion("ZGJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSEqualTo(Double value) {
            addCriterion("ZGJKND_HK_S =", value, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSNotEqualTo(Double value) {
            addCriterion("ZGJKND_HK_S <>", value, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSGreaterThan(Double value) {
            addCriterion("ZGJKND_HK_S >", value, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("ZGJKND_HK_S >=", value, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSLessThan(Double value) {
            addCriterion("ZGJKND_HK_S <", value, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("ZGJKND_HK_S <=", value, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSIn(List<Double> values) {
            addCriterion("ZGJKND_HK_S in", values, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSNotIn(List<Double> values) {
            addCriterion("ZGJKND_HK_S not in", values, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSBetween(Double value1, Double value2) {
            addCriterion("ZGJKND_HK_S between", value1, value2, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("ZGJKND_HK_S not between", value1, value2, "zgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSIsNull() {
            addCriterion("ZGCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSIsNotNull() {
            addCriterion("ZGCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSEqualTo(Double value) {
            addCriterion("ZGCKND_HK_S =", value, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSNotEqualTo(Double value) {
            addCriterion("ZGCKND_HK_S <>", value, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSGreaterThan(Double value) {
            addCriterion("ZGCKND_HK_S >", value, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("ZGCKND_HK_S >=", value, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSLessThan(Double value) {
            addCriterion("ZGCKND_HK_S <", value, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("ZGCKND_HK_S <=", value, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSIn(List<Double> values) {
            addCriterion("ZGCKND_HK_S in", values, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSNotIn(List<Double> values) {
            addCriterion("ZGCKND_HK_S not in", values, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSBetween(Double value1, Double value2) {
            addCriterion("ZGCKND_HK_S between", value1, value2, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andZgckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("ZGCKND_HK_S not between", value1, value2, "zgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkIsNull() {
            addCriterion("LJGQCL_QK is null");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkIsNotNull() {
            addCriterion("LJGQCL_QK is not null");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkEqualTo(Double value) {
            addCriterion("LJGQCL_QK =", value, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkNotEqualTo(Double value) {
            addCriterion("LJGQCL_QK <>", value, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkGreaterThan(Double value) {
            addCriterion("LJGQCL_QK >", value, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkGreaterThanOrEqualTo(Double value) {
            addCriterion("LJGQCL_QK >=", value, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkLessThan(Double value) {
            addCriterion("LJGQCL_QK <", value, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkLessThanOrEqualTo(Double value) {
            addCriterion("LJGQCL_QK <=", value, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkIn(List<Double> values) {
            addCriterion("LJGQCL_QK in", values, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkNotIn(List<Double> values) {
            addCriterion("LJGQCL_QK not in", values, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkBetween(Double value1, Double value2) {
            addCriterion("LJGQCL_QK between", value1, value2, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgqclQkNotBetween(Double value1, Double value2) {
            addCriterion("LJGQCL_QK not between", value1, value2, "ljgqclQk");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSIsNull() {
            addCriterion("LJGJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSIsNotNull() {
            addCriterion("LJGJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSEqualTo(Double value) {
            addCriterion("LJGJKND_HK_S =", value, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSNotEqualTo(Double value) {
            addCriterion("LJGJKND_HK_S <>", value, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSGreaterThan(Double value) {
            addCriterion("LJGJKND_HK_S >", value, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("LJGJKND_HK_S >=", value, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSLessThan(Double value) {
            addCriterion("LJGJKND_HK_S <", value, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("LJGJKND_HK_S <=", value, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSIn(List<Double> values) {
            addCriterion("LJGJKND_HK_S in", values, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSNotIn(List<Double> values) {
            addCriterion("LJGJKND_HK_S not in", values, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSBetween(Double value1, Double value2) {
            addCriterion("LJGJKND_HK_S between", value1, value2, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("LJGJKND_HK_S not between", value1, value2, "ljgjkndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSIsNull() {
            addCriterion("LJGCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSIsNotNull() {
            addCriterion("LJGCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSEqualTo(Double value) {
            addCriterion("LJGCKND_HK_S =", value, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSNotEqualTo(Double value) {
            addCriterion("LJGCKND_HK_S <>", value, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSGreaterThan(Double value) {
            addCriterion("LJGCKND_HK_S >", value, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("LJGCKND_HK_S >=", value, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSLessThan(Double value) {
            addCriterion("LJGCKND_HK_S <", value, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("LJGCKND_HK_S <=", value, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSIn(List<Double> values) {
            addCriterion("LJGCKND_HK_S in", values, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSNotIn(List<Double> values) {
            addCriterion("LJGCKND_HK_S not in", values, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSBetween(Double value1, Double value2) {
            addCriterion("LJGCKND_HK_S between", value1, value2, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andLjgckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("LJGCKND_HK_S not between", value1, value2, "ljgckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRIsNull() {
            addCriterion("GY_CLSL_WD_R is null");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRIsNotNull() {
            addCriterion("GY_CLSL_WD_R is not null");
            return (Criteria) this;
        }

        public Criteria andGyClslWdREqualTo(Double value) {
            addCriterion("GY_CLSL_WD_R =", value, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRNotEqualTo(Double value) {
            addCriterion("GY_CLSL_WD_R <>", value, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRGreaterThan(Double value) {
            addCriterion("GY_CLSL_WD_R >", value, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRGreaterThanOrEqualTo(Double value) {
            addCriterion("GY_CLSL_WD_R >=", value, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRLessThan(Double value) {
            addCriterion("GY_CLSL_WD_R <", value, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRLessThanOrEqualTo(Double value) {
            addCriterion("GY_CLSL_WD_R <=", value, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRIn(List<Double> values) {
            addCriterion("GY_CLSL_WD_R in", values, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRNotIn(List<Double> values) {
            addCriterion("GY_CLSL_WD_R not in", values, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRBetween(Double value1, Double value2) {
            addCriterion("GY_CLSL_WD_R between", value1, value2, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyClslWdRNotBetween(Double value1, Double value2) {
            addCriterion("GY_CLSL_WD_R not between", value1, value2, "gyClslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRIsNull() {
            addCriterion("GY_XZCLSL_WD_R is null");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRIsNotNull() {
            addCriterion("GY_XZCLSL_WD_R is not null");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdREqualTo(Double value) {
            addCriterion("GY_XZCLSL_WD_R =", value, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRNotEqualTo(Double value) {
            addCriterion("GY_XZCLSL_WD_R <>", value, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRGreaterThan(Double value) {
            addCriterion("GY_XZCLSL_WD_R >", value, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRGreaterThanOrEqualTo(Double value) {
            addCriterion("GY_XZCLSL_WD_R >=", value, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRLessThan(Double value) {
            addCriterion("GY_XZCLSL_WD_R <", value, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRLessThanOrEqualTo(Double value) {
            addCriterion("GY_XZCLSL_WD_R <=", value, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRIn(List<Double> values) {
            addCriterion("GY_XZCLSL_WD_R in", values, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRNotIn(List<Double> values) {
            addCriterion("GY_XZCLSL_WD_R not in", values, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRBetween(Double value1, Double value2) {
            addCriterion("GY_XZCLSL_WD_R between", value1, value2, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyXzclslWdRNotBetween(Double value1, Double value2) {
            addCriterion("GY_XZCLSL_WD_R not between", value1, value2, "gyXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTIsNull() {
            addCriterion("GY_YXTS_T is null");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTIsNotNull() {
            addCriterion("GY_YXTS_T is not null");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTEqualTo(Double value) {
            addCriterion("GY_YXTS_T =", value, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTNotEqualTo(Double value) {
            addCriterion("GY_YXTS_T <>", value, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTGreaterThan(Double value) {
            addCriterion("GY_YXTS_T >", value, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTGreaterThanOrEqualTo(Double value) {
            addCriterion("GY_YXTS_T >=", value, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTLessThan(Double value) {
            addCriterion("GY_YXTS_T <", value, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTLessThanOrEqualTo(Double value) {
            addCriterion("GY_YXTS_T <=", value, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTIn(List<Double> values) {
            addCriterion("GY_YXTS_T in", values, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTNotIn(List<Double> values) {
            addCriterion("GY_YXTS_T not in", values, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTBetween(Double value1, Double value2) {
            addCriterion("GY_YXTS_T between", value1, value2, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyYxtsTNotBetween(Double value1, Double value2) {
            addCriterion("GY_YXTS_T not between", value1, value2, "gyYxtsT");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSIsNull() {
            addCriterion("GY_CODJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSIsNotNull() {
            addCriterion("GY_CODJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSEqualTo(Double value) {
            addCriterion("GY_CODJKND_HK_S =", value, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSNotEqualTo(Double value) {
            addCriterion("GY_CODJKND_HK_S <>", value, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSGreaterThan(Double value) {
            addCriterion("GY_CODJKND_HK_S >", value, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("GY_CODJKND_HK_S >=", value, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSLessThan(Double value) {
            addCriterion("GY_CODJKND_HK_S <", value, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("GY_CODJKND_HK_S <=", value, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSIn(List<Double> values) {
            addCriterion("GY_CODJKND_HK_S in", values, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSNotIn(List<Double> values) {
            addCriterion("GY_CODJKND_HK_S not in", values, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSBetween(Double value1, Double value2) {
            addCriterion("GY_CODJKND_HK_S between", value1, value2, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("GY_CODJKND_HK_S not between", value1, value2, "gyCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSIsNull() {
            addCriterion("GY_CODCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSIsNotNull() {
            addCriterion("GY_CODCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSEqualTo(Double value) {
            addCriterion("GY_CODCKND_HK_S =", value, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSNotEqualTo(Double value) {
            addCriterion("GY_CODCKND_HK_S <>", value, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSGreaterThan(Double value) {
            addCriterion("GY_CODCKND_HK_S >", value, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("GY_CODCKND_HK_S >=", value, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSLessThan(Double value) {
            addCriterion("GY_CODCKND_HK_S <", value, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("GY_CODCKND_HK_S <=", value, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSIn(List<Double> values) {
            addCriterion("GY_CODCKND_HK_S in", values, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSNotIn(List<Double> values) {
            addCriterion("GY_CODCKND_HK_S not in", values, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSBetween(Double value1, Double value2) {
            addCriterion("GY_CODCKND_HK_S between", value1, value2, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyCodckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("GY_CODCKND_HK_S not between", value1, value2, "gyCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSIsNull() {
            addCriterion("GY_ADJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSIsNotNull() {
            addCriterion("GY_ADJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSEqualTo(Double value) {
            addCriterion("GY_ADJKND_HK_S =", value, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSNotEqualTo(Double value) {
            addCriterion("GY_ADJKND_HK_S <>", value, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSGreaterThan(Double value) {
            addCriterion("GY_ADJKND_HK_S >", value, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("GY_ADJKND_HK_S >=", value, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSLessThan(Double value) {
            addCriterion("GY_ADJKND_HK_S <", value, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("GY_ADJKND_HK_S <=", value, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSIn(List<Double> values) {
            addCriterion("GY_ADJKND_HK_S in", values, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSNotIn(List<Double> values) {
            addCriterion("GY_ADJKND_HK_S not in", values, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSBetween(Double value1, Double value2) {
            addCriterion("GY_ADJKND_HK_S between", value1, value2, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("GY_ADJKND_HK_S not between", value1, value2, "gyAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSIsNull() {
            addCriterion("GY_ADCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSIsNotNull() {
            addCriterion("GY_ADCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSEqualTo(Double value) {
            addCriterion("GY_ADCKND_HK_S =", value, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSNotEqualTo(Double value) {
            addCriterion("GY_ADCKND_HK_S <>", value, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSGreaterThan(Double value) {
            addCriterion("GY_ADCKND_HK_S >", value, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("GY_ADCKND_HK_S >=", value, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSLessThan(Double value) {
            addCriterion("GY_ADCKND_HK_S <", value, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("GY_ADCKND_HK_S <=", value, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSIn(List<Double> values) {
            addCriterion("GY_ADCKND_HK_S in", values, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSNotIn(List<Double> values) {
            addCriterion("GY_ADCKND_HK_S not in", values, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSBetween(Double value1, Double value2) {
            addCriterion("GY_ADCKND_HK_S between", value1, value2, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andGyAdckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("GY_ADCKND_HK_S not between", value1, value2, "gyAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShClslWdRIsNull() {
            addCriterion("SH_CLSL_WD_R is null");
            return (Criteria) this;
        }

        public Criteria andShClslWdRIsNotNull() {
            addCriterion("SH_CLSL_WD_R is not null");
            return (Criteria) this;
        }

        public Criteria andShClslWdREqualTo(Double value) {
            addCriterion("SH_CLSL_WD_R =", value, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRNotEqualTo(Double value) {
            addCriterion("SH_CLSL_WD_R <>", value, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRGreaterThan(Double value) {
            addCriterion("SH_CLSL_WD_R >", value, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRGreaterThanOrEqualTo(Double value) {
            addCriterion("SH_CLSL_WD_R >=", value, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRLessThan(Double value) {
            addCriterion("SH_CLSL_WD_R <", value, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRLessThanOrEqualTo(Double value) {
            addCriterion("SH_CLSL_WD_R <=", value, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRIn(List<Double> values) {
            addCriterion("SH_CLSL_WD_R in", values, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRNotIn(List<Double> values) {
            addCriterion("SH_CLSL_WD_R not in", values, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRBetween(Double value1, Double value2) {
            addCriterion("SH_CLSL_WD_R between", value1, value2, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShClslWdRNotBetween(Double value1, Double value2) {
            addCriterion("SH_CLSL_WD_R not between", value1, value2, "shClslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRIsNull() {
            addCriterion("SH_XZCLSL_WD_R is null");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRIsNotNull() {
            addCriterion("SH_XZCLSL_WD_R is not null");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdREqualTo(Double value) {
            addCriterion("SH_XZCLSL_WD_R =", value, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRNotEqualTo(Double value) {
            addCriterion("SH_XZCLSL_WD_R <>", value, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRGreaterThan(Double value) {
            addCriterion("SH_XZCLSL_WD_R >", value, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRGreaterThanOrEqualTo(Double value) {
            addCriterion("SH_XZCLSL_WD_R >=", value, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRLessThan(Double value) {
            addCriterion("SH_XZCLSL_WD_R <", value, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRLessThanOrEqualTo(Double value) {
            addCriterion("SH_XZCLSL_WD_R <=", value, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRIn(List<Double> values) {
            addCriterion("SH_XZCLSL_WD_R in", values, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRNotIn(List<Double> values) {
            addCriterion("SH_XZCLSL_WD_R not in", values, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRBetween(Double value1, Double value2) {
            addCriterion("SH_XZCLSL_WD_R between", value1, value2, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShXzclslWdRNotBetween(Double value1, Double value2) {
            addCriterion("SH_XZCLSL_WD_R not between", value1, value2, "shXzclslWdR");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSIsNull() {
            addCriterion("SH_CODJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSIsNotNull() {
            addCriterion("SH_CODJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSEqualTo(Double value) {
            addCriterion("SH_CODJKND_HK_S =", value, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSNotEqualTo(Double value) {
            addCriterion("SH_CODJKND_HK_S <>", value, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSGreaterThan(Double value) {
            addCriterion("SH_CODJKND_HK_S >", value, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("SH_CODJKND_HK_S >=", value, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSLessThan(Double value) {
            addCriterion("SH_CODJKND_HK_S <", value, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("SH_CODJKND_HK_S <=", value, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSIn(List<Double> values) {
            addCriterion("SH_CODJKND_HK_S in", values, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSNotIn(List<Double> values) {
            addCriterion("SH_CODJKND_HK_S not in", values, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSBetween(Double value1, Double value2) {
            addCriterion("SH_CODJKND_HK_S between", value1, value2, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("SH_CODJKND_HK_S not between", value1, value2, "shCodjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSIsNull() {
            addCriterion("SH_CODCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSIsNotNull() {
            addCriterion("SH_CODCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSEqualTo(Double value) {
            addCriterion("SH_CODCKND_HK_S =", value, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSNotEqualTo(Double value) {
            addCriterion("SH_CODCKND_HK_S <>", value, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSGreaterThan(Double value) {
            addCriterion("SH_CODCKND_HK_S >", value, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("SH_CODCKND_HK_S >=", value, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSLessThan(Double value) {
            addCriterion("SH_CODCKND_HK_S <", value, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("SH_CODCKND_HK_S <=", value, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSIn(List<Double> values) {
            addCriterion("SH_CODCKND_HK_S in", values, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSNotIn(List<Double> values) {
            addCriterion("SH_CODCKND_HK_S not in", values, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSBetween(Double value1, Double value2) {
            addCriterion("SH_CODCKND_HK_S between", value1, value2, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShCodckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("SH_CODCKND_HK_S not between", value1, value2, "shCodckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSIsNull() {
            addCriterion("SH_ADJKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSIsNotNull() {
            addCriterion("SH_ADJKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSEqualTo(Double value) {
            addCriterion("SH_ADJKND_HK_S =", value, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSNotEqualTo(Double value) {
            addCriterion("SH_ADJKND_HK_S <>", value, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSGreaterThan(Double value) {
            addCriterion("SH_ADJKND_HK_S >", value, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("SH_ADJKND_HK_S >=", value, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSLessThan(Double value) {
            addCriterion("SH_ADJKND_HK_S <", value, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSLessThanOrEqualTo(Double value) {
            addCriterion("SH_ADJKND_HK_S <=", value, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSIn(List<Double> values) {
            addCriterion("SH_ADJKND_HK_S in", values, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSNotIn(List<Double> values) {
            addCriterion("SH_ADJKND_HK_S not in", values, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSBetween(Double value1, Double value2) {
            addCriterion("SH_ADJKND_HK_S between", value1, value2, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdjkndHkSNotBetween(Double value1, Double value2) {
            addCriterion("SH_ADJKND_HK_S not between", value1, value2, "shAdjkndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSIsNull() {
            addCriterion("SH_ADCKND_HK_S is null");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSIsNotNull() {
            addCriterion("SH_ADCKND_HK_S is not null");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSEqualTo(Double value) {
            addCriterion("SH_ADCKND_HK_S =", value, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSNotEqualTo(Double value) {
            addCriterion("SH_ADCKND_HK_S <>", value, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSGreaterThan(Double value) {
            addCriterion("SH_ADCKND_HK_S >", value, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSGreaterThanOrEqualTo(Double value) {
            addCriterion("SH_ADCKND_HK_S >=", value, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSLessThan(Double value) {
            addCriterion("SH_ADCKND_HK_S <", value, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSLessThanOrEqualTo(Double value) {
            addCriterion("SH_ADCKND_HK_S <=", value, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSIn(List<Double> values) {
            addCriterion("SH_ADCKND_HK_S in", values, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSNotIn(List<Double> values) {
            addCriterion("SH_ADCKND_HK_S not in", values, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSBetween(Double value1, Double value2) {
            addCriterion("SH_ADCKND_HK_S between", value1, value2, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andShAdckndHkSNotBetween(Double value1, Double value2) {
            addCriterion("SH_ADCKND_HK_S not between", value1, value2, "shAdckndHkS");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDIsNull() {
            addCriterion("HDXZSHCODQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDIsNotNull() {
            addCriterion("HDXZSHCODQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDEqualTo(Double value) {
            addCriterion("HDXZSHCODQCL_D =", value, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDNotEqualTo(Double value) {
            addCriterion("HDXZSHCODQCL_D <>", value, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDGreaterThan(Double value) {
            addCriterion("HDXZSHCODQCL_D >", value, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDGreaterThanOrEqualTo(Double value) {
            addCriterion("HDXZSHCODQCL_D >=", value, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDLessThan(Double value) {
            addCriterion("HDXZSHCODQCL_D <", value, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDLessThanOrEqualTo(Double value) {
            addCriterion("HDXZSHCODQCL_D <=", value, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDIn(List<Double> values) {
            addCriterion("HDXZSHCODQCL_D in", values, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDNotIn(List<Double> values) {
            addCriterion("HDXZSHCODQCL_D not in", values, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDBetween(Double value1, Double value2) {
            addCriterion("HDXZSHCODQCL_D between", value1, value2, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshcodqclDNotBetween(Double value1, Double value2) {
            addCriterion("HDXZSHCODQCL_D not between", value1, value2, "hdxzshcodqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDIsNull() {
            addCriterion("HDXZSHADQCL_D is null");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDIsNotNull() {
            addCriterion("HDXZSHADQCL_D is not null");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDEqualTo(Double value) {
            addCriterion("HDXZSHADQCL_D =", value, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDNotEqualTo(Double value) {
            addCriterion("HDXZSHADQCL_D <>", value, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDGreaterThan(Double value) {
            addCriterion("HDXZSHADQCL_D >", value, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDGreaterThanOrEqualTo(Double value) {
            addCriterion("HDXZSHADQCL_D >=", value, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDLessThan(Double value) {
            addCriterion("HDXZSHADQCL_D <", value, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDLessThanOrEqualTo(Double value) {
            addCriterion("HDXZSHADQCL_D <=", value, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDIn(List<Double> values) {
            addCriterion("HDXZSHADQCL_D in", values, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDNotIn(List<Double> values) {
            addCriterion("HDXZSHADQCL_D not in", values, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDBetween(Double value1, Double value2) {
            addCriterion("HDXZSHADQCL_D between", value1, value2, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andHdxzshadqclDNotBetween(Double value1, Double value2) {
            addCriterion("HDXZSHADQCL_D not between", value1, value2, "hdxzshadqclD");
            return (Criteria) this;
        }

        public Criteria andJytlcMIsNull() {
            addCriterion("JYTLC_M is null");
            return (Criteria) this;
        }

        public Criteria andJytlcMIsNotNull() {
            addCriterion("JYTLC_M is not null");
            return (Criteria) this;
        }

        public Criteria andJytlcMEqualTo(Double value) {
            addCriterion("JYTLC_M =", value, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMNotEqualTo(Double value) {
            addCriterion("JYTLC_M <>", value, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMGreaterThan(Double value) {
            addCriterion("JYTLC_M >", value, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMGreaterThanOrEqualTo(Double value) {
            addCriterion("JYTLC_M >=", value, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMLessThan(Double value) {
            addCriterion("JYTLC_M <", value, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMLessThanOrEqualTo(Double value) {
            addCriterion("JYTLC_M <=", value, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMIn(List<Double> values) {
            addCriterion("JYTLC_M in", values, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMNotIn(List<Double> values) {
            addCriterion("JYTLC_M not in", values, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMBetween(Double value1, Double value2) {
            addCriterion("JYTLC_M between", value1, value2, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andJytlcMNotBetween(Double value1, Double value2) {
            addCriterion("JYTLC_M not between", value1, value2, "jytlcM");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andPollBl1IsNull() {
            addCriterion("poll_bl1 is null");
            return (Criteria) this;
        }

        public Criteria andPollBl1IsNotNull() {
            addCriterion("poll_bl1 is not null");
            return (Criteria) this;
        }

        public Criteria andPollBl1EqualTo(String value) {
            addCriterion("poll_bl1 =", value, "pollBl1");
            return (Criteria) this;
        }

        public Criteria andPollBl1NotEqualTo(String value) {
            addCriterion("poll_bl1 <>", value, "pollBl1");
            return (Criteria) this;
        }

        public Criteria andPollBl1GreaterThan(String value) {
            addCriterion("poll_bl1 >", value, "pollBl1");
            return (Criteria) this;
        }

        public Criteria andPollBl1GreaterThanOrEqualTo(String value) {
            addCriterion("poll_bl1 >=", value, "pollBl1");
            return (Criteria) this;
        }

        public Criteria andPollBl1LessThan(String value) {
            addCriterion("poll_bl1 <", value, "pollBl1");
            return (Criteria) this;
        }

        public Criteria andPollBl1LessThanOrEqualTo(String value) {
            addCriterion("poll_bl1 <=", value, "pollBl1");
            return (Criteria) this;
        }

        public Criteria andPollBl1Like(String value) {
            addCriterion("poll_bl1 like", value, "pollBl1");
            return (Criteria) this;
        }

        public Criteria andPollBl1NotLike(String value) {
            addCriterion("poll_bl1 not like", value, "pollBl1");
            return (Criteria) this;
        }

        public Criteria andPollBl1In(List<String> values) {
            addCriterion("poll_bl1 in", values, "pollBl1");
            return (Criteria) this;
        }

        public Criteria andPollBl1NotIn(List<String> values) {
            addCriterion("poll_bl1 not in", values, "pollBl1");
            return (Criteria) this;
        }

        public Criteria andPollBl1Between(String value1, String value2) {
            addCriterion("poll_bl1 between", value1, value2, "pollBl1");
            return (Criteria) this;
        }

        public Criteria andPollBl1NotBetween(String value1, String value2) {
            addCriterion("poll_bl1 not between", value1, value2, "pollBl1");
            return (Criteria) this;
        }

        public Criteria andPollBl2IsNull() {
            addCriterion("poll_bl2 is null");
            return (Criteria) this;
        }

        public Criteria andPollBl2IsNotNull() {
            addCriterion("poll_bl2 is not null");
            return (Criteria) this;
        }

        public Criteria andPollBl2EqualTo(String value) {
            addCriterion("poll_bl2 =", value, "pollBl2");
            return (Criteria) this;
        }

        public Criteria andPollBl2NotEqualTo(String value) {
            addCriterion("poll_bl2 <>", value, "pollBl2");
            return (Criteria) this;
        }

        public Criteria andPollBl2GreaterThan(String value) {
            addCriterion("poll_bl2 >", value, "pollBl2");
            return (Criteria) this;
        }

        public Criteria andPollBl2GreaterThanOrEqualTo(String value) {
            addCriterion("poll_bl2 >=", value, "pollBl2");
            return (Criteria) this;
        }

        public Criteria andPollBl2LessThan(String value) {
            addCriterion("poll_bl2 <", value, "pollBl2");
            return (Criteria) this;
        }

        public Criteria andPollBl2LessThanOrEqualTo(String value) {
            addCriterion("poll_bl2 <=", value, "pollBl2");
            return (Criteria) this;
        }

        public Criteria andPollBl2Like(String value) {
            addCriterion("poll_bl2 like", value, "pollBl2");
            return (Criteria) this;
        }

        public Criteria andPollBl2NotLike(String value) {
            addCriterion("poll_bl2 not like", value, "pollBl2");
            return (Criteria) this;
        }

        public Criteria andPollBl2In(List<String> values) {
            addCriterion("poll_bl2 in", values, "pollBl2");
            return (Criteria) this;
        }

        public Criteria andPollBl2NotIn(List<String> values) {
            addCriterion("poll_bl2 not in", values, "pollBl2");
            return (Criteria) this;
        }

        public Criteria andPollBl2Between(String value1, String value2) {
            addCriterion("poll_bl2 between", value1, value2, "pollBl2");
            return (Criteria) this;
        }

        public Criteria andPollBl2NotBetween(String value1, String value2) {
            addCriterion("poll_bl2 not between", value1, value2, "pollBl2");
            return (Criteria) this;
        }

        public Criteria andPollBl3IsNull() {
            addCriterion("poll_bl3 is null");
            return (Criteria) this;
        }

        public Criteria andPollBl3IsNotNull() {
            addCriterion("poll_bl3 is not null");
            return (Criteria) this;
        }

        public Criteria andPollBl3EqualTo(String value) {
            addCriterion("poll_bl3 =", value, "pollBl3");
            return (Criteria) this;
        }

        public Criteria andPollBl3NotEqualTo(String value) {
            addCriterion("poll_bl3 <>", value, "pollBl3");
            return (Criteria) this;
        }

        public Criteria andPollBl3GreaterThan(String value) {
            addCriterion("poll_bl3 >", value, "pollBl3");
            return (Criteria) this;
        }

        public Criteria andPollBl3GreaterThanOrEqualTo(String value) {
            addCriterion("poll_bl3 >=", value, "pollBl3");
            return (Criteria) this;
        }

        public Criteria andPollBl3LessThan(String value) {
            addCriterion("poll_bl3 <", value, "pollBl3");
            return (Criteria) this;
        }

        public Criteria andPollBl3LessThanOrEqualTo(String value) {
            addCriterion("poll_bl3 <=", value, "pollBl3");
            return (Criteria) this;
        }

        public Criteria andPollBl3Like(String value) {
            addCriterion("poll_bl3 like", value, "pollBl3");
            return (Criteria) this;
        }

        public Criteria andPollBl3NotLike(String value) {
            addCriterion("poll_bl3 not like", value, "pollBl3");
            return (Criteria) this;
        }

        public Criteria andPollBl3In(List<String> values) {
            addCriterion("poll_bl3 in", values, "pollBl3");
            return (Criteria) this;
        }

        public Criteria andPollBl3NotIn(List<String> values) {
            addCriterion("poll_bl3 not in", values, "pollBl3");
            return (Criteria) this;
        }

        public Criteria andPollBl3Between(String value1, String value2) {
            addCriterion("poll_bl3 between", value1, value2, "pollBl3");
            return (Criteria) this;
        }

        public Criteria andPollBl3NotBetween(String value1, String value2) {
            addCriterion("poll_bl3 not between", value1, value2, "pollBl3");
            return (Criteria) this;
        }

        public Criteria andPollBl4IsNull() {
            addCriterion("poll_bl4 is null");
            return (Criteria) this;
        }

        public Criteria andPollBl4IsNotNull() {
            addCriterion("poll_bl4 is not null");
            return (Criteria) this;
        }

        public Criteria andPollBl4EqualTo(String value) {
            addCriterion("poll_bl4 =", value, "pollBl4");
            return (Criteria) this;
        }

        public Criteria andPollBl4NotEqualTo(String value) {
            addCriterion("poll_bl4 <>", value, "pollBl4");
            return (Criteria) this;
        }

        public Criteria andPollBl4GreaterThan(String value) {
            addCriterion("poll_bl4 >", value, "pollBl4");
            return (Criteria) this;
        }

        public Criteria andPollBl4GreaterThanOrEqualTo(String value) {
            addCriterion("poll_bl4 >=", value, "pollBl4");
            return (Criteria) this;
        }

        public Criteria andPollBl4LessThan(String value) {
            addCriterion("poll_bl4 <", value, "pollBl4");
            return (Criteria) this;
        }

        public Criteria andPollBl4LessThanOrEqualTo(String value) {
            addCriterion("poll_bl4 <=", value, "pollBl4");
            return (Criteria) this;
        }

        public Criteria andPollBl4Like(String value) {
            addCriterion("poll_bl4 like", value, "pollBl4");
            return (Criteria) this;
        }

        public Criteria andPollBl4NotLike(String value) {
            addCriterion("poll_bl4 not like", value, "pollBl4");
            return (Criteria) this;
        }

        public Criteria andPollBl4In(List<String> values) {
            addCriterion("poll_bl4 in", values, "pollBl4");
            return (Criteria) this;
        }

        public Criteria andPollBl4NotIn(List<String> values) {
            addCriterion("poll_bl4 not in", values, "pollBl4");
            return (Criteria) this;
        }

        public Criteria andPollBl4Between(String value1, String value2) {
            addCriterion("poll_bl4 between", value1, value2, "pollBl4");
            return (Criteria) this;
        }

        public Criteria andPollBl4NotBetween(String value1, String value2) {
            addCriterion("poll_bl4 not between", value1, value2, "pollBl4");
            return (Criteria) this;
        }

        public Criteria andPollBl5IsNull() {
            addCriterion("poll_bl5 is null");
            return (Criteria) this;
        }

        public Criteria andPollBl5IsNotNull() {
            addCriterion("poll_bl5 is not null");
            return (Criteria) this;
        }

        public Criteria andPollBl5EqualTo(String value) {
            addCriterion("poll_bl5 =", value, "pollBl5");
            return (Criteria) this;
        }

        public Criteria andPollBl5NotEqualTo(String value) {
            addCriterion("poll_bl5 <>", value, "pollBl5");
            return (Criteria) this;
        }

        public Criteria andPollBl5GreaterThan(String value) {
            addCriterion("poll_bl5 >", value, "pollBl5");
            return (Criteria) this;
        }

        public Criteria andPollBl5GreaterThanOrEqualTo(String value) {
            addCriterion("poll_bl5 >=", value, "pollBl5");
            return (Criteria) this;
        }

        public Criteria andPollBl5LessThan(String value) {
            addCriterion("poll_bl5 <", value, "pollBl5");
            return (Criteria) this;
        }

        public Criteria andPollBl5LessThanOrEqualTo(String value) {
            addCriterion("poll_bl5 <=", value, "pollBl5");
            return (Criteria) this;
        }

        public Criteria andPollBl5Like(String value) {
            addCriterion("poll_bl5 like", value, "pollBl5");
            return (Criteria) this;
        }

        public Criteria andPollBl5NotLike(String value) {
            addCriterion("poll_bl5 not like", value, "pollBl5");
            return (Criteria) this;
        }

        public Criteria andPollBl5In(List<String> values) {
            addCriterion("poll_bl5 in", values, "pollBl5");
            return (Criteria) this;
        }

        public Criteria andPollBl5NotIn(List<String> values) {
            addCriterion("poll_bl5 not in", values, "pollBl5");
            return (Criteria) this;
        }

        public Criteria andPollBl5Between(String value1, String value2) {
            addCriterion("poll_bl5 between", value1, value2, "pollBl5");
            return (Criteria) this;
        }

        public Criteria andPollBl5NotBetween(String value1, String value2) {
            addCriterion("poll_bl5 not between", value1, value2, "pollBl5");
            return (Criteria) this;
        }

        public Criteria andPollBl6IsNull() {
            addCriterion("poll_bl6 is null");
            return (Criteria) this;
        }

        public Criteria andPollBl6IsNotNull() {
            addCriterion("poll_bl6 is not null");
            return (Criteria) this;
        }

        public Criteria andPollBl6EqualTo(String value) {
            addCriterion("poll_bl6 =", value, "pollBl6");
            return (Criteria) this;
        }

        public Criteria andPollBl6NotEqualTo(String value) {
            addCriterion("poll_bl6 <>", value, "pollBl6");
            return (Criteria) this;
        }

        public Criteria andPollBl6GreaterThan(String value) {
            addCriterion("poll_bl6 >", value, "pollBl6");
            return (Criteria) this;
        }

        public Criteria andPollBl6GreaterThanOrEqualTo(String value) {
            addCriterion("poll_bl6 >=", value, "pollBl6");
            return (Criteria) this;
        }

        public Criteria andPollBl6LessThan(String value) {
            addCriterion("poll_bl6 <", value, "pollBl6");
            return (Criteria) this;
        }

        public Criteria andPollBl6LessThanOrEqualTo(String value) {
            addCriterion("poll_bl6 <=", value, "pollBl6");
            return (Criteria) this;
        }

        public Criteria andPollBl6Like(String value) {
            addCriterion("poll_bl6 like", value, "pollBl6");
            return (Criteria) this;
        }

        public Criteria andPollBl6NotLike(String value) {
            addCriterion("poll_bl6 not like", value, "pollBl6");
            return (Criteria) this;
        }

        public Criteria andPollBl6In(List<String> values) {
            addCriterion("poll_bl6 in", values, "pollBl6");
            return (Criteria) this;
        }

        public Criteria andPollBl6NotIn(List<String> values) {
            addCriterion("poll_bl6 not in", values, "pollBl6");
            return (Criteria) this;
        }

        public Criteria andPollBl6Between(String value1, String value2) {
            addCriterion("poll_bl6 between", value1, value2, "pollBl6");
            return (Criteria) this;
        }

        public Criteria andPollBl6NotBetween(String value1, String value2) {
            addCriterion("poll_bl6 not between", value1, value2, "pollBl6");
            return (Criteria) this;
        }

        public Criteria andPollBl7IsNull() {
            addCriterion("poll_bl7 is null");
            return (Criteria) this;
        }

        public Criteria andPollBl7IsNotNull() {
            addCriterion("poll_bl7 is not null");
            return (Criteria) this;
        }

        public Criteria andPollBl7EqualTo(String value) {
            addCriterion("poll_bl7 =", value, "pollBl7");
            return (Criteria) this;
        }

        public Criteria andPollBl7NotEqualTo(String value) {
            addCriterion("poll_bl7 <>", value, "pollBl7");
            return (Criteria) this;
        }

        public Criteria andPollBl7GreaterThan(String value) {
            addCriterion("poll_bl7 >", value, "pollBl7");
            return (Criteria) this;
        }

        public Criteria andPollBl7GreaterThanOrEqualTo(String value) {
            addCriterion("poll_bl7 >=", value, "pollBl7");
            return (Criteria) this;
        }

        public Criteria andPollBl7LessThan(String value) {
            addCriterion("poll_bl7 <", value, "pollBl7");
            return (Criteria) this;
        }

        public Criteria andPollBl7LessThanOrEqualTo(String value) {
            addCriterion("poll_bl7 <=", value, "pollBl7");
            return (Criteria) this;
        }

        public Criteria andPollBl7Like(String value) {
            addCriterion("poll_bl7 like", value, "pollBl7");
            return (Criteria) this;
        }

        public Criteria andPollBl7NotLike(String value) {
            addCriterion("poll_bl7 not like", value, "pollBl7");
            return (Criteria) this;
        }

        public Criteria andPollBl7In(List<String> values) {
            addCriterion("poll_bl7 in", values, "pollBl7");
            return (Criteria) this;
        }

        public Criteria andPollBl7NotIn(List<String> values) {
            addCriterion("poll_bl7 not in", values, "pollBl7");
            return (Criteria) this;
        }

        public Criteria andPollBl7Between(String value1, String value2) {
            addCriterion("poll_bl7 between", value1, value2, "pollBl7");
            return (Criteria) this;
        }

        public Criteria andPollBl7NotBetween(String value1, String value2) {
            addCriterion("poll_bl7 not between", value1, value2, "pollBl7");
            return (Criteria) this;
        }

        public Criteria andPollBl8IsNull() {
            addCriterion("poll_bl8 is null");
            return (Criteria) this;
        }

        public Criteria andPollBl8IsNotNull() {
            addCriterion("poll_bl8 is not null");
            return (Criteria) this;
        }

        public Criteria andPollBl8EqualTo(String value) {
            addCriterion("poll_bl8 =", value, "pollBl8");
            return (Criteria) this;
        }

        public Criteria andPollBl8NotEqualTo(String value) {
            addCriterion("poll_bl8 <>", value, "pollBl8");
            return (Criteria) this;
        }

        public Criteria andPollBl8GreaterThan(String value) {
            addCriterion("poll_bl8 >", value, "pollBl8");
            return (Criteria) this;
        }

        public Criteria andPollBl8GreaterThanOrEqualTo(String value) {
            addCriterion("poll_bl8 >=", value, "pollBl8");
            return (Criteria) this;
        }

        public Criteria andPollBl8LessThan(String value) {
            addCriterion("poll_bl8 <", value, "pollBl8");
            return (Criteria) this;
        }

        public Criteria andPollBl8LessThanOrEqualTo(String value) {
            addCriterion("poll_bl8 <=", value, "pollBl8");
            return (Criteria) this;
        }

        public Criteria andPollBl8Like(String value) {
            addCriterion("poll_bl8 like", value, "pollBl8");
            return (Criteria) this;
        }

        public Criteria andPollBl8NotLike(String value) {
            addCriterion("poll_bl8 not like", value, "pollBl8");
            return (Criteria) this;
        }

        public Criteria andPollBl8In(List<String> values) {
            addCriterion("poll_bl8 in", values, "pollBl8");
            return (Criteria) this;
        }

        public Criteria andPollBl8NotIn(List<String> values) {
            addCriterion("poll_bl8 not in", values, "pollBl8");
            return (Criteria) this;
        }

        public Criteria andPollBl8Between(String value1, String value2) {
            addCriterion("poll_bl8 between", value1, value2, "pollBl8");
            return (Criteria) this;
        }

        public Criteria andPollBl8NotBetween(String value1, String value2) {
            addCriterion("poll_bl8 not between", value1, value2, "pollBl8");
            return (Criteria) this;
        }

        public Criteria andPollBl9IsNull() {
            addCriterion("poll_bl9 is null");
            return (Criteria) this;
        }

        public Criteria andPollBl9IsNotNull() {
            addCriterion("poll_bl9 is not null");
            return (Criteria) this;
        }

        public Criteria andPollBl9EqualTo(String value) {
            addCriterion("poll_bl9 =", value, "pollBl9");
            return (Criteria) this;
        }

        public Criteria andPollBl9NotEqualTo(String value) {
            addCriterion("poll_bl9 <>", value, "pollBl9");
            return (Criteria) this;
        }

        public Criteria andPollBl9GreaterThan(String value) {
            addCriterion("poll_bl9 >", value, "pollBl9");
            return (Criteria) this;
        }

        public Criteria andPollBl9GreaterThanOrEqualTo(String value) {
            addCriterion("poll_bl9 >=", value, "pollBl9");
            return (Criteria) this;
        }

        public Criteria andPollBl9LessThan(String value) {
            addCriterion("poll_bl9 <", value, "pollBl9");
            return (Criteria) this;
        }

        public Criteria andPollBl9LessThanOrEqualTo(String value) {
            addCriterion("poll_bl9 <=", value, "pollBl9");
            return (Criteria) this;
        }

        public Criteria andPollBl9Like(String value) {
            addCriterion("poll_bl9 like", value, "pollBl9");
            return (Criteria) this;
        }

        public Criteria andPollBl9NotLike(String value) {
            addCriterion("poll_bl9 not like", value, "pollBl9");
            return (Criteria) this;
        }

        public Criteria andPollBl9In(List<String> values) {
            addCriterion("poll_bl9 in", values, "pollBl9");
            return (Criteria) this;
        }

        public Criteria andPollBl9NotIn(List<String> values) {
            addCriterion("poll_bl9 not in", values, "pollBl9");
            return (Criteria) this;
        }

        public Criteria andPollBl9Between(String value1, String value2) {
            addCriterion("poll_bl9 between", value1, value2, "pollBl9");
            return (Criteria) this;
        }

        public Criteria andPollBl9NotBetween(String value1, String value2) {
            addCriterion("poll_bl9 not between", value1, value2, "pollBl9");
            return (Criteria) this;
        }

        public Criteria andPollBl10IsNull() {
            addCriterion("poll_bl10 is null");
            return (Criteria) this;
        }

        public Criteria andPollBl10IsNotNull() {
            addCriterion("poll_bl10 is not null");
            return (Criteria) this;
        }

        public Criteria andPollBl10EqualTo(String value) {
            addCriterion("poll_bl10 =", value, "pollBl10");
            return (Criteria) this;
        }

        public Criteria andPollBl10NotEqualTo(String value) {
            addCriterion("poll_bl10 <>", value, "pollBl10");
            return (Criteria) this;
        }

        public Criteria andPollBl10GreaterThan(String value) {
            addCriterion("poll_bl10 >", value, "pollBl10");
            return (Criteria) this;
        }

        public Criteria andPollBl10GreaterThanOrEqualTo(String value) {
            addCriterion("poll_bl10 >=", value, "pollBl10");
            return (Criteria) this;
        }

        public Criteria andPollBl10LessThan(String value) {
            addCriterion("poll_bl10 <", value, "pollBl10");
            return (Criteria) this;
        }

        public Criteria andPollBl10LessThanOrEqualTo(String value) {
            addCriterion("poll_bl10 <=", value, "pollBl10");
            return (Criteria) this;
        }

        public Criteria andPollBl10Like(String value) {
            addCriterion("poll_bl10 like", value, "pollBl10");
            return (Criteria) this;
        }

        public Criteria andPollBl10NotLike(String value) {
            addCriterion("poll_bl10 not like", value, "pollBl10");
            return (Criteria) this;
        }

        public Criteria andPollBl10In(List<String> values) {
            addCriterion("poll_bl10 in", values, "pollBl10");
            return (Criteria) this;
        }

        public Criteria andPollBl10NotIn(List<String> values) {
            addCriterion("poll_bl10 not in", values, "pollBl10");
            return (Criteria) this;
        }

        public Criteria andPollBl10Between(String value1, String value2) {
            addCriterion("poll_bl10 between", value1, value2, "pollBl10");
            return (Criteria) this;
        }

        public Criteria andPollBl10NotBetween(String value1, String value2) {
            addCriterion("poll_bl10 not between", value1, value2, "pollBl10");
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