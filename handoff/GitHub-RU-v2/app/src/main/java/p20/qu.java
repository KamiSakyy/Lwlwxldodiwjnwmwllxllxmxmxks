package p20;

import java.util.ArrayList;
import java.util.List;
import u10.s80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qu implements aaShadow.a {
    public static final qu a = new qu();
    public static final List b = sy.d0Shadow.n("weeks");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        while (eVar.r0(b) == 0) {
            arrayList = aa.c.a(aa.c.c(vu.a, false)).c(eVar, wVar);
        }
        if (arrayList != null) {
            return new s80(arrayList);
        }
        k41.b.B(eVar, "weeks");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s80 s80Var = (s80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s80Var, "value");
        fVar.z0("weeks");
        aa.c.a(aa.c.c(vu.a, false)).e(fVar, wVar, s80Var.a);
    }
}
