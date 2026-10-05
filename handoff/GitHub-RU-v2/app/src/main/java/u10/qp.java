package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qp implements aa.w0 {
    public static final vo Companion = new vo();
    public final String r;
    public final String s;
    public final String t;
    public final aa.u0 u;

    public qp(String str, String str2, String str3, aa.u0 u0Var) {
        k71.k.g(str, "repositoryOwner");
        k71.k.g(str2, "repositoryName");
        k71.k.g(str3, "tagName");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = u0Var;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.z2.a;
        List list2 = fc0.z2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp)) {
            return false;
        }
        qp qpVar = (qp) obj;
        return k71.k.b(this.r, qpVar.r) && k71.k.b(this.s, qpVar.s) && k71.k.b(this.t, qpVar.t) && this.u.equals(qpVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.wg.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + a0.s0.b(30, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), 31);
    }

    public final String i() {
        return "38c0ab9d685e61a811793ce88ff1873b3bf969c6e4a00ee4ad21409f05172ae8";
    }

    public final String j() {
        Companion.getClass();
        return "query ReleaseQuery($repositoryOwner: String!, $repositoryName: String!, $tagName: String!, $number: Int!, $after: String) { repository(owner: $repositoryOwner, name: $repositoryName) { id owner { __typename id ...avatarFragment } ref(qualifiedName: $tagName) { id target { __typename id ... on Tag { id target { __typename id ... on Commit { id oid abbreviatedOid signature { isValid } message messageBodyHTML authoredDate } } message name commitUrl tagger { user { __typename ...actorFields id } } } } __typename } release(tagName: $tagName) { __typename id url name tagName tagCommit { id oid abbreviatedOid __typename } author { __typename ...actorFields id } ...ReactionFragment descriptionHTML isPrerelease isDraft isLatest createdAt publishedAt releaseAssets(first: $number, after: $after) { pageInfo { hasNextPage endCursor } nodes { id name size url contentType __typename } } discussion { id number comments(last: 3) { totalCount nodes { __typename id author { __typename ...actorFields } createdAt lastEditedAt body ...MinimizableCommentFragment } } __typename } mentions(after: null, first: 5) { totalCount nodes { __typename ...actorFields id } } } __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }";
    }

    public final String name() {
        return "ReleaseQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repositoryOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("tagName");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("number");
        fVar.z(30);
        fVar.z0("after");
        aa.c.d(aa.c.i).d(fVar, wVar, this.u);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ReleaseQuery(repositoryOwner=", this.r, ", repositoryName=", this.s, ", tagName=");
        o.append(this.t);
        o.append(", number=30, after=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }
}
