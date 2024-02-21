package eldin_ring;

public class Personagem {

	private String nome;
	private String raca;
	private String classe;
	
	private int inteligencia;
	private int destreza;
	private int forca;
	private int vida;
	private int xp;
	private int stamina;
	
	//METHOD
	void atacar() {
		System.out.println("Atacando...");
		xp += 10;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public void setVida (int pVida) {
		this.vida = pVida;
	}
	
	
	//volta no nome do personagem
	public String getNome() {
		return this.nome.toUpperCase();
	} //pegar ou consultar
	
	
	//funcao nao retornar nada, apenas coloca dentro
	public void setNome(String pNome) {
		this.nome = pNome;
	} //colocar
	
	
	
	public int getXp() {
		return this.xp;
	} 
	
	public void setXp(int pXp) {
		this.xp = pXp;
	} 
	
	
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	//CONSTRUCTOR
	public Personagem(){
		this.vida = 100;
		
	}
	
	public Personagem(String pNome){
		this.vida = 100;
		this.nome = pNome;
	}
}
