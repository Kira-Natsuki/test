
public class Capsul {

	public static void main(String[] args) {
		Person taro = new Person("山田　太郎", 20,"Tokyo");
		System.out.println(taro.getName());
		System.out.println(taro.getAge());

		taro.setAge(25);
		System.out.println(taro.getAge());



	}

}
