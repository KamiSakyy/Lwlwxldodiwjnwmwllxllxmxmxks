package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class cj {
    public static final bj Companion;
    public static final aa.a0 s;
    public static final cj t;
    public static final /* synthetic */ cj[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        cj cjVar = new cj("CLOSED", 0, "CLOSED");
        cj cjVar2 = new cj("OPEN", 1, "OPEN");
        cj cjVar3 = new cj("UNKNOWN__", 2, "UNKNOWN__");
        t = cjVar3;
        cj[] cjVarArr = {cjVar, cjVar2, cjVar3};
        u = cjVarArr;
        v = v8.l0.t(cjVarArr);
        Companion = new bj();
        x61.l.r(new String[]{"CLOSED", "OPEN"});
        s = new aa.a0("MilestoneState");
    }

    public cj(String str, int i, String str2) {
        this.r = str2;
    }

    public static cj valueOf(String str) {
        return (cj) Enum.valueOf(cj.class, str);
    }

    public static cj[] values() {
        return (cj[]) u.clone();
    }
}
