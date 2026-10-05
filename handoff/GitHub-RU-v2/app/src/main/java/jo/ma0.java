package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ma0 implements aa.n0 {
    public static final ja0 Companion = new ja0();
    public final String r;

    public ma0(String str) {
        k71.k.g(str, "userId");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.a6.a;
        List list2 = h10.a6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ma0) && k71.k.b(this.r, ((ma0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.hw.a, false);
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
