package com.kennysoft.mapper;

import com.kennysoft.model.KsAdmin;
import com.kennysoft.model.KsAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface KsAdminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_admin
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    long countByExample(KsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_admin
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int deleteByExample(KsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_admin
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_admin
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int insert(KsAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_admin
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int insertSelective(KsAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_admin
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    List<KsAdmin> selectByExampleWithRowbounds(KsAdminExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_admin
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    List<KsAdmin> selectByExample(KsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_admin
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    KsAdmin selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_admin
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") KsAdmin record, @Param("example") KsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_admin
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByExample(@Param("record") KsAdmin record, @Param("example") KsAdminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_admin
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByPrimaryKeySelective(KsAdmin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ks_admin
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByPrimaryKey(KsAdmin record);
}