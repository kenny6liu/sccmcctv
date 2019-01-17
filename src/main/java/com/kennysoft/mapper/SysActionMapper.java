package com.kennysoft.mapper;

import com.kennysoft.model.SysAction;
import com.kennysoft.model.SysActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SysActionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    long countByExample(SysActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int deleteByExample(SysActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int insert(SysAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int insertSelective(SysAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    List<SysAction> selectByExampleWithRowbounds(SysActionExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    List<SysAction> selectByExample(SysActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") SysAction record, @Param("example") SysActionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_action
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByExample(@Param("record") SysAction record, @Param("example") SysActionExample example);
}