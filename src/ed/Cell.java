package ed;

public class Cell {
	
	private Object elemento;
	private Cell anterior;
	private Cell proximo;

	public Cell (Object elemento, Cell anterior, Cell prox) {
		this.elemento = elemento;
		this.anterior = anterior;
		this.proximo = prox;
	}
	
	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Cell getAnterior() {
		return anterior;
	}

	public void setAnterior(Cell anterior) {
		this.anterior = anterior;
	}

	public Cell getProximo() {
		return proximo;
	}

	public void setProximo(Cell proximo) {
		this.proximo = proximo;
	}

}
