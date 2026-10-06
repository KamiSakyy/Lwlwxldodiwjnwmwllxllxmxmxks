package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cz implements aaShadow.w0 {
    public static final ty Companion = new ty();
    public String r;
    public String s;
    public String t;
    public String u;
    public aa1.b v;

    public cz(aa1.b bVar, String str, String str2, String str3, String str4) {
        k71.k.g(str, "ownerName");
        k71.k.g(str2, "repoName");
        k71.k.g(str3, "baseRefName");
        k71.k.g(str4, "headRefName");
        k71.k.g(bVar, "after");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
        this.v = bVar;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.g4.a;
        List list2 = kz0.g4.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz)) {
            return false;
        }
        cz czVar = (cz) obj;
        return k71.k.b(this.r, czVar.r) && k71.k.b(this.s, czVar.s) && k71.k.b(this.t, czVar.t) && k71.k.b(this.u, czVar.u) && k71.k.b(this.v, czVar.v);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ho.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + a0.s0.b(30, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), this.u, 31), 31);
    }

    public final String i() {
        return "73060824cdfc247a7c3d17833a41bc41dedf29e08f00b333e0e76f341b17025e";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryCompareRefsFilesChanged($ownerName: String!, $repoName: String!, $baseRefName: String!, $headRefName: String!, $first: Int!, $after: String) { repository(owner: $ownerName, name: $repoName) { id comparison: ref(qualifiedName: $baseRefName) { id compare(headRef: $headRefName) { id diff { linesAdded linesDeleted filesChanged patches(first: $first, after: $after) { pageInfo { endCursor hasNextPage } nodes { __typename id ...PatchFileFragment } } } __typename } __typename } __typename } id __typename }  fragment FileTypeFragment on File { __typename ... on ImageFileType { url } ... on PdfFileType { url } ... on MarkdownFileType { __typename } ... on TextFileType { __typename } }  fragment DiffLineFragment on DiffLine { type html left right text isMissingNewlineAtEnd }  fragment PatchFileFragment on Patch { id linesAdded linesDeleted oldTreeEntry { path fileType { __typename ... on ImageFileType { url } } } newTreeEntry { path isGenerated submodule { gitUrl } lineCount fileType { __typename ...FileTypeFragment } } diffLines { __typename ...DiffLineFragment } isBinary isLargeDiff isSubmodule status __typename }";
    }

    public final String name() {
        return "RepositoryCompareRefsFilesChanged";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("ownerName");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repoName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("baseRefName");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("headRefName");
        bVar.b(fVar, wVar, this.u);
        fVar.z0("first");
        fVar.z(30);
        aa.u0 u0Var = this.v;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryCompareRefsFilesChangedQuery(ownerName=", this.r, ", repoName=", this.s, ", baseRefName=");
        f1.e.x(o, this.t, ", headRefName=", this.u, ", first=30, after=");
        return f1.e.k(o, this.v, ")");
    }
}
