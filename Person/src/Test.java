
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person taro = new Person();
		taro.name = "Yamada Taro";
		taro.age = 20;
		System.out.println(taro.name);
		System.out.println(taro.age);

		taro.talk();

		Person jiro = new Person();
		jiro.name = "Kimura Jiro";
		jiro.age = 18;
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		Person hanako = new Person();
		hanako.name = "Suzuki Hanako";
		hanako.age = 16;
		hanako.phoneNumber = "080-1111-2222";
		hanako.zipCode = "141-2222";
		hanako.address = "東京都";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.zipCode);
		System.out.println(hanako.address);

		hanako.talk();
		hanako.walk();
		hanako.run();


	}

}
