package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e20 implements aaShadow.n0 {
    public static final b20 Companion = new b20();
    public String r;

    public e20(String str) {
        k71.k.g(str, "userId");
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.y4.a;
        List list2 = fc0.y4.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e20) && k71.k.b(this.r, ((e20) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.dq.a, false);
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
