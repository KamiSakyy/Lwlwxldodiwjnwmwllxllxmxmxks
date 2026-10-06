package py0;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b0 implements w0 {
    public static final x Companion = new x();
    public final String r;
    public final String s;

    public b0(String str, String str2) {
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        su.Companion.getClass();
        q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = uy0.e.a;
        List list2 = uy0.e.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.r, b0Var.r) && k71.k.b(this.s, b0Var.s);
    }

    public final p0 g() {
        return aa.c.c(qy0.m.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "1ee068f6c4f1125b444c95816b61d45b870eee5d56be3092f1eb3376fb710f31";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryPullRequestTemplates($ownerName: String!, $repoName: String!) { repository(owner: $ownerName, name: $repoName) { id pullRequestTemplates: pullRequestTemplates { filename body } __typename } id __typename }";
    }

    public final String name() {
        return "RepositoryPullRequestTemplates";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("ownerName");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repoName");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("RepositoryPullRequestTemplatesQuery(ownerName=", this.r, ", repoName=", this.s, ")");
    }
}
