package OOPs.Inheritance.Inherit2;

public class Box {
     int l;
    int h;
    int wt;

    public Box() {
        this.l = -1;
        this.h = -1;
    }

    public Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.wt = old.wt;
    }



    public Box(int l, int h) {
//        super();
        this.l = l;
        this.h = h;
    }

    Box(int side){
        this.l = side;
        this.h = side;
    }


}

