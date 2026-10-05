package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class e2 {

    /* renamed from: r, reason: collision with root package name */
    public static final e2 f1607r;

    /* renamed from: s, reason: collision with root package name */
    public static final e2 f1608s;

    /* renamed from: t, reason: collision with root package name */
    public static final e2 f1609t;

    /* renamed from: u, reason: collision with root package name */
    public static final e2 f1610u;

    /* renamed from: v, reason: collision with root package name */
    public static final e2 f1611v;

    /* renamed from: w, reason: collision with root package name */
    public static final e2 f1612w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ e2[] f1613x;

    static {
        e2 e2Var = new e2("ShutDown", 0);
        f1607r = e2Var;
        e2 e2Var2 = new e2("ShuttingDown", 1);
        f1608s = e2Var2;
        e2 e2Var3 = new e2("Inactive", 2);
        f1609t = e2Var3;
        e2 e2Var4 = new e2("InactivePendingWork", 3);
        f1610u = e2Var4;
        e2 e2Var5 = new e2("Idle", 4);
        f1611v = e2Var5;
        e2 e2Var6 = new e2("PendingWork", 5);
        f1612w = e2Var6;
        e2[] e2VarArr = {e2Var, e2Var2, e2Var3, e2Var4, e2Var5, e2Var6};
        f1613x = e2VarArr;
        v8.l0.t(e2VarArr);
    }

    public static e2 valueOf(String str) {
        return (e2) Enum.valueOf(e2.class, str);
    }

    public static e2[] values() {
        return (e2[]) f1613x.clone();
    }
}
