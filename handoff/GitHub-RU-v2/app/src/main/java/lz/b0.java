package lz;

import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 {
    public String a;
    public h b;
    public j c;
    public g d;
    public z e;
    public k f;
    public o g;
    public p h;
    public t i;
    public u j;
    public r k;
    public i l;
    public s m;
    public v n;
    public l o;
    public n p;
    public vx.a q;

    public b0(String str, h hVar, j jVar, g gVar, z zVar, k kVar, o oVar, p pVar, t tVar, u uVar, r rVar, i iVar, s sVar, v vVar, l lVar, n nVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = hVar;
        this.c = jVar;
        this.d = gVar;
        this.e = zVar;
        this.f = kVar;
        this.g = oVar;
        this.h = pVar;
        this.i = tVar;
        this.j = uVar;
        this.k = rVar;
        this.l = iVar;
        this.m = sVar;
        this.n = vVar;
        this.o = lVar;
        this.p = nVar;
        this.q = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.a, b0Var.a) && k71.k.b(this.b, b0Var.b) && k71.k.b(this.c, b0Var.c) && k71.k.b(this.d, b0Var.d) && k71.k.b(this.e, b0Var.e) && k71.k.b(this.f, b0Var.f) && k71.k.b(this.g, b0Var.g) && k71.k.b(this.h, b0Var.h) && k71.k.b(this.i, b0Var.i) && k71.k.b(this.j, b0Var.j) && k71.k.b(this.k, b0Var.k) && k71.k.b(this.l, b0Var.l) && k71.k.b(this.m, b0Var.m) && k71.k.b(this.n, b0Var.n) && k71.k.b(this.o, b0Var.o) && k71.k.b(this.p, b0Var.p) && k71.k.b(this.q, b0Var.q);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        h hVar = this.b;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        j jVar = this.c;
        int hashCode3 = (hashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        g gVar = this.d;
        int hashCode4 = (hashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        z zVar = this.e;
        int hashCode5 = (hashCode4 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        k kVar = this.f;
        int hashCode6 = (hashCode5 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        o oVar = this.g;
        int hashCode7 = (hashCode6 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        p pVar = this.h;
        int hashCode8 = (hashCode7 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        t tVar = this.i;
        int hashCode9 = (hashCode8 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        u uVar = this.j;
        int hashCode10 = (hashCode9 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        r rVar = this.k;
        int hashCode11 = (hashCode10 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        i iVar = this.l;
        int hashCode12 = (hashCode11 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        s sVar = this.m;
        int hashCode13 = (hashCode12 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        v vVar = this.n;
        int hashCode14 = (hashCode13 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        l lVar = this.o;
        int hashCode15 = (hashCode14 + (lVar == null ? 0 : lVar.a.hashCode())) * 31;
        n nVar = this.p;
        int hashCode16 = (hashCode15 + (nVar == null ? 0 : nVar.a.hashCode())) * 31;
        vx.a aVar = this.q;
        return hashCode16 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptionalSubject(__typename=");
        sb.append(this.a);
        sb.append(", onCommit=");
        sb.append(this.b);
        sb.append(", onGist=");
        sb.append(this.c);
        sb.append(", onCheckSuite=");
        sb.append(this.d);
        sb.append(", onWorkflowRun=");
        sb.append(this.e);
        sb.append(", onIssue=");
        sb.append(this.f);
        sb.append(", onPullRequest=");
        sb.append(this.g);
        sb.append(", onRelease=");
        sb.append(this.h);
        sb.append(", onRepositoryInvitation=");
        sb.append(this.i);
        sb.append(", onRepositoryVulnerabilityAlert=");
        sb.append(this.j);
        sb.append(", onRepositoryAdvisory=");
        sb.append(this.k);
        sb.append(", onDiscussion=");
        sb.append(this.l);
        sb.append(", onRepositoryDependabotAlertsThread=");
        sb.append(this.m);
        sb.append(", onSecurityAdvisory=");
        sb.append(this.n);
        sb.append(", onMemberFeatureRequestNotification=");
        sb.append(this.o);
        sb.append(", onProjectV2=");
        sb.append(this.p);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.q, ")");
    }
}
