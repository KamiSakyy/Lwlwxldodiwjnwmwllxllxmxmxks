package xn;

import com.github.service.copilot.ResourceState$Companion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class g3 {
    public static final ResourceState$Companion Companion;
    public static final Object r;
    public static final g3 s;
    public static final /* synthetic */ g3[] t;

    static {
        g3 g3Var = new g3("DRAFT", 0);
        g3 g3Var2 = new g3("OPEN", 1);
        g3 g3Var3 = new g3("CLOSED", 2);
        g3 g3Var4 = new g3("MERGED", 3);
        s = g3Var4;
        g3[] g3VarArr = {g3Var, g3Var2, g3Var3, g3Var4};
        t = g3VarArr;
        v8.l0.t(g3VarArr);
        Companion = new ResourceState$Companion();
        r = sy.w.s(w61.i.r, new wm.a(16));
    }

    public static g3 valueOf(String str) {
        return (g3) Enum.valueOf(g3.class, str);
    }

    public static g3[] values() {
        return (g3[]) t.clone();
    }
}
