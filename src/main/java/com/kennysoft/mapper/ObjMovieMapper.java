package com.kennysoft.mapper;

import com.kennysoft.model.ObjMovie;
import com.kennysoft.model.ObjMovieExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ObjMovieMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_movie
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    long countByExample(ObjMovieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_movie
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int deleteByExample(ObjMovieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_movie
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_movie
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int insert(ObjMovie record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_movie
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int insertSelective(ObjMovie record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_movie
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    List<ObjMovie> selectByExampleWithRowbounds(ObjMovieExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_movie
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    List<ObjMovie> selectByExample(ObjMovieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_movie
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    ObjMovie selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_movie
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") ObjMovie record, @Param("example") ObjMovieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_movie
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByExample(@Param("record") ObjMovie record, @Param("example") ObjMovieExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_movie
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByPrimaryKeySelective(ObjMovie record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table obj_movie
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByPrimaryKey(ObjMovie record);
}