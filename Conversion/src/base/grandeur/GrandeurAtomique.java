package base.grandeur;

import java.util.HashMap;

public class GrandeurAtomique extends Grandeur {
	public GrandeurAtomique(String nom, String abr) {
		super(nom, abr);
	}

	@Override
	public double evaluer(HashMap<String, Double> val) {
		return val.get(this.abr);
	}
}
