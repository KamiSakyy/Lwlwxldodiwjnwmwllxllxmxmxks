package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u3 implements aaShadow.n0 {
    public static final s3 Companion = new s3();
    public String r;

    public u3(String str) {
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.t.a;
        List list2 = h10.t.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3) && k71.k.b(this.r, ((u3) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.g2.a, false);
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
