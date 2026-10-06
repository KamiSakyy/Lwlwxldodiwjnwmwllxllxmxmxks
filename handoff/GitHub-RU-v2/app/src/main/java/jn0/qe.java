package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qe {
    public final String a;
    public final ap0.j b;
    public final ap0.t c;
    public final ap0.r0 d;
    public final ap0.b1 e;
    public final ap0.l1 f;
    public final ap0.v1 g;
    public final ap0.h2 h;
    public final ap0.f5 i;
    public final ap0.n5 j;

    public qe(String str, ap0.j jVar, ap0.t tVar, ap0.r0 r0Var, ap0.b1 b1Var, ap0.l1 l1Var, ap0.v1 v1Var, ap0.h2 h2Var, ap0.f5 f5Var, ap0.n5 n5Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = jVar;
        this.c = tVar;
        this.d = r0Var;
        this.e = b1Var;
        this.f = l1Var;
        this.g = v1Var;
        this.h = h2Var;
        this.i = f5Var;
        this.j = n5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe)) {
            return false;
        }
        qe qeVar = (qe) obj;
        return k71.k.b(this.a, qeVar.a) && k71.k.b(this.b, qeVar.b) && k71.k.b(this.c, qeVar.c) && k71.k.b(this.d, qeVar.d) && k71.k.b(this.e, qeVar.e) && k71.k.b(this.f, qeVar.f) && k71.k.b(this.g, qeVar.g) && k71.k.b(this.h, qeVar.h) && k71.k.b(this.i, qeVar.i) && k71.k.b(this.j, qeVar.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ap0.j jVar = this.b;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        ap0.t tVar = this.c;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        ap0.r0 r0Var = this.d;
        int hashCode4 = (hashCode3 + (r0Var == null ? 0 : r0Var.hashCode())) * 31;
        ap0.b1 b1Var = this.e;
        int hashCode5 = (hashCode4 + (b1Var == null ? 0 : b1Var.hashCode())) * 31;
        ap0.l1 l1Var = this.f;
        int hashCode6 = (hashCode5 + (l1Var == null ? 0 : l1Var.hashCode())) * 31;
        ap0.v1 v1Var = this.g;
        int hashCode7 = (hashCode6 + (v1Var == null ? 0 : v1Var.hashCode())) * 31;
        ap0.h2 h2Var = this.h;
        int hashCode8 = (hashCode7 + (h2Var == null ? 0 : h2Var.hashCode())) * 31;
        ap0.f5 f5Var = this.i;
        int hashCode9 = (hashCode8 + (f5Var == null ? 0 : f5Var.hashCode())) * 31;
        ap0.n5 n5Var = this.j;
        return hashCode9 + (n5Var != null ? n5Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", createdDiscussionFeedItemFragment=" + this.b + ", createdRepositoryFeedItemFragment=" + this.c + ", followRecommendationFeedItemFragment=" + this.d + ", followedUserFeedItemFragment=" + this.e + ", forkedRepositoryFeedItemFragment=" + this.f + ", mergedPullRequestFeedItemFragment=" + this.g + ", publishedReleaseFeedItemFragment=" + this.h + ", repositoryRecommendationFeedItemFragment=" + this.i + ", starredRepositoryFeedItemFragment=" + this.j + ")";
    }
}
