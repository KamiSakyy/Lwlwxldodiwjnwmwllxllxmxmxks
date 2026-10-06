package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i5 implements aaShadow.w0 {
    public static final f5 Companion = new f5();
    public final String r;

    public i5(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.z.a;
        List list2 = fc0.z.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5) && k71.k.b(this.r, ((i5) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.h3.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "e474a08d8ea42f5748dbf6280a3c46e958c9bb2c82a37e1ae7f91294a91a726c";
    }

    public final String j() {
        Companion.getClass();
        return "query Commit($id: ID!) { node(id: $id) { __typename ...commitDetailFields id } }  fragment DiffLineFragment on DiffLine { type html left right text isMissingNewlineAtEnd }  fragment commitDetailFields on Commit { committedDate messageBodyHTML messageHeadlineHTML abbreviatedOid oid committedViaWeb authoredByCommitter url repository { id owner { id login } name __typename } committer { __typename avatarUrl name user { login id __typename } } author { __typename avatarUrl name user { login id __typename } } authors(first: 15) { nodes { __typename name avatarUrl user { login id __typename } } } diff { linesAdded linesDeleted filesChanged patches(first: 50) { nodes { linesAdded linesDeleted oldTreeEntry { path fileType { __typename ... on ImageFileType { url } } } newTreeEntry { path isGenerated submodule { gitUrl } fileType { __typename ... on ImageFileType { url } } } diffLines { __typename ...DiffLineFragment } isBinary isLargeDiff isSubmodule status id __typename } } } statusCheckRollup { id state __typename } associatedPullRequests(first: 5) { nodes { id state headRefName number title repository { name owner { id login } id __typename } __typename } } parents(first: 5) { nodes { abbreviatedOid id __typename } } id __typename }";
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
