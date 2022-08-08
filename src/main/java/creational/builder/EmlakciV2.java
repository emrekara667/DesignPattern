package creational.builder;



public class EmlakciV2 {
    public static void main(String[] args) {

        Ev build = EvBuilder.startNormalEvBuilder("İstan", "sancak", 2,1)
               /* .setOdaSayisi(23)
                .setIl("Istanbul")
                .setIlce("sabcaktepe")
                .setBinaYili(3)*/
                        .setBalkonSayisi(3)
                                .setDublex(true).build();

        Emlakci.printEv(build);

        Ev havuzluEv = EvBuilder.startHavuzluEvBuilder("istan", "umra", 3, 4)
                .build();
        Emlakci.printEv(havuzluEv);


    }
}
