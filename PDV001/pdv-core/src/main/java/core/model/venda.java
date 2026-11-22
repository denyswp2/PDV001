package model;

public class venda {
private int CODVENDA;
private int CODCLI;
private int CODPROD;
private int CODLOCAL;
private long QTD_VENDA;
private long VALOR_TOTAL;
private String DATA_VENDA;
public int getCODVENDA() {
	return CODVENDA;
}
public void setCODVENDA(int cODVENDA) {
	CODVENDA = cODVENDA;
}
public int getCODCLI() {
	return CODCLI;
}
public void setCODCLI(int cODCLI) {
	CODCLI = cODCLI;
}
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
public long getQTD_VENDA() {
	return QTD_VENDA;
}
public void setQTD_VENDA(long qTD_VENDA) {
	QTD_VENDA = qTD_VENDA;
}
public long getVALOR_TOTAL() {
	return VALOR_TOTAL;
}
public void setVALOR_TOTAL(long vALOR_TOTAL) {
	VALOR_TOTAL = vALOR_TOTAL;
}
public String getDATA_VENDA() {
	return DATA_VENDA;
}
public void setDATA_VENDA(String dATA_VENDA) {
	DATA_VENDA = dATA_VENDA;
}
}
