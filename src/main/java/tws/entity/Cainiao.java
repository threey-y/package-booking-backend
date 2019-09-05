package tws.entity;

public class Cainiao implements Serializable{

	

	    private int yundanhao;
	    private String shoujianren;
	    private int dianhua;
	    private String zhongliang;
	    
		public int getYundanhao() {
			return yundanhao;
		}
		public void setYundanhao(int yundanhao) {
			this.yundanhao = yundanhao;
		}
		public String getShoujianren() {
			return shoujianren;
		}
		public void setShoujianren(String shoujianren) {
			this.shoujianren = shoujianren;
		}
		public String getZhongliang() {
			return zhongliang;
		}
		public void setZhongliang(String zhongliang) {
			this.zhongliang = zhongliang;
		}
		public int getDianhua() {
			return dianhua;
		}
		public void setDianhua(int dianhua) {
			this.dianhua = dianhua;
		}

		public  Cainiao(int yundanhao,String shoujianren,int dianhua,String zhongliang) {
			this.yundanhao = yundanhao;
			this.shoujianren= shoujianren;
			this.dianhua = dianhua;
			this.zhongliang = zhongliang;
		}
		public Cainiao() {}
		
	
	
	
}
