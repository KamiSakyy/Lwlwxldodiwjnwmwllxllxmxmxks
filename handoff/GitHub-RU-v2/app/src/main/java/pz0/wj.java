package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class wj {
    public static final vj Companion;
    public static final wj s;
    public static final wj t;
    public static final /* synthetic */ wj[] u;
    public final String r;

    static {
        wj wjVar = new wj("AUTH", 0, "AUTH");
        s = wjVar;
        wj wjVar2 = new wj("RECOVERY", 1, "RECOVERY");
        t = wjVar2;
        wj[] wjVarArr = {wjVar, wjVar2, new wj("UNKNOWN__", 2, "UNKNOWN__")};
        u = wjVarArr;
        v8.l0.t(wjVarArr);
        Companion = new vj();
        sy.d0.o(new String[]{"AUTH", "RECOVERY"});
    }

    public wj(String str, int i, String str2) {
        this.r = str2;
    }

    public static wj valueOf(String str) {
        return (wj) Enum.valueOf(wj.class, str);
    }

    public static wj[] values() {
        return (wj[]) u.clone();
    }
}
