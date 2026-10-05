package fl;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public static final g r;
    public static final g s;
    public static final g t;
    public static final /* synthetic */ g[] u;

    static {
        g gVar = new g("LOADING", 0);
        r = gVar;
        g gVar2 = new g("SUCCESS", 1);
        s = gVar2;
        g gVar3 = new g("FAILURE", 2);
        t = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        u = gVarArr;
        l0.t(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) u.clone();
    }
}
