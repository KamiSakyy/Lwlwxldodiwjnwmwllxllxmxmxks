package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dh implements aaShadow.n0 {
    public static final ah Companion = new ah();
    public final String r;

    public dh(String str) {
        k71.k.g(str, "userId");
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.t1.a;
        List list2 = kz0.t1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh) && k71.k.b(this.r, ((dh) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.nb.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "679636df2bfac4d21cec2992e73fad71db7f89d1a2adbd82ad55d48864f1a027";
    }

    public final String j() {
        Companion.getClass();
        return "mutation FollowUser($userId: ID!) { followUser(input: { userId: $userId } ) { clientMutationId } }";
    }

    public final String name() {
        return "FollowUser";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("userId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("FollowUserMutation(userId=", this.r, ")");
    }
}
