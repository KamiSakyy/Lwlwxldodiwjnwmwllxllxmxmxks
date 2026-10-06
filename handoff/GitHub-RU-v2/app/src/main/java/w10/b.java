package w10;

import aa.w;
import java.util.List;
import jo.f4;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements aa.a {
    public static final b a = new b();
    public static final List b = d0.o("totalCount", "pageInfo", "nodes");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Integer num = null;
        v10.g gVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                gVar = (v10.g) aa.c.c(f.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(d.a, false)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "totalCount");
            throw null;
        }
        int intValue = num.intValue();
        if (gVar != null) {
            return new v10.b(intValue, gVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        v10.b bVar = (v10.b) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("totalCount");
        fVar.z(bVar.a);
        fVar.z0("pageInfo");
        aa.c.c(f.a, false).b(fVar, wVar, bVar.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(d.a, false)))).b(fVar, wVar, bVar.c);
    }
}
