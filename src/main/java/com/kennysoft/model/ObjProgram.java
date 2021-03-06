package com.kennysoft.model;

import java.io.Serializable;

public class ObjProgram implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.id
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.actor_display
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String actorDisplay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.definition
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String definition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.picture_url1
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String pictureUrl1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.name
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.language
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String language;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.writer_display
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String writerDisplay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.description
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.en_name
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String enName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.release_year
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String releaseYear;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.volumn_count
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String volumnCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.orgair_date
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String orgairDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.original_country
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String originalCountry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.is_3d
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String is3d;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.if_priview
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String ifPriview;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.duration
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String duration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.content_provider
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String contentProvider;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.play_url
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String playUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.code
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.program_type
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String programType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column obj_program.program_type2
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private String programType2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table obj_program
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.id
     *
     * @return the value of obj_program.id
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.id
     *
     * @param id the value for obj_program.id
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.actor_display
     *
     * @return the value of obj_program.actor_display
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getActorDisplay() {
        return actorDisplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.actor_display
     *
     * @param actorDisplay the value for obj_program.actor_display
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setActorDisplay(String actorDisplay) {
        this.actorDisplay = actorDisplay == null ? null : actorDisplay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.definition
     *
     * @return the value of obj_program.definition
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.definition
     *
     * @param definition the value for obj_program.definition
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setDefinition(String definition) {
        this.definition = definition == null ? null : definition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.picture_url1
     *
     * @return the value of obj_program.picture_url1
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getPictureUrl1() {
        return pictureUrl1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.picture_url1
     *
     * @param pictureUrl1 the value for obj_program.picture_url1
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setPictureUrl1(String pictureUrl1) {
        this.pictureUrl1 = pictureUrl1 == null ? null : pictureUrl1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.name
     *
     * @return the value of obj_program.name
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.name
     *
     * @param name the value for obj_program.name
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.language
     *
     * @return the value of obj_program.language
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.language
     *
     * @param language the value for obj_program.language
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.writer_display
     *
     * @return the value of obj_program.writer_display
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getWriterDisplay() {
        return writerDisplay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.writer_display
     *
     * @param writerDisplay the value for obj_program.writer_display
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setWriterDisplay(String writerDisplay) {
        this.writerDisplay = writerDisplay == null ? null : writerDisplay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.description
     *
     * @return the value of obj_program.description
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.description
     *
     * @param description the value for obj_program.description
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.en_name
     *
     * @return the value of obj_program.en_name
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getEnName() {
        return enName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.en_name
     *
     * @param enName the value for obj_program.en_name
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.release_year
     *
     * @return the value of obj_program.release_year
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getReleaseYear() {
        return releaseYear;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.release_year
     *
     * @param releaseYear the value for obj_program.release_year
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear == null ? null : releaseYear.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.volumn_count
     *
     * @return the value of obj_program.volumn_count
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getVolumnCount() {
        return volumnCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.volumn_count
     *
     * @param volumnCount the value for obj_program.volumn_count
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setVolumnCount(String volumnCount) {
        this.volumnCount = volumnCount == null ? null : volumnCount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.orgair_date
     *
     * @return the value of obj_program.orgair_date
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getOrgairDate() {
        return orgairDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.orgair_date
     *
     * @param orgairDate the value for obj_program.orgair_date
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setOrgairDate(String orgairDate) {
        this.orgairDate = orgairDate == null ? null : orgairDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.original_country
     *
     * @return the value of obj_program.original_country
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getOriginalCountry() {
        return originalCountry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.original_country
     *
     * @param originalCountry the value for obj_program.original_country
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setOriginalCountry(String originalCountry) {
        this.originalCountry = originalCountry == null ? null : originalCountry.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.is_3d
     *
     * @return the value of obj_program.is_3d
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getIs3d() {
        return is3d;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.is_3d
     *
     * @param is3d the value for obj_program.is_3d
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setIs3d(String is3d) {
        this.is3d = is3d == null ? null : is3d.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.if_priview
     *
     * @return the value of obj_program.if_priview
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getIfPriview() {
        return ifPriview;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.if_priview
     *
     * @param ifPriview the value for obj_program.if_priview
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setIfPriview(String ifPriview) {
        this.ifPriview = ifPriview == null ? null : ifPriview.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.duration
     *
     * @return the value of obj_program.duration
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getDuration() {
        return duration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.duration
     *
     * @param duration the value for obj_program.duration
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setDuration(String duration) {
        this.duration = duration == null ? null : duration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.content_provider
     *
     * @return the value of obj_program.content_provider
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getContentProvider() {
        return contentProvider;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.content_provider
     *
     * @param contentProvider the value for obj_program.content_provider
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setContentProvider(String contentProvider) {
        this.contentProvider = contentProvider == null ? null : contentProvider.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.play_url
     *
     * @return the value of obj_program.play_url
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getPlayUrl() {
        return playUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.play_url
     *
     * @param playUrl the value for obj_program.play_url
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setPlayUrl(String playUrl) {
        this.playUrl = playUrl == null ? null : playUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.code
     *
     * @return the value of obj_program.code
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.code
     *
     * @param code the value for obj_program.code
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.program_type
     *
     * @return the value of obj_program.program_type
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getProgramType() {
        return programType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.program_type
     *
     * @param programType the value for obj_program.program_type
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setProgramType(String programType) {
        this.programType = programType == null ? null : programType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column obj_program.program_type2
     *
     * @return the value of obj_program.program_type2
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public String getProgramType2() {
        return programType2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column obj_program.program_type2
     *
     * @param programType2 the value for obj_program.program_type2
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    public void setProgramType2(String programType2) {
        this.programType2 = programType2 == null ? null : programType2.trim();
    }
}