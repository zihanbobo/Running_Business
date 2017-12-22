package com.running.business.service;

import com.running.business.common.BaseResult;
import com.running.business.pojo.RunOrder;

public interface RunOrderService {

	BaseResult addRunOrder(RunOrder order);
	BaseResult updateRunOrder(RunOrder order);
	BaseResult delRunOrderByOID(String oid);
	BaseResult delAllRunOrderByUID(Integer uid);
	BaseResult delAllRunOrderByDID(Integer did);

	BaseResult getRunOrderByOID(String oid);
	BaseResult getAllRunOrderByUID(Integer uid);
	BaseResult getAllRunOrderByDID(Integer did);
	BaseResult getAllRunOrder();
}