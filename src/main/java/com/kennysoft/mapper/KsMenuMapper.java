package com.kennysoft.mapper;

import com.kennysoft.model.KsMenu;
import com.kennysoft.model.KsMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface KsMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_menu
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    long countByExample(KsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_menu
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int deleteByExample(KsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_menu
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_menu
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int insert(KsMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_menu
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int insertSelective(KsMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_menu
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    List<KsMenu> selectByExampleWithRowbounds(KsMenuExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_menu
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    List<KsMenu> selectByExample(KsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_menu
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    KsMenu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_menu
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") KsMenu record, @Param("example") KsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_menu
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByExample(@Param("record") KsMenu record, @Param("example") KsMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_menu
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByPrimaryKeySelective(KsMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_menu
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByPrimaryKey(KsMenu record);
}