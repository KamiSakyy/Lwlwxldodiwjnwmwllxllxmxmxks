package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pf implements aaShadow.a {
    public static final pf a = new pf();
    public static final List b = sy.d0Shadow.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(qf.a, true)))).a(eVar, wVar);
        }
        return new jo.dn(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.dn dnVar = (jo.dn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dnVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(qf.a, true)))).b(fVar, wVar, dnVar.a);
    }
}
