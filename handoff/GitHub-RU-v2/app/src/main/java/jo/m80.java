package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m80 implements aaShadow.n0 {
    public static final h80 Companion = new h80();
    public String r;
    public String s;
    public m10.ya0 t;

    public m80(String str, String str2, m10.ya0 ya0Var) {
        k71.k.g(str2, "notificationId");
        this.r = str;
        this.s = str2;
        this.t = ya0Var;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.r5.a;
        List list2 = h10.r5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m80)) {
            return false;
        }
        m80 m80Var = (m80) obj;
        return k71.k.b(this.r, m80Var.r) && k71.k.b(this.s, m80Var.s) && this.t == m80Var.t;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.xu.a, false);
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
