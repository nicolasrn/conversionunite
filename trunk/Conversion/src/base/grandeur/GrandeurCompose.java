package base.grandeur;

public class GrandeurCompose extends Grandeur {
	private ElementFonction tete;
	
	public GrandeurCompose(String nom, ElementFonction a) {
		super(nom);
		this.tete = a;
	}

	@Override
	public Object evaluer() {
		return tete.evaluer();
	}
}
