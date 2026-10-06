package eo0;

import java.util.List;
import jn0.v30;
import jn0.w30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vr implements aaShadow.a {
    public static final vr a = new vr();
    public static final List b = sy.d0.o(new String[]{"repositoryCount", "pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        v30 v30Var = null;
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
                v30Var = (v30) aa.c.c(ur.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(sr.a, true)))).a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "repositoryCount");
            throw null;
        }
        int intValue = num.intValue();
        if (v30Var != null) {
            return new w30(intValue, v30Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        w30 w30Var = (w30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w30Var, "value");
        fVar.z0("repositoryCount");
        fVar.z(w30Var.a);
        fVar.z0("pageInfo");
        aa.c.c(ur.a, false).b(fVar, wVar, w30Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(sr.a, true)))).b(fVar, wVar, w30Var.c);
    }
}
