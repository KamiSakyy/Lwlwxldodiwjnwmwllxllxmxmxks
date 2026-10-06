package bm0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l0 implements aa.a {
    public static final l0 a = new l0();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        am0.i iVar;
        am0.k kVar;
        am0.y yVar;
        am0.h hVar;
        am0.a0Shadow a0Var;
        am0.l lVar;
        am0.o oVar;
        am0.p pVar;
        am0.t tVar;
        am0.u uVar;
        am0.r rVar;
        am0.j jVar;
        am0.s sVar;
        am0.v vVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        am0.m mVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Commit"}), set2, str, set)) {
            eVar.s0();
            iVar = h.c(eVar, wVar);
        } else {
            iVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Gist"}), set2, str, set)) {
            eVar.s0();
            kVar = j.c(eVar, wVar);
        } else {
            kVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"TeamDiscussion"}), set2, str, set)) {
            eVar.s0();
            yVar = x.c(eVar, wVar);
        } else {
            yVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CheckSuite"}), set2, str, set)) {
            eVar.s0();
            hVar = g.c(eVar, wVar);
        } else {
            hVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"WorkflowRun"}), set2, str, set)) {
            eVar.s0();
            a0Var = z.c(eVar, wVar);
        } else {
            a0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            lVar = k.c(eVar, wVar);
        } else {
            lVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            oVar = n.c(eVar, wVar);
        } else {
            oVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Release"}), set2, str, set)) {
            eVar.s0();
            pVar = o.c(eVar, wVar);
        } else {
            pVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RepositoryInvitation"}), set2, str, set)) {
            eVar.s0();
            tVar = s.c(eVar, wVar);
        } else {
            tVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RepositoryVulnerabilityAlert"}), set2, str, set)) {
            eVar.s0();
            uVar = t.c(eVar, wVar);
        } else {
            uVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RepositoryAdvisory"}), set2, str, set)) {
            eVar.s0();
            rVar = q.c(eVar, wVar);
        } else {
            rVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), set2, str, set)) {
            eVar.s0();
            jVar = i.c(eVar, wVar);
        } else {
            jVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RepositoryDependabotAlertsThread"}), set2, str, set)) {
            eVar.s0();
            sVar = r.c(eVar, wVar);
        } else {
            sVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"SecurityAdvisory"}), set2, str, set)) {
            eVar.s0();
            vVar = u.c(eVar, wVar);
        } else {
            vVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"MemberFeatureRequestNotification"}), set2, str, set)) {
            eVar.s0();
            mVar = l.c(eVar, wVar);
        }
        return new am0.m0(str, iVar, kVar, yVar, hVar, a0Var, lVar, oVar, pVar, tVar, uVar, rVar, jVar, sVar, vVar, mVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        am0.m0 m0Var = (am0.m0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, m0Var.a);
        am0.i iVar = m0Var.b;
        if (iVar != null) {
            h.d(fVar, wVar, iVar);
        }
        am0.k kVar = m0Var.c;
        if (kVar != null) {
            j.d(fVar, wVar, kVar);
        }
        am0.y yVar = m0Var.d;
        if (yVar != null) {
            x.d(fVar, wVar, yVar);
        }
        am0.h hVar = m0Var.e;
        if (hVar != null) {
            g.d(fVar, wVar, hVar);
        }
        am0.a0Shadow a0Var = m0Var.f;
        if (a0Var != null) {
            z.d(fVar, wVar, a0Var);
        }
        am0.l lVar = m0Var.g;
        if (lVar != null) {
            k.d(fVar, wVar, lVar);
        }
        am0.o oVar = m0Var.h;
        if (oVar != null) {
            n.d(fVar, wVar, oVar);
        }
        am0.p pVar = m0Var.i;
        if (pVar != null) {
            o.d(fVar, wVar, pVar);
        }
        am0.t tVar = m0Var.j;
        if (tVar != null) {
            s.d(fVar, wVar, tVar);
        }
        am0.u uVar = m0Var.k;
        if (uVar != null) {
            t.d(fVar, wVar, uVar);
        }
        am0.r rVar = m0Var.l;
        if (rVar != null) {
            q.d(fVar, wVar, rVar);
        }
        am0.j jVar = m0Var.m;
        if (jVar != null) {
            i.d(fVar, wVar, jVar);
        }
        am0.s sVar = m0Var.n;
        if (sVar != null) {
            r.d(fVar, wVar, sVar);
        }
        am0.v vVar = m0Var.o;
        if (vVar != null) {
            u.d(fVar, wVar, vVar);
        }
        am0.m mVar = m0Var.p;
        if (mVar != null) {
            l.d(fVar, wVar, mVar);
        }
    }
}
