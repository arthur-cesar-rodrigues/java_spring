package ultraEmojiCombat;

public class Main {
    public static void main(String[] args) {
        //criando um array "l" de objetos da classe lutador
        // e informando que o array vai possuir 6 objetos("itens")
        Lutador[] l = new Lutador[6];

        //instanciando o valor de cada objeto do array l (de 0 a 5, total= 6 objetos)
        l[0] = new Lutador("Pretty Boy", "França",
                31, 1.75f, 68.9f, 11, 2, 1);

        l[1] = new Lutador("Putscript", "Brasil",
                29, 1.68f, 57.8f, 14, 2, 3);

        l[2] = new Lutador("Snapshadow", "EUA",
                35, 1.65f, 80.9f, 12, 2, 1);

        l[3] = new Lutador("Dead Code", "Austrália",
                28, 1.93f, 81.6f, 13, 0, 2);

        l[4] = new Lutador("UFOCobol", "Brasil",
                37, 1.70f, 119.3f, 5, 4, 3);

        l[5] = new Lutador("Nerdaart", "EUA",
                30, 1.81f, 105.7f, 12, 2, 4);

        Luta UEC01 = new Luta();
//        UEC01.marcarLuta(l[0], l[1]);
//        UEC01.lutar();
//        System.out.println(l[0].status());
//        System.out.println(l[1].status());
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();



    }
}