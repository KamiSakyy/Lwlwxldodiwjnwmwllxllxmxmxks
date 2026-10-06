package p20;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ra implements aaShadow.a {
    public static final ra a = new ra();
    public static final List b = sy.d0Shadow.n("programmingLanguages");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ArrayList arrayList = null;
        while (eVar.r0(b) == 0) {
            arrayList = aa.c.a(aa.c.b(aa.c.c(sa.a, false))).c(eVar, wVar);
        }
        if (arrayList != null) {
            return new u10.vf(arrayList);
        }
        k41.b.B(eVar, "programmingLanguages");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.vf vfVar = (u10.vf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vfVar, "value");
        fVar.z0("programmingLanguages");
        aa.c.a(aa.c.b(aa.c.c(sa.a, false))).e(fVar, wVar, vfVar.a);
    }
}
