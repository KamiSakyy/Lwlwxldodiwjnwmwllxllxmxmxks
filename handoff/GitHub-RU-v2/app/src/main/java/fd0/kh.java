package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kh implements aaShadow.a {
    public static final kh a = new kh();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.sp spVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                spVar = (kc0.sp) aa.c.c(mh.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(lh.a, true)))).a(eVar, wVar);
            }
        }
        if (spVar != null) {
            return new kc0.qp(spVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.qp qpVar = (kc0.qp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qpVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(mh.a, false).b(fVar, wVar, qpVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(lh.a, true)))).b(fVar, wVar, qpVar.b);
    }
}
