package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gi0 implements aaShadow.w0 {
    public static final di0 Companion = new di0();
    public final String r;

    public gi0(String str) {
        k71.k.g(str, "login");
        this.r = str;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.i7.a;
        List list2 = h10.i7.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi0) && k71.k.b(this.r, ((gi0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.m10.a, false);
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
