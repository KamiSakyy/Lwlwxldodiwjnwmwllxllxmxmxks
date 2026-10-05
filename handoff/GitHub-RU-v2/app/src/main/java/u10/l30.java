package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l30 implements aa.n0 {
    public static final g30 Companion = new g30();
    public final String r;
    public final String s;
    public final hc0.ev t;

    public l30(String str, String str2, hc0.ev evVar) {
        k71.k.g(str2, "notificationId");
        this.r = str;
        this.s = str2;
        this.t = evVar;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.d5.a;
        List list2 = fc0.d5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l30)) {
            return false;
        }
        l30 l30Var = (l30) obj;
        return k71.k.b(this.r, l30Var.r) && k71.k.b(this.s, l30Var.s) && this.t == l30Var.t;
    }

    public final aa.p0 g() {
        return aa.c.c(p20.yq.a, false);
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
