package com.running.business.mapper;

import java.util.List;

import com.running.business.pojo.RunOrderStatus;
import com.running.business.pojo.RunOrderStatusExample;
import org.apache.ibatis.annotations.Param;

public interface RunOrderStatusMapper {
    int countByExample(RunOrderStatusExample example);

    int deleteByExample(RunOrderStatusExample example);

    int deleteByPrimaryKey(String orderid);

    int insert(RunOrderStatus record);

    int insertSelective(RunOrderStatus record);

    List<RunOrderStatus> selectByExample(RunOrderStatusExample example);

    RunOrderStatus selectByPrimaryKey(String orderid);

    int updateByExampleSelective(@Param("record") RunOrderStatus record, @Param("example") RunOrderStatusExample example);

    int updateByExample(@Param("record") RunOrderStatus record, @Param("example") RunOrderStatusExample example);

    int updateByPrimaryKeySelective(RunOrderStatus record);

    int updateByPrimaryKey(RunOrderStatus record);
}