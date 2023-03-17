package tpfinal;

public class Partido {

	private int nroPartido;
	private String equipoLocal;
	private String equipoVisitante;
	private int golesLocal;
	private int golesVisitante;

	public Partido(int nroPartido, String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante) {
		super();
		this.nroPartido = nroPartido;
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
	}

	public String getResultado() {
		if (this.golesLocal == this.golesVisitante) {
			return "Empate";
		} else if (this.golesLocal > this.golesVisitante) {
			return "Local";
		}
		return "Visitante";
	}

	public int getNroPartido() {
		return nroPartido;
	}

}
