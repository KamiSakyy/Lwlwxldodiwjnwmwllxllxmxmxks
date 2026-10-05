package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t9 implements aa.a {
    public static final t9 a = new t9();
    public static final List b = sy.d0.o("nodes", "pageInfo");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        jo.me meVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(r9.a, true)))).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                meVar = (jo.me) aa.c.c(s9.a, false).a(eVar, wVar);
            }
        }
        if (meVar != null) {
            return new jo.ne(list, meVar);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ne neVar = (jo.ne) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(neVar, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(r9.a, true)))).b(fVar, wVar, neVar.a);
        fVar.z0("pageInfo");
        aa.c.c(s9.a, false).b(fVar, wVar, neVar.b);
    }
}
