package com.kennysoft.mapper;

import com.kennysoft.model.NotifyRequest;
import com.kennysoft.model.NotifyRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NotifyRequestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_request
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    long countByExample(NotifyRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_request
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int deleteByExample(NotifyRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_request
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_request
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int insert(NotifyRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_request
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int insertSelective(NotifyRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_request
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    List<NotifyRequest> selectByExampleWithRowbounds(NotifyRequestExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_request
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    List<NotifyRequest> selectByExample(NotifyRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_request
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") NotifyRequest record, @Param("example") NotifyRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table notify_request
     *
     * @mbg.generated Thu Dec 13 15:19:45 CST 2018
     */
    int updateByExample(@Param("record") NotifyRequest record, @Param("example") NotifyRequestExample example);
}