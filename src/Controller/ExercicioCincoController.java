package Controller;

public class ExercicioCincoController {
    public ExercicioCincoController(){
        super();
    }

    public int calculaSomatoria(int n){
        if(n <= 1){
            return 1 / n;
        }else{
            return n += calculaSomatoria(n - 1);
        }
    }
}
