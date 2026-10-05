package qx;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 implements aa.a {
    public static final c0 a = new c0();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        s sVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        r rVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            sVar = f0.c(eVar, wVar);
        } else {
            sVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            rVar = e0.c(eVar, wVar);
        }
        return new p(str, sVar, rVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p pVar = (p) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, pVar.a);
        s sVar = pVar.b;
        if (sVar != null) {
            f0.d(fVar, wVar, sVar);
        }
        r rVar = pVar.c;
        if (rVar != null) {
            e0.d(fVar, wVar, rVar);
        }
    }
}
