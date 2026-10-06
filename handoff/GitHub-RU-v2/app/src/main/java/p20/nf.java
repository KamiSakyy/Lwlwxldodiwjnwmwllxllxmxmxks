package p20;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nf implements aaShadow.a {
    public static final nf a = new nf();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        u10.hn hnVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        u10.gn gnVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequestReviewThread"}), set2, str, set)) {
            eVar.s0();
            hnVar = sf.c(eVar, wVar);
        } else {
            hnVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequestReviewComment"}), set2, str, set)) {
            eVar.s0();
            gnVar = rf.c(eVar, wVar);
        }
        return new u10.cn(str, hnVar, gnVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.cn cnVar = (u10.cn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cnVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, cnVar.a);
        u10.hn hnVar = cnVar.b;
        if (hnVar != null) {
            sf.d(fVar, wVar, hnVar);
        }
        u10.gn gnVar = cnVar.c;
        if (gnVar != null) {
            rf.d(fVar, wVar, gnVar);
        }
    }
}
