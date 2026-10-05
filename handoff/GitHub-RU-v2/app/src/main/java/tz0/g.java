package tz0;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public static final g r;
    public static final g s;
    public static final g t;
    public static final g u;
    public static final g v;
    public static final g w;
    public static final g x;
    public static final /* synthetic */ g[] y;

    static {
        g gVar = new g("FAILED", 0);
        r = gVar;
        g gVar2 = new g("PASSED", 1);
        s = gVar2;
        g gVar3 = new g("PENDING", 2);
        t = gVar3;
        g gVar4 = new g("PENDING_APPROVAL", 3);
        u = gVar4;
        g gVar5 = new g("PENDING_FAILED", 4);
        v = gVar5;
        g gVar6 = new g("SOME_FAILED", 5);
        w = gVar6;
        g gVar7 = new g("UNKNOWN", 6);
        x = gVar7;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7};
        y = gVarArr;
        l0.t(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) y.clone();
    }
}
