package exemplos.ex002.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import exemplos.ex002.entities.Comment;
import exemplos.ex002.entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Tenha uma boa Viagem");
		Comment c2 = new Comment("Uau vai ser incrivel!");

		Post p1 = new Post(sdf.parse("07/12/2022 20:22:30"), "Viagem para Nova Zelandia",
				"Estou indo visitar este pais incrivel", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1.toString());

	}

}
