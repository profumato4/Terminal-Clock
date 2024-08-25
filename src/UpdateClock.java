import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class UpdateClock {
    
    private String dataString;
    private GregorianCalendar g;
    private SimpleDateFormat s;
    

   
    public String updateClock(){

        g = new GregorianCalendar();
        s = new SimpleDateFormat("yyyy/MM/dd   hh:mm:ss.SSS");
        dataString = s.format(g.getTime());

        return dataString;

    }


    public void clear(){

        try {
     
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      
        } catch (InterruptedException | IOException e) {
            // TODO Auto-generated catch block
   
            e.printStackTrace();
   
        }
    
    }

    public UpdateClock(){
      // TODO document why this constructor is empty
    }
}