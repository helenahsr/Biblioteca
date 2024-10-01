package Fabrica;

public class Revista extends ItemBiblioteca {
	private int edicao;

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	@Override
	public String toString() {
		return "Revista [edicao=" + edicao + "]";
	}
}
