package m00;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 implements w0 {
    public static final w Companion = new w();
    public final String r;
    public final String s;

    public a0(String str, String str2) {
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = r00.e.a;
        List list2 = r00.e.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return k71.k.b(this.r, a0Var.r) && k71.k.b(this.s, a0Var.s);
    }

    public final p0 g() {
        return aa.c.c(n00.m.a, false);
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
