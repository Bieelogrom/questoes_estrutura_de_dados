package Controller;

public class ExercicioUmController {
    public ExercicioUmController(){
        super();
    }

    /*
    A condição de parada ocorre quando nValores é menor ou igual a zero.
    Quando isso acontece, a função retorna 0, interrompendo a recursão.
    Caso contrário, a função realiza uma chamada recursiva,
    somando o valor atual de nValores ao resultado da chamada da função com
    nValores - 1.
     */
    public int retornaNaturais(int nValores){
        if(nValores <= 0){
            return 0;
        }else{
            return nValores += retornaNaturais(nValores - 1);
        }
    }


}
