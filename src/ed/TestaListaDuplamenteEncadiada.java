package ed;

public class TestaListaDuplamenteEncadiada {
	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

	    System.out.println(lista);
	    lista.adicionaNoComeco("arroz");
	    System.out.println(lista);
	    lista.adicionaPorUltimo("salame");
	    System.out.println(lista);
	    lista.adicionaPorUltimo("suco");
	    System.out.println(lista);
	    lista.adicionaNoComeco("mostarda");
	    System.out.println(lista);
	}
}
