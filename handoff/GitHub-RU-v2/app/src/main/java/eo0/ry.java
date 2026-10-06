package eo0;

import java.util.List;
import jn0.ae0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ry implements aaShadow.a {
    public static final ry a = new ry();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        nv0.f fVar = nv0.f.a;
        nv0.b c = nv0.f.c(eVar, wVar);
        if (str != null) {
            return new ae0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ae0 ae0Var = (ae0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ae0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, ae0Var.a);
        nv0.f fVar2 = nv0.f.a;
        nv0.f.d(fVar, wVar, ae0Var.b);
    }
}
