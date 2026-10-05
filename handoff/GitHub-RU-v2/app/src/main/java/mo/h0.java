package mo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 implements aa.h0 {
    public final String a;
    public final d b;
    public final e c;
    public final f d;
    public final g e;
    public final h f;
    public final i g;
    public final k h;
    public final l i;
    public final m j;
    public final n k;
    public final o l;
    public final p m;
    public final q n;
    public final r o;
    public final vx.a p;

    public h0(String str, d dVar, e eVar, f fVar, g gVar, h hVar, i iVar, k kVar, l lVar, m mVar, n nVar, o oVar, p pVar, q qVar, r rVar, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = dVar;
        this.c = eVar;
        this.d = fVar;
        this.e = gVar;
        this.f = hVar;
        this.g = iVar;
        this.h = kVar;
        this.i = lVar;
        this.j = mVar;
        this.k = nVar;
        this.l = oVar;
        this.m = pVar;
        this.n = qVar;
        this.o = rVar;
        this.p = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return k71.k.b(this.a, h0Var.a) && k71.k.b(this.b, h0Var.b) && k71.k.b(this.c, h0Var.c) && k71.k.b(this.d, h0Var.d) && k71.k.b(this.e, h0Var.e) && k71.k.b(this.f, h0Var.f) && k71.k.b(this.g, h0Var.g) && k71.k.b(this.h, h0Var.h) && k71.k.b(this.i, h0Var.i) && k71.k.b(this.j, h0Var.j) && k71.k.b(this.k, h0Var.k) && k71.k.b(this.l, h0Var.l) && k71.k.b(this.m, h0Var.m) && k71.k.b(this.n, h0Var.n) && k71.k.b(this.o, h0Var.o) && k71.k.b(this.p, h0Var.p);
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
        k kVar = this.h;
        int hashCode8 = (hashCode7 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        l lVar = this.i;
        int hashCode9 = (hashCode8 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        m mVar = this.j;
        int hashCode10 = (hashCode9 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        n nVar = this.k;
        int hashCode11 = (hashCode10 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        o oVar = this.l;
        int hashCode12 = (hashCode11 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        p pVar = this.m;
        int hashCode13 = (hashCode12 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        q qVar = this.n;
        int hashCode14 = (hashCode13 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        r rVar = this.o;
        int hashCode15 = (hashCode14 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        vx.a aVar = this.p;
        return hashCode15 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "UnlockingModelFragment(__typename=" + this.a + ", onAchievementRepositoryList=" + this.b + ", onCommitComment=" + this.c + ", onDiscussion=" + this.d + ", onDiscussionComment=" + this.e + ", onIssue=" + this.f + ", onIssueComment=" + this.g + ", onPullRequest=" + this.h + ", onPullRequestReview=" + this.i + ", onPullRequestReviewComment=" + this.j + ", onRelease=" + this.k + ", onRepository=" + this.l + ", onRepositoryAdvisory=" + this.m + ", onRepositoryAdvisoryComment=" + this.n + ", onSponsorship=" + this.o + ", nodeIdFragment=" + this.p + ")";
    }
}
