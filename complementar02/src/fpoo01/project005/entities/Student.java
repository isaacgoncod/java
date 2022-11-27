package fpoo01.project005.entities;

public class Student {

	public String name;
	public double notaTrimestralA;
	public double notaTrimestralB;
	public double notaTrimestralC;

	public double somaNota() {
		return notaTrimestralA + notaTrimestralB + notaTrimestralC;
	}

	public double porcent100() {
		return 30 + (35 * 2);
	}

	public double porcent60() {

		return porcent100() * 60 / 100;
	}

	public String conceitoNota() {

		double porcentNota;

		porcentNota = somaNota() * porcent100() / 100;

		if (porcentNota >= 60) {
			return String.format("FINAL GRADE : %.2f\nPASS", somaNota());
		} else {
			return String.format("FINAL GRADE : %.2f\nFAILED\nMISSING %.2f POINTS", somaNota(),
					(porcent60() - somaNota()));
		}
	}

}
