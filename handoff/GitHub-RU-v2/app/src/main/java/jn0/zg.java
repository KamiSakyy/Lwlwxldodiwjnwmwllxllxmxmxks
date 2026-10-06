package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zg implements aaShadow.n0 {
    public static final vg Companion = new vg();
    public String r;

    public zg(String str) {
        k71.k.g(str, "userId");
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.s1.a;
        List list2 = kz0.s1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zg) && k71.k.b(this.r, ((zg) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.kb.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "5ae2b7f5e31a1ca4f31473c99bc7b5c8ae5b8df40adab710f5af056171559b4a";
    }

    public final String j() {
        Companion.getClass();
        return "mutation FollowUserLegacy($userId: ID!) { followUser(input: { userId: $userId } ) { user { __typename ...FollowUserFragment id } } }  fragment FollowUserFragment on User { id viewerIsFollowing __typename }";
    }

    public final String name() {
        return "FollowUserLegacy";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("userId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("FollowUserLegacyMutation(userId=", this.r, ")");
    }
}
