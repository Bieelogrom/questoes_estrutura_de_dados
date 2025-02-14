package Controller;

public class ExercicioSeisController {
    public ExercicioSeisController(){
        super();
    }

    public int somarValores(int a, int b){
        if(b == 0){
            return b;
        }else {
            return a + somarValores(a, b-1);
        }
    }
}
