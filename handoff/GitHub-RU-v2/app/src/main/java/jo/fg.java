package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fg implements aa.w0 {
    public static final cg Companion = new cg();
    public final String r;

    public fg(String str) {
        this.r = str;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.p1.a;
        List list2 = h10.p1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fg) && k71.k.b(this.r, ((fg) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.wa.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "9075697964333c1bbfcd57eb762385d6a048d9b65b277980e2e8f2d6a30d4477";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchOrganizationForLogin($login: String!) { organization(login: $login) { __typename ...OrganizationNameAndAvatar id } id __typename }  fragment OrganizationNameAndAvatar on Organization { id login name avatarUrl __typename }";
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
