package com.amway.common.util;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.gson.Gson;

public class JsonFunc {
	public static final String formateDate = "yyyy/MM/dd HH:mm:ss";
	
	public static String toJson(Object src){
		Gson gson = new Gson();
		return gson.toJson(src);
	}

	
	public static <T> T fromJson(String json, Class<T> classOfT){
		Gson gson = new Gson();
		return gson.fromJson(json, classOfT);
	}
	
	
	public static <T> T fromJson(String json, Type typeOfT){
		Gson gson = new Gson();
		return (T)gson.fromJson(json, typeOfT);
	}
	
	
	
	public static String toJsonForListType(Object src) {
		java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<ArrayList<String>>() {
		}.getType();
		Gson gson = new Gson();
		List dataResultList = new ArrayList();
		Collection colResult = (Collection) src;
		for(Object obj : colResult) {
			String objStr = gson.toJson(obj);
			dataResultList.add(objStr);
		}
		return gson.toJson(dataResultList,type);
	}
	
	
	public static  List fromJsonForListType(String json, Class classOfT){
		java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<ArrayList<String>>() {
		}.getType();
		Gson gson = new Gson();
		List result = new ArrayList();
		List listTypeJson = JsonFunc.fromJson(json, type);
		for(Object obj : listTypeJson) {
			result.add(gson.fromJson(obj.toString(), classOfT));
		}
		return result;
	}
	
	
	public static List fromJsonForListType(String json, Type typeOfT){
		Gson gson = new Gson();
		java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<ArrayList<String>>() {
		}.getType();
		List result = new ArrayList();
		List listTypeJson = JsonFunc.fromJson(json, type);
		for(Object obj : listTypeJson) {
			result.add(gson.fromJson(obj.toString(), typeOfT));
		}
		return result;
	}
	
}
