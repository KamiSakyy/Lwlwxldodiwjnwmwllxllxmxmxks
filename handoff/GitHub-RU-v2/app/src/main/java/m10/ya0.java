package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class ya0 {
    public static final /* synthetic */ d71.b A;
    public static final xa0 Companion;
    public static final aa.a0 s;
    public static final ya0 t;
    public static final ya0 u;
    public static final ya0 v;
    public static final ya0 w;
    public static final ya0 x;
    public static final ya0 y;
    public static final /* synthetic */ ya0[] z;
    public final String r;

    static {
        ya0 ya0Var = new ya0("CUSTOM", 0, "CUSTOM");
        t = ya0Var;
        ya0 ya0Var2 = new ya0("IGNORED", 1, "IGNORED");
        u = ya0Var2;
        ya0 ya0Var3 = new ya0("RELEASES_ONLY", 2, "RELEASES_ONLY");
        v = ya0Var3;
        ya0 ya0Var4 = new ya0("SUBSCRIBED", 3, "SUBSCRIBED");
        w = ya0Var4;
        ya0 ya0Var5 = new ya0("UNSUBSCRIBED", 4, "UNSUBSCRIBED");
        x = ya0Var5;
        ya0 ya0Var6 = new ya0("UNKNOWN__", 5, "UNKNOWN__");
        y = ya0Var6;
        ya0[] ya0VarArr = {ya0Var, ya0Var2, ya0Var3, ya0Var4, ya0Var5, ya0Var6};
        z = ya0VarArr;
        A = v8.l0.t(ya0VarArr);
        Companion = new xa0();
        x61.l.r(new String[]{"CUSTOM", "IGNORED", "RELEASES_ONLY", "SUBSCRIBED", "UNSUBSCRIBED"});
        s = new aa.a0("SubscriptionState");
    }

    public ya0(String str, int i, String str2) {
        this.r = str2;
    }

    public static ya0 valueOf(String str) {
        return (ya0) Enum.valueOf(ya0.class, str);
    }

    public static ya0[] values() {
        return (ya0[]) z.clone();
    }
}
