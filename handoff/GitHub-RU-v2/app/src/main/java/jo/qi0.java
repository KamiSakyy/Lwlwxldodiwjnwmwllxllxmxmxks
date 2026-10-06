package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qi0 implements aaShadow.w0 {
    public static final ni0 Companion = new ni0();
    public String r;
    public String s;

    public qi0(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.k7.a;
        List list2 = h10.k7.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi0)) {
            return false;
        }
        qi0 qi0Var = (qi0) obj;
        return k71.k.b(this.r, qi0Var.r) && k71.k.b(this.s, qi0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.r10.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "d734abc2bb53ea482e62222cace6a75af93ee1b5be1452643d05dd072dcee9a7";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerCanPushToRepository($owner: String!, $name: String!) { repository(owner: $owner, name: $name) { id viewerCanPush __typename } id __typename }";
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
