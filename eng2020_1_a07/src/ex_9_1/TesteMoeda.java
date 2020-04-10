package ex_9_1;

import java.util.ArrayList;

public class TesteMoeda {

	public static void main(String[] args) {
		Slot slot1 = new Slot1();
		Slot slot5 = new Slot5();
		Slot slot10 = new Slot10();
		Slot slot50 = new Slot50();
		
		slot1.setSlot(slot5);
		slot5.setSlot(slot10);
		slot10.setSlot(slot50);
		
		ArrayList<Moeda> moedas = new ArrayList<>();
		moedas.add(new Moeda(1));
		moedas.add(new Moeda(5));
		moedas.add(new Moeda(10));
		moedas.add(new Moeda(50));
		moedas.add(new Moeda(3));
		
		for(Moeda moeda: moedas) {
			System.out.printf(">>>>>>>>>>>> Moeda de %d inserida\n", moeda.getValor());
			slot1.processar(moeda);
		}

	}

}