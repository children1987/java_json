package java_json;

public class SubTestJsonBean implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1363728982485326698L;
	private int sub_i = 9;  // ������Ĭ��ֵ
	private boolean sub_b;
	public SubTestJsonBean() {
		super();
	}
	public int getSub_i() {
		return sub_i;
	}
	public void setSub_i(int sub_i) {
		this.sub_i = sub_i;
	}
	public boolean isSub_b() {
		return sub_b;
	}
	public void setSub_b(boolean sub_b) {
		this.sub_b = sub_b;
	}
	
	
}
