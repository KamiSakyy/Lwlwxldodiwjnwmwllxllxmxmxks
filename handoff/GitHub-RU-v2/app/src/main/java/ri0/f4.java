package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f4 implements aa.a {
    public static final f4 a = new f4();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "beforeFocusCount", "pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        z3 z3Var = null;
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
                z3Var = (z3) aa.c.c(d4.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(c4.a, true)))).a(eVar, wVar);
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
        if (z3Var != null) {
            return new a4(str, intValue, z3Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a4 a4Var = (a4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a4Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, a4Var.a);
        fVar.z0("beforeFocusCount");
        fVar.z(a4Var.b);
        fVar.z0("pageInfo");
        aa.c.c(d4.a, false).b(fVar, wVar, a4Var.c);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(c4.a, true)))).b(fVar, wVar, a4Var.d);
    }
}
