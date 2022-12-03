
class Trinity<T, T1, T2> implements Comparable<T>{
    T thirst; // объявляем объект типа T
    T1 second; // объявляем объект типа T1
    T2 third; // объявляем объект типа T2

    //передаем в конструктор параметр типа T
    public Trinity(T t, T1 t1, T2 t2) {
        super();
        this.thirst = t;
        this.second = t1;
        this.third = t2;
    }

    //получаем параметр типа T
    public T getThirst() {
        return thirst;
    }

    public T1 getSecond() {
        return second;
    }

    public T2 getThird() {
        return third;
    }
    @Override
    public int compareTo(T o) {
        return 0;
    }

    public void printT_S_TR(){
        System.out.println(this.thirst + " " + this.second + " " + this.third);
    }
    public void printT_TR_S(){
        System.out.println(this.thirst + " " + this.third + " " + this.second);
    }
    public void printS_T_TR(){
        System.out.println(this.second + " " + this.thirst + " " + this.third);
    }
    public void printS_TR_T(){
        System.out.println(this.second + " " + this.third + " " + this.thirst);
    }
    public void printTR_T_S(){
        System.out.println(this.third + " " + this.thirst + " " + this.second);
    }
    public void printTR_S_T(){
        System.out.println(this.third + " " + this.second + " " + this.thirst);
    }
}