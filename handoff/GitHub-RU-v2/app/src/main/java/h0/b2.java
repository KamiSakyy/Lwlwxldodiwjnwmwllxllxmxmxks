package h0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class b2 {

    /* renamed from: r, reason: collision with root package name */
    public static final b2 f24910r;

    /* renamed from: s, reason: collision with root package name */
    public static final b2 f24911s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ b2[] f24912t;

    static {
        b2 b2Var = new b2("Vertical", 0);
        f24910r = b2Var;
        b2 b2Var2 = new b2("Horizontal", 1);
        f24911s = b2Var2;
        b2[] b2VarArr = {b2Var, b2Var2};
        f24912t = b2VarArr;
        v8.l0.t(b2VarArr);
    }

    public static b2 valueOf(String str) {
        return (b2) Enum.valueOf(b2.class, str);
    }

    public static b2[] values() {
        return (b2[]) f24912t.clone();
    }
}
