package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v10 implements aaShadow.n0 {
    public static final s10 Companion = new s10();
    public final String r;

    public v10(String str) {
        k71.k.g(str, "userId");
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.w4.a;
        List list2 = fc0.w4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v10) && k71.k.b(this.r, ((v10) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.yp.a, false);
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
