package ly;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements w0 {
    public static final j Companion = new j();
    public String r;
    public String s;

    public m(String str, String str2) {
        k71.k.g(str2, "slug");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = ny.c.a;
        List list2 = ny.c.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
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
        return aa.c.c(my.f.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "32d043bca520c0674030e53da22fe4adb32dc2f4290a21f2d59d1593f083a1ec";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchListMetadata($login: String!, $slug: String!) { list(login: $login, slug: $slug) { id slug name description __typename } id __typename }";
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
