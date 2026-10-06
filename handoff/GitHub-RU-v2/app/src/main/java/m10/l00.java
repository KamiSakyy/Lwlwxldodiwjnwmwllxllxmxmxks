package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class l00 {
    public static final k00 Companion;
    public static final l00 s;
    public static final l00 t;
    public static final l00 u;
    public static final /* synthetic */ l00[] v;
    public static final /* synthetic */ d71.b w;
    public final String r;

    static {
        l00 l00Var = new l00("CLOSED", 0, "CLOSED");
        s = l00Var;
        l00 l00Var2 = new l00("OPEN", 1, "OPEN");
        t = l00Var2;
        l00 l00Var3 = new l00("UNKNOWN__", 2, "UNKNOWN__");
        u = l00Var3;
        l00[] l00VarArr = {l00Var, l00Var2, l00Var3};
        v = l00VarArr;
        w = v8.l0.t(l00VarArr);
        Companion = new k00();
        sy.d0.o("CLOSED", "OPEN");
    }

    public l00(String str, int i, String str2) {
        this.r = str2;
    }

    public static l00 valueOf(String str) {
        return (l00) Enum.valueOf(l00.class, str);
    }

    public static l00[] values() {
        return (l00[]) v.clone();
    }
}
