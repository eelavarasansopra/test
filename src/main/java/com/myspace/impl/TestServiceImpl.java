package com.myspace.impl;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import com.myspace.service.TestService;

@Component
@Scope(value=BeanDefinition.SCOPE_PROTOTYPE,proxyMode=ScopedProxyMode.TARGET_CLASS)
public class TestServiceImpl implements TestService{
	
	public volatile String name ="testservice";


	@Override
	public String test(long value,String service) throws InterruptedException {
		String methodVariable ="testMethod";
		System.out.println(Thread.currentThread().getName()+" #  value--->"+value);
		System.out.println(Thread.currentThread().getName()+" #  serviceName-->"+name);
		System.out.println(Thread.currentThread().getName()+" #  methodVariable-->"+methodVariable);
		name = service;	
		methodVariable = service;
		Thread.sleep(value);

		System.out.println(Thread.currentThread().getName()+" #  value--->"+value);
		System.out.println(Thread.currentThread().getName()+" #  serviceName-->"+name);
		System.out.println(Thread.currentThread().getName()+" #  methodVariable-->"+methodVariable);
		return null;
	}
	

}
