package test;

public class SimpleFactory {

	public static void main(String[] args) {
		Shape mycircle=Shapefarm.jihe("Բ");
		if(mycircle!=null){
			mycircle.draw();
			mycircle.erase();
		}
		Shape myrectangle=Shapefarm.jihe("����");
		if(myrectangle!=null){
			myrectangle.draw();
			myrectangle.erase();
		}
		Shape mytirangle=Shapefarm.jihe("������");
		if(mytirangle!=null){
			mytirangle.draw();
			mytirangle.erase();
		}

	}

}
