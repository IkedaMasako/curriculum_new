// ※パッケージはなくても結構です
package instance;

public class InstanceOfSato {

//    追記
    /** 変数（フィールド変数） */
    private int id = 0;
    /** static 変数（クラス変数） */
    private static int staticVarId = 0;
    
    /**
     * IDをインクリメント
     */
    public void incrementId() {
        this.id++;
        System.out.println("id: var          = " + this.id);
        
        InstanceOfSato.staticVarId++;
        System.out.println("id: static var   = " + InstanceOfSato.staticVarId);
    }

}