
public class TstPes2 {
    public static void main(String[] args) {
        ContaSteam c1; //declaração
        c1 = new ContaSteam(); //instanciação

        c1.setAcount("Gustavo"); //chamada do método
        c1.setSenha("123456"); //chamada do método
        c1.setEmail("glovizotto@gmail.com");
        c1.getAcount(); //chamada do método
        c1.getSenha(); //chamada do método
        c1.getEmail(); //chamada do método

        c1.exibirDados(); //chamada do método
        System.gc(); //chamada do garbage collector
    }
    
}
