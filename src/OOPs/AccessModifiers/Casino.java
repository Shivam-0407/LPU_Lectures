package OOPs.AccessModifiers;

public class Casino {

    protected int sp_no;

    public void setSp_no(int sp_no) {
        this.sp_no = sp_no;
    }

    public int getSp_no() {
        return sp_no;
    }

    public Casino(int sp_no) {
        this.sp_no = sp_no;
    }

    public int algo(){
        return (int) (Math.random()*sp_no);
    }
}
