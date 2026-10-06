package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dp implements aaShadow.a {
    public static final dp a = new dp();
    public static final List b = sy.d0Shadow.o("pageInfo", "totalCount", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.g00 g00Var = null;
        Integer num = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                g00Var = (jo.g00) aa.c.c(gp.a, false).a(eVar, wVar);
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
            } else {
                if (r0 != 2) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(fp.a, true)))).a(eVar, wVar);
            }
        }
        if (g00Var == null) {
            k41.b.B(eVar, "pageInfo");
            throw null;
        }
        if (num != null) {
            return new jo.c00(g00Var, num.intValue(), list);
        }
        k41.b.B(eVar, "totalCount");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.c00 c00Var = (jo.c00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c00Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(gp.a, false).b(fVar, wVar, c00Var.a);
        fVar.z0("totalCount");
        fVar.z(c00Var.b);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(fp.a, true)))).b(fVar, wVar, c00Var.c);
    }
}
