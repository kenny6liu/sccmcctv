package com.kennysoft.model;

import java.io.Serializable;

public class KsRole implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ks_role.id
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ks_role.ks_name
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String ksName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ks_role.ks_code
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String ksCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ks_role.ks_value
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String ksValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ks_role.ks_description
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String ksDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ks_role
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ks_role.id
     *
     * @return the value of ks_role.id
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ks_role.id
     *
     * @param id the value for ks_role.id
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ks_role.ks_name
     *
     * @return the value of ks_role.ks_name
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getKsName() {
        return ksName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ks_role.ks_name
     *
     * @param ksName the value for ks_role.ks_name
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setKsName(String ksName) {
        this.ksName = ksName == null ? null : ksName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ks_role.ks_code
     *
     * @return the value of ks_role.ks_code
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getKsCode() {
        return ksCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ks_role.ks_code
     *
     * @param ksCode the value for ks_role.ks_code
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setKsCode(String ksCode) {
        this.ksCode = ksCode == null ? null : ksCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ks_role.ks_value
     *
     * @return the value of ks_role.ks_value
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getKsValue() {
        return ksValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ks_role.ks_value
     *
     * @param ksValue the value for ks_role.ks_value
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setKsValue(String ksValue) {
        this.ksValue = ksValue == null ? null : ksValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ks_role.ks_description
     *
     * @return the value of ks_role.ks_description
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getKsDescription() {
        return ksDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ks_role.ks_description
     *
     * @param ksDescription the value for ks_role.ks_description
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setKsDescription(String ksDescription) {
        this.ksDescription = ksDescription == null ? null : ksDescription.trim();
    }
}