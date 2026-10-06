package rz;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b1 implements aa.w0 {
    public static final w0 Companion = new w0();
    public final String r;
    public final int s;

    public b1(String str, int i) {
        k71.k.g(str, "orgLogin");
        this.r = str;
        this.s = i;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = b00.i.a;
        List list2 = b00.i.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return k71.k.b(this.r, b1Var.r) && this.s == b1Var.s;
    }

    public final aa.p0 g() {
        return aa.c.c(sz.f0.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.s) + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "f7dafcafd31fe1005631ae3e8b3f4185773dc31db3df55fa20dc26168aafa01f";
    }

    public final String j() {
        Companion.getClass();
        return "query ResolveProjectType($orgLogin: String!, $number: Int!) { repositoryOwner(login: $orgLogin) { __typename ...OrganizationNameAndAvatar ... on ProjectV2Owner { __typename ...NodeIdFragment projectV2(number: $number) { id __typename } } } id __typename }  fragment OrganizationNameAndAvatar on Organization { id login name avatarUrl __typename }  fragment NodeIdFragment on Node { id __typename }";
    }

    public final String name() {
        return "ResolveProjectType";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("orgLogin");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("number");
        fVar.z(this.s);
    }

    public final String toString() {
        return com.github.rudroid.m0.b(this.s, "ResolveProjectTypeQuery(orgLogin=", this.r, ", number=", ")");
    }
}
