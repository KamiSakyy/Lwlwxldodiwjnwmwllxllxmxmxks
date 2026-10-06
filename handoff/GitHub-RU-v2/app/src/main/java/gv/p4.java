package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p4 implements aa.a {
    public static final p4 a = new p4();
    public static final List b = sy.d0Shadow.o("__typename", "beforeFocusCount", "pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        j4 j4Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 2) {
                j4Var = (j4) aa.c.c(n4.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(m4.a, true)))).a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (num == null) {
            k41.b.B(eVar, "beforeFocusCount");
            throw null;
        }
        int intValue = num.intValue();
        if (j4Var != null) {
            return new k4(str, intValue, j4Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        k4 k4Var = (k4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k4Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, k4Var.a);
        fVar.z0("beforeFocusCount");
        fVar.z(k4Var.b);
        fVar.z0("pageInfo");
        aa.c.c(n4.a, false).b(fVar, wVar, k4Var.c);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(m4.a, true)))).b(fVar, wVar, k4Var.d);
    }
}
