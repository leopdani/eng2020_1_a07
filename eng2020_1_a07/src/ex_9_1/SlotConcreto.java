package ex_9_1;

public abstract class SlotConcreto implements Slot {
	public final int VALOR;
	private Slot slot;
	
	public SlotConcreto(int valor) {
		VALOR = valor;
	}

	@Override
	public String getNomeSlot() {
		return "Slot de " + VALOR;
	}

	@Override
	public void processar(Moeda moeda) {
		System.out.printf("**** Slot de %d diz: ", VALOR);
		if (moeda.getValor() == VALOR) {
			System.out.printf("moeda de %d aceita.\n", moeda.getValor());
		} else if (this.slot != null) {
			System.out.printf("não processo moedas de %d. Passando para %s\n",
					VALOR, this.slot.getNomeSlot());
			this.slot.processar(moeda);
		} else {
			System.out.printf("moeda de %d é inválida.\n", moeda.getValor());
		}
	}

	@Override
	public void setSlot(Slot slot) {
		this.slot = slot;
	}

}