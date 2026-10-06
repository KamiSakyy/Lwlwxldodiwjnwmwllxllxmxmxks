package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uc implements aaShadow.a {
    public static final uc a = new uc();
    public static final List b = sy.d0Shadow.o(new String[]{"actor", "lockedRecord"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.ri riVar = null;
        jn0.vi viVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                riVar = (jn0.ri) aa.c.b(aa.c.c(sc.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jn0.ui(riVar, viVar);
                }
                viVar = (jn0.vi) aa.c.b(aa.c.c(vc.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.ui uiVar = (jn0.ui) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uiVar, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(sc.a, true)).b(fVar, wVar, uiVar.a);
        fVar.z0("lockedRecord");
        aa.c.b(aa.c.c(vc.a, true)).b(fVar, wVar, uiVar.b);
    }
}
