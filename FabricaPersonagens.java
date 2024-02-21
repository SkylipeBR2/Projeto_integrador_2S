package eldin_ring;
import java.util.Scanner;

public class FabricaPersonagens {

	public static void main(String[] args) {
		Personagem p1 = new Personagem();
		Personagem p2 = new Personagem();
		Scanner input = new Scanner(System.in);
		
		p1.setVida(10);
		p1.setXp(100);
		p2.setVida(10);
		p2.setXp(100);
		
		
		System.out.println("Digite o nome do seu personagem: ");
		p1.setNome(input.next());

		
		System.out.println("P1 - " + p1.getNome());
		System.out.println("Seu personagem tem: "+ p1.getXp() + "XP");
		

		System.out.println("Digite o nome do seu personagem: ");
		p2.setNome(input.next());
		
		System.out.println("P1 - " + p2.getNome());
		System.out.println("Seu personagem tem: "+ p2.getXp() + "XP");
		
		p2.atacar();
		
		System.out.println("XP ganho - " + p2.getXp());
	}

}
