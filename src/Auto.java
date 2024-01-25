public class Auto {
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
