package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ca0 implements aaShadow.w0 {
    public static final z90 Companion = new z90();
    public final String r;
    public final String s;

    public ca0(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.g6.a;
        List list2 = fc0.g6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca0)) {
            return false;
        }
        ca0 ca0Var = (ca0) obj;
        return k71.k.b(this.r, ca0Var.r) && k71.k.b(this.s, ca0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.lv.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "db628f0744f2ddc093d12a59bd37b9a7268b4af6bd765942243a7622bdaaf6b3";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerCanPushToRepository($owner: String!, $name: String!) { repository(owner: $owner, name: $name) { id viewerCanPush __typename } }";
    }

    public final String name() {
        return "ViewerCanPushToRepository";
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
        return x.i.g("ViewerCanPushToRepositoryQuery(owner=", this.r, ", name=", this.s, ")");
    }
}
