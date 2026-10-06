package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b5 implements aaShadow.a {
    public static final b5 a = new b5();
    public static final List b = sy.d0.n("deleteDiscussion");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.t7 t7Var = null;
        while (eVar.r0(b) == 0) {
            t7Var = (u10.t7) aa.c.b(aa.c.c(c5.a, false)).a(eVar, wVar);
        }
        return new u10.s7(t7Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.s7 s7Var = (u10.s7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s7Var, "value");
        fVar.z0("deleteDiscussion");
        aa.c.b(aa.c.c(c5.a, false)).b(fVar, wVar, s7Var.a);
    }
}
