package lista.br.edu.up.modelos;

public class HoraAula {
    private int nivel;
    private double valorHA;

    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    public int getNivel(){
        return nivel;
    }
    public void setValorHA(){
        
        if(this.nivel == 1){
            this.valorHA = 12;
        }else if(this.nivel == 2){
            this.valorHA = 17;
        }else{
            this.valorHA = 25;
        }
    }

    public double getValorHA() {
        return valorHA;
    }
}