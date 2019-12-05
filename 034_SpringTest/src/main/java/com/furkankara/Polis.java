package com.furkankara;

public class Polis implements Memur {

	private Gorev gorev;
	
	public Polis() {
	}

	 public Polis(Gorev gorev) {
		this.gorev = gorev;
	}


	@Override
	public void calis() {
		gorev.gorevVer();
	}

}
