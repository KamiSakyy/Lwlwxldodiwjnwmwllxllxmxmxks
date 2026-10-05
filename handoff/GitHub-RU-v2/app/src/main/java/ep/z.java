package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z implements aa.a {
    public static final z a = new z();
    public static final List b = sy.d0.n("comment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.o0 o0Var = null;
        while (eVar.r0(b) == 0) {
            o0Var = (jo.o0) aa.c.b(aa.c.c(a0.a, true)).a(eVar, wVar);
        }
        return new jo.n0(o0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.n0 n0Var = (jo.n0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n0Var, "value");
        fVar.z0("comment");
        aa.c.b(aa.c.c(a0.a, true)).b(fVar, wVar, n0Var.a);
    }
}
