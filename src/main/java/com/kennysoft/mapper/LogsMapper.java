package com.kennysoft.mapper;

import com.kennysoft.model.Logs;
import com.kennysoft.model.LogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LogsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Thu Nov 22 17:38:07 CST 2018
     */
    long countByExample(LogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Thu Nov 22 17:38:07 CST 2018
     */
    int deleteByExample(LogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Thu Nov 22 17:38:07 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Thu Nov 22 17:38:07 CST 2018
     */
    int insert(Logs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Thu Nov 22 17:38:07 CST 2018
     */
    int insertSelective(Logs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Thu Nov 22 17:38:07 CST 2018
     */
    List<Logs> selectByExampleWithRowbounds(LogsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Thu Nov 22 17:38:07 CST 2018
     */
    List<Logs> selectByExample(LogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Thu Nov 22 17:38:07 CST 2018
     */
    Logs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Thu Nov 22 17:38:07 CST 2018
     */
    int updateByExampleSelective(@Param("record") Logs record, @Param("example") LogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Thu Nov 22 17:38:07 CST 2018
     */
    int updateByExample(@Param("record") Logs record, @Param("example") LogsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Thu Nov 22 17:38:07 CST 2018
     */
    int updateByPrimaryKeySelective(Logs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logs
     *
     * @mbg.generated Thu Nov 22 17:38:07 CST 2018
     */
    int updateByPrimaryKey(Logs record);
}