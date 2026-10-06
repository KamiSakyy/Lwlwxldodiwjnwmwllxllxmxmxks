package nb0;

import java.util.List;
import mb0.r0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 implements aa.a {
    public static final c0 a = new c0();
    public static final List b = sy.d0Shadow.n("getsPullRequestReviews");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new r0(bool.booleanValue());
        }
        k41.b.B(eVar, "getsPullRequestReviews");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        r0 r0Var = (r0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r0Var, "value");
        fVar.z0("getsPullRequestReviews");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(r0Var.a));
    }
}
