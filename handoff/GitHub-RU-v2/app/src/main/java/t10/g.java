package t10;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public static final /* synthetic */ g[] A;
    public static final g r;
    public static final g s;
    public static final g t;
    public static final g u;
    public static final g v;
    public static final g w;
    public static final g x;
    public static final g y;
    public static final g z;

    static {
        g gVar = new g("ANNOUNCEMENTS", 0);
        r = gVar;
        g gVar2 = new g("RELEASES", 1);
        s = gVar2;
        g gVar3 = new g("SPONSORS", 2);
        t = gVar3;
        g gVar4 = new g("STARS", 3);
        u = gVar4;
        g gVar5 = new g("REPOSITORIES", 4);
        v = gVar5;
        g gVar6 = new g("FOLLOWS", 5);
        w = gVar6;
        g gVar7 = new g("RECOMMENDATIONS", 6);
        x = gVar7;
        g gVar8 = new g("POSTS", 7);
        y = gVar8;
        g gVar9 = new g("UNKNOWN__", 8);
        z = gVar9;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9};
        A = gVarArr;
        l0.t(gVarArr);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) A.clone();
    }
}
