package java_json;

import java.util.List;

public class TestJsonBean implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1700915195107154313L;


	private int AA;
	private String B;  // ！陷阱：当仅有一个大写字母时，会误输出为小写字母
	private double c = 0.6;  // 可以设置默认值
	private boolean d;
	private SubTestJsonBean sub;
	private List<SubTestJsonBean> subs;
	
	public int getAA() {
		return AA;
	}

	public void setAA(int a) {
		this.AA = a;
	}

	public String getB() {
		return B;
	}

	public void setB(String b) {
		this.B = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
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
