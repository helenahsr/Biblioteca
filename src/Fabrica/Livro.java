package Fabrica;

public class Livro extends ItemBiblioteca {
	private int numPaginas;

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	@Override
	public String toString() {
		return "Livro [numPaginas=" + numPaginas + "]";
	}
}
