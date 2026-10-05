package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class b00 {
    public static final a00 Companion;
    public static final aa.a0 s;
    public static final b00 t;
    public static final b00 u;
    public static final b00 v;
    public static final /* synthetic */ b00[] w;
    public static final /* synthetic */ d71.b x;
    public final String r;

    static {
        b00 b00Var = new b00("CLOSED", 0, "CLOSED");
        t = b00Var;
        b00 b00Var2 = new b00("MERGED", 1, "MERGED");
        b00 b00Var3 = new b00("OPEN", 2, "OPEN");
        u = b00Var3;
        b00 b00Var4 = new b00("UNKNOWN__", 3, "UNKNOWN__");
        v = b00Var4;
        b00[] b00VarArr = {b00Var, b00Var2, b00Var3, b00Var4};
        w = b00VarArr;
        x = v8.l0.t(b00VarArr);
        Companion = new a00();
        x61.l.r(new String[]{"CLOSED", "MERGED", "OPEN"});
        s = new aa.a0("PullRequestState");
    }

    public b00(String str, int i, String str2) {
        this.r = str2;
    }

    public static b00 valueOf(String str) {
        return (b00) Enum.valueOf(b00.class, str);
    }

    public static b00[] values() {
        return (b00[]) w.clone();
    }
}
