package animal;

public class Animal {
    //フィールド
    private String name; //名前
    private int nenrei; //年齢

    //引数ありのコンストラクタ
    public  Animal(String name, int nenrei) {
        this.name = name;
        this.nenrei = nenrei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNenrei() {
        return nenrei;
    }

    public void setNenrei(int nenrei) {
        this.nenrei = nenrei;
    }

    public void say() {
    System.out.println(this.name + "です。" + this.nenrei + "歳です。");//名前年齢表示
    }
}

