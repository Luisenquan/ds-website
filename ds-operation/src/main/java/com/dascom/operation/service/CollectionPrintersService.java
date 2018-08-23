package com.dascom.operation.service;

import java.util.List;

import com.dascom.operation.entity.CollectionPrinters;

public interface CollectionPrintersService {
	
	//获取设备总数
	int getAllDevice();
	
	//获取当前日期的设备(登陆过)
	List<CollectionPrinters> getonlineDevice();
	

}
