package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c40 implements aa.n0 {
    public static final z30 Companion = new z30();
    public final String r;

    public c40(String str) {
        k71.k.g(str, "userId");
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.f5.a;
        List list2 = en0.f5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c40) && k71.k.b(this.r, ((c40) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.nr.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "5635c83c8bffc369ca4ad3f02804bbca42e63220a36d26432b7a51516113c3d6";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UnfollowUser($userId: ID!) { unfollowUser(input: { userId: $userId } ) { clientMutationId } }";
    }

    public final String name() {
        return "UnfollowUser";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("userId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("UnfollowUserMutation(userId=", this.r, ")");
    }
}
