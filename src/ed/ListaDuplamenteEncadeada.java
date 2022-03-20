package ed;

public class ListaDuplamenteEncadeada {

    private Cell primeira = null;
	private int totalDeElementos = 0;
    
    public Cell getPrimeira() {
		return primeira;
	}

	public void setPrimeira(Cell primeira) {
		this.primeira = primeira;
	}

    public void adicionaNoComeco(Object elemento) {
    	if(totalDeElementos==0) {
    		Cell nova = new Cell(elemento);
        	this.primeira = nova;
        	this.primeira.setProximo(nova);
        	this.primeira.setAnterior(nova);
    	}
    	else {
    		Cell nova = new Cell(elemento);
    		Cell ant = primeira.getAnterior();
    		Cell prox = primeira;
    		
            this.primeira = nova;
        	this.primeira.setProximo(prox);
        	this.primeira.setAnterior(ant);
    	}
        this.totalDeElementos++;
    }
    
    public void adicionaPorUltimo(Object elemento) {

        if(this.totalDeElementos == 0) {
            adicionaNoComeco(elemento);
        } else {
            Cell nova = new Cell(elemento);
            Cell ultimo = primeira.getAnterior();
            
            ultimo.setProximo(nova);
            nova.setAnterior(ultimo);
            primeira.setAnterior(nova);
            nova.setProximo(primeira);
            this.totalDeElementos++;
        }
    }
    
    @Override
    public String toString () {
        Cell atual = primeira;

        StringBuilder builder = new StringBuilder("[");

        for(int i = 0; i < totalDeElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(",");

            atual = atual.getProximo();
        }

        builder.append("]");

        return builder.toString();
    }
}
