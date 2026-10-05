package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class bf {
    public static final af Companion;
    public static final aa.a0 s;
    public static final bf t;
    public static final bf u;
    public static final bf v;
    public static final /* synthetic */ bf[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        bf bfVar = new bf("CLOSED", 0, "CLOSED");
        t = bfVar;
        bf bfVar2 = new bf("OPEN", 1, "OPEN");
        u = bfVar2;
        bf bfVar3 = new bf("UNKNOWN__", 2, "UNKNOWN__");
        v = bfVar3;
        bf[] bfVarArr = {bfVar, bfVar2, bfVar3};
        w = bfVarArr;
        x = v8.l0.t(bfVarArr);
        Companion = new af();
        x61.l.r(new String[]{"CLOSED", "OPEN"});
        s = new aa.a0("IssueState");
    }

    public bf(String str, int i, String str2) {
        this.r = str2;
    }

    public static bf valueOf(String str) {
        return (bf) Enum.valueOf(bf.class, str);
    }

    public static bf[] values() {
        return (bf[]) w.clone();
    }
}
