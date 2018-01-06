package com.running.business.service;

import com.running.business.common.BaseResult;
import com.running.business.pojo.RunUserAddress;

public interface RunUserAddressService {

    BaseResult addRunUserAddress(RunUserAddress userAddress);

    BaseResult updateRunUserAddress(RunUserAddress userAddress);

    BaseResult delRunUserAddressByID(Integer id);

    /**
     * 根据用户id删除所有地址
     *
     * @param uid
     * @return
     */
    BaseResult delAllRunUserAddressByUID(Integer uid);

    /**
     * 根据id获取地址
     *
     * @param id
     * @return
     */
    BaseResult getRunUserAddressByID(Integer id);

    /**
     * 获取该用户的所有地址信息
     *
     * @param uid
     * @return
     */
    BaseResult getAllRunUserAddress(Integer uid);
}
