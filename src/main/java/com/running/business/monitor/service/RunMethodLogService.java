package com.running.business.monitor.service;

import com.running.business.exception.AppException;
import com.running.business.monitor.pojo.RunMapperLogWithBLOBs;
import com.running.business.monitor.pojo.RunServiceLogWithBLOBs;

import java.util.Date;
import java.util.List;

/**
 * @author liumingyu
 * @create 2018-01-21 下午3:40
 */
public interface RunMethodLogService {

    /**
     * 保存service方法日志
     *
     * @param runServiceLogWithBLOBs
     * @return
     * @throws AppException
     */
    int saveServiceLog(RunServiceLogWithBLOBs runServiceLogWithBLOBs) throws AppException;

    /**
     * 更新service方法日志
     *
     * @param runServiceLogWithBLOBs
     * @throws AppException
     */
    void updateServiceLog(RunServiceLogWithBLOBs runServiceLogWithBLOBs) throws AppException;

    /**
     * 批量保存service方法日志
     *
     * @param runServiceLogWithBLOBsList
     * @throws AppException
     */
    void batchSaveServiceLog(List<RunServiceLogWithBLOBs> runServiceLogWithBLOBsList) throws AppException;

    /**
     * 保存mapper方法日志
     *
     * @param runMapperLogWithBLOBs
     * @return
     * @throws AppException
     */
    int saveMapperLog(RunMapperLogWithBLOBs runMapperLogWithBLOBs) throws AppException;

    /**
     * 更新mapper方法日志
     *
     * @param runMapperLogWithBLOBs
     * @throws AppException
     */
    void updateMapperLog(RunMapperLogWithBLOBs runMapperLogWithBLOBs) throws AppException;

    /**
     * 批量保存mapper方法日志
     *
     * @param runMapperLogWithBLOBs
     * @throws AppException
     */
    void batchSaveMapperLog(List<RunMapperLogWithBLOBs> runMapperLogWithBLOBs) throws AppException;

    /**
     * 根据id查询service日志
     *
     * @param id
     * @return
     * @throws AppException
     */
    RunServiceLogWithBLOBs queryServiceLogById(Integer id) throws AppException;

    /**
     * 根据操作者id查询service日志
     *
     * @param oId
     * @return
     * @throws AppException
     */
    List<RunServiceLogWithBLOBs> pageServiceLogByOID(Integer oId, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 根据执行状态查询service日志
     *
     * @param invokerStatus
     * @return
     * @throws AppException
     */
    List<RunServiceLogWithBLOBs> pageServiceLogByStatus(Integer invokerStatus, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 根据父id查询service日志
     *
     * @param pId
     * @return
     * @throws AppException
     */
    List<RunServiceLogWithBLOBs> pageServiceLogByPID(Integer pId, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 根据类名模糊查询Service日志
     *
     * @param className
     * @return
     * @throws AppException
     */
    List<RunServiceLogWithBLOBs> pageServiceLogLikeClassName(String className, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 根据方法名模糊查询Service日志
     *
     * @param methodName
     * @return
     * @throws AppException
     */
    List<RunServiceLogWithBLOBs> pageServiceLogLikeMethodName(String methodName, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 根据操作者姓名模糊查询Service日志
     *
     * @param operatorName
     * @return
     * @throws AppException
     */
    List<RunServiceLogWithBLOBs> pageServiceLogLikeOperatorName(String operatorName, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 根据方法参数模糊查询Service日志
     *
     * @param methodParam
     * @return
     * @throws AppException
     */
    List<RunServiceLogWithBLOBs> pageServiceLogLikeMethodParam(String methodParam, Integer page, Integer size, String orderField, String orderType) throws AppException;


    /**
     * 根据返回值模糊查询Service日志
     *
     * @param returnValue
     * @return
     * @throws AppException
     */
    List<RunServiceLogWithBLOBs> pageServiceLogLikeReturnValue(String returnValue, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 根据错误信息模糊查询Service日志
     *
     * @param errorMessage
     * @return
     * @throws AppException
     */
    List<RunServiceLogWithBLOBs> pageServiceLogLikeErrorMessage(String errorMessage, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 范围查询，查询耗时大于startTime小于endTime的日志
     *
     * @param startTime
     * @param endTime
     * @return
     * @throws AppException
     */
    List<RunServiceLogWithBLOBs> pageServiceLogByMethodTime(Long startTime, Long endTime, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 范围查询，根据执行时间查询startTime到endTime中间的日志
     *
     * @param startTime
     * @param endTime
     * @return
     * @throws AppException
     */
    List<RunServiceLogWithBLOBs> pageServiceLogByExecutionTime(Date startTime, Date endTime, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 根据ID查询Mapper日志
     *
     * @param id
     * @return
     * @throws AppException
     */
    RunMapperLogWithBLOBs queryMapperLogByID(Integer id) throws AppException;

    /**
     * service方法Id查询Mapper日志
     *
     * @param serviceLogId
     * @return
     * @throws AppException
     */
    List<RunMapperLogWithBLOBs> pageMapperLogByServiceId(Integer serviceLogId, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 操作类型查询Mapper日志
     *
     * @param OperateType
     * @return
     * @throws AppException
     */
    List<RunMapperLogWithBLOBs> pageMapperLogByOperateType(Byte OperateType, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 影响行数查询Mapper日志
     *
     * @param InfluenceRow
     * @return
     * @throws AppException
     */
    List<RunMapperLogWithBLOBs> pageMapperLogByInfluenceRow(Integer InfluenceRow, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 执行状态查询Mapper日志
     *
     * @param InvokeStatus
     * @return
     * @throws AppException
     */
    List<RunMapperLogWithBLOBs> pageMapperLogByInvokeStatus(Byte InvokeStatus, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 方法名查询Mapper日志
     *
     * @param MethodName
     * @return
     * @throws AppException
     */
    List<RunMapperLogWithBLOBs> pageMapperLogByMethodName(String MethodName, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 根据方法参数模糊查询Mapper日志
     *
     * @param methodParam
     * @param page
     * @param size
     * @param orderField
     * @param orderType
     * @return
     * @throws AppException
     */
    List<RunMapperLogWithBLOBs> pageMapperLogByMethodParam(String methodParam, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 表名查询Mapper日志
     *
     * @param TargetTableName
     * @return
     * @throws AppException
     */
    List<RunMapperLogWithBLOBs> pageMapperLogByTargetTableName(String TargetTableName, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * sql语句查询Mapper日志
     *
     * @param SqlStatement
     * @return
     * @throws AppException
     */
    List<RunMapperLogWithBLOBs> pageMapperLogBySqlStatement(String SqlStatement, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 根据错误信息模糊查询Mapper日志
     *
     * @param error
     * @return
     * @throws AppException
     */
    List<RunMapperLogWithBLOBs> pageMapperLogByError(String error, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 方法耗时查询Mapper日志
     *
     * @param startTime
     * @return
     * @throws AppException
     */
    List<RunMapperLogWithBLOBs> pageMapperLogByMethodTime(Date startTime, Date endTime, Integer page, Integer size, String orderField, String orderType) throws AppException;

    /**
     * 范围查询Mapper日志
     *
     * @param startTime
     * @return
     * @throws AppException
     */
    List<RunMapperLogWithBLOBs> pageMapperLogByTimeCost(Long startTime, Long endTime, Integer page, Integer size, String orderField, String orderType) throws AppException;
}



