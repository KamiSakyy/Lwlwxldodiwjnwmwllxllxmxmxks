package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d60 implements aaShadow.n0 {
    public static final y50 Companion = new y50();
    public String r;
    public String s;
    public pz0.f40 t;

    public d60(String str, String str2, pz0.f40 f40Var) {
        k71.k.g(str2, "notificationId");
        this.r = str;
        this.s = str2;
        this.t = f40Var;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.j5.a;
        List list2 = kz0.j5.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d60)) {
            return false;
        }
        d60 d60Var = (d60) obj;
        return k71.k.b(this.r, d60Var.r) && k71.k.b(this.s, d60Var.s) && this.t == d60Var.t;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.et.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "8dc60bee6c1dcf65270bf150aee1ced554e5e636f9ece711ec207b58909b5a28";
    }

    public final String j() {
        Companion.getClass();
        return "mutation SubscribeToNotificationAndMarkAsUndone($id: ID!, $notificationId: ID!, $state: SubscriptionState!) { updateSubscription(input: { subscribableId: $id state: $state } ) { __typename subscribable { __typename ...NodeIdFragment viewerSubscription } } markNotificationAsUndone(input: { id: $notificationId } ) { success } }  fragment NodeIdFragment on Node { id __typename }";
    }

    public final String name() {
        return "SubscribeToNotificationAndMarkAsUndone";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("notificationId");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("state");
        fVar.I(this.t.r);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("SubscribeToNotificationAndMarkAsUndoneMutation(id=", this.r, ", notificationId=", this.s, ", state=");
        o.append(this.t);
        o.append(")");
        return o.toString();
    }
}
