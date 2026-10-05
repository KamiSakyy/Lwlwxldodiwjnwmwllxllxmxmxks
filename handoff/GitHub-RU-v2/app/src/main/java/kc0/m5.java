package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m5 implements aa.w0 {
    public static final i5 Companion = new i5();
    public final String r;
    public final String s;
    public final String t;

    public m5(String str, String str2, String str3) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "commitOid");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.z.a;
        List list2 = en0.z.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        return k71.k.b(this.r, m5Var.r) && k71.k.b(this.s, m5Var.s) && k71.k.b(this.t, m5Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.k3.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "e1856d36fe3e46e34779824a2ad611a8446269597643da9f3e41ccbd2eebd7fe";
    }

    public final String j() {
        Companion.getClass();
        return "query CommitByOid($owner: String!, $name: String!, $commitOid: String!) { repository(owner: $owner, name: $name) { id gitObject: object(expression: $commitOid) { __typename ...NodeIdFragment ...commitDetailFields } __typename } }  fragment NodeIdFragment on Node { id __typename }  fragment DiffLineFragment on DiffLine { type html left right text isMissingNewlineAtEnd }  fragment commitDetailFields on Commit { committedDate messageBodyHTML messageHeadlineHTML abbreviatedOid oid committedViaWeb authoredByCommitter url repository { id owner { id login } name __typename } committer { __typename avatarUrl name user { login id __typename } } author { __typename avatarUrl name user { login id __typename } } authors(first: 15) { nodes { __typename name avatarUrl user { login id __typename } } } diff { linesAdded linesDeleted filesChanged patches(first: 50) { nodes { linesAdded linesDeleted oldTreeEntry { path fileType { __typename ... on ImageFileType { url } } } newTreeEntry { path isGenerated submodule { gitUrl } fileType { __typename ... on ImageFileType { url } } } diffLines { __typename ...DiffLineFragment } isBinary isLargeDiff isSubmodule status id __typename } } } statusCheckRollup { id state __typename } associatedPullRequests(first: 5) { nodes { id state headRefName number title repository { name owner { id login } id __typename } isInMergeQueue __typename } } parents(first: 5) { nodes { abbreviatedOid id __typename } } id __typename }";
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
