package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 implements aaShadow.a {
    public static final n0 a = new n0();
    public static final List b = sy.d0Shadow.n("comment");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.i1 i1Var = null;
        while (eVar.r0(b) == 0) {
            i1Var = (jo.i1) aa.c.b(aa.c.c(o0.a, true)).a(eVar, wVar);
        }
        return new jo.h1(i1Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.h1 h1Var = (jo.h1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h1Var, "value");
        fVar.z0("comment");
        aa.c.b(aa.c.c(o0.a, true)).b(fVar, wVar, h1Var.a);
    }
}
