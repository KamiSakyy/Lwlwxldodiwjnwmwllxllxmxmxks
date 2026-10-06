package bm0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements aa.a {
    public static final c a = new c();
    public static final List b = sy.d0Shadow.n("viewer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        am0.o0 o0Var = null;
        while (eVar.r0(b) == 0) {
            o0Var = (am0.o0) aa.c.c(n0.a, true).a(eVar, wVar);
        }
        if (o0Var != null) {
            return new am0.d(o0Var);
        }
        k41.b.B(eVar, "viewer");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        am0.d dVar = (am0.d) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("viewer");
        aa.c.c(n0.a, true).b(fVar, wVar, dVar.a);
    }
    public Object b(Object p1) { return null; }
    public static final Object f = null;
    public static final Object i = null;
}
