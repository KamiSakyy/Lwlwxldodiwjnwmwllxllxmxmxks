package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mf implements aaShadow.a {
    public static final mf a = new mf();
    public static final List b = sy.d0.n("minimizeComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.an anVar = null;
        while (eVar.r0(b) == 0) {
            anVar = (jn0.an) aa.c.b(aa.c.c(nf.a, false)).a(eVar, wVar);
        }
        return new jn0.zm(anVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.zm zmVar = (jn0.zm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zmVar, "value");
        fVar.z0("minimizeComment");
        aa.c.b(aa.c.c(nf.a, false)).b(fVar, wVar, zmVar.a);
    }
}
