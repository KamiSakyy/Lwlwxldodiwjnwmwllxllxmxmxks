package a0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes.dex */
public final class x0 {

    /* renamed from: r, reason: collision with root package name */
    public static final x0 f307r;

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ x0[] f308s;

    static {
        x0 x0Var = new x0("Default", 0);
        f307r = x0Var;
        x0[] x0VarArr = {x0Var, new x0("UserInput", 1), new x0("PreventUserInput", 2)};
        f308s = x0VarArr;
        v8.l0.t(x0VarArr);
    }

    public static x0 valueOf(String str) {
        return (x0) Enum.valueOf(x0.class, str);
    }

    public static x0[] values() {
        return (x0[]) f308s.clone();
    }

    public x0(Object... a) {
    }
}
