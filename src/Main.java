public class Main {

    public static void main(String[] args) {
        Auto nuovaMacchina = new Auto("BMW", "66699922AB", "1600", "Coupè");
        System.out.println(nuovaMacchina.getModello());

        nuovaMacchina.setModello("SUV");

        System.out.println(nuovaMacchina.getModello());

        System.out.println(nuovaMacchina);
    }


//    Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
//    Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
//    Nel main dichiarare un oggetto di tipo Auto.
//    In questo caso la nota importante è rendere le proprietà della classe auto accessibili solo attraverso i metodi.

}