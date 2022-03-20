package ed;

public class TestaListaDuplamenteEncadiada {
	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

	    System.out.println(lista);
	    lista.adicionaNoComeco("Grazi");
	    System.out.println(lista);
	    lista.adicionaPorUltimo("Aline");
	    System.out.println(lista);
	    lista.adicionaPorUltimo("Ana");
	    System.out.println(lista);
	    lista.adicionaNoComeco("Elisa");
	    System.out.println(lista);
	}
}
