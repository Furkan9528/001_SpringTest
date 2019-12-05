package com.furkankara;

public class Ogretmen implements Memur {

	private Gorev gorev;
	
	public Ogretmen() {
	}

	public Ogretmen(Gorev gorev) {
		this.gorev = gorev;
	}

	@Override
	public void calis() {
		gorev.gorevVer();
	}
	
	

}
