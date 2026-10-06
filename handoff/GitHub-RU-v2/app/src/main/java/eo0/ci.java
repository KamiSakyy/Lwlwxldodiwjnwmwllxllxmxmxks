package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ci implements aaShadow.a {
    public static final ci a = new ci();
    public static final List b = sy.d0Shadow.o(new String[]{"created", "assigned", "mentioned", "requested", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.nq nqVar = null;
        jn0.lq lqVar = null;
        jn0.pq pqVar = null;
        jn0.uq uqVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                nqVar = (jn0.nq) aa.c.b(aa.c.c(bi.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                lqVar = (jn0.lq) aa.c.b(aa.c.c(ai.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                pqVar = (jn0.pq) aa.c.b(aa.c.c(di.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                uqVar = (jn0.uq) aa.c.b(aa.c.c(ii.a, false)).a(eVar, wVar);
            } else if (r0 == 4) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jn0.oq(nqVar, lqVar, pqVar, uqVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.oq oqVar = (jn0.oq) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oqVar, "value");
        fVar.z0("created");
        aa.c.b(aa.c.c(bi.a, false)).b(fVar, wVar, oqVar.a);
        fVar.z0("assigned");
        aa.c.b(aa.c.c(ai.a, false)).b(fVar, wVar, oqVar.b);
        fVar.z0("mentioned");
        aa.c.b(aa.c.c(di.a, false)).b(fVar, wVar, oqVar.c);
        fVar.z0("requested");
        aa.c.b(aa.c.c(ii.a, false)).b(fVar, wVar, oqVar.d);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oqVar.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, oqVar.f);
    }
}
