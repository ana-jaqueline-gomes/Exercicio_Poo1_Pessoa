package treino;

public class App {

	public static void main(String[] args) {	
		Pessoa []pess=new Pessoa[3];
		
		
		for(int i=0;i<pess.length;i++) {
			pess[i]=new Pessoa();	
		}
		
		pess[0].setNome("Ana jaqueline");
		pess[0].setAltura(1.62);
		pess[0].setIdade(18);
		
		pess[1].setNome("Cauan ");
		pess[1].setAltura(1.78);
		pess[1].setIdade(20);
		
		pess[2].setNome("Matheus");
		pess[2].setAltura(1.70);
		pess[2].setIdade(15);
		
		
		for(int i=0;i<pess.length;i++) {
			System.out.println("\n****************************************\n");	
			System.out.println("Informações da cliente "+pess[i].getNome()+":");
			System.out.println("Altura: "+ pess[i].getAltura()+" ,Idade: "+pess[i].getIdade());
		}
	}
}
