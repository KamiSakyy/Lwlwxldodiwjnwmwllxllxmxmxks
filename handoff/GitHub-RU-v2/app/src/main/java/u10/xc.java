package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xc implements aaShadow.w0 {
    public static final uc Companion = new uc();
    public String r;

    public xc(String str) {
        this.r = str;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.d1.a;
        List list2 = fc0.d1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xc) && k71.k.b(this.r, ((xc) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.o8.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "66457abed5079981dcea1f3ed99a105a57b6f4f3dd82d7640ac413b4e91d1226";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchOrganizationForLogin($login: String!) { organization(login: $login) { __typename ...OrganizationNameAndAvatar id } }  fragment OrganizationNameAndAvatar on Organization { id login name avatarUrl __typename }";
    }

    public final String name() {
        return "FetchOrganizationForLogin";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("login");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("FetchOrganizationForLoginQuery(login=", this.r, ")");
    }
}
