package java_json;

import java.util.List;

public class TestJsonBean {

	private int AB;  // ！陷阱：当仅有一个大写字母时，会误输出为小写字母
	private String b;
	private float c;
	private boolean d;
	private SubTestJsonBean sub;
	private List<SubTestJsonBean> subs;
	
	public int getAB() {
		return AB;
	}

	public void setAB(int a) {
		this.AB = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public boolean isD() {
		return d;
	}

	public void setD(boolean d) {
		this.d = d;
	}


	
	public SubTestJsonBean getSub() {
		return sub;
	}

	public void setSub(SubTestJsonBean sub) {
		this.sub = sub;
	}

	public List<SubTestJsonBean> getSubs() {
		return subs;
	}

	public void setSubs(List<SubTestJsonBean> subs) {
		this.subs = subs;
	}

	public TestJsonBean() {
		super();
	}
	
	
}
