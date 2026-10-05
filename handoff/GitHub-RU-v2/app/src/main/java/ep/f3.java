package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f3 implements aa.a {
    public static final f3 a = new f3();
    public static final List b = sy.d0.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.d5 d5Var = null;
        while (eVar.r0(b) == 0) {
            d5Var = (jo.d5) aa.c.b(aa.c.c(h3.a, false)).a(eVar, wVar);
        }
        return new jo.a5(d5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.a5 a5Var = (jo.a5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a5Var, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(h3.a, false)).b(fVar, wVar, a5Var.a);
    }
}
