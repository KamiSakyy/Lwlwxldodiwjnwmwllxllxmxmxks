package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v70 implements aaShadow.n0 {
    public static final r70 Companion = new r70();
    public String r;

    public v70(String str) {
        k71.k.g(str, "userId");
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.q5.a;
        List list2 = kz0.q5.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v70) && k71.k.b(this.r, ((v70) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ku.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "fe21e9fbb07ec0e326c68e90f9bc82e33b94faeb4d6a5c7044b26e083dac267a";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UnfollowUserLegacy($userId: ID!) { unfollowUser(input: { userId: $userId } ) { user { __typename ...FollowUserFragment id } } }  fragment FollowUserFragment on User { id viewerIsFollowing __typename }";
    }

    public final String name() {
        return "UnfollowUserLegacy";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("userId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("UnfollowUserLegacyMutation(userId=", this.r, ")");
    }
}
