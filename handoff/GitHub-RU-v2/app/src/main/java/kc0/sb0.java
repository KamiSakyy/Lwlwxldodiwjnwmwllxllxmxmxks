package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sb0 implements aaShadow.w0 {
    public static final pb0 Companion = new pb0();
    public String r;

    public sb0(String str) {
        k71.k.g(str, "login");
        this.r = str;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.l6.a;
        List list2 = en0.l6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sb0) && k71.k.b(this.r, ((sb0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.sw.a, false);
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
