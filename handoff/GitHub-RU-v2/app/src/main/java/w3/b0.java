package w3;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class b0 {

    /* renamed from: r, reason: collision with root package name */
    public static final b0 f33248r;

    /* renamed from: s, reason: collision with root package name */
    public static final b0 f33249s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ b0[] f33250t;

    static {
        b0 b0Var = new b0("Inherit", 0);
        f33248r = b0Var;
        b0 b0Var2 = new b0("SecureOn", 1);
        f33249s = b0Var2;
        b0[] b0VarArr = {b0Var, b0Var2, new b0("SecureOff", 2)};
        f33250t = b0VarArr;
        l0.t(b0VarArr);
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f33250t.clone();
    }

    public static w3.b0 f33248r;
    public static final Object f33248r = null;
}
