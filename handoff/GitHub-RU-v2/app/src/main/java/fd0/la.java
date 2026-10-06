package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class la implements aaShadow.a {
    public static final la a = new la();
    public static final List b = sy.d0.n("codeSearch");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.nf nfVar = null;
        while (eVar.r0(b) == 0) {
            nfVar = (kc0.nf) aa.c.c(ka.a, false).a(eVar, wVar);
        }
        if (nfVar != null) {
            return new kc0.pf(nfVar);
        }
        k41.b.B(eVar, "codeSearch");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.pf pfVar = (kc0.pf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pfVar, "value");
        fVar.z0("codeSearch");
        aa.c.c(ka.a, false).b(fVar, wVar, pfVar.a);
    }
}
