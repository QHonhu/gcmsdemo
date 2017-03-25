package test;

public class SimpleFactory {

	public static void main(String[] args) {
		Shape mycircle=Shapefarm.jihe("Ô²");
		if(mycircle!=null){
			mycircle.draw();
			mycircle.erase();
		}
		Shape myrectangle=Shapefarm.jihe("¾ØÐÎ");
		if(myrectangle!=null){
			myrectangle.draw();
			myrectangle.erase();
		}
		Shape mytirangle=Shapefarm.jihe("Èý½ÇÐÎ");
		if(mytirangle!=null){
			mytirangle.draw();
			mytirangle.erase();
		}

	}

}
