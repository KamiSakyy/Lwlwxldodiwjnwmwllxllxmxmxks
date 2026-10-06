package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fv implements aaShadow.w0 {
    public static final cv Companion = new cv();
    public final String r;
    public final String s;
    public final String t;
    public final String u;

    public fv(String str, String str2, String str3, String str4) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(str3, "ref");
        k71.k.g(str4, "path");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.u3.a;
        List list2 = kz0.u3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv)) {
            return false;
        }
        fv fvVar = (fv) obj;
        return k71.k.b(this.r, fvVar.r) && k71.k.b(this.s, fvVar.s) && k71.k.b(this.t, fvVar.t) && k71.k.b(this.u, fvVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ml.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31);
    }

    public final String i() {
        return "8ae96de3d24e815c19ce773cd3986f892ff579adcdfd066e071279f8cb077ccd";
    }

    public final String j() {
        Companion.getClass();
        return "query RepoFile($owner: String!, $name: String!, $ref: String!, $path: String!) { repository(owner: $owner, name: $name) { __typename ...RepoFileFragment id } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment FileLineFragment on FileLine { html number }  fragment RepoFileFragment on Repository { id databaseId gitObject: object(expression: $ref) { __typename ...NodeIdFragment ... on Commit { file(path: $path) { extension path fileType { __typename ... on MarkdownFileType { contentHTML markDownFileLines: fileLines { __typename ...FileLineFragment } } ... on ImageFileType { url } ... on PdfFileType { url } ... on TextFileType { textFieldFileLines: fileLines { __typename ...FileLineFragment } } } } id } } viewerCanPush ref(qualifiedName: $ref) { id name viewerCanCommitToBranch target { id oid } __typename } owner { id avatarUrl } isInOrganization __typename }";
    }

    public final String name() {
        return "RepoFile";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("ref");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("path");
        bVar.b(fVar, wVar, this.u);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("RepoFileQuery(owner=", this.r, ", name=", this.s, ", ref="), this.t, ", path=", this.u, ")");
    }
}
