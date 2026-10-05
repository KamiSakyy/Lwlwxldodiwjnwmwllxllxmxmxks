package eo0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ne implements aa.a {
    public static final ne a = new ne();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        jn0.tl tlVar;
        jn0.ul ulVar;
        jn0.sl slVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            tlVar = pe.c(eVar, wVar);
        } else {
            tlVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            ulVar = qe.c(eVar, wVar);
        } else {
            ulVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), set2, str, set)) {
            eVar.s0();
            slVar = oe.c(eVar, wVar);
        } else {
            slVar = null;
        }
        if (str2 != null) {
            return new jn0.rl(str, str2, tlVar, ulVar, slVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.rl rlVar = (jn0.rl) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rlVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rlVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, rlVar.b);
        jn0.tl tlVar = rlVar.c;
        if (tlVar != null) {
            pe.d(fVar, wVar, tlVar);
        }
        jn0.ul ulVar = rlVar.d;
        if (ulVar != null) {
            qe.d(fVar, wVar, ulVar);
        }
        jn0.sl slVar = rlVar.e;
        if (slVar != null) {
            oe.d(fVar, wVar, slVar);
        }
    }
}
