package v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class c0 {

    /* renamed from: r, reason: collision with root package name */
    public static final c0 f32441r;

    /* renamed from: s, reason: collision with root package name */
    public static final c0 f32442s;

    /* renamed from: t, reason: collision with root package name */
    public static final c0 f32443t;

    /* renamed from: u, reason: collision with root package name */
    public static final c0 f32444u;

    /* renamed from: v, reason: collision with root package name */
    public static final c0 f32445v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ c0[] f32446w;

    static {
        c0 c0Var = new c0("Measuring", 0);
        f32441r = c0Var;
        c0 c0Var2 = new c0("LookaheadMeasuring", 1);
        f32442s = c0Var2;
        c0 c0Var3 = new c0("LayingOut", 2);
        f32443t = c0Var3;
        c0 c0Var4 = new c0("LookaheadLayingOut", 3);
        f32444u = c0Var4;
        c0 c0Var5 = new c0("Idle", 4);
        f32445v = c0Var5;
        c0[] c0VarArr = {c0Var, c0Var2, c0Var3, c0Var4, c0Var5};
        f32446w = c0VarArr;
        v8.l0.t(c0VarArr);
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) f32446w.clone();
    }
}
