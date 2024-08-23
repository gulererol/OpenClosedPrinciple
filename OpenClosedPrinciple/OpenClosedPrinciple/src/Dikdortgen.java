public class Dikdortgen implements Hesapla {

    private int kenar1;
    private int kenar2;

    public Dikdortgen(int kenar1,int kenar2) {
        this.kenar1=kenar1;
        this.kenar2=kenar2;
    }


    public int getKenar1() {
        return kenar1;
    }


    public void setKenar1(int kenar1) {
        this.kenar1 = kenar1;
    }


    public int getKenar2() {
        return kenar2;
    }


    public void setKenar2(int kenar2) {
        this.kenar2 = kenar2;
    }


    @Override
    public void CevreHesapla() {
        System.out.println("Çevre:"+(kenar1+kenar2)*2);

    }

    @Override
    public void AlanHesapla() {
        System.out.println("Alan:"+kenar1*kenar2);

    }

}