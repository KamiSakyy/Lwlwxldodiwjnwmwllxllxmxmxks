package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nk implements aaShadow.a {
    public static final nk a = new nk();
    public static final List b = sy.d0Shadow.o(new String[]{"subject", "reaction"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.rt rtVar = null;
        jn0.pt ptVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                rtVar = (jn0.rt) aa.c.b(aa.c.c(ok.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jn0.qt(rtVar, ptVar);
                }
                ptVar = (jn0.pt) aa.c.b(aa.c.c(mk.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.qt qtVar = (jn0.qt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qtVar, "value");
        fVar.z0("subject");
        aa.c.b(aa.c.c(ok.a, true)).b(fVar, wVar, qtVar.a);
        fVar.z0("reaction");
        aa.c.b(aa.c.c(mk.a, false)).b(fVar, wVar, qtVar.b);
    }
}
