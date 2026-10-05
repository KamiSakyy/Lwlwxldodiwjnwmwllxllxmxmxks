package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mf implements aa.n0 {
    public static final jf Companion = new jf();
    public final String r;

    public mf(String str) {
        k71.k.g(str, "userId");
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.n1.a;
        List list2 = en0.n1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf) && k71.k.b(this.r, ((mf) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.ia.a, false);
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
