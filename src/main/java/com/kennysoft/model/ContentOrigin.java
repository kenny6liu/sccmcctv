package com.kennysoft.model;

import java.io.Serializable;

public class ContentOrigin implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column content_origin.id
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table content_origin
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column content_origin.id
     *
     * @return the value of content_origin.id
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column content_origin.id
     *
     * @param id the value for content_origin.id
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }
}