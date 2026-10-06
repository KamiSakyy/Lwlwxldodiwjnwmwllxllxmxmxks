package fd0;

import java.util.List;
import kc0.iz;
import kc0.mz;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ho implements aaShadow.a {
    public static final ho a = new ho();
    public static final List b = sy.d0Shadow.n("search");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        mz mzVar = null;
        while (eVar.r0(b) == 0) {
            mzVar = (mz) aa.c.c(lo.a, false).a(eVar, wVar);
        }
        if (mzVar != null) {
            return new iz(mzVar);
        }
        k41.b.B(eVar, "search");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        iz izVar = (iz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(izVar, "value");
        fVar.z0("search");
        aa.c.c(lo.a, false).b(fVar, wVar, izVar.a);
    }
}
