package p20;

import java.util.List;
import u10.a80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gu implements aaShadow.a {
    public static final gu a = new gu();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        m90.e eVar2 = m90.e.a;
        m90.b c = m90.e.c(eVar, wVar);
        if (str != null) {
            return new a80(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a80 a80Var = (a80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a80Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, a80Var.a);
        m90.e eVar = m90.e.a;
        m90.e.d(fVar, wVar, a80Var.b);
    }
}
