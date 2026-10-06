package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s90 implements aaShadow.w0 {
    public static final p90 Companion = new p90();
    public String r;

    public s90(String str) {
        k71.k.g(str, "login");
        this.r = str;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.e6.a;
        List list2 = fc0.e6.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s90) && k71.k.b(this.r, ((s90) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.gv.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "13771d2deb3b1347f46eb7212633e3a6e12df22f0a07e71612eabe38e34a773d";
    }

    public final String j() {
        Companion.getClass();
        return "query UserQuery($login: String!) { user(login: $login) { __typename ...avatarFragment login id name } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }";
    }

    public final String name() {
        return "UserQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("login");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("UserQuery(login=", this.r, ")");
    }
}
