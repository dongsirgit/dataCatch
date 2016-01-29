/**
 *Copyright (c) 1997, 2015,BEST WONDER CO.,LTD. All rights reserved.
 */

package com.baiwang.excuter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.baiwang.spiders.GSspider_jx_jcxx;
import com.baiwang.spiders.util.HttpUtil;

import us.codecraft.webmagic.Spider;

/**
  * @ClassName: DataCatchExcuter
  * @Description: TODO
  * @author Administrator
  * @date 2016年1月29日 下午2:22:48
  */
public class DataCatchExcuter {
	
	/**
	  * @author Administrator
	  * @Description: 企业基本信息（工商类抓取）
	  * @param @param djh 企业登记号
	  * @param @param qylx 企业类型	
	  * @return void  
	  * @throws
	  * @date 2016年1月28日 下午5:06:50
	  */
	private static void spider_jbxx(String djh,String qylx){
		Spider.create(new GSspider_jx_jcxx())
		.addUrl("http://gsxt.jxaic.gov.cn/ECPS/qyxxgsAction_initQyjbqk.action?nbxh="+djh+"&qylx="+qylx)
		.run();
	}
	/**
	  * @author Administrator
	  * @Description: 经营异常
	  * @param @param djh
	  * @param @param qylx  
	  * @return void  
	  * @throws
	  * @date 2016年1月29日 下午5:36:42
	  */
	private static void spider_jyyc(String djh,String qylx){
		Spider.create(new GSspider_jx_jcxx())
		.addUrl("http://gsxt.jxaic.gov.cn/ECPS/qyxxgsAction_initQyjbqk.action?nbxh="+djh+"&qylx="+qylx)
		.run();
	}
	/**
	  * @author Administrator
	  * @Description: 行政处罚
	  * @param @param djh
	  * @param @param qylx  
	  * @return void  
	  * @throws
	  * @date 2016年1月29日 下午5:36:42
	  */
	private static void spider_xzcf(String djh,String qylx){
		Spider.create(new GSspider_jx_jcxx())
		.addUrl("http://gsxt.jxaic.gov.cn/ECPS/qyxxgsAction_initQyjbqk.action?nbxh="+djh+"&qylx="+qylx)
		.run();
	}
	/**
	  * @author Administrator
	  * @Description: 严重违法
	  * @param @param djh
	  * @param @param qylx  
	  * @return void  
	  * @throws
	  * @date 2016年1月29日 下午5:36:42
	  */
	private static void spider_yzwf(String djh,String qylx){
		Spider.create(new GSspider_jx_jcxx())
		.addUrl("http://gsxt.jxaic.gov.cn/ECPS/qyxxgsAction_initQyjbqk.action?nbxh="+djh+"&qylx="+qylx)
		.run();
	}
	/**
	  * @author Administrator
	  * @Description: 抽查抽检
	  * @param @param djh
	  * @param @param qylx  
	  * @return void  
	  * @throws
	  * @date 2016年1月29日 下午5:36:42
	  */
	private static void spider_cccj(String djh,String qylx){
		Spider.create(new GSspider_jx_jcxx())
		.addUrl("http://gsxt.jxaic.gov.cn/ECPS/qyxxgsAction_initQyjbqk.action?nbxh="+djh+"&qylx="+qylx)
		.run();
	}

	/**
	  * @author Administrator
	  * @Description: TODO
	  * @param @param args  
	  * @return void  
	  * @throws
	  * @date 2016年1月29日 下午2:22:48
	  */
	public static void main(String[] args) {
		spider_jbxx("3600006000042031", "1219");
		System.out.println("完事");
//		List<NameValuePair> list = new ArrayList<>();
//		NameValuePair nvp = new BasicNameValuePair("selectValue", "360803310002382");
//		list.add(nvp);
//		try {
//			String a = HttpUtil.postOnePage("http://gsxt.jxaic.gov.cn/ECPS/qyxxgsAction_queryXyxx.action", list);
//			System.out.println("下载页面："+a);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

}
