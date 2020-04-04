package practice;

import java.io.Serializable;
import java.util.Date;

public class FortuneBean implements Serializable{

    //フィールド
    private Date today;
    private String fortune;

    //引数なしコンストラクタ
    public FortuneBean() {};

    //getterとsetter
    public Date getToday() {
        return this.today;
    }
    public void setToday(Date today) {
        this.today = today;
    }

    public String getFortune() {
        return this.fortune;
    }
    public void setFortune(String fortune) {
        this.fortune = fortune;
    }
}
