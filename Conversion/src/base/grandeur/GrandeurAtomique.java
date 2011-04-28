package base.grandeur;

public class GrandeurAtomique extends Grandeur {

	public GrandeurAtomique(String nom) {
		super(nom);
	}

	@Override
	public Object evaluer() {
		return nom;
	}

}
