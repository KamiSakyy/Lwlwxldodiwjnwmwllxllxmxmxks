package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class ve implements aa.a {
    public static final List a = sy.d0.n("mentionableUsers");

    public static jn0.bm c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.yl ylVar = null;
        while (eVar.r0(a) == 0) {
            ylVar = (jn0.yl) aa.c.c(se.a, false).a(eVar, wVar);
        }
        if (ylVar != null) {
            return new jn0.bm(ylVar);
        }
        k41.b.B(eVar, "mentionableUsers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jn0.bm bmVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bmVar, "value");
        fVar.z0("mentionableUsers");
        aa.c.c(se.a, false).b(fVar, wVar, bmVar.a);
    }
}
