package gb0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 implements aa.a {
    public static final k0 a = new k0();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        fb0.i iVar;
        fb0.k kVar;
        fb0.x xVar;
        fb0.h hVar;
        fb0.z zVar;
        fb0.l lVar;
        fb0.n nVar;
        fb0.o oVar;
        fb0.s sVar;
        fb0.t tVar;
        fb0.q qVar;
        fb0.j jVar;
        fb0.r rVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        fb0.u uVar = null;
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
            xVar = w.c(eVar, wVar);
        } else {
            xVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CheckSuite"}), set2, str, set)) {
            eVar.s0();
            hVar = g.c(eVar, wVar);
        } else {
            hVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"WorkflowRun"}), set2, str, set)) {
            eVar.s0();
            zVar = y.c(eVar, wVar);
        } else {
            zVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            lVar = k.c(eVar, wVar);
        } else {
            lVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            nVar = m.c(eVar, wVar);
        } else {
            nVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Release"}), set2, str, set)) {
            eVar.s0();
            oVar = n.c(eVar, wVar);
        } else {
            oVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RepositoryInvitation"}), set2, str, set)) {
            eVar.s0();
            sVar = r.c(eVar, wVar);
        } else {
            sVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RepositoryVulnerabilityAlert"}), set2, str, set)) {
            eVar.s0();
            tVar = s.c(eVar, wVar);
        } else {
            tVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RepositoryAdvisory"}), set2, str, set)) {
            eVar.s0();
            qVar = p.c(eVar, wVar);
        } else {
            qVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), set2, str, set)) {
            eVar.s0();
            jVar = i.c(eVar, wVar);
        } else {
            jVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RepositoryDependabotAlertsThread"}), set2, str, set)) {
            eVar.s0();
            rVar = q.c(eVar, wVar);
        } else {
            rVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"SecurityAdvisory"}), set2, str, set)) {
            eVar.s0();
            uVar = t.c(eVar, wVar);
        }
        return new fb0.l0(str, iVar, kVar, xVar, hVar, zVar, lVar, nVar, oVar, sVar, tVar, qVar, jVar, rVar, uVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        fb0.l0 l0Var = (fb0.l0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, l0Var.a);
        fb0.i iVar = l0Var.b;
        if (iVar != null) {
            h.d(fVar, wVar, iVar);
        }
        fb0.k kVar = l0Var.c;
        if (kVar != null) {
            j.d(fVar, wVar, kVar);
        }
        fb0.x xVar = l0Var.d;
        if (xVar != null) {
            w.d(fVar, wVar, xVar);
        }
        fb0.h hVar = l0Var.e;
        if (hVar != null) {
            g.d(fVar, wVar, hVar);
        }
        fb0.z zVar = l0Var.f;
        if (zVar != null) {
            y.d(fVar, wVar, zVar);
        }
        fb0.l lVar = l0Var.g;
        if (lVar != null) {
            k.d(fVar, wVar, lVar);
        }
        fb0.n nVar = l0Var.h;
        if (nVar != null) {
            m.d(fVar, wVar, nVar);
        }
        fb0.o oVar = l0Var.i;
        if (oVar != null) {
            n.d(fVar, wVar, oVar);
        }
        fb0.s sVar = l0Var.j;
        if (sVar != null) {
            r.d(fVar, wVar, sVar);
        }
        fb0.t tVar = l0Var.k;
        if (tVar != null) {
            s.d(fVar, wVar, tVar);
        }
        fb0.q qVar = l0Var.l;
        if (qVar != null) {
            p.d(fVar, wVar, qVar);
        }
        fb0.j jVar = l0Var.m;
        if (jVar != null) {
            i.d(fVar, wVar, jVar);
        }
        fb0.r rVar = l0Var.n;
        if (rVar != null) {
            q.d(fVar, wVar, rVar);
        }
        fb0.u uVar = l0Var.o;
        if (uVar != null) {
            t.d(fVar, wVar, uVar);
        }
    }
}
