package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j5 implements aaShadow.a {
    public static final j5 a = new j5();
    public static final List b = sy.d0.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.f8 f8Var = null;
        while (eVar.r0(b) == 0) {
            f8Var = (jo.f8) aa.c.b(aa.c.c(l5.a, true)).a(eVar, wVar);
        }
        return new jo.d8(f8Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.d8 d8Var = (jo.d8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d8Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(l5.a, true)).b(fVar, wVar, d8Var.a);
    }
}
