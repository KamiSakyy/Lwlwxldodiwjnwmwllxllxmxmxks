package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v20 implements aaShadow.w0 {
    public static final s20 Companion = new s20();
    public String r;
    public String s;

    public v20(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.u4.a;
        List list2 = h10.u4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v20)) {
            return false;
        }
        v20 v20Var = (v20) obj;
        return k71.k.b(this.r, v20Var.r) && k71.k.b(this.s, v20Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.br.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "417c5627431de9da45a598da3a06bf69161a84513bd8ed711a55ff921263a572";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryLicenseContents($owner: String!, $name: String!) { repository(owner: $owner, name: $name) { licenseContents id __typename } id __typename }";
    }

    public final String name() {
        return "RepositoryLicenseContents";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("RepositoryLicenseContentsQuery(owner=", this.r, ", name=", this.s, ")");
    }
}
