package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ce implements aaShadow.w0 {
    public static final xd Companion = new xd();

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.i1.a;
        List list2 = kz0.i1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == ce.class;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.h9.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(ce.class).hashCode();
    }

    public final String i() {
        return "2f569b67f3b6ec083243fd0b0ba41457dee1a7b84d36a9ca1a23f1ecfaf4778b";
    }

    public final String j() {
        Companion.getClass();
        return "query FeedAwesomeTop5Topics { topic(name: \"awesome\") { id repositories(first: 5, orderBy: { field: STARGAZERS direction: DESC } ) { nodes { __typename ...RepositoryFeedFragment id } } __typename } id __typename }  fragment RepositoryStarsFragment on Repository { __typename id stargazerCount viewerHasStarred }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment RepositoryFeedHeader on Repository { id name url owner { __typename id login url ...avatarFragment ... on User { __typename id name } ... on Organization { __typename id name } } usesCustomOpenGraphImage openGraphImageUrl lists(first: 100, onlyOwnedByViewer: true) { nodes { id name __typename } } __typename }  fragment RepositoryFeedFragment on Repository { __typename id contributorsCount descriptionHTML primaryLanguage { color name id __typename } ...RepositoryStarsFragment ...RepositoryFeedHeader }";
    }

    public final String name() {
        return "FeedAwesomeTop5Topics";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
