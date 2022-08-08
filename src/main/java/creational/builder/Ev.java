package creational.builder;

public class Ev {

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


    public Ev() {
    }

    public Ev(String il, String ilce, String mahalle, int binaYili, int odaSayisi, int banyoSayisi, int tuvaletSayisi,
              int balkonSayisi, boolean isDublex, boolean isEsyali, boolean isOtopark, boolean hasCocukPArki,
              boolean hasKlima, boolean hasHavuz) {
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.binaYili = binaYili;
        this.odaSayisi = odaSayisi;
        this.banyoSayisi = banyoSayisi;
        this.tuvaletSayisi = tuvaletSayisi;
        this.balkonSayisi = balkonSayisi;
        this.isDublex = isDublex;
        this.isEsyali = isEsyali;
        this.isOtopark = isOtopark;
        this.hasCocukPArki = hasCocukPArki;
        this.hasKlima = hasKlima;
        this.hasHavuz = hasHavuz;
    }




    @Override
    public String toString() {
        return "Ev{" +
                "il='" + il + '\'' +
                ", ilce='" + ilce + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", binaYili=" + binaYili +
                ", odaSayisi=" + odaSayisi +
                ", banyoSayisi=" + banyoSayisi +
                ", tuvaletSayisi=" + tuvaletSayisi +
                ", balkonSayisi=" + balkonSayisi +
                ", isDublex=" + isDublex +
                ", isEsyali=" + isEsyali +
                ", isOtopark=" + isOtopark +
                ", hasCocukPArki=" + hasCocukPArki +
                ", hasKlima=" + hasKlima +
                ", hasHavuz=" + hasHavuz +
                '}';
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public int getBinaYili() {
        return binaYili;
    }

    public void setBinaYili(int binaYili) {
        this.binaYili = binaYili;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public int getTuvaletSayisi() {
        return tuvaletSayisi;
    }

    public void setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
    }

    public int getBalkonSayisi() {
        return balkonSayisi;
    }

    public void setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    public boolean isEsyali() {
        return isEsyali;
    }

    public void setEsyali(boolean esyali) {
        isEsyali = esyali;
    }

    public boolean isOtopark() {
        return isOtopark;
    }

    public void setOtopark(boolean otopark) {
        isOtopark = otopark;
    }

    public boolean isHasCocukPArki() {
        return hasCocukPArki;
    }

    public void setHasCocukPArki(boolean hasCocukPArki) {
        this.hasCocukPArki = hasCocukPArki;
    }

    public boolean isHasKlima() {
        return hasKlima;
    }

    public void setHasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
    }

    public boolean isHasHavuz() {
        return hasHavuz;
    }

    public void setHasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
    }
}
