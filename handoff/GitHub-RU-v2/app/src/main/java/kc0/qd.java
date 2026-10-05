package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qd implements aa.w0 {
    public static final nd Companion = new nd();
    public final String r;

    public qd(String str) {
        this.r = str;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.g1.a;
        List list2 = en0.g1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qd) && k71.k.b(this.r, ((qd) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.b9.a, false);
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
