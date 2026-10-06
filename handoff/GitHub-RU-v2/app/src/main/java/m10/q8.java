package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class q8 {
    public static final p8 Companion;
    public static final aa.a0 s;
    public static final q8 t;
    public static final /* synthetic */ q8[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        q8 q8Var = new q8("APPLE", 0, "APPLE");
        q8 q8Var2 = new q8("GOOGLE", 1, "GOOGLE");
        q8 q8Var3 = new q8("MANAGED", 2, "MANAGED");
        q8 q8Var4 = new q8("UNKNOWN", 3, "UNKNOWN");
        q8 q8Var5 = new q8("WEB", 4, "WEB");
        q8 q8Var6 = new q8("UNKNOWN__", 5, "UNKNOWN__");
        t = q8Var6;
        q8[] q8VarArr = {q8Var, q8Var2, q8Var3, q8Var4, q8Var5, q8Var6};
        u = q8VarArr;
        v = v8.l0.t(q8VarArr);
        Companion = new p8();
        x61.l.r(new String[]{"APPLE", "GOOGLE", "MANAGED", "UNKNOWN", "WEB"});
        s = new aa.a0("CopilotSubscriptionPlatform");
    }

    public q8(String str, int i, String str2) {
        this.r = str2;
    }

    public static q8 valueOf(String str) {
        return (q8) Enum.valueOf(q8.class, str);
    }

    public static q8[] values() {
        return (q8[]) u.clone();
    }
}
