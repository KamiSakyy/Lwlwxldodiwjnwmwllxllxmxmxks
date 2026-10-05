package p20;

import java.util.List;
import u10.iy;
import u10.jy;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pn implements aa.a {
    public static final pn a = new pn();
    public static final List b = sy.d0.o("repositoryCount", "pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        iy iyVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                iyVar = (iy) aa.c.c(on.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(mn.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "repositoryCount");
            throw null;
        }
        int intValue = num.intValue();
        if (iyVar != null) {
            return new jy(intValue, iyVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jy jyVar = (jy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jyVar, "value");
        fVar.z0("repositoryCount");
        fVar.z(jyVar.a);
        fVar.z0("pageInfo");
        aa.c.c(on.a, false).b(fVar, wVar, jyVar.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(mn.a, true)))).b(fVar, wVar, jyVar.c);
    }
}
