package com.dascom.operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dascom.operation.entity.CollectionPrinters;
import com.dascom.operation.service.CollectionPrintersService;

@RestController
public class CloudDeviceController {
	
	@Autowired
	private CollectionPrintersService printersService;
	
	@RequestMapping("getAllDevice")
	public int getAll(){
		return printersService.getAllDevice();
	}
	
	//获取当前日期的设备(登陆过)
	@RequestMapping("getNowDayDevice")
	public List<CollectionPrinters> getNowDay(){
		return printersService.getonlineDevice();
	}

}
