package animal;

//継承とインターフェイスの実装
public class Human extends Animal implements Thinkable {
    //追加フィールド
    private String syumi;

    //引数ありのコンストラクタ（スーパークラスからの呼び出し）
    public Human (String name, int nenrei, String syumi) {
        super(name, nenrei);
    this.syumi = syumi;

    }

    public String getSyumi() {
        return syumi;
    }

    public void setSyumi(String syumi) {
        this.syumi = syumi;
    }
    public void think() {
        System.out.println("私は" +this.syumi + "について考えています。");
}
    }
