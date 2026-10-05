package wz;

import aa.w;
import java.util.List;
import jo.f4;
import sy.d0;
import vz.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p implements aa.a {
    public static final p a = new p();
    public static final List b = d0.o("totalCount", "pageInfo", "nodes");

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        a0 a0Var = null;
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
                a0Var = (a0) aa.c.c(t.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(q.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "totalCount");
            throw null;
        }
        int intValue = num.intValue();
        if (a0Var != null) {
            return new vz.w(intValue, a0Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        vz.w wVar2 = (vz.w) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wVar2, "value");
        fVar.z0("totalCount");
        fVar.z(wVar2.a);
        fVar.z0("pageInfo");
        aa.c.c(t.a, false).b(fVar, wVar, wVar2.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(q.a, true)))).b(fVar, wVar, wVar2.c);
    }
}
