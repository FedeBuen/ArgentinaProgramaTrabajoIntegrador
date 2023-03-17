package tpfinal;

public class Pronostico {

	private int nroPartido;
	private String nombre;
	private String resultado;

	public int getNroPartido() {
		return nroPartido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getResultado() {
		return resultado;
	}

	public Pronostico(int nroPartido, String nombre, String resultado) {
		super();
		this.nroPartido = nroPartido;
		this.nombre = nombre;
		this.resultado = resultado;
	}

}
