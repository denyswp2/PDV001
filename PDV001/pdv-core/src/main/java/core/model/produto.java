package model;

public class produto {
	private int CODPROD;
	private int CODLOCAL;
	private String DESCRICAO;
	private int QTD_ESTOQUE;
	private double PRECO_UNITARIO;
	
	public int getCODPROD() {
		return CODPROD;
	}
	public void setCODPROD(int cODPROD) {
		CODPROD = cODPROD;
	}
	public int getCODLOCAL() {
		return CODLOCAL;
	}
	public void setCODLOCAL(int cODLOCAL) {
		CODLOCAL = cODLOCAL;
	}
	public String getDESCRICAO() {
		return DESCRICAO;
	}
	public void setDESCRICAO(String dESCRICAO) {
		DESCRICAO = dESCRICAO;
	}
	public int getQTD_ESTOQUE() {
		return QTD_ESTOQUE;
	}
	public void setQTD_ESTOQUE(int qTD_ESTOQUE) {
		QTD_ESTOQUE = qTD_ESTOQUE;
	}
	public double getPRECO_UNITARIO() {
		return PRECO_UNITARIO;
	}
	public void setPRECO_UNITARIO(double pRECO_UNITARIO) {
		PRECO_UNITARIO = pRECO_UNITARIO;
	}
	
}
