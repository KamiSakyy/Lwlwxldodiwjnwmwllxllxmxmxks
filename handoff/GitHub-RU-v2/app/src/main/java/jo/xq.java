package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xq implements aa.w0 {
    public static final rq Companion = new rq();
    public final String r;
    public final String s;

    public xq(String str, String str2) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.h3.a;
        List list2 = h10.h3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq)) {
            return false;
        }
        xq xqVar = (xq) obj;
        return k71.k.b(this.r, xqVar.r) && k71.k.b(this.s, xqVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.bi.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "5fec49e2df238f6cc4a49c8817fc5709308e98221b65287e9ecd220ba0daf464";
    }

    public final String j() {
        Companion.getClass();
        return "query PinnedDiscussionsQuery($repositoryOwner: String!, $repositoryName: String!) { repository(owner: $repositoryOwner, name: $repositoryName) { id pinnedDiscussions(first: 10) { nodes { id discussion { number title author { __typename ...actorFields } category { name id __typename } id __typename } pattern gradientStopColors __typename } } __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }";
    }

    public final String name() {
        return "PinnedDiscussionsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("PinnedDiscussionsQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ")");
    }
}
