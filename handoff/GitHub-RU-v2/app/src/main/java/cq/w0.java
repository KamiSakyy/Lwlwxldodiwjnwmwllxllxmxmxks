package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 implements aa.h0 {
    public String a;
    public w b;
    public g0 c;
    public d1 d;
    public o1 e;
    public y1 f;
    public i2 g;
    public i3 h;
    public f6 i;
    public o6 j;

    public w0(String str, w wVar, g0 g0Var, d1 d1Var, o1 o1Var, y1 y1Var, i2 i2Var, i3 i3Var, f6 f6Var, o6 o6Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = wVar;
        this.c = g0Var;
        this.d = d1Var;
        this.e = o1Var;
        this.f = y1Var;
        this.g = i2Var;
        this.h = i3Var;
        this.i = f6Var;
        this.j = o6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return k71.k.b(this.a, w0Var.a) && k71.k.b(this.b, w0Var.b) && k71.k.b(this.c, w0Var.c) && k71.k.b(this.d, w0Var.d) && k71.k.b(this.e, w0Var.e) && k71.k.b(this.f, w0Var.f) && k71.k.b(this.g, w0Var.g) && k71.k.b(this.h, w0Var.h) && k71.k.b(this.i, w0Var.i) && k71.k.b(this.j, w0Var.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w wVar = this.b;
        int hashCode2 = (hashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        g0 g0Var = this.c;
        int hashCode3 = (hashCode2 + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        d1 d1Var = this.d;
        int hashCode4 = (hashCode3 + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
        o1 o1Var = this.e;
        int hashCode5 = (hashCode4 + (o1Var == null ? 0 : o1Var.hashCode())) * 31;
        y1 y1Var = this.f;
        int hashCode6 = (hashCode5 + (y1Var == null ? 0 : y1Var.hashCode())) * 31;
        i2 i2Var = this.g;
        int hashCode7 = (hashCode6 + (i2Var == null ? 0 : i2Var.hashCode())) * 31;
        i3 i3Var = this.h;
        int hashCode8 = (hashCode7 + (i3Var == null ? 0 : i3Var.hashCode())) * 31;
        f6 f6Var = this.i;
        int hashCode9 = (hashCode8 + (f6Var == null ? 0 : f6Var.hashCode())) * 31;
        o6 o6Var = this.j;
        return hashCode9 + (o6Var != null ? o6Var.hashCode() : 0);
    }

    public final String toString() {
        return "FeedItemsNoRelatedItems(__typename=" + this.a + ", createdDiscussionFeedItemFragmentNoRelatedItems=" + this.b + ", createdRepositoryFeedItemFragmentNoRelatedItems=" + this.c + ", followRecommendationFeedItemFragmentNoRelatedItems=" + this.d + ", followedUserFeedItemFragmentNoRelatedItems=" + this.e + ", forkedRepositoryFeedItemFragmentNoRelatedItems=" + this.f + ", mergedPullRequestFeedItemFragmentNoRelatedItems=" + this.g + ", publishedReleaseFeedItemFragmentNoRelatedItems=" + this.h + ", repositoryRecommendationFeedItemFragmentNoRelatedItems=" + this.i + ", starredRepositoryFeedItemFragmentNoRelatedItems=" + this.j + ")";
    }
}
