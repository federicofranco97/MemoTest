
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;


public class NewClass {
    
    public static void scheduleDelayTask1()
    {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        Runnable task1 = () -> System.out.println("hola");
        Runnable task2 = () -> System.out.println("mundo");
        service.schedule(task2, 5, TimeUnit.SECONDS);
        service.schedule(task1, 3, TimeUnit.SECONDS);
   
        
        //scheduleWithFixedDelay es aconsejable usarlo cuando no importa que se siga un patron de tiempo, distinto a scheduleFixedRate que se ejecuta cronologicamente siempre
    }
    
    public static void main(String[] args) {
       scheduleDelayTask1();
        
        
    }
   
}
