package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q8 implements aaShadow.a {
    public static final q8 a = new q8();
    public static final List b = sy.d0.o(new String[]{"actor", "pullRequest"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.uc ucVar = null;
        jn0.yc ycVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ucVar = (jn0.uc) aa.c.b(aa.c.c(o8.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jn0.xc(ucVar, ycVar);
                }
                ycVar = (jn0.yc) aa.c.b(aa.c.c(r8.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.xc xcVar = (jn0.xc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xcVar, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(o8.a, true)).b(fVar, wVar, xcVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(r8.a, true)).b(fVar, wVar, xcVar.b);
    }
}
