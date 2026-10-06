package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wi implements aaShadow.a {
    public static final wi a = new wi();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.pr prVar = null;
        while (eVar.r0(b) == 0) {
            prVar = (u10.pr) aa.c.b(aa.c.c(xi.a, true)).a(eVar, wVar);
        }
        return new u10.or(prVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.or orVar = (u10.or) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(orVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(xi.a, true)).b(fVar, wVar, orVar.a);
    }
}
