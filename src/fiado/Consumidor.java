package fiado;

public class Consumidor {
	private String nome;
	private int[] fiados;
	private int posicao = 0;

	public Consumidor(String nome) {
		this.nome = nome;
		this.fiados = new int[10];

	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getFiado() {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}

	public void registrarFiado(int valor) {
		this.fiados[posicao] = valor;
		posicao++;
	}
}
