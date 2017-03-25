package test;

public class Shapefarm {
	public static Shape jihe(String type){
		if("圆形".equals(type)){
			return new Circle();
		}else if ("矩形".equals(type)) {
			return new Rectangle();
			
		}else if ("三角形".equals(type)) {
			return new Tirangle();
			
		} else {
			try {
				System.out.println("什么也没有");
			} catch (Exception e) {
			return null;
			}

		}
		
		return null;
		
	}

}
