package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v implements aaShadow.a {
    public static final v a = new v();
    public static final List b = sy.d0Shadow.n("addReaction");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.g0 g0Var = null;
        while (eVar.r0(b) == 0) {
            g0Var = (jo.g0) aa.c.b(aa.c.c(u.a, false)).a(eVar, wVar);
        }
        return new jo.i0(g0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.i0 i0Var = (jo.i0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i0Var, "value");
        fVar.z0("addReaction");
        aa.c.b(aa.c.c(u.a, false)).b(fVar, wVar, i0Var.a);
    }
}
