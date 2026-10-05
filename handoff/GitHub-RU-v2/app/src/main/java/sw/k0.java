package sw;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 implements aa.a {
    public static final k0 a = new k0();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        i iVar;
        j jVar;
        k kVar;
        l lVar;
        h hVar;
        m mVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        n nVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"SearchShortcutQueryLabelTerm"}), set2, str, set)) {
            eVar.s0();
            iVar = c0.c(eVar, wVar);
        } else {
            iVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"SearchShortcutQueryLoginRefTerm"}), set2, str, set)) {
            eVar.s0();
            jVar = d0.c(eVar, wVar);
        } else {
            jVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"SearchShortcutQueryMilestoneTerm"}), set2, str, set)) {
            eVar.s0();
            kVar = e0.c(eVar, wVar);
        } else {
            kVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"SearchShortcutQueryRepoTerm"}), set2, str, set)) {
            eVar.s0();
            lVar = f0.c(eVar, wVar);
        } else {
            lVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"SearchShortcutQueryCategoryTerm"}), set2, str, set)) {
            eVar.s0();
            hVar = b0.c(eVar, wVar);
        } else {
            hVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"SearchShortcutQueryTerm"}), set2, str, set)) {
            eVar.s0();
            mVar = g0.c(eVar, wVar);
        } else {
            mVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"SearchShortcutQueryText"}), set2, str, set)) {
            eVar.s0();
            nVar = h0.c(eVar, wVar);
        }
        return new q(str, iVar, jVar, kVar, lVar, hVar, mVar, nVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q qVar = (q) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, qVar.a);
        i iVar = qVar.b;
        if (iVar != null) {
            c0.d(fVar, wVar, iVar);
        }
        j jVar = qVar.c;
        if (jVar != null) {
            d0.d(fVar, wVar, jVar);
        }
        k kVar = qVar.d;
        if (kVar != null) {
            e0.d(fVar, wVar, kVar);
        }
        l lVar = qVar.e;
        if (lVar != null) {
            f0.d(fVar, wVar, lVar);
        }
        h hVar = qVar.f;
        if (hVar != null) {
            b0.d(fVar, wVar, hVar);
        }
        m mVar = qVar.g;
        if (mVar != null) {
            g0.d(fVar, wVar, mVar);
        }
        n nVar = qVar.h;
        if (nVar != null) {
            h0.d(fVar, wVar, nVar);
        }
    }
}
