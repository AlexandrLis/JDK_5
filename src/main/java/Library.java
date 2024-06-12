import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public class Library {

    List<Philosoph> list = new LinkedList<>();

    private boolean listFlag = true;

    public void addPhilosoph(Philosoph philosoph){
        list.add(philosoph);
    }

    public void tableStart(){
        for (int i = 0; i < 5; i++) {
            try{
                list.get(i).start();
                Thread.sleep(5000);
            }catch (Exception e){
                e.printStackTrace();
            }
//            if(listFlag){
//                listFlag = false;
//                try{
//                    list.get(i).start();
//                    listFlag = list.get(i).makesOfPhilosoph();
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//            }
        }
    }
}


