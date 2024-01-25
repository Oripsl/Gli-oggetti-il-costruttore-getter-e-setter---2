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

class Auto {
    private int cilindrata;

    private String targa;

    private String marca;

    private String modello;

    public Auto(int cilindrata,String targa, String marca, String modello) {
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }

    // Getter setter cilindrata
    public int getCilindrata() {
        return cilindrata;
    }
    public void setCilindrata(int cilindrata){
        this.cilindrata = cilindrata;
    }

    // Getter setter targa
    public String getTarga() {
        return targa;
    }
    public void setTarga(String targa) {
        this.targa = targa;
    }

    // Getter setter marca
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter setter modello
    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
}