package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 implements aaShadow.a {
    public static final d0 a = new d0();
    public static final List b = sy.d0Shadow.n("thread");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.z0 z0Var = null;
        while (eVar.r0(b) == 0) {
            z0Var = (jo.z0) aa.c.b(aa.c.c(i0.a, false)).a(eVar, wVar);
        }
        return new jo.t0(z0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.t0 t0Var = (jo.t0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t0Var, "value");
        fVar.z0("thread");
        aa.c.b(aa.c.c(i0.a, false)).b(fVar, wVar, t0Var.a);
    }
}
