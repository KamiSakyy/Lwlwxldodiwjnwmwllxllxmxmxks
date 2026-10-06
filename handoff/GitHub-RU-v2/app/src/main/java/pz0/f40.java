package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class f40 {
    public static final /* synthetic */ d71.b A;
    public static final e40 Companion;
    public static final aa.a0 s;
    public static final f40 t;
    public static final f40 u;
    public static final f40 v;
    public static final f40 w;
    public static final f40 x;
    public static final f40 y;
    public static final /* synthetic */ f40[] z;
    public String r;

    static {
        f40 f40Var = new f40("CUSTOM", 0, "CUSTOM");
        t = f40Var;
        f40 f40Var2 = new f40("IGNORED", 1, "IGNORED");
        u = f40Var2;
        f40 f40Var3 = new f40("RELEASES_ONLY", 2, "RELEASES_ONLY");
        v = f40Var3;
        f40 f40Var4 = new f40("SUBSCRIBED", 3, "SUBSCRIBED");
        w = f40Var4;
        f40 f40Var5 = new f40("UNSUBSCRIBED", 4, "UNSUBSCRIBED");
        x = f40Var5;
        f40 f40Var6 = new f40("UNKNOWN__", 5, "UNKNOWN__");
        y = f40Var6;
        f40[] f40VarArr = {f40Var, f40Var2, f40Var3, f40Var4, f40Var5, f40Var6};
        z = f40VarArr;
        A = v8.l0.t(f40VarArr);
        Companion = new e40();
        x61.l.r(new String[]{"CUSTOM", "IGNORED", "RELEASES_ONLY", "SUBSCRIBED", "UNSUBSCRIBED"});
        s = new aa.a0("SubscriptionState");
    }

    public f40(String str, int i, String str2) {
        this.r = str2;
    }

    public static f40 valueOf(String str) {
        return (f40) Enum.valueOf(f40.class, str);
    }

    public static f40[] values() {
        return (f40[]) z.clone();
    }
    public Object ordinal() { return null; }
}
