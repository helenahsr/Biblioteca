package Principal;
import Fabrica.Livro;
import Fabrica.Revista;
import javax.swing.JOptionPane;
import java.util.*;

public class Principal {
	private static List<Livro> livros = new ArrayList<>();
    private static List<Revista> revistas = new ArrayList<>();
    
	public static void main(String[] args) {
		System.out.println("Sucedido.");
		menu();
	}
	
	public static void menu() {
	    int opcao = 0;
		do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Livro\n" +
                    "2 - Revista\n" +
                    "0 - Sair"
            ));

            switch (opcao) {
                case 1:
                    menuLivro();
                    break;
                case 2:
                    menuRevista();
                    break;
            }
        } while (opcao != 0);
	}
	
	public static void menuLivro() {
		int opcao = 0;
		do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Cadastrar Livro\n" +
                    "2 - Deletar Livro\n" +
                    "3 - Buscar Livro\n" +
                    "4 - Listar todos os livros\n" +
                    "5 - Atualizar Livro\n" +
                    "0 - Sair"
            ));

            switch (opcao) {
                case 1:
                	Livro livro = new Livro();
                	livro.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do livro:")));
                	livro.setTitulo(JOptionPane.showInputDialog(null, "Digite o titulo da obra:"));
                	livro.setAutor(JOptionPane.showInputDialog(null, "Digite o autor da obra:"));
                	livro.setNumPaginas(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de páginas da obra:")));
                	
                	livros.add(livro);
                	JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
                    break;
                case 2:
                	String item = "";
            		String lista = "";
            		int index = 0;
            		if(livros != null)	
            		{
            			item = JOptionPane.showInputDialog ("Digite o nome do livro que deseja remover:");
            			for (Livro l : livros) {
            				if(l.getTitulo().contains(item)) {
            					livros.remove(index);
            					JOptionPane.showMessageDialog(null, "Livro removido!");
            					break;
            				}
            				index++;
            			}
            			
            		}
            		else {
            			JOptionPane.showMessageDialog(null, "Não há livros cadastrados!");
            		}
                    break;
                case 3:
                	String itemBusca = "", busca = "";
    				int contagem = 0;
    				try {
    					busca = JOptionPane.showInputDialog ("Digite o nome do livro que deseja procurar: ");
    				}
    				catch(Exception e)
    				{
    					JOptionPane.showMessageDialog(null, "Insira um nome válido!");
    					break;
    				}
    				
    				for (Livro l : livros) {
    					if(l.getTitulo().contains(busca))
    					{
    						itemBusca = "ID: " + l.getId()  + " | Título: " + l.getTitulo() + " | Autor: " + l.getAutor() + " | Número de páginas: " + l.getNumPaginas() + "\n";
    					}
    					contagem++;
    				}
    				
    				if(itemBusca != "")
    				{
    					JOptionPane.showMessageDialog(null, "Exibindo livro da busca\n" + itemBusca);
    				}
    				else
    				{
    					JOptionPane.showMessageDialog(null, "Livro não encontrado!");
    				}
                    break;
                case 4:
                	String lista1 = "";
    				for (Livro l : livros) {
    					lista1 += "ID: " + l.getId()  + " | Título: " + l.getTitulo() + " | Autor: " + l.getAutor() + " | Número de páginas: " + l.getNumPaginas() + "\n";
    				}
    				if(lista1 != "") {
    					JOptionPane.showMessageDialog(null, "Exibindo lista de livros:\n" + lista1);
    				}
    				else {
    					JOptionPane.showMessageDialog(null, "Não há livros cadastrados!");
    				}
                    break;
                case 5:
                	int id = 0;
                	id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID do livro que deseja alterar:"));
                	for (Livro l : livros)
                	{
                		if (l.getId() == id)
                		{
                			JOptionPane.showMessageDialog(null, "Item encontrado!\n" + "ID: " + l.getId()  + " | Titulo da obra: " + l.getTitulo() + " | Autor: " + l.getAutor() + " | Número de páginas: " + l.getNumPaginas() + "\n");
                			l.setId(Integer.parseInt(JOptionPane.showInputDialog("Deseja alterar o ID?", l.getId())));
                			l.setTitulo(JOptionPane.showInputDialog("Deseja alterar o título?:", l.getTitulo()));
                			l.setAutor(JOptionPane.showInputDialog("Deseja alterar o autor?", l.getAutor()));
                			l.setNumPaginas(Integer.parseInt(JOptionPane.showInputDialog("Deseja alterar o número de páginas?", l.getNumPaginas())));
                			JOptionPane.showMessageDialog(null, "Livro alterado com sucesso!");
                			break;                			
                		}
                	}
                	break;
            }
        } while (opcao != 0);
	}
	public static void menuRevista() {
		int opcao = 0;
		do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Cadastrar Revista\n" +
                    "2 - Deletar Revista\n" +
                    "3 - Buscar Revista\n" +
                    "4 - Listar todos as revsitas\n" +
                    "5 - Atualizar revista\n" +
                    "0 - Sair"
            ));

            switch (opcao) {
                case 1:
                	Revista revista = new Revista();
                	revista.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID da revista:")));
                	revista.setTitulo(JOptionPane.showInputDialog(null, "Digite o titulo da revista:"));
                	revista.setAutor(JOptionPane.showInputDialog(null, "Digite o autor da revista:"));
                	revista.setEdicao(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número da edição da revista:")));
                	revistas.add(revista);
                	JOptionPane.showMessageDialog(null, "Revista cadastrada com sucesso!");
                    break;
                case 2:
            		String item = "";
            		String lista = "";
            		int index = 0;
            		if(revistas != null)	
            		{
            			item = JOptionPane.showInputDialog ("Digite o nome da revista que deseja remover:");
            			for (Revista r : revistas) {
            				if(r.getTitulo().contains(item)) {
            					revistas.remove(index);
            					JOptionPane.showMessageDialog(null, "Revista removida!");
            					break;
            				}
            				index++;
            			}
            			
            		}
            		else {
            			JOptionPane.showMessageDialog(null, "Não há revistas cadastradas!");
            		}
                    break;
                case 3:
                	String itemBusca = "", busca = "";
    				int contagem = 0;
    				try {
    					busca = JOptionPane.showInputDialog ("Digite o nome da revista que deseja procurar: ");
    				}
    				catch(Exception e)
    				{
    					JOptionPane.showMessageDialog(null, "Insira um nome válido!");
    					break;
    				}
    				
    				for (Revista r : revistas) {
    					if(r.getTitulo().contains(busca))
    					{
    						itemBusca = "ID: " + r.getId()  + " | Título: " + r.getTitulo() + " | Autor: " + r.getAutor() + " | Edição: " + r.getEdicao() + "\n";
    					}
    					contagem++;
    				}
    				
    				if(itemBusca != "")
    				{
    					JOptionPane.showMessageDialog(null, "Exibindo revista da busca\n" + itemBusca);
    				}
    				else
    				{
    					JOptionPane.showMessageDialog(null, "Revista não encontrada!");
    				}
                    break;
                case 4:
    				String lista1 = "";
    				for (Revista r : revistas) {
    					lista1 += "ID: " + r.getId()  + " | Titulo da obra: " + r.getTitulo() + " | Autor: " + r.getAutor() + " | Edição: " + r.getEdicao() + "\n";
    				}
    				if(lista1 != "") {
    					JOptionPane.showMessageDialog(null, "Exibindo lista de revistas:\n" + lista1);
    				}
    				else {
    					JOptionPane.showMessageDialog(null, "Não há revistas cadastradas!");
    				}
                    break;
                case 5:
                	int id = 0;
                	id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ID da revista que deseja alterar:"));
                	for (Revista r : revistas)
                	{
                		if (r.getId() == id)
                		{
                			JOptionPane.showMessageDialog(null, "Item encontrado!\n" + "ID: " + r.getId()  + " | Titulo da obra: " + r.getTitulo() + " | Autor: " + r.getAutor() + " | Edição: " + r.getEdicao() + "\n");
                			r.setId(Integer.parseInt(JOptionPane.showInputDialog("Deseja alterar o ID?", r.getId())));
                			r.setTitulo(JOptionPane.showInputDialog("Deseja alterar o título?:", r.getTitulo()));
                			r.setAutor(JOptionPane.showInputDialog("Deseja alterar o autor?", r.getAutor()));
                			r.setEdicao(Integer.parseInt(JOptionPane.showInputDialog("Deseja alterar a edição?", r.getEdicao())));
                			JOptionPane.showMessageDialog(null, "Revista alterada com sucesso!");
                			break;
                			
                		}
                	}                	
                	break;
            }
        } while (opcao != 0);
	}
}
