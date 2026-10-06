package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g3 implements aaShadow.n0 {
    public static final e3 Companion = new e3();
    public String r;

    public g3(String str) {
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.r.a;
        List list2 = fc0.r.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3) && k71.k.b(this.r, ((g3) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.w1.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "eb31a1b20ff395ef1db8f8954efde229faa0180646350745353766458204ba77";
    }

    public final String j() {
        Companion.getClass();
        return "mutation BlockUser($userId: ID!) { blockUser(input: { userId: $userId } ) { clientMutationId } }";
    }

    public final String name() {
        return "BlockUser";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("userId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("BlockUserMutation(userId=", this.r, ")");
    }
}
