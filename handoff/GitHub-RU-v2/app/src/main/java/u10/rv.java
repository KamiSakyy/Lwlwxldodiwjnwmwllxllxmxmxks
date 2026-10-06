package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rv implements aaShadow.w0 {
    public static final ov Companion = new ov();
    public final String r;
    public final String s;

    public rv(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.x3.a;
        List list2 = fc0.x3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv)) {
            return false;
        }
        rv rvVar = (rv) obj;
        return k71.k.b(this.r, rvVar.r) && k71.k.b(this.s, rvVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.sl.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "c1270ad5b597e74b63e6c496507bd9ae882431e9bf2c29833c3f720eed024e26";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryLicenseContents($owner: String!, $name: String!) { repository(owner: $owner, name: $name) { licenseContents id __typename } }";
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
