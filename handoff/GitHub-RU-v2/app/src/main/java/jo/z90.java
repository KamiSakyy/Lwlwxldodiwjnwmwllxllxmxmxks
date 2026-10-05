package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z90 implements aa.n0 {
    public static final w90 Companion = new w90();
    public final String r;

    public z90(String str) {
        k71.k.g(str, "userId");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.x5.a;
        List list2 = h10.x5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z90) && k71.k.b(this.r, ((z90) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.aw.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "22c835292ac5e7c00dd7b159951ff162f84ca46bd324ef004ec56670b7e1748d";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UnblockUser($userId: ID!) { unblockUser(input: { userId: $userId } ) { clientMutationId } }";
    }

    public final String name() {
        return "UnblockUser";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("userId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("UnblockUserMutation(userId=", this.r, ")");
    }
}
