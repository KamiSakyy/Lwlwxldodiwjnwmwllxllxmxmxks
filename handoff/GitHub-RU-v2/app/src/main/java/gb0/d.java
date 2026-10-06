package gb0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements aa.a {
    public static final d a = new d();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        fb0.v vVar;
        fb0.p pVar;
        fb0.y yVar;
        fb0.w wVar2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        fb0.m mVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Commit", "Discussion", "Issue", "PullRequest", "Repository", "Team", "TeamDiscussion"}), set2, str, set)) {
            eVar.s0();
            vVar = u.c(eVar, wVar);
        } else {
            vVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Repository"}), set2, str, set)) {
            eVar.s0();
            pVar = o.c(eVar, wVar);
        } else {
            pVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"User"}), set2, str, set)) {
            eVar.s0();
            yVar = x.c(eVar, wVar);
        } else {
            yVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Team"}), set2, str, set)) {
            eVar.s0();
            wVar2 = v.c(eVar, wVar);
        } else {
            wVar2 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Organization"}), set2, str, set)) {
            eVar.s0();
            mVar = l.c(eVar, wVar);
        }
        return new fb0.e(str, vVar, pVar, yVar, wVar2, mVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fb0.e eVar = (fb0.e) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, eVar.a);
        fb0.v vVar = eVar.b;
        if (vVar != null) {
            u.d(fVar, wVar, vVar);
        }
        fb0.p pVar = eVar.c;
        if (pVar != null) {
            o.d(fVar, wVar, pVar);
        }
        fb0.y yVar = eVar.d;
        if (yVar != null) {
            x.d(fVar, wVar, yVar);
        }
        fb0.w wVar2 = eVar.e;
        if (wVar2 != null) {
            v.d(fVar, wVar, wVar2);
        }
        fb0.m mVar = eVar.f;
        if (mVar != null) {
            l.d(fVar, wVar, mVar);
        }
    }
}
