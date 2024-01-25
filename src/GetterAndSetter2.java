public class GetterAndSetter2 {
    public static void main(String[] args) {
        Auto auto1 = new Auto(1598, "PS750PR", "Peugeot", "207");

        System.out.println("Cilindrata: " + auto1.getCilindrata() + " cc");
        System.out.println("Targa: " + auto1.getTarga());
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modello: " + auto1.getModello());

        // Update infos
        auto1.setCilindrata(1800);
        auto1.setTarga("XY987ZW");
        auto1.setMarca("Toyota");
        auto1.setModello("Corolla");

        // Print new infos
        System.out.println("Nuove informazioni:");
        System.out.println("Cilindrata: " + auto1.getCilindrata() + " cc");
        System.out.println("Targa: " + auto1.getTarga());
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Modello: " + auto1.getModello());
    }
}
