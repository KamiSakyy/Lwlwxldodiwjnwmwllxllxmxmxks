package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c6 implements aaShadow.w0 {
    public static final y5 Companion = new y5();
    public String r;
    public String s;
    public String t;

    public c6(String str, String str2, String str3) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "commitOid");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.b0.a;
        List list2 = h10.b0.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj;
        return k71.k.b(this.r, c6Var.r) && k71.k.b(this.s, c6Var.s) && k71.k.b(this.t, c6Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.v3.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "b5c37713e120f71ce9e959f02b47a95dd0d9c6434437316162b04de4cc5e1c86";
    }

    public final String j() {
        Companion.getClass();
        return "query CommitByOid($owner: String!, $name: String!, $commitOid: String!) { repository(owner: $owner, name: $name) { id gitObject: object(expression: $commitOid) { __typename ...NodeIdFragment ...commitDetailFields } __typename } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment DiffLineFragment on DiffLine { type html left right text isMissingNewlineAtEnd }  fragment commitDetailFields on Commit { committedDate messageBodyHTML messageHeadlineHTML abbreviatedOid oid committedViaWeb authoredByCommitter url repository { id owner { id login } name __typename } committer { __typename avatarUrl name user { login id __typename } } author { __typename avatarUrl name user { login id __typename } } authors(first: 15) { nodes { __typename name avatarUrl user { login id __typename } } } diff { linesAdded linesDeleted filesChanged patches(first: 50) { nodes { linesAdded linesDeleted oldTreeEntry { path fileType { __typename ... on ImageFileType { url } } } newTreeEntry { path isGenerated submodule { gitUrl } fileType { __typename ... on ImageFileType { url } } } diffLines { __typename ...DiffLineFragment } isBinary isLargeDiff isSubmodule status id __typename } } } statusCheckRollup { id state __typename } associatedPullRequests(first: 5) { nodes { id state headRefName number title repository { name owner { id login } id __typename } isInMergeQueue __typename } } parents(first: 5) { nodes { abbreviatedOid id __typename } } id __typename }";
    }

    public final String name() {
        return "CommitByOid";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("commitOid");
        bVar.b(fVar, wVar, this.t);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("CommitByOidQuery(owner=", this.r, ", name=", this.s, ", commitOid="), this.t, ")");
    }
}
