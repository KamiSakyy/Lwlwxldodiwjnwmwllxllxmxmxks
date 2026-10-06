package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nf implements aaShadow.a {
    public static final nf a = new nf();
    public static final List b = sy.d0Shadow.n("minimizedComment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.bn bnVar = null;
        while (eVar.r0(b) == 0) {
            bnVar = (jn0.bn) aa.c.b(aa.c.c(of.a, true)).a(eVar, wVar);
        }
        return new jn0.an(bnVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.an anVar = (jn0.an) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(anVar, "value");
        fVar.z0("minimizedComment");
        aa.c.b(aa.c.c(of.a, true)).b(fVar, wVar, anVar.a);
    }
}
