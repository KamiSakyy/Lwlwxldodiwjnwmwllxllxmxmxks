package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class c0 {

    /* renamed from: r, reason: collision with root package name */
    public static final c0 f24919r;

    /* renamed from: s, reason: collision with root package name */
    public static final c0 f24920s;

    /* renamed from: t, reason: collision with root package name */
    public static final c0 f24921t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ c0[] f24922u;

    static {
        c0 c0Var = new c0("Yes", 0);
        f24919r = c0Var;
        c0 c0Var2 = new c0("No", 1);
        f24920s = c0Var2;
        c0 c0Var3 = new c0("NotInitialized", 2);
        f24921t = c0Var3;
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3};
        f24922u = c0VarArr;
        v8.l0.t(c0VarArr);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f24922u.clone();
    }
}
