package ep;

import java.util.List;
import jo.dk0;
import jo.ek0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t20 implements aaShadow.a {
    public static final t20 a = new t20();
    public static final List b = sy.d0Shadow.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        dk0 dk0Var = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                dk0Var = (dk0) aa.c.c(s20.a, true).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(r20.a, true)))).a(eVar, wVar);
            }
        }
        if (dk0Var != null) {
            return new ek0(dk0Var, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ek0 ek0Var = (ek0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ek0Var, "value");
        fVar.z0("pageInfo");
        aa.c.c(s20.a, true).b(fVar, wVar, ek0Var.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(r20.a, true)))).b(fVar, wVar, ek0Var.b);
    }
}
