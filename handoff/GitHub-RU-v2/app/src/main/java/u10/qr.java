package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qr implements aa.w0 {
    public static final nr Companion = new nr();
    public final String r;
    public final String s;
    public final String t;
    public final String u;

    public qr(String str, String str2, String str3, String str4) {
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
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.i3.a;
        List list2 = fc0.i3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr)) {
            return false;
        }
        qr qrVar = (qr) obj;
        return k71.k.b(this.r, qrVar.r) && k71.k.b(this.s, qrVar.s) && k71.k.b(this.t, qrVar.t) && k71.k.b(this.u, qrVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.wi.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31);
    }

    public final String i() {
        return "b667286f331ffa87a612c758ace238bad4bf11c5eaf269f7842a68c44cf0e5f2";
    }

    public final String j() {
        Companion.getClass();
        return "query RepoFile($owner: String!, $name: String!, $ref: String!, $path: String!) { repository(owner: $owner, name: $name) { __typename ...RepoFileFragment id } }  fragment NodeIdFragment on Node { id __typename }  fragment FileLineFragment on FileLine { html number }  fragment RepoFileFragment on Repository { id databaseId gitObject: object(expression: $ref) { __typename ...NodeIdFragment ... on Commit { file(path: $path) { extension path fileType { __typename ... on MarkdownFileType { contentHTML markDownFileLines: fileLines { __typename ...FileLineFragment } } ... on ImageFileType { url } ... on PdfFileType { url } ... on TextFileType { textFieldFileLines: fileLines { __typename ...FileLineFragment } } } } id } } viewerCanPush ref(qualifiedName: $ref) { id name viewerCanCommitToBranch target { id oid } __typename } owner { id avatarUrl } isInOrganization __typename }";
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
