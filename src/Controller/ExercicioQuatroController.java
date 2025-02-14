package Controller;

public class ExercicioQuatroController {
    public ExercicioQuatroController(){
        super();
    }

    public int calculaNegativos(int[] veto, int posicoes){
        if (0 == posicoes){
            return 1;
        }else{
            if(veto[posicoes] < 0){
                return 1 + calculaNegativos(veto, posicoes - 1);
            }else{
                return calculaNegativos(veto, posicoes - 1);
            }
        }

    }
}
