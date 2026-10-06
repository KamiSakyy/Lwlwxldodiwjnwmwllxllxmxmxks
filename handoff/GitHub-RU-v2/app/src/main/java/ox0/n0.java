package ox0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n0 {
    public String a;
    public i b;
    public k c;
    public z d;
    public h e;
    public b0 f;
    public l g;
    public p h;
    public q i;
    public u j;
    public v k;
    public s l;
    public j m;
    public t n;
    public w o;
    public m p;
    public o q;
    public kw0.a r;

    public n0(String str, i iVar, k kVar, z zVar, h hVar, b0 b0Var, l lVar, p pVar, q qVar, u uVar, v vVar, s sVar, j jVar, t tVar, w wVar, m mVar, o oVar, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = iVar;
        this.c = kVar;
        this.d = zVar;
        this.e = hVar;
        this.f = b0Var;
        this.g = lVar;
        this.h = pVar;
        this.i = qVar;
        this.j = uVar;
        this.k = vVar;
        this.l = sVar;
        this.m = jVar;
        this.n = tVar;
        this.o = wVar;
        this.p = mVar;
        this.q = oVar;
        this.r = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return k71.k.b(this.a, n0Var.a) && k71.k.b(this.b, n0Var.b) && k71.k.b(this.c, n0Var.c) && k71.k.b(this.d, n0Var.d) && k71.k.b(this.e, n0Var.e) && k71.k.b(this.f, n0Var.f) && k71.k.b(this.g, n0Var.g) && k71.k.b(this.h, n0Var.h) && k71.k.b(this.i, n0Var.i) && k71.k.b(this.j, n0Var.j) && k71.k.b(this.k, n0Var.k) && k71.k.b(this.l, n0Var.l) && k71.k.b(this.m, n0Var.m) && k71.k.b(this.n, n0Var.n) && k71.k.b(this.o, n0Var.o) && k71.k.b(this.p, n0Var.p) && k71.k.b(this.q, n0Var.q) && k71.k.b(this.r, n0Var.r);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i iVar = this.b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        k kVar = this.c;
        int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        z zVar = this.d;
        int hashCode4 = (hashCode3 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        h hVar = this.e;
        int hashCode5 = (hashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        b0 b0Var = this.f;
        int hashCode6 = (hashCode5 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        l lVar = this.g;
        int hashCode7 = (hashCode6 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        p pVar = this.h;
        int hashCode8 = (hashCode7 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        q qVar = this.i;
        int hashCode9 = (hashCode8 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        u uVar = this.j;
        int hashCode10 = (hashCode9 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        v vVar = this.k;
        int hashCode11 = (hashCode10 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        s sVar = this.l;
        int hashCode12 = (hashCode11 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        j jVar = this.m;
        int hashCode13 = (hashCode12 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        t tVar = this.n;
        int hashCode14 = (hashCode13 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        w wVar = this.o;
        int hashCode15 = (hashCode14 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        m mVar = this.p;
        int hashCode16 = (hashCode15 + (mVar == null ? 0 : mVar.a.hashCode())) * 31;
        o oVar = this.q;
        int hashCode17 = (hashCode16 + (oVar == null ? 0 : oVar.a.hashCode())) * 31;
        kw0.a aVar = this.r;
        return hashCode17 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "Subject(__typename=" + this.a + ", onCommit=" + this.b + ", onGist=" + this.c + ", onTeamDiscussion=" + this.d + ", onCheckSuite=" + this.e + ", onWorkflowRun=" + this.f + ", onIssue=" + this.g + ", onPullRequest=" + this.h + ", onRelease=" + this.i + ", onRepositoryInvitation=" + this.j + ", onRepositoryVulnerabilityAlert=" + this.k + ", onRepositoryAdvisory=" + this.l + ", onDiscussion=" + this.m + ", onRepositoryDependabotAlertsThread=" + this.n + ", onSecurityAdvisory=" + this.o + ", onMemberFeatureRequestNotification=" + this.p + ", onProjectV2=" + this.q + ", nodeIdFragment=" + this.r + ")";
    }
}
