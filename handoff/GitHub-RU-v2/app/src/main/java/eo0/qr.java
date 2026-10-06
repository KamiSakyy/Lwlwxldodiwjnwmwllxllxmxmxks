package eo0;

import java.util.List;
import jn0.o30;
import jn0.p30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qr implements aaShadow.a {
    public static final qr a = new qr();
    public static final List b = sy.d0Shadow.o(new String[]{"issueCount", "pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        o30 o30Var = null;
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
                o30Var = (o30) aa.c.c(pr.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(nr.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "issueCount");
            throw null;
        }
        int intValue = num.intValue();
        if (o30Var != null) {
            return new p30(intValue, o30Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p30 p30Var = (p30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p30Var, "value");
        fVar.z0("issueCount");
        fVar.z(p30Var.a);
        fVar.z0("pageInfo");
        aa.c.c(pr.a, false).b(fVar, wVar, p30Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(nr.a, true)))).b(fVar, wVar, p30Var.c);
    }
}
