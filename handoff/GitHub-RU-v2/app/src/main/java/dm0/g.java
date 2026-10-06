package dm0;

import aa.m;
import aa.n0;
import aa.p0;
import aa.q0;
import aa.u0;
import aa.w;
import gn0.r6;
import gn0.wh;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements n0 {
    public static final b Companion = new b();
    public aa1.b r;
    public aa1.b s;
    public aa1.b t;
    public aa1.b u;
    public aa1.b v;

    public g(aa1.b bVar, aa1.b bVar2, aa1.b bVar3, aa1.b bVar4, aa1.b bVar5) {
        k.g(bVar, "message");
        k.g(bVar2, "emoji");
        k.g(bVar3, "organizationId");
        k.g(bVar4, "indicatesLimitedAvailability");
        k.g(bVar5, "expiresAt");
        this.r = bVar;
        this.s = bVar2;
        this.t = bVar3;
        this.u = bVar4;
        this.v = bVar5;
    }

    public final m d() {
        wh.Companion.getClass();
        q0 q0Var = wh.e1;
        k.g(q0Var, "type");
        List list = fm0.a.a;
        List list2 = fm0.a.a;
        k.g(list2, "selections");
        rShadow rVar = rShadow.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k.b(this.r, gVar.r) && k.b(this.s, gVar.s) && k.b(this.t, gVar.t) && k.b(this.u, gVar.u) && k.b(this.v, gVar.v);
    }

    public final p0 g() {
        return aa.c.c(em0.b.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + f1.e.a(this.u, f1.e.a(this.t, f1.e.a(this.s, this.rShadow.hashCode() * 31, 31), 31), 31);
    }

    public final String i() {
        return "ef4df1d046f9272dea5ea805bb3a2d66bfb19042126e917719462c1e7a4e99fa";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateUserStatus($message: String, $emoji: String, $organizationId: ID, $indicatesLimitedAvailability: Boolean, $expiresAt: DateTime) { changeUserStatus(input: { emoji: $emoji message: $message organizationId: $organizationId limitedAvailability: $indicatesLimitedAvailability expiresAt: $expiresAt } ) { status { user { id status { __typename ...ProfileStatusFragment id } __typename } id __typename } } }  fragment OrganizationNameAndAvatar on Organization { id login name avatarUrl __typename }  fragment ProfileStatusFragment on UserStatus { id emojiHTML indicatesLimitedAvailability message emoji expiresAt organization { __typename ...OrganizationNameAndAvatar id } __typename }";
    }

    public final String name() {
        return "UpdateUserStatus";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k.g(wVar, "customScalarAdapters");
        u0 u0Var = this.r;
        if (u0Var instanceof u0) {
            fVar.z0("message");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        u0 u0Var2 = this.s;
        if (u0Var2 instanceof u0) {
            fVar.z0("emoji");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        }
        u0 u0Var3 = this.t;
        if (u0Var3 instanceof u0) {
            fVar.z0("organizationId");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var3);
        }
        u0 u0Var4 = this.u;
        if (u0Var4 instanceof u0) {
            fVar.z0("indicatesLimitedAvailability");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var4);
        }
        u0 u0Var5 = this.v;
        if (u0Var5 instanceof u0) {
            fVar.z0("expiresAt");
            r6.Companion.getClass();
            aa.c.d(aa.c.b(wVar.e(r6.a))).d(fVar, wVar, u0Var5);
        }
    }

    public final String toString() {
        StringBuilder u = f4Shadow.u("UpdateUserStatusMutation(message=", this.r, ", emoji=", this.s, ", organizationId=");
        f1.e.w(u, this.t, ", indicatesLimitedAvailability=", this.u, ", expiresAt=");
        return f1.e.k(u, this.v, ")");
    }



}
