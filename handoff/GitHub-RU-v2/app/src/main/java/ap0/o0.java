package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 implements aa.h0 {
    public final String a;
    public final o b;
    public final y c;
    public final v0 d;
    public final g1 e;
    public final q1 f;
    public final a2 g;
    public final m2 h;
    public final j5 i;
    public final s5 j;

    public o0(String str, o oVar, y yVar, v0 v0Var, g1 g1Var, q1 q1Var, a2 a2Var, m2 m2Var, j5 j5Var, s5 s5Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = oVar;
        this.c = yVar;
        this.d = v0Var;
        this.e = g1Var;
        this.f = q1Var;
        this.g = a2Var;
        this.h = m2Var;
        this.i = j5Var;
        this.j = s5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return k71.k.b(this.a, o0Var.a) && k71.k.b(this.b, o0Var.b) && k71.k.b(this.c, o0Var.c) && k71.k.b(this.d, o0Var.d) && k71.k.b(this.e, o0Var.e) && k71.k.b(this.f, o0Var.f) && k71.k.b(this.g, o0Var.g) && k71.k.b(this.h, o0Var.h) && k71.k.b(this.i, o0Var.i) && k71.k.b(this.j, o0Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o oVar = this.b;
        int hashCode2 = (hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        y yVar = this.c;
        int hashCode3 = (hashCode2 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        v0 v0Var = this.d;
        int hashCode4 = (hashCode3 + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        g1 g1Var = this.e;
        int hashCode5 = (hashCode4 + (g1Var == null ? 0 : g1Var.hashCode())) * 31;
        q1 q1Var = this.f;
        int hashCode6 = (hashCode5 + (q1Var == null ? 0 : q1Var.hashCode())) * 31;
        a2 a2Var = this.g;
        int hashCode7 = (hashCode6 + (a2Var == null ? 0 : a2Var.hashCode())) * 31;
        m2 m2Var = this.h;
        int hashCode8 = (hashCode7 + (m2Var == null ? 0 : m2Var.hashCode())) * 31;
        j5 j5Var = this.i;
        int hashCode9 = (hashCode8 + (j5Var == null ? 0 : j5Var.hashCode())) * 31;
        s5 s5Var = this.j;
        return hashCode9 + (s5Var != null ? s5Var.hashCode() : 0);
    }

    public final String toString() {
        return "FeedItemsNoRelatedItems(__typename=" + this.a + ", createdDiscussionFeedItemFragmentNoRelatedItems=" + this.b + ", createdRepositoryFeedItemFragmentNoRelatedItems=" + this.c + ", followRecommendationFeedItemFragmentNoRelatedItems=" + this.d + ", followedUserFeedItemFragmentNoRelatedItems=" + this.e + ", forkedRepositoryFeedItemFragmentNoRelatedItems=" + this.f + ", mergedPullRequestFeedItemFragmentNoRelatedItems=" + this.g + ", publishedReleaseFeedItemFragmentNoRelatedItems=" + this.h + ", repositoryRecommendationFeedItemFragmentNoRelatedItems=" + this.i + ", starredRepositoryFeedItemFragmentNoRelatedItems=" + this.j + ")";
    }
}
