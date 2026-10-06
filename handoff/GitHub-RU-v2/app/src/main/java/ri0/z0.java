package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 implements aa.a {
    public static final z0 a = new z0();
    public static final List b = sy.d0Shadow.n("patches");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        t0 t0Var = null;
        while (eVar.r0(b) == 0) {
            t0Var = (t0) aa.c.c(o1.a, false).a(eVar, wVar);
        }
        if (t0Var != null) {
            return new f0(t0Var);
        }
        k41.b.B(eVar, "patches");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f0 f0Var = (f0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f0Var, "value");
        fVar.z0("patches");
        aa.c.c(o1.a, false).b(fVar, wVar, f0Var.a);
    }
}
