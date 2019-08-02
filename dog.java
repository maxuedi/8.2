package Animal;

public class dog extends Animal implements see {

	@Override
	public void kanjia() {
		System.out.println("ø¥º“");

	}

	@Override
	public void eat() {
		System.out.println("≥‘“ª∂—π∑¡∏");

	}
public static void main(String[] args) {
	Animal a = new dog();
	a.Eat();
	see b = new dog();
	b.kanjia();
	dog c = new dog();
	c.eat();
}

}
