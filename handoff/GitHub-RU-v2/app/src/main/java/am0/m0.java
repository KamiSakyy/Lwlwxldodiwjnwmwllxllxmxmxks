package am0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m0 {
    public final String a;
    public final i b;
    public final k c;
    public final y d;
    public final h e;
    public final a0 f;
    public final l g;
    public final o h;
    public final p i;
    public final t j;
    public final u k;
    public final r l;
    public final j m;
    public final s n;
    public final v o;
    public final m p;

    public m0(String str, i iVar, k kVar, y yVar, h hVar, a0 a0Var, l lVar, o oVar, p pVar, t tVar, u uVar, r rVar, j jVar, s sVar, v vVar, m mVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = iVar;
        this.c = kVar;
        this.d = yVar;
        this.e = hVar;
        this.f = a0Var;
        this.g = lVar;
        this.h = oVar;
        this.i = pVar;
        this.j = tVar;
        this.k = uVar;
        this.l = rVar;
        this.m = jVar;
        this.n = sVar;
        this.o = vVar;
        this.p = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return k71.k.b(this.a, m0Var.a) && k71.k.b(this.b, m0Var.b) && k71.k.b(this.c, m0Var.c) && k71.k.b(this.d, m0Var.d) && k71.k.b(this.e, m0Var.e) && k71.k.b(this.f, m0Var.f) && k71.k.b(this.g, m0Var.g) && k71.k.b(this.h, m0Var.h) && k71.k.b(this.i, m0Var.i) && k71.k.b(this.j, m0Var.j) && k71.k.b(this.k, m0Var.k) && k71.k.b(this.l, m0Var.l) && k71.k.b(this.m, m0Var.m) && k71.k.b(this.n, m0Var.n) && k71.k.b(this.o, m0Var.o) && k71.k.b(this.p, m0Var.p);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i iVar = this.b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        k kVar = this.c;
        int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        y yVar = this.d;
        int hashCode4 = (hashCode3 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        h hVar = this.e;
        int hashCode5 = (hashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        a0 a0Var = this.f;
        int hashCode6 = (hashCode5 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        l lVar = this.g;
        int hashCode7 = (hashCode6 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        o oVar = this.h;
        int hashCode8 = (hashCode7 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        p pVar = this.i;
        int hashCode9 = (hashCode8 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        t tVar = this.j;
        int hashCode10 = (hashCode9 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        u uVar = this.k;
        int hashCode11 = (hashCode10 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        r rVar = this.l;
        int hashCode12 = (hashCode11 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        j jVar = this.m;
        int hashCode13 = (hashCode12 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        s sVar = this.n;
        int hashCode14 = (hashCode13 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        v vVar = this.o;
        int hashCode15 = (hashCode14 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        m mVar = this.p;
        return hashCode15 + (mVar != null ? mVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "Subject(__typename=" + this.a + ", onCommit=" + this.b + ", onGist=" + this.c + ", onTeamDiscussion=" + this.d + ", onCheckSuite=" + this.e + ", onWorkflowRun=" + this.f + ", onIssue=" + this.g + ", onPullRequest=" + this.h + ", onRelease=" + this.i + ", onRepositoryInvitation=" + this.j + ", onRepositoryVulnerabilityAlert=" + this.k + ", onRepositoryAdvisory=" + this.l + ", onDiscussion=" + this.m + ", onRepositoryDependabotAlertsThread=" + this.n + ", onSecurityAdvisory=" + this.o + ", onMemberFeatureRequestNotification=" + this.p + ")";
    }
    public Object f(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object h(Object p1, Object p2, Object p3) { return null; }
    public Object l(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object y(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object z(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
