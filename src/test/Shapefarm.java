package test;

public class Shapefarm {
	public static Shape jihe(String type){
		if("Բ��".equals(type)){
			return new Circle();
		}else if ("����".equals(type)) {
			return new Rectangle();
			
		}else if ("������".equals(type)) {
			return new Tirangle();
			
		} else {
			try {
				System.out.println("ʲôҲû��");
			} catch (Exception e) {
			return null;
			}

		}
		
		return null;
		
	}

}
