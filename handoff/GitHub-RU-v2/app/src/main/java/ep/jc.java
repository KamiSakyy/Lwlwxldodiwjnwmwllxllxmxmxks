package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jc implements aa.a {
    public static final jc a = new jc();
    public static final List b = sy.d0.o("nodes", "pageInfo");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        jo.xi xiVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(qc.a, true)))).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                xiVar = (jo.xi) aa.c.c(yc.a, false).a(eVar, wVar);
            }
        }
        if (xiVar != null) {
            return new jo.hi(list, xiVar);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.hi hiVar = (jo.hi) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hiVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(qc.a, true)))).b(fVar, wVar, hiVar.a);
        fVar.z0("pageInfo");
        aa.c.c(yc.a, false).b(fVar, wVar, hiVar.b);
    }
}
