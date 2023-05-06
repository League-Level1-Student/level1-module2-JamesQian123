package _03_tea_maker;

public class TeaMakerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeaBag tea = new TeaBag("Green");
		Kettle kettle = new Kettle();
		kettle.boil();
		Cup cup = new Cup();
		cup.makeTea(tea, kettle.getWater());
		
		
	}

}
