package ep;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wi implements aaShadow.a {
    public static final wi a = new wi();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        jo.as asVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        jo.zr zrVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequestReviewThread"}), set2, str, set)) {
            eVar.s0();
            asVar = bj.c(eVar, wVar);
        } else {
            asVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequestReviewComment"}), set2, str, set)) {
            eVar.s0();
            zrVar = aj.c(eVar, wVar);
        }
        return new jo.vr(str, asVar, zrVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.vr vrVar = (jo.vr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vrVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, vrVar.a);
        jo.as asVar = vrVar.b;
        if (asVar != null) {
            bj.d(fVar, wVar, asVar);
        }
        jo.zr zrVar = vrVar.c;
        if (zrVar != null) {
            aj.d(fVar, wVar, zrVar);
        }
    }
}
