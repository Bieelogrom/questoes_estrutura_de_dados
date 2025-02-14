package Controller;

public class ExercicioSeisController {
    public ExercicioSeisController(){
        super();
    }

    public int somarValores(int a, int b){
        if(b == 0){
            return a;
        }else {
            return somarValores(a+1, b-1);
        }
    }
}
