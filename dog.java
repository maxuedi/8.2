package Animal;

public class dog extends Animal implements see {

	@Override
	public void kanjia() {
		System.out.println("����");

	}

	@Override
	public void eat() {
		System.out.println("��һ�ѹ���");

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
