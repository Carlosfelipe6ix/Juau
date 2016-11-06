
public class Livro implements Publicacao {
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public void detalhes(){
		System.out.println("T�tulo: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de Paginas: " + this.getPagAtual());
		System.out.println("P�gina Atual: " + this.getPagAtual());
		System.out.println("Est� aberto? " + this.getAberto());
		System.out.println("Pessoa lendo: " + this.getLeitor().getNome());
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
		//super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = pagAtual;
		this.aberto = aberto;
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		
		
	}

	@Override
	public void fechar() {
		
		
	}

	@Override
	public void folhear(int p) {
		this.setPagAtual(p);
		
	}

	@Override
	public void avan�arPag() {
		this.setPagAtual(this.getPagAtual() + 1);
	
		
	}

	@Override
	public void voltarpag() {
		this.setPagAtual(getPagAtual() - 1);
	}
	
	
	
}
