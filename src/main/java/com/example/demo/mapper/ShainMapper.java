package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.form.ShainInfoForm;
@Mapper
public interface ShainMapper {
	List<ShainInfoForm> selectAll();	
}
