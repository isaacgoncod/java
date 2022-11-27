package fpoo02.project013.application;

public class Program {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria", "BOb", "Alex" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		// obj == vect[i]
		//para cada objeto 'obj' contido no vect, faça:
		for (String obj : vect) {
			System.out.println(obj);
		}
	}

}
