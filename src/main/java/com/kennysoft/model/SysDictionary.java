package com.kennysoft.model;

import java.io.Serializable;

public class SysDictionary implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dictionary.id
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_dictionary
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dictionary.id
     *
     * @return the value of sys_dictionary.id
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dictionary.id
     *
     * @param id the value for sys_dictionary.id
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }
}