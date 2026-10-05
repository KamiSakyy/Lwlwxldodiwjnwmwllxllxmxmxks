package w20;

import aa.w;
import ea.f;
import java.util.List;
import jo.f4;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements aa.a {
    public static final a a = new a();
    public static final List b = d0.o("pageInfo", "totalCount", "nodes");

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        v20.e eVar2 = null;
        Integer num = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                eVar2 = (v20.e) aa.c.c(d.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(c.a, true)))).a(eVar, wVar);
            }
        }
        if (eVar2 == null) {
            k41.b.B(eVar, "pageInfo");
            throw null;
        }
        if (num != null) {
            return new v20.a(eVar2, num.intValue(), list);
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(f fVar, w wVar, Object obj) {
        v20.a aVar = (v20.a) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(aVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(d.a, false).b(fVar, wVar, aVar.a);
        fVar.z0("totalCount");
        fVar.z(aVar.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(c.a, true)))).b(fVar, wVar, aVar.c);
    }
}
