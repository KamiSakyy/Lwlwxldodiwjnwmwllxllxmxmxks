package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class gb0 {
    public static final fb0 Companion;
    public static final aa.a0 s;
    public static final gb0 t;
    public static final gb0 u;
    public static final /* synthetic */ gb0[] v;
    public static final /* synthetic */ d71.b w;
    public final String r;

    static {
        gb0 gb0Var = new gb0("EMAIL", 0, "EMAIL");
        t = gb0Var;
        gb0 gb0Var2 = new gb0("URL", 1, "URL");
        gb0 gb0Var3 = new gb0("UNKNOWN__", 2, "UNKNOWN__");
        u = gb0Var3;
        gb0[] gb0VarArr = {gb0Var, gb0Var2, gb0Var3};
        v = gb0VarArr;
        w = v8.l0.t(gb0VarArr);
        Companion = new fb0();
        x61.l.r(new String[]{"EMAIL", "URL"});
        s = new aa.a0("SupportLinkType");
    }

    public gb0(String str, int i, String str2) {
        this.r = str2;
    }

    public static gb0 valueOf(String str) {
        return (gb0) Enum.valueOf(gb0.class, str);
    }

    public static gb0[] values() {
        return (gb0[]) v.clone();
    }
}
