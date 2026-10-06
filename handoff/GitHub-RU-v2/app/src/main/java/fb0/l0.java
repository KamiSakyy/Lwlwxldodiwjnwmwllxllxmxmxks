package fb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 {
    public String a;
    public i b;
    public k c;
    public xShadow d;
    public h e;
    public z f;
    public l g;
    public n h;
    public o i;
    public s j;
    public t k;
    public q l;
    public j m;
    public r n;
    public u o;

    public l0(String str, i iVar, k kVar, xShadow xVar, h hVar, z zVar, l lVar, n nVar, o oVar, s sVar, t tVar, q qVar, j jVar, r rVar, u uVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = iVar;
        this.c = kVar;
        this.d = xVar;
        this.e = hVar;
        this.f = zVar;
        this.g = lVar;
        this.h = nVar;
        this.i = oVar;
        this.j = sVar;
        this.k = tVar;
        this.l = qVar;
        this.m = jVar;
        this.n = rVar;
        this.o = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return k71.k.b(this.a, l0Var.a) && k71.k.b(this.b, l0Var.b) && k71.k.b(this.c, l0Var.c) && k71.k.b(this.d, l0Var.d) && k71.k.b(this.e, l0Var.e) && k71.k.b(this.f, l0Var.f) && k71.k.b(this.g, l0Var.g) && k71.k.b(this.h, l0Var.h) && k71.k.b(this.i, l0Var.i) && k71.k.b(this.j, l0Var.j) && k71.k.b(this.k, l0Var.k) && k71.k.b(this.l, l0Var.l) && k71.k.b(this.m, l0Var.m) && k71.k.b(this.n, l0Var.n) && k71.k.b(this.o, l0Var.o);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i iVar = this.b;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        k kVar = this.c;
        int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        xShadow xVar = this.d;
        int hashCode4 = (hashCode3 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        h hVar = this.e;
        int hashCode5 = (hashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        z zVar = this.f;
        int hashCode6 = (hashCode5 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        l lVar = this.g;
        int hashCode7 = (hashCode6 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        n nVar = this.h;
        int hashCode8 = (hashCode7 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        o oVar = this.i;
        int hashCode9 = (hashCode8 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        s sVar = this.j;
        int hashCode10 = (hashCode9 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        t tVar = this.k;
        int hashCode11 = (hashCode10 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        q qVar = this.l;
        int hashCode12 = (hashCode11 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        j jVar = this.m;
        int hashCode13 = (hashCode12 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        r rVar = this.n;
        int hashCode14 = (hashCode13 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        u uVar = this.o;
        return hashCode14 + (uVar != null ? uVar.hashCode() : 0);
    }

    public final String toString() {
        return "Subject(__typename=" + this.a + ", onCommit=" + this.b + ", onGist=" + this.c + ", onTeamDiscussion=" + this.d + ", onCheckSuite=" + this.e + ", onWorkflowRun=" + this.f + ", onIssue=" + this.g + ", onPullRequest=" + this.h + ", onRelease=" + this.i + ", onRepositoryInvitation=" + this.j + ", onRepositoryVulnerabilityAlert=" + this.k + ", onRepositoryAdvisory=" + this.l + ", onDiscussion=" + this.m + ", onRepositoryDependabotAlertsThread=" + this.n + ", onSecurityAdvisory=" + this.o + ")";
    }
}
