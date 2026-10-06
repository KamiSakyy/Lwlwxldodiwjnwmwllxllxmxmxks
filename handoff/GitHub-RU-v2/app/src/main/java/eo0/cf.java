package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cf implements aaShadow.a {
    public static final cf a = new cf();
    public static final List b = sy.d0.o(new String[]{"actor", "pullRequest"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.im imVar = null;
        jn0.om omVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                imVar = (jn0.im) aa.c.b(aa.c.c(ze.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jn0.mm(imVar, omVar);
                }
                omVar = (jn0.om) aa.c.b(aa.c.c(ef.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.mm mmVar = (jn0.mm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mmVar, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(ze.a, true)).b(fVar, wVar, mmVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(ef.a, true)).b(fVar, wVar, mmVar.b);
    }
}
