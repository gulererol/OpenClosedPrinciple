public class Kare implements Hesapla{

    private int birinciKenar;

    public Kare(int birinciKenar) {
        this.birinciKenar=birinciKenar;
    }


    public int getBirinciKenar() {
        return birinciKenar;
    }

    public void setBirinciKenar(int birinciKenar) {
        this.birinciKenar = birinciKenar;
    }

    public void alanHesapla() {
        System.out.println();
    }


    @Override
    public void CevreHesapla() {
        System.out.println("Çevre:"+birinciKenar*4);

    }


    @Override
    public void AlanHesapla() {
        System.out.println("Alan:"+birinciKenar*birinciKenar);

    }



}