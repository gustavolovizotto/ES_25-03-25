public class TstPes {
    public static void main(String[] args) {
        Pessoa p1; //declaração
        p1 = new Pessoa(); //instanciação
        p1.entDados(18, "Gustavo"); //chamada do método
        p1.impDados(); //chamada do método

        Pessoa p2 = new Pessoa(); //instanciação
        p2.entDados(19, "POAP"); //chamada do método
        p2.impDados(); //chamada do método

        /*     p1.cpf=20; //acesso ao atributo
        p1.nome="Gustavo"; //acesso ao atributo
        p2.cpf=21; //acesso ao atributo 
        p2.nome="POAP"; //acesso ao atributo        */

        p1.setCpf(52); //chamada do método
        p1.setNome("Paulinho"); //chamada do método
        p2.setCpf(69); //chamada do método
        p2.setNome("Polar"); //chamada do método

        System.out.println("P1: " + p1.getCpf()); //chamada do método
        System.out.println("P1: " + p1.getNome()); //chamada do método
        System.out.println("P2: " + p2.getCpf()); //chamada do método
        System.out.println("P2: " + p2.getNome()); //chamada do método


       /*  System.out.println("End. P1: " + p1); //acesso ao atributo
        System.out.println("End. P2: " + p2); //acesso ao atributo  */
        System.gc(); //chamada do garbage collector
    }//Fim do main
}
