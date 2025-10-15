package atividadesPolimorfismo;

public class PrincipalAnimal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Thor", "M", "Lobo-cinzento");
		lobo.emitirSom();
		lobo.getNome();
		lobo.getSexo();
		lobo.getRaca();
		
		Leao leao = new Leao("Nolan","F", "Lobo-asiático");
		leao.emitirSom();
		leao.getNome();
		leao.getSexo();
		leao.getRaca();
		
		Tigre tigre = new Tigre("Alex", "M", "Qualquer");
		tigre.emitirSom();
		tigre.emitirSom();
		tigre.getNome();
		tigre.getSexo();
		tigre.getRaca();
		
		Cachorro cachorro = new Cachorro("Thor", "M", "Qualquer");
		cachorro.emitirSom();
		
		Gato gato = new Gato("Thor", "M", "Qualquer");
		leao.emitirSom();
	}

}
