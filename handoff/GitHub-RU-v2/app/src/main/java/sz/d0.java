package sz;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 implements aa.a {
    public static final d0 a = new d0();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        tz.c c = tz.f.c(eVar, wVar);
        if (str != null) {
            return new rz.t0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        rz.t0 t0Var = (rz.t0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, t0Var.a);
        List list = tz.f.a;
        tz.f.d(fVar, wVar, t0Var.b);
    }
}
