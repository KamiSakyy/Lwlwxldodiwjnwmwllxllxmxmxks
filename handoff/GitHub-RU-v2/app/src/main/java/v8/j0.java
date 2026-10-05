package v8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class j0 {

    /* renamed from: r, reason: collision with root package name */
    public static final j0 f32794r;

    /* renamed from: s, reason: collision with root package name */
    public static final j0 f32795s;

    /* renamed from: t, reason: collision with root package name */
    public static final j0 f32796t;

    /* renamed from: u, reason: collision with root package name */
    public static final j0 f32797u;

    /* renamed from: v, reason: collision with root package name */
    public static final j0 f32798v;

    /* renamed from: w, reason: collision with root package name */
    public static final j0 f32799w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ j0[] f32800x;

    static {
        j0 j0Var = new j0("ENQUEUED", 0);
        f32794r = j0Var;
        j0 j0Var2 = new j0("RUNNING", 1);
        f32795s = j0Var2;
        j0 j0Var3 = new j0("SUCCEEDED", 2);
        f32796t = j0Var3;
        j0 j0Var4 = new j0("FAILED", 3);
        f32797u = j0Var4;
        j0 j0Var5 = new j0("BLOCKED", 4);
        f32798v = j0Var5;
        j0 j0Var6 = new j0("CANCELLED", 5);
        f32799w = j0Var6;
        j0[] j0VarArr = {j0Var, j0Var2, j0Var3, j0Var4, j0Var5, j0Var6};
        f32800x = j0VarArr;
        l0.t(j0VarArr);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) f32800x.clone();
    }

    public final boolean a() {
        return this == f32796t || this == f32797u || this == f32799w;
    }
}
