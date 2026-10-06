package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ub0 implements aaShadow.n0 {
    public static final pb0 Companion = new pb0();
    public final String r;
    public final String s;
    public final m10.ya0 t;

    public ub0(String str, String str2, m10.ya0 ya0Var) {
        k71.k.g(str2, "notificationId");
        this.r = str;
        this.s = str2;
        this.t = ya0Var;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.f6.a;
        List list2 = h10.f6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub0)) {
            return false;
        }
        ub0 ub0Var = (ub0) obj;
        return k71.k.b(this.r, ub0Var.r) && k71.k.b(this.s, ub0Var.s) && this.t == ub0Var.t;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.dx.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "1612411566e21041fa3420a7556f57f8caed58095ce12d0a9553e280553fd7bb";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UnsubscribeFromNotificationAndMarkAsDone($id: ID!, $notificationId: ID!, $state: SubscriptionState!) { updateSubscription(input: { subscribableId: $id state: $state } ) { __typename subscribable { __typename ...NodeIdFragment viewerSubscription } } markNotificationAsDone(input: { id: $notificationId } ) { __typename success } }  fragment NodeIdFragment on Node { id __typename }";
    }

    public final String name() {
        return "UnsubscribeFromNotificationAndMarkAsDone";
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
        StringBuilder o = a0.s0.o("UnsubscribeFromNotificationAndMarkAsDoneMutation(id=", this.r, ", notificationId=", this.s, ", state=");
        o.append(this.t);
        o.append(")");
        return o.toString();
    }
}
