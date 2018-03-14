package Homeworks;

public class Person {
	String nev;
	int tomeg;
	double magassag;
	
	public double getTti() {
		return (tomeg/(Math.pow(magassag, 2)));
	}
	
	public String getAlkat() {
		double x = getTti();
		
		if(x < 18.5)
			return "Sovány";
		else if(x > 25)
			return "Kövér";
		else
			return "Normál";
	}
	
	public String getInfo() {
		//Legyen egy metódusa, amely egy String-be összefűzi az adatokat és visszaadja azokat az alábbi alakban: név, súly, magasság, tti: alkat.
		String interlink = nev+", "+tomeg+", "+magassag+", "+getTti()+": "+getAlkat()+".";
		
		return interlink;
	}
	
	////////////////////////////////////////////////////

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getTomeg() {
		return tomeg;
	}

	public void setTomeg(int tomeg) {
		this.tomeg = tomeg;
	}

	public double getMagassag() {
		return magassag;
	}

	public void setMagassag(double magassag) {
		this.magassag = magassag;
	}
	
	////////////////////////////////////////////////////
}
