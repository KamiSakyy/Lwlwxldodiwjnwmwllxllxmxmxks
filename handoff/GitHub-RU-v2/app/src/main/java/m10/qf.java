package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class qf {
    public static final pf Companion;
    public static final aa.a0 s;
    public static final qf t;
    public static final qf u;
    public static final qf v;
    public static final /* synthetic */ qf[] w;
    public static final /* synthetic */ d71.b x;
    public String r;

    static {
        qf qfVar = new qf("DISMISSED", 0, "DISMISSED");
        qf qfVar2 = new qf("UNVIEWED", 1, "UNVIEWED");
        t = qfVar2;
        qf qfVar3 = new qf("VIEWED", 2, "VIEWED");
        u = qfVar3;
        qf qfVar4 = new qf("UNKNOWN__", 3, "UNKNOWN__");
        v = qfVar4;
        qf[] qfVarArr = {qfVar, qfVar2, qfVar3, qfVar4};
        w = qfVarArr;
        x = v8.l0.t(qfVarArr);
        Companion = new pf();
        x61.l.r(new String[]{"DISMISSED", "UNVIEWED", "VIEWED"});
        s = new aa.a0("FileViewedState");
    }

    public qf(String str, int i, String str2) {
        this.r = str2;
    }

    public static qf valueOf(String str) {
        return (qf) Enum.valueOf(qf.class, str);
    }

    public static qf[] values() {
        return (qf[]) w.clone();
    }
    public Object ordinal() { return null; }
}
