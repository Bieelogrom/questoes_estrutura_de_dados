package Controller;

public class ExercicioUmController {
    public ExercicioUmController(){
        super();
    }

    // Condição de parada: se nValores for <= 0 então retorna 0
    // Senão soma com nValores o resultado da função.
    // Por exemplo, se for 3 o valor de nValores, vai ter que voltar até retornaNaturais(0), já que
    public int retornaNaturais(int nValores){
        if(nValores <= 0){
            return 0;
        }else{
            return nValores += retornaNaturais(nValores - 1);
        }
    }


}
