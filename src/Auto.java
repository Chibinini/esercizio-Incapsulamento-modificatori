public class Auto {
    private String Targa;
    private String Modello;
    private String Cilindrata;
    private String Marca;

    //Costruttore
    public Auto (String Marca, String Targa, String Cilindrata, String Modello){
        this.Marca = Marca;
        this.Targa = Targa;
        this.Cilindrata = Cilindrata;
        this.Modello = Modello;
    }
    //Fine Costruttore

    //Metodi Getter
    public String getMarca(){ return Marca; }
    public String getModello(){ return Modello; }
    public String getCilindrata(){ return Cilindrata; }
    public String getTarga(){ return Targa; }
    //Fine metodi Getter


    @Override
    public String toString() {
        return "Auto{" +
                "Targa='" + Targa + '\'' +
                ", Modello='" + Modello + '\'' +
                ", Cilindrata='" + Cilindrata + '\'' +
                ", Marca='" + Marca + '\'' +
                '}';
    }

    //Metodi Setter
    public void setMarca(String marca){ this.Marca = marca; }
    public void setModello(String modello){ this.Modello = modello; }
    public void setCilindrata(String cilindrata){ this.Cilindrata = cilindrata; }
    public void setTarga(String targa){ this.Targa = targa; }
    //Fine metodi Setter
}
