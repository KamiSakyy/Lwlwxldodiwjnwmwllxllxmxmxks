package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i4 implements aaShadow.a {
    public static final i4 a = new i4();
    public static final List b = sy.d0Shadow.n("issue");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.t6 t6Var = null;
        while (eVar.r0(b) == 0) {
            t6Var = (kc0.t6) aa.c.b(aa.c.c(k4.a, false)).a(eVar, wVar);
        }
        return new kc0.r6(t6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.r6 r6Var = (kc0.r6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r6Var, "value");
        fVar.z0("issue");
        aa.c.b(aa.c.c(k4.a, false)).b(fVar, wVar, r6Var.a);
    }
}
