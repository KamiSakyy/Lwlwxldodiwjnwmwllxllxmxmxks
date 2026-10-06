package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g3 implements aaShadow.a {
    public static final g3 a = new g3();
    public static final List b = sy.d0Shadow.n("cloneTemplateRepository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.a5 a5Var = null;
        while (eVar.r0(b) == 0) {
            a5Var = (jo.a5) aa.c.b(aa.c.c(f3.a, false)).a(eVar, wVar);
        }
        return new jo.c5(a5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.c5 c5Var = (jo.c5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c5Var, "value");
        fVar.z0("cloneTemplateRepository");
        aa.c.b(aa.c.c(f3.a, false)).b(fVar, wVar, c5Var.a);
    }
}
