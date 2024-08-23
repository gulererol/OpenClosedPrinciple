public class Daire implements Hesapla{

    private int r;
    private double pi;

    public Daire(int r,double pi) {

        this.pi=pi;
        this.r=r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public void CevreHesapla() {
        System.out.println("Çevre:"+2*pi*r);

    }

    @Override
    public void AlanHesapla() {
        System.out.println("Alan:"+pi*r*r);

    }



}