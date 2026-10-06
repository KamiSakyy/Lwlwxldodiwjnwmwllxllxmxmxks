package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c3 implements aaShadow.n0 {
    public static final a3 Companion = new a3();
    public String r;
    public String s;
    public String t;
    public hc0.x1 u;
    public boolean v;
    public aa.u0 w;

    public c3(String str, String str2, String str3, hc0.x1 x1Var, boolean z, aa.u0 u0Var) {
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = x1Var;
        this.v = z;
        this.w = u0Var;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.q.a;
        List list2 = fc0.q.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return this.r.equals(c3Var.r) && this.s.equals(c3Var.s) && this.t.equals(c3Var.t) && this.u == c3Var.u && this.v == c3Var.v && this.w.equals(c3Var.w);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.u1.a, false);
    }

    public final int hashCode() {
        return this.w.hashCode() + x.i.e((this.u.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31)) * 31, 31, this.v);
    }

    public final String i() {
        return "392cb119bc8b622527b4cfda04eb8434b762a7d4328deec5b2d76a61b0f2bc4a";
    }

    public final String j() {
        Companion.getClass();
        return "mutation BlockUserFromOrganization($userId: ID!, $organizationId: ID!, $contentId: ID!, $duration: BlockFromOrganizationDuration!, $notifyUser: Boolean!, $hiddenReason: ReportedContentClassifiers) { blockUserFromOrganization(input: { blockedUserId: $userId organizationId: $organizationId contentId: $contentId duration: $duration notifyBlockedUser: $notifyUser hiddenReason: $hiddenReason } ) { clientMutationId } }";
    }

    public final String name() {
        return "BlockUserFromOrganization";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("userId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("organizationId");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("contentId");
        bVar.b(fVar, wVar, this.t);
        fVar.z0("duration");
        fVar.I(this.u.r);
        fVar.z0("notifyUser");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(this.v));
        fVar.z0("hiddenReason");
        aa.c.d(aa.c.b(ic0.b.e)).d(fVar, wVar, this.w);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("BlockUserFromOrganizationMutation(userId=", this.r, ", organizationId=", this.s, ", contentId=");
        o.append(this.t);
        o.append(", duration=");
        o.append(this.u);
        o.append(", notifyUser=");
        o.append(this.v);
        o.append(", hiddenReason=");
        o.append(this.w);
        o.append(")");
        return o.toString();
    }
}
