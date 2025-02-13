package Controller;

public class ExercicioTresController {
    public ExercicioTresController(){
        super();
    }

    public int calculaFatorial(int valFatorial){
        if(valFatorial <= 0){
            return 1;
        }else{
            return valFatorial *= calculaFatorial(valFatorial - 1);
        }
    }
}
