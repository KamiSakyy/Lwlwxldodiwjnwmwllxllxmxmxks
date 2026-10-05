package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class q0 {

    /* renamed from: r, reason: collision with root package name */
    public static final q0 f1756r;

    /* renamed from: s, reason: collision with root package name */
    public static final q0 f1757s;

    /* renamed from: t, reason: collision with root package name */
    public static final q0 f1758t;

    /* renamed from: u, reason: collision with root package name */
    public static final q0 f1759u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ q0[] f1760v;

    static {
        q0 q0Var = new q0("IGNORED", 0);
        f1756r = q0Var;
        q0 q0Var2 = new q0("SCHEDULED", 1);
        f1757s = q0Var2;
        q0 q0Var3 = new q0("DEFERRED", 2);
        f1758t = q0Var3;
        q0 q0Var4 = new q0("IMMINENT", 3);
        f1759u = q0Var4;
        q0[] q0VarArr = {q0Var, q0Var2, q0Var3, q0Var4};
        f1760v = q0VarArr;
        v8.l0.t(q0VarArr);
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) f1760v.clone();
    }
}
