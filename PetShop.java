abstract interface Animal {
    public abstract void emitirSom();
}
abstract class Cao implements Animal {
    public void emitirSom() { System.out.println("AuAuAu"); }
    public abstract String obterTipoPelo();
}
abstract class Gato implements Animal {
    public void emitirSom(){ System.out.println("MiauMiauMiau"); }
    public abstract int obterDocilidade();
}
class Poodle extends Cao {
    public String obterTipoPelo() { return "Cacheado"; }
}
class Siames extends Gato {
    public int obterDocilidade() { return 10; }
}
class Pastor extends Cao {
    public String obterTipoPelo() { return "Liso"; }
}
public class PetShop {
    public static void main(String [] painho){
        Poodle algodao = new Poodle();
        Gato isis = new Siames();
        isis.emitirSom();
        System.out.println("Docilidade: " + isis.obterDocilidade());
        Animal osiris = new Siames();
        osiris.emitirSom();        
        
   }
}