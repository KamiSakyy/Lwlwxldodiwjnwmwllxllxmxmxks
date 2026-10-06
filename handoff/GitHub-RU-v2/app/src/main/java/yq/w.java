package yq;

import java.util.List;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class w implements aa.a {
    public static final List a = d0.n("repository");

    public static h c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m mVar = null;
        while (eVar.r0(a) == 0) {
            mVar = (m) aa.c.c(b0.a, false).a(eVar, wVar);
        }
        if (mVar != null) {
            return new h(mVar);
        }
        k41.b.B(eVar, "repository");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, h hVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("repository");
        aa.c.c(b0.a, false).b(fVar, wVar, hVar.a);
    }
    public Object e(Object p1) { return null; }
}
