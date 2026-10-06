package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pe implements aaShadow.w0 {
    public static final je Companion = new je();
    public final aa.u0 r;
    public final aa1.b s;

    public /* synthetic */ pe(aa.u0 u0Var) {
        this(u0Var, aa.t0.d);
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.j1.a;
        List list2 = h10.j1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pe)) {
            return false;
        }
        pe peVar = (pe) obj;
        return k71.k.b(this.r, peVar.r) && k71.k.b(this.s, peVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.q9.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "2cad9339003d8764ead1bbe31f64ae1822e8bf0d2da6ed78197c62ded7fc5519";
    }

    public final String j() {
        Companion.getClass();
        return "query ExploreAwesomeTopics($number: Int = 5 , $after: String) { topic(name: \"awesome\") { id repositories(first: $number, after: $after, orderBy: { field: STARGAZERS direction: DESC } ) { nodes { __typename ...RepositoryListItemFragment contributorsCount id } pageInfo { hasNextPage endCursor } } __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment RepositoryListItemFragment on Repository { __typename shortDescriptionHTML id name url isPrivate isArchived owner { __typename id login ...avatarFragment } primaryLanguage { color name id __typename } usesCustomOpenGraphImage openGraphImageUrl isInOrganization hasIssuesEnabled isDiscussionsEnabled isFork parent { name owner { id login } id __typename } ...RepositoryStarsFragment lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } }";
    }

    public final String name() {
        return "ExploreAwesomeTopics";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        aa.u0 u0Var = this.r;
        if (u0Var != null) {
            fVar.z0("number");
            aa.c.d(aa.c.b(tp.a.a)).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("number");
            aa.c.l.b(fVar, wVar, 5);
        }
        aa.u0 u0Var2 = this.s;
        if (u0Var2 instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
    }

    public final String toString() {
        return "ExploreAwesomeTopicsQuery(number=" + this.r + ", after=" + this.s + ")";
    }

    public pe(aa.u0 u0Var, aa1.b bVar) {
        this.r = u0Var;
        this.s = bVar;
    }
}
