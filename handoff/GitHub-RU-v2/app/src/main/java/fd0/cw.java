package fd0;

import java.util.ArrayList;
import java.util.List;
import kc0.sa0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cw implements aaShadow.a {
    public static final cw a = new cw();
    public static final List b = sy.d0Shadow.n("weeks");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        while (eVar.r0(b) == 0) {
            arrayList = aa.c.a(aa.c.c(hw.a, false)).c(eVar, wVar);
        }
        if (arrayList != null) {
            return new sa0(arrayList);
        }
        k41.b.B(eVar, "weeks");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        sa0 sa0Var = (sa0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sa0Var, "value");
        fVar.z0("weeks");
        aa.c.a(aa.c.c(hw.a, false)).e(fVar, wVar, sa0Var.a);
    }
}
