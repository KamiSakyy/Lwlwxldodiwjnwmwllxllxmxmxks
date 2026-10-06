package nc0;

import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 implements aa.h0 {
    public String a;
    public d b;
    public e c;
    public f d;
    public g e;
    public h f;
    public i g;
    public j h;
    public k i;
    public l j;
    public m k;
    public n l;
    public o m;
    public p n;
    public q o;
    public r p;
    public bl0.a q;

    public g0(String str, d dVar, e eVar, f fVar, g gVar, h hVar, i iVar, j jVar, k kVar, l lVar, m mVar, n nVar, o oVar, p pVar, q qVar, r rVar, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = dVar;
        this.c = eVar;
        this.d = fVar;
        this.e = gVar;
        this.f = hVar;
        this.g = iVar;
        this.h = jVar;
        this.i = kVar;
        this.j = lVar;
        this.k = mVar;
        this.l = nVar;
        this.m = oVar;
        this.n = pVar;
        this.o = qVar;
        this.p = rVar;
        this.q = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && k71.k.b(this.b, g0Var.b) && k71.k.b(this.c, g0Var.c) && k71.k.b(this.d, g0Var.d) && k71.k.b(this.e, g0Var.e) && k71.k.b(this.f, g0Var.f) && k71.k.b(this.g, g0Var.g) && k71.k.b(this.h, g0Var.h) && k71.k.b(this.i, g0Var.i) && k71.k.b(this.j, g0Var.j) && k71.k.b(this.k, g0Var.k) && k71.k.b(this.l, g0Var.l) && k71.k.b(this.m, g0Var.m) && k71.k.b(this.n, g0Var.n) && k71.k.b(this.o, g0Var.o) && k71.k.b(this.p, g0Var.p) && k71.k.b(this.q, g0Var.q);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d dVar = this.b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.a.hashCode())) * 31;
        e eVar = this.c;
        int hashCode3 = (hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        f fVar = this.d;
        int hashCode4 = (hashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        g gVar = this.e;
        int hashCode5 = (hashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.f;
        int hashCode6 = (hashCode5 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        i iVar = this.g;
        int hashCode7 = (hashCode6 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        j jVar = this.h;
        int hashCode8 = (hashCode7 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        k kVar = this.i;
        int hashCode9 = (hashCode8 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        l lVar = this.j;
        int hashCode10 = (hashCode9 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        m mVar = this.k;
        int hashCode11 = (hashCode10 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        n nVar = this.l;
        int hashCode12 = (hashCode11 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        o oVar = this.m;
        int hashCode13 = (hashCode12 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        p pVar = this.n;
        int hashCode14 = (hashCode13 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        q qVar = this.o;
        int hashCode15 = (hashCode14 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        r rVar = this.p;
        int hashCode16 = (hashCode15 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        bl0.a aVar = this.q;
        return hashCode16 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnlockingModelFragment(__typename=");
        sb.append(this.a);
        sb.append(", onAchievementRepositoryList=");
        sb.append(this.b);
        sb.append(", onCommitComment=");
        sb.append(this.c);
        sb.append(", onDiscussion=");
        sb.append(this.d);
        sb.append(", onDiscussionComment=");
        sb.append(this.e);
        sb.append(", onIssue=");
        sb.append(this.f);
        sb.append(", onIssueComment=");
        sb.append(this.g);
        sb.append(", onPullRequest=");
        sb.append(this.h);
        sb.append(", onPullRequestReview=");
        sb.append(this.i);
        sb.append(", onPullRequestReviewComment=");
        sb.append(this.j);
        sb.append(", onRelease=");
        sb.append(this.k);
        sb.append(", onRepository=");
        sb.append(this.l);
        sb.append(", onRepositoryAdvisory=");
        sb.append(this.m);
        sb.append(", onRepositoryAdvisoryComment=");
        sb.append(this.n);
        sb.append(", onTeamDiscussion=");
        sb.append(this.o);
        sb.append(", onTeamDiscussionComment=");
        sb.append(this.p);
        sb.append(", nodeIdFragment=");
        return f4.q(sb, this.q, ")");
    }
}
