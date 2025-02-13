package Controller;

public class ExercicioDoisController {
    public ExercicioDoisController(){
        super();
    }

    public int encontrarMenorValor(int[] vetor, int tam, int MenorValor){
        if(0 == tam){
            return MenorValor;
        }else{
            if(vetor[tam] < MenorValor){
                return encontrarMenorValor(vetor, tam - 1, vetor[tam]);
            }else{
                return encontrarMenorValor(vetor, tam - 1, MenorValor);
            }
        }
    }
}
