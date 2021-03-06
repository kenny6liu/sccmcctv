package com.kennysoft.mapper;

import com.kennysoft.model.ContentClick;
import com.kennysoft.model.ContentClickExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ContentClickMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_click
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    long countByExample(ContentClickExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_click
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int deleteByExample(ContentClickExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_click
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_click
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int insert(ContentClick record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_click
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int insertSelective(ContentClick record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_click
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    List<ContentClick> selectByExampleWithRowbounds(ContentClickExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_click
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    List<ContentClick> selectByExample(ContentClickExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_click
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") ContentClick record, @Param("example") ContentClickExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table content_click
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByExample(@Param("record") ContentClick record, @Param("example") ContentClickExample example);
}