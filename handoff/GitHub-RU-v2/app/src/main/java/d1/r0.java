package d1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class r0 {

    /* renamed from: r, reason: collision with root package name */
    public static final r0 f21202r;

    /* renamed from: s, reason: collision with root package name */
    public static final r0 f21203s;

    /* renamed from: t, reason: collision with root package name */
    public static final r0 f21204t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ r0[] f21205u;

    static {
        r0 r0Var = new r0("Left", 0);
        f21202r = r0Var;
        r0 r0Var2 = new r0("Middle", 1);
        f21203s = r0Var2;
        r0 r0Var3 = new r0("Right", 2);
        f21204t = r0Var3;
        r0[] r0VarArr = {r0Var, r0Var2, r0Var3};
        f21205u = r0VarArr;
        v8.l0.t(r0VarArr);
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f21205u.clone();
    }
}
