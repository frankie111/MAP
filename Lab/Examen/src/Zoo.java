import java.util.List;

public class Zoo {
    List<Vogel> vogelList;

    public Zoo(List<Vogel> vogelList) {
        this.vogelList = vogelList;
    }

    public void changeAge(FunInterface function){
        function.method(vogelList);
    }
}
