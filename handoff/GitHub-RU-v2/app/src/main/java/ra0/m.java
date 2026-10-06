package ra0;

import aa.p0;
import aa.q0;
import aa.w0;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements w0 {
    public static final j Companion = new j();
    public final String r;
    public final String s;

    public m(String str, String str2) {
        k71.k.g(str2, "slug");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        pm.Companion.getClass();
        q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = ta0.c.a;
        List list2 = ta0.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.r, mVar.r) && k71.k.b(this.s, mVar.s);
    }

    public final p0 g() {
        return aa.c.c(sa0.f.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "57f22a42a28d67a4a982d7eae7f64b26518fe48fb335a1b17f97e90995501346";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchListMetadata($login: String!, $slug: String!) { list(login: $login, slug: $slug) { id slug name description __typename } }";
    }

    public final String name() {
        return "FetchListMetadata";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("login");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("slug");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("FetchListMetadataQuery(login=", this.r, ", slug=", this.s, ")");
    }
}
