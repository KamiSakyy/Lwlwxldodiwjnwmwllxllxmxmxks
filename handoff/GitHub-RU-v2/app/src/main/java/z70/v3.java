package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v3 implements aa.a {
    public static final v3 a = new v3();
    public static final List b = sy.d0.o("__typename", "beforeFocusCount", "pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Integer num = null;
        p3 p3Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 2) {
                p3Var = (p3) aa.c.c(t3.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(s3.a, true)))).a(eVar, wVar);
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
        if (p3Var != null) {
            return new q3(str, intValue, p3Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q3 q3Var = (q3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q3Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, q3Var.a);
        fVar.z0("beforeFocusCount");
        fVar.z(q3Var.b);
        fVar.z0("pageInfo");
        aa.c.c(t3.a, false).b(fVar, wVar, q3Var.c);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(s3.a, true)))).b(fVar, wVar, q3Var.d);
    }
}
