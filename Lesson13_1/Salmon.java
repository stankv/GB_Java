package Lesson13_1;

public class Salmon {  //Лосось (корм для животных)
    //если приготовлен (true), то снимается 5 единиц голода у животных,
    //а если нет (false), то только 1
    private boolean isCooked;

    public Salmon(boolean isCooked) {
        this.isCooked = isCooked;
    }

    public boolean isCooked() {
        return isCooked;
    }

    public void setCooked(boolean isCooked) {
        this.isCooked = isCooked;
    }

    
}
