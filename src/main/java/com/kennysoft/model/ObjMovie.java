package com.kennysoft.model;

import java.io.Serializable;

public class ObjMovie implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_movie.id
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_movie.file_url
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String fileUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_movie.definition
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String definition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_movie.screen_format
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String screenFormat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_movie.cdn_platform
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String cdnPlatform;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_movie.code
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_movie.md5
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String md5;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table obj_movie
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_movie.id
     *
     * @return the value of obj_movie.id
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_movie.id
     *
     * @param id the value for obj_movie.id
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_movie.file_url
     *
     * @return the value of obj_movie.file_url
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_movie.file_url
     *
     * @param fileUrl the value for obj_movie.file_url
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_movie.definition
     *
     * @return the value of obj_movie.definition
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_movie.definition
     *
     * @param definition the value for obj_movie.definition
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setDefinition(String definition) {
        this.definition = definition == null ? null : definition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_movie.screen_format
     *
     * @return the value of obj_movie.screen_format
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getScreenFormat() {
        return screenFormat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_movie.screen_format
     *
     * @param screenFormat the value for obj_movie.screen_format
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setScreenFormat(String screenFormat) {
        this.screenFormat = screenFormat == null ? null : screenFormat.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_movie.cdn_platform
     *
     * @return the value of obj_movie.cdn_platform
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getCdnPlatform() {
        return cdnPlatform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_movie.cdn_platform
     *
     * @param cdnPlatform the value for obj_movie.cdn_platform
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setCdnPlatform(String cdnPlatform) {
        this.cdnPlatform = cdnPlatform == null ? null : cdnPlatform.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_movie.code
     *
     * @return the value of obj_movie.code
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_movie.code
     *
     * @param code the value for obj_movie.code
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_movie.md5
     *
     * @return the value of obj_movie.md5
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getMd5() {
        return md5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_movie.md5
     *
     * @param md5 the value for obj_movie.md5
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }
}