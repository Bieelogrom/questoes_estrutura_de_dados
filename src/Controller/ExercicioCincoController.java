package Controller;

public class ExercicioCincoController {
    public ExercicioCincoController(){
        super();
    }

    public double calculaSomatoria(double n){
        if(n == 1){
            return 1;
        }else{
            return 1 / n + calculaSomatoria(n - 1);
        }
    }
}
