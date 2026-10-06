package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sf0 implements aaShadow.w0 {
    public static final pf0 Companion = new pf0();
    public String r;

    public sf0(String str) {
        k71.k.g(str, "login");
        this.r = str;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.z6.a;
        List list2 = kz0.z6.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf0) && k71.k.b(this.r, ((sf0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.rz.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "9de8e6f6460615c086e100aeadd5e98b575cb9358dfdda4e1f1924770fa42a33";
    }

    public final String j() {
        Companion.getClass();
        return "query UserQuery($login: String!) { user(login: $login) { __typename ...avatarFragment login id name } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }";
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
