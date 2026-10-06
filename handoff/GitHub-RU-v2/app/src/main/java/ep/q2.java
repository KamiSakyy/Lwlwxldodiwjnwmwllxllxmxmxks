package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q2 implements aaShadow.a {
    public static final q2 a = new q2();
    public static final List b = sy.d0.n("nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        List list = null;
        while (eVar.r0(b) == 0) {
            list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(u2.a, false)))).a(eVar, wVar);
        }
        return new jo.j4(list);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.j4 j4Var = (jo.j4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j4Var, "value");
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(u2.a, false)))).b(fVar, wVar, j4Var.a);
    }
}
