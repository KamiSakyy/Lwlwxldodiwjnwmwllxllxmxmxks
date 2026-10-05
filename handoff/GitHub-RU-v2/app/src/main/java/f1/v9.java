package f1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class v9 {

    /* renamed from: r, reason: collision with root package name */
    public static final v9 f23929r;

    /* renamed from: s, reason: collision with root package name */
    public static final v9 f23930s;

    /* renamed from: t, reason: collision with root package name */
    public static final v9 f23931t;

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ v9[] f23932u;

    static {
        v9 v9Var = new v9("Short", 0);
        f23929r = v9Var;
        v9 v9Var2 = new v9("Long", 1);
        f23930s = v9Var2;
        v9 v9Var3 = new v9("Indefinite", 2);
        f23931t = v9Var3;
        v9[] v9VarArr = {v9Var, v9Var2, v9Var3};
        f23932u = v9VarArr;
        v8.l0.t(v9VarArr);
    }

    public static v9 valueOf(String str) {
        return (v9) Enum.valueOf(v9.class, str);
    }

    public static v9[] values() {
        return (v9[]) f23932u.clone();
    }
}
