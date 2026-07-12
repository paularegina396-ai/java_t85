package repository;

public interface ProdutoRepository {
	
	//CRUD
	public void criarProduto();
	public void listarTodosProdutos();
	public void consultarProdutoId();
	public void atualizarProduto();
	public void deletarProduto();

	

}
