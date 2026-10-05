package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g6 implements aa.w0 {
    public static final d6 Companion = new d6();
    public final String r;

    public g6(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.c0.a;
        List list2 = h10.c0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6) && k71.k.b(this.r, ((g6) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.y3.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "8fc88fbf8ef3cb8e5e88693bde7e67120237c7dad8151780e3e142debdc90056";
    }

    public final String j() {
        Companion.getClass();
        return "query Commit($id: ID!) { node(id: $id) { __typename ...commitDetailFields id } id __typename }  fragment DiffLineFragment on DiffLine { type html left right text isMissingNewlineAtEnd }  fragment commitDetailFields on Commit { committedDate messageBodyHTML messageHeadlineHTML abbreviatedOid oid committedViaWeb authoredByCommitter url repository { id owner { id login } name __typename } committer { __typename avatarUrl name user { login id __typename } } author { __typename avatarUrl name user { login id __typename } } authors(first: 15) { nodes { __typename name avatarUrl user { login id __typename } } } diff { linesAdded linesDeleted filesChanged patches(first: 50) { nodes { linesAdded linesDeleted oldTreeEntry { path fileType { __typename ... on ImageFileType { url } } } newTreeEntry { path isGenerated submodule { gitUrl } fileType { __typename ... on ImageFileType { url } } } diffLines { __typename ...DiffLineFragment } isBinary isLargeDiff isSubmodule status id __typename } } } statusCheckRollup { id state __typename } associatedPullRequests(first: 5) { nodes { id state headRefName number title repository { name owner { id login } id __typename } isInMergeQueue __typename } } parents(first: 5) { nodes { abbreviatedOid id __typename } } id __typename }";
    }

    public final String name() {
        return "Commit";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("CommitQuery(id=", this.r, ")");
    }
}
