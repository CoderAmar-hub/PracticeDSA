import java.util.Arrays;

public class App {
    private App instance;

    private App(){

    }

    public App getApp(){
        if(instance == null)
            this.instance = new App();
        else
            return
    }
}
