package zg;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 {
    public static final e0 r;
    public static final e0 s;
    public static final /* synthetic */ e0[] t;

    static {
        e0 e0Var = new e0("Small", 0);
        r = e0Var;
        e0 e0Var2 = new e0("Large", 1);
        s = e0Var2;
        e0[] e0VarArr = {e0Var, e0Var2};
        t = e0VarArr;
        l0.t(e0VarArr);
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) t.clone();
    }
    public Object ordinal() { return null; }
}
