package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class of {
    public final String a;
    public final cq.r b;
    public final cq.b0 c;
    public final cq.z0 d;
    public final cq.j1 e;
    public final cq.t1 f;
    public final cq.d2 g;
    public final cq.d3 h;
    public final cq.b6 i;
    public final cq.j6 j;

    public of(String str, cq.r rVar, cq.b0 b0Var, cq.z0 z0Var, cq.j1 j1Var, cq.t1 t1Var, cq.d2 d2Var, cq.d3 d3Var, cq.b6 b6Var, cq.j6 j6Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = rVar;
        this.c = b0Var;
        this.d = z0Var;
        this.e = j1Var;
        this.f = t1Var;
        this.g = d2Var;
        this.h = d3Var;
        this.i = b6Var;
        this.j = j6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of)) {
            return false;
        }
        of ofVar = (of) obj;
        return k71.k.b(this.a, ofVar.a) && k71.k.b(this.b, ofVar.b) && k71.k.b(this.c, ofVar.c) && k71.k.b(this.d, ofVar.d) && k71.k.b(this.e, ofVar.e) && k71.k.b(this.f, ofVar.f) && k71.k.b(this.g, ofVar.g) && k71.k.b(this.h, ofVar.h) && k71.k.b(this.i, ofVar.i) && k71.k.b(this.j, ofVar.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cq.r rVar = this.b;
        int hashCode2 = (hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        cq.b0 b0Var = this.c;
        int hashCode3 = (hashCode2 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        cq.z0 z0Var = this.d;
        int hashCode4 = (hashCode3 + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        cq.j1 j1Var = this.e;
        int hashCode5 = (hashCode4 + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        cq.t1 t1Var = this.f;
        int hashCode6 = (hashCode5 + (t1Var == null ? 0 : t1Var.hashCode())) * 31;
        cq.d2 d2Var = this.g;
        int hashCode7 = (hashCode6 + (d2Var == null ? 0 : d2Var.hashCode())) * 31;
        cq.d3 d3Var = this.h;
        int hashCode8 = (hashCode7 + (d3Var == null ? 0 : d3Var.hashCode())) * 31;
        cq.b6 b6Var = this.i;
        int hashCode9 = (hashCode8 + (b6Var == null ? 0 : b6Var.hashCode())) * 31;
        cq.j6 j6Var = this.j;
        return hashCode9 + (j6Var != null ? j6Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", createdDiscussionFeedItemFragment=" + this.b + ", createdRepositoryFeedItemFragment=" + this.c + ", followRecommendationFeedItemFragment=" + this.d + ", followedUserFeedItemFragment=" + this.e + ", forkedRepositoryFeedItemFragment=" + this.f + ", mergedPullRequestFeedItemFragment=" + this.g + ", publishedReleaseFeedItemFragment=" + this.h + ", repositoryRecommendationFeedItemFragment=" + this.i + ", starredRepositoryFeedItemFragment=" + this.j + ")";
    }
}
