package ck0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 implements aa.a {
    public static final o0 a = new o0();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        i iVar;
        j jVar;
        k kVar;
        m mVar;
        h hVar;
        l lVar;
        n nVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        o oVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"SearchShortcutQueryLabelTerm"}), set2, str, set)) {
            eVar.s0();
            iVar = e0.c(eVar, wVar);
        } else {
            iVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"SearchShortcutQueryLoginRefTerm"}), set2, str, set)) {
            eVar.s0();
            jVar = f0.c(eVar, wVar);
        } else {
            jVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"SearchShortcutQueryMilestoneTerm"}), set2, str, set)) {
            eVar.s0();
            kVar = g0.c(eVar, wVar);
        } else {
            kVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"SearchShortcutQueryRepoTerm"}), set2, str, set)) {
            eVar.s0();
            mVar = i0.c(eVar, wVar);
        } else {
            mVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"SearchShortcutQueryCategoryTerm"}), set2, str, set)) {
            eVar.s0();
            hVar = d0.c(eVar, wVar);
        } else {
            hVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"SearchShortcutQueryProjectTerm"}), set2, str, set)) {
            eVar.s0();
            lVar = h0.c(eVar, wVar);
        } else {
            lVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"SearchShortcutQueryTerm"}), set2, str, set)) {
            eVar.s0();
            nVar = j0.c(eVar, wVar);
        } else {
            nVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"SearchShortcutQueryText"}), set2, str, set)) {
            eVar.s0();
            oVar = k0.c(eVar, wVar);
        }
        return new s(str, iVar, jVar, kVar, mVar, hVar, lVar, nVar, oVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s sVar = (s) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(sVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, sVar.a);
        i iVar = sVar.b;
        if (iVar != null) {
            e0.d(fVar, wVar, iVar);
        }
        j jVar = sVar.c;
        if (jVar != null) {
            f0.d(fVar, wVar, jVar);
        }
        k kVar = sVar.d;
        if (kVar != null) {
            g0.d(fVar, wVar, kVar);
        }
        m mVar = sVar.e;
        if (mVar != null) {
            i0.d(fVar, wVar, mVar);
        }
        h hVar = sVar.f;
        if (hVar != null) {
            d0.d(fVar, wVar, hVar);
        }
        l lVar = sVar.g;
        if (lVar != null) {
            h0.d(fVar, wVar, lVar);
        }
        n nVar = sVar.h;
        if (nVar != null) {
            j0.d(fVar, wVar, nVar);
        }
        o oVar = sVar.i;
        if (oVar != null) {
            k0.d(fVar, wVar, oVar);
        }
    }
}
