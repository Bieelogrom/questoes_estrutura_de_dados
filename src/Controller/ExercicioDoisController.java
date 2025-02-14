package Controller;

public class ExercicioDoisController {
    public ExercicioDoisController(){
        super();
    }

    /*
    A condição de parada ocorre quando tam for igual a zero.
Se essa condição for verdadeira, a função retorna o valor de MenorValor.

Nos passos seguintes, a função verifica se o valor do índice atual do vetor é menor que MenorValor.

Se for, a função é chamada novamente, passando o vetor, tam - 1 (para percorrer o restante do array) e o novo menor valor encontrado.
Caso contrário, a função continua a recursão mantendo MenorValor inalterado.
     */

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
