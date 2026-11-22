package model;

public class cliente {
	private int CODCLI;
	private String NOME;
	private int BONUS;
	private char PERFIL;
	private char STATUS;

	public int getCODCLI() {
		return CODCLI;
	}

	public void setCODCLI(int cODCLI) {
		CODCLI = cODCLI;
	}

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String nOME) {
		NOME = nOME;
	}

	public int getBONUS() {
		return BONUS;
	}

	public void setBONUS(int bONUS) {
		BONUS = bONUS;
	}

	public char getPERFIL() {
		return PERFIL;
	}

	public void setPERFIL(char pERFIL) {
		PERFIL = pERFIL;
	}

	public char getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(char sTATUS) {
		STATUS = sTATUS;
	}

}
