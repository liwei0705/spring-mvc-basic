package org.jiagoushi.spring_mvc_basic.controller;

import org.jiagoushi.spring_mvc_basic.model.SampleJsonData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
	// 获取JSON信息
	@RequestMapping(value = "/getJsonData.do")
	@ResponseBody	// 添加该注释后，返回值将由转换器进行转换，转换器为fastJson，所以会转换成json格式
	public SampleJsonData getPersonData() {
		SampleJsonData data = new SampleJsonData();
		data.setTest1("aaa");
		data.setTest2("bbb");
		return data;
	}
}
