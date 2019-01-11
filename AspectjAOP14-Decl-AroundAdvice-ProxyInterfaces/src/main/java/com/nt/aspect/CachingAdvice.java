package com.nt.aspect;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;

public class CachingAdvice {
	private Map<String,Object> cache=new HashMap();
	public   Object  caching(ProceedingJoinPoint pjp)throws Throwable{
		String key=null;
		Object retVal=null;
		key=pjp.getSignature()+""+Arrays.toString(pjp.getArgs());
		if(!cache.containsKey(key)){
			retVal=pjp.proceed();
			cache.put(key, retVal);
			System.out.println("from target method...");
		}
		else{
			System.out.println("from cahe");
			retVal=cache.get(key);
		}
		return retVal;
	}//method
}//class
