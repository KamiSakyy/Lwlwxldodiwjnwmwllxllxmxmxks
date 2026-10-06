package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class te implements aaShadow.w0 {
    public static final qe Companion = new qe();
    public aa.u0 r;
    public aa.u0 s;
    public aa.u0 t;

    public te(aa.u0 u0Var, aa.u0 u0Var2, aa.u0 u0Var3) {
        this.r = u0Var;
        this.s = u0Var2;
        this.t = u0Var3;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.k1.a;
        List list2 = h10.k1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        return this.r.equals(teVar.r) && this.s.equals(teVar.s) && this.t.equals(teVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.v9.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f4.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "a48498b0782835388e52c7e3431949f3d8eeb409783e263db1a706aa774fde3a";
    }

    public final String j() {
        Companion.getClass();
        return "query ExploreTrending($language: String, $spokenLanguageCode: String, $period: TrendingPeriod) { trendingRepositories(language: $language, spokenLanguageCode: $spokenLanguageCode, period: $period, mobileSortOrder: true) { __typename ...RepositoryListItemFragment starsSince(period: $period) contributorsCount id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryListItemFragment on Repository { __typename shortDescriptionHTML id name url isPrivate isArchived owner { __typename id login ...avatarFragment } primaryLanguage { color name id __typename } usesCustomOpenGraphImage openGraphImageUrl isInOrganization hasIssuesEnabled isDiscussionsEnabled isFork parent { name owner { id login } id __typename } ...RepositoryStarsFragment lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } }";
    }

    public final String name() {
        return "ExploreTrending";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("language");
        aa.o0 o0Var = aa.c.i;
        f4.y(o0Var, fVar, wVar, this.r, "spokenLanguageCode");
        f4.y(o0Var, fVar, wVar, this.s, "period");
        aa.c.d(aa.c.b(n10.c.f)).d(fVar, wVar, this.t);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExploreTrendingQuery(language=");
        sb.append(this.r);
        sb.append(", spokenLanguageCode=");
        sb.append(this.s);
        sb.append(", period=");
        return f1.e.j(sb, this.t, ")");
    }
}
