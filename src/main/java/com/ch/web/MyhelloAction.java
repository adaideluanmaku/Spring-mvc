package com.ch.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ch.service.MyService;




/**
 * 
 * <ul>
 * <li>��Ŀ��ƣ�Spring-mvc </li>
 * <li>����ƣ�  Myhello </li>
 * <li>��������   </li>
 * <li>�����ˣ��»� </li>
 * <li>����ʱ�䣺2017��3��2�� </li>
 * <li>�޸ı�ע��</li>
 * <li>web�㣬����ҳ�����󣬷ַ�ʵ��</li>
 * </ul>
 */

//web��
@Controller
//����·��   ������/mvc
@RequestMapping("/mvc")
public class MyhelloAction {
	
	//�����߼������ת�������߼������ 
	@Autowired
	private MyService myService;
	
	//1
	//�������ҳ�����
	//����·��   ������/mvc/hello
	@RequestMapping("/hello")
	public String hello(){ 
        return "/hello";
    }
	
	
	//2
	//���ض������ҳ��
	//����·��   ������/mvc/hello2
	@RequestMapping("/hello2")
	public ModelAndView hello2(){ 
		
		//ת�������߼������ 
		myService.aaa();
		
		//����ҳ����󣬴�Ų���
		ModelAndView mv = new ModelAndView("/hello2");//hello2Ϊ���ص�ҳ�����,转发forward
		mv.addObject("xx1", "1");
		mv.addObject("xx2", "1");
		mv.addObject("xx3", "1");
		//����ҳ��ĳ������ˢ��ҳ��,EL���ʽ����${xx1}
        return mv;
    }
	
	
	//3
	//����ҳ��ĳ������
	@ResponseBody
	//����·��   ������/mvc/hello3
	@RequestMapping("/hello3")
	public String hello3(){
		//����ҳ��ĳ������ͨ��JS���մ��?��ˢ�����ҳ��
        return "return string";
    }
}
