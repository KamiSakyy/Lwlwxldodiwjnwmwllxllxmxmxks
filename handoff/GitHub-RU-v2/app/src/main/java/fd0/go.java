package fd0;

import java.util.List;
import kc0.cz;
import kc0.fz;

/* loaded from: /home/user/work/p/classes4.dex */
public final class go implements aaShadow.a {
    public static final go a = new go();
    public static final List b = sy.d0Shadow.o(new String[]{"issueCount", "pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        cz czVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                czVar = (cz) aa.c.c(co.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(yn.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "issueCount");
            throw null;
        }
        int intValue = num.intValue();
        if (czVar != null) {
            return new fz(intValue, czVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fz fzVar = (fz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fzVar, "value");
        fVar.z0("issueCount");
        fVar.z(fzVar.a);
        fVar.z0("pageInfo");
        aa.c.c(co.a, false).b(fVar, wVar, fzVar.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(yn.a, true)))).b(fVar, wVar, fzVar.c);
    }
}
