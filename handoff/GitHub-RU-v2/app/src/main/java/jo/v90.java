package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v90 implements aaShadow.n0 {
    public static final s90 Companion = new s90();
    public String r;
    public String s;

    public v90(String str, String str2) {
        k71.k.g(str, "userId");
        k71.k.g(str2, "organizationId");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.w5.a;
        List list2 = h10.w5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v90)) {
            return false;
        }
        v90 v90Var = (v90) obj;
        return k71.k.b(this.r, v90Var.r) && k71.k.b(this.s, v90Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.yv.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "8e427306b253399b20a347c53084b6b0db4a6df2cafd6e88c7f775927c3b3884";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UnblockUserFromOrganization($userId: ID!, $organizationId: ID!) { unblockUserFromOrganization(input: { unblockedUserId: $userId organizationId: $organizationId } ) { clientMutationId } }";
    }

    public final String name() {
        return "UnblockUserFromOrganization";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("userId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("organizationId");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("UnblockUserFromOrganizationMutation(userId=", this.r, ", organizationId=", this.s, ")");
    }
}
