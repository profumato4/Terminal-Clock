public class App {
    public static void main(String[] args) throws Exception {
        UpdateClock a = new UpdateClock();

        a.clear();

        while(true){

            System.out.println("\033[0;36m" + a.updateClock());
           
            try {
                
                Thread.sleep(1000);;
                a.clear();
            } catch (Exception e) {
           
                Thread.currentThread().interrupt();
           
            }

            
        }

    }
}