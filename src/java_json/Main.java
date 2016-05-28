package java_json;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

public class Main {

	public static void main(String[] args) {
		
		TestJsonBean testJsonBean = new TestJsonBean();
		SubTestJsonBean sub = new SubTestJsonBean();
		sub.setSub_i(55);
		testJsonBean.setSub(sub);
		List<SubTestJsonBean> subs = new ArrayList<SubTestJsonBean>();
		testJsonBean.setSubs(subs);
		subs.add(sub);
		JSONObject jsonObject = JSONObject.fromObject(testJsonBean);
		System.out.println(jsonObject.toString());
		System.out.println(jsonObject.toString(4));
	}

}
