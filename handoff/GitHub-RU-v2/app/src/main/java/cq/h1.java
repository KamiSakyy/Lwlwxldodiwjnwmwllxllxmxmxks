package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "viewerIsFollowing", "__typename"});

    public static g1 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "viewerIsFollowing");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str2 != null) {
            return new g1(str, str2, booleanValue);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, g1 g1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, g1Var.a);
        fVar.z0("viewerIsFollowing");
        jo.f4.C(g1Var.b, aa.c.f, fVar, wVar, "__typename");
        bVar.b(fVar, wVar, g1Var.c);
    }
    public static final Object i = null;
}
