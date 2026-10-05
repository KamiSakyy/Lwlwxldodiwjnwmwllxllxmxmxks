package xn;

import com.github.service.copilot.PermissionScope$Companion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class z2 {
    public static final PermissionScope$Companion Companion;
    public static final Object r;
    public static final z2 s;
    public static final z2 t;
    public static final /* synthetic */ z2[] u;

    static {
        z2 z2Var = new z2("ONCE", 0);
        s = z2Var;
        z2 z2Var2 = new z2("SESSION", 1);
        t = z2Var2;
        z2[] z2VarArr = {z2Var, z2Var2};
        u = z2VarArr;
        v8.l0.t(z2VarArr);
        Companion = new PermissionScope$Companion();
        r = sy.w.s(w61.i.r, new wm.a(15));
    }

    public static z2 valueOf(String str) {
        return (z2) Enum.valueOf(z2.class, str);
    }

    public static z2[] values() {
        return (z2[]) u.clone();
    }
}
