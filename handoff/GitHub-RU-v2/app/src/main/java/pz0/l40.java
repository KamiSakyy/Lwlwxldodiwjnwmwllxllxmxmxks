package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class l40 {
    public static final k40 Companion;
    public static final aa.a0 s;
    public static final l40 t;
    public static final l40 u;
    public static final /* synthetic */ l40[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        l40 l40Var = new l40("EMAIL", 0, "EMAIL");
        t = l40Var;
        l40 l40Var2 = new l40("URL", 1, "URL");
        l40 l40Var3 = new l40("UNKNOWN__", 2, "UNKNOWN__");
        u = l40Var3;
        l40[] l40VarArr = {l40Var, l40Var2, l40Var3};
        v = l40VarArr;
        w = v8.l0.t(l40VarArr);
        Companion = new k40();
        x61.l.r(new String[]{"EMAIL", "URL"});
        s = new aa.a0("SupportLinkType");
    }

    public l40(String str, int i, String str2) {
        this.r = str2;
    }

    public static l40 valueOf(String str) {
        return (l40) Enum.valueOf(l40.class, str);
    }

    public static l40[] values() {
        return (l40[]) v.clone();
    }
}
