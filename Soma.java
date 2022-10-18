public class Soma implements Calcular{
    private float n1,n2=0;
    public Soma(float n1, float n2){
        this.n1=n1;
        this.n2=n2;

    }
    

    @Override
    public float calcular() {
        
        return this.n1+this.n2;
    }
}