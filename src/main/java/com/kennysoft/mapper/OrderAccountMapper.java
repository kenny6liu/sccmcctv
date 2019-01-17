package com.kennysoft.mapper;

import com.kennysoft.model.OrderAccount;
import com.kennysoft.model.OrderAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrderAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_account
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    long countByExample(OrderAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_account
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int deleteByExample(OrderAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_account
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_account
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int insert(OrderAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_account
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int insertSelective(OrderAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_account
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    List<OrderAccount> selectByExampleWithRowbounds(OrderAccountExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_account
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    List<OrderAccount> selectByExample(OrderAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_account
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") OrderAccount record, @Param("example") OrderAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_account
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByExample(@Param("record") OrderAccount record, @Param("example") OrderAccountExample example);
}