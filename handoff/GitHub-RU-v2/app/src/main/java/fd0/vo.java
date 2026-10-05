package fd0;

import java.util.List;
import kc0.a00;
import kc0.zz;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vo implements aa.a {
    public static final vo a = new vo();
    public static final List b = sy.d0.o(new String[]{"issueCount", "pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        zz zzVar = null;
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
                zzVar = (zz) aa.c.c(uo.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(so.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "issueCount");
            throw null;
        }
        int intValue = num.intValue();
        if (zzVar != null) {
            return new a00(intValue, zzVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a00 a00Var = (a00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a00Var, "value");
        fVar.z0("issueCount");
        fVar.z(a00Var.a);
        fVar.z0("pageInfo");
        aa.c.c(uo.a, false).b(fVar, wVar, a00Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(so.a, true)))).b(fVar, wVar, a00Var.c);
    }
}
