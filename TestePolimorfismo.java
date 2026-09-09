public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal();
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();
        
        meuAnimal.fazerSom();
        meuCachorro.fazerSom();
        meuGato.fazerSom();
        
        System.out.println("\n--- Demonstração de Polimorfismo ---");
        
        Animal[] animais = {new Cachorro(), new Gato(), new Cachorro(), new Gato()};
        
        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }
}
