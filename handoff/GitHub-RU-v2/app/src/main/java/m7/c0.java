package m7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class c0 {

    /* renamed from: r, reason: collision with root package name */
    public static final c0 f28961r;

    /* renamed from: s, reason: collision with root package name */
    public static final c0 f28962s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ c0[] f28963t;

    static {
        c0 c0Var = new c0("DEFERRED", 0);
        f28961r = c0Var;
        c0 c0Var2 = new c0("IMMEDIATE", 1);
        f28962s = c0Var2;
        c0[] c0VarArr = {c0Var, c0Var2, new c0("EXCLUSIVE", 2)};
        f28963t = c0VarArr;
        v8.l0.t(c0VarArr);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f28963t.clone();
    }
}
