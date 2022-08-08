package creational.builder;

public class EvBuilder {

    private String il;
    private String ilce;
    private String mahalle;

    private int binaYili;
    private int odaSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;
    private int balkonSayisi;

    private boolean isDublex;
    private boolean isEsyali;
    private boolean isOtopark;
    private boolean hasCocukPArki;
    private boolean hasKlima;
    private boolean hasHavuz;

    public static EvBuilder startNormalEvBuilder(String il, String ilce, int binaYili, int odaSayisi){
        EvBuilder evBuilder = new EvBuilder();
        evBuilder.il = il;
        evBuilder.ilce = ilce;
        evBuilder.binaYili = binaYili;
        evBuilder.odaSayisi = odaSayisi;

        return evBuilder;
    }

    public static EvBuilder startHavuzluEvBuilder(String il, String ilce, int binaYili, int odaSayisi){
        EvBuilder evBuilder = new EvBuilder();
        evBuilder.il = il;
        evBuilder.ilce = ilce;
        evBuilder.binaYili = binaYili;
        evBuilder.odaSayisi = odaSayisi;
        evBuilder.hasHavuz = true;

        return evBuilder;
    }

    public Ev build(){
        Ev ev = new Ev();

        ev.setIl(il);
        ev.setIlce(ilce);
        ev.setMahalle(mahalle);

        ev.setBinaYili(binaYili);
        ev.setBalkonSayisi(balkonSayisi);
        ev.setOdaSayisi(odaSayisi);
        ev.setBanyoSayisi(banyoSayisi);
        ev.setTuvaletSayisi(tuvaletSayisi);

        ev.setDublex(isDublex);
        ev.setEsyali(isEsyali);
        ev.setOtopark(isOtopark);
        ev.setHasCocukPArki(hasCocukPArki);
        ev.setHasKlima(hasKlima);
        ev.setHasHavuz(hasHavuz);

        return ev;
    }

   /* public EvBuilder setIl(String il) {
        this.il = il;
        return this;
    }*/

  /*  public EvBuilder setIlce(String ilce) {
        this.ilce = ilce;
        return this;
    }*/

    public EvBuilder setMahalle(String mahalle) {
        this.mahalle = mahalle;
        return this;
    }

   /* public EvBuilder setBinaYili(int binaYili) {
        this.binaYili = binaYili;
        return this;
    }*/

 /*   public EvBuilder setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
        return this;
    }*/

    public EvBuilder setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return this;
    }

    public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
        return this;
    }

    public EvBuilder setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
        return this;
    }

    public EvBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public EvBuilder setEsyali(boolean esyali) {
        isEsyali = esyali;
        return this;
    }

    public EvBuilder setOtopark(boolean otopark) {
        isOtopark = otopark;
        return this;
    }

    public EvBuilder setHasCocukPArki(boolean hasCocukPArki) {
        this.hasCocukPArki = hasCocukPArki;
        return this;
    }

    public EvBuilder setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
        return this;
    }

    public EvBuilder setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
        return this;
    }
}
