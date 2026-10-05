package bm0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        am0.w wVar2;
        am0.q qVar;
        am0.z zVar;
        am0.x xVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        am0.n nVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team", "TeamDiscussion"}), set2, str, set)) {
            eVar.s0();
            wVar2 = v.c(eVar, wVar);
        } else {
            wVar2 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), set2, str, set)) {
            eVar.s0();
            qVar = p.c(eVar, wVar);
        } else {
            qVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            zVar = y.c(eVar, wVar);
        } else {
            zVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Team"}), set2, str, set)) {
            eVar.s0();
            xVar = w.c(eVar, wVar);
        } else {
            xVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            nVar = m.c(eVar, wVar);
        }
        return new am0.e(str, wVar2, qVar, zVar, xVar, nVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        am0.e eVar = (am0.e) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, eVar.a);
        am0.w wVar2 = eVar.b;
        if (wVar2 != null) {
            v.d(fVar, wVar, wVar2);
        }
        am0.q qVar = eVar.c;
        if (qVar != null) {
            p.d(fVar, wVar, qVar);
        }
        am0.z zVar = eVar.d;
        if (zVar != null) {
            y.d(fVar, wVar, zVar);
        }
        am0.x xVar = eVar.e;
        if (xVar != null) {
            w.d(fVar, wVar, xVar);
        }
        am0.n nVar = eVar.f;
        if (nVar != null) {
            m.d(fVar, wVar, nVar);
        }
    }
}
