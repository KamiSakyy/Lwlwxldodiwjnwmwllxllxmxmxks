package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g90 implements aaShadow.n0 {
    public static final b90 Companion = new b90();
    public String r;
    public String s;
    public pz0.f40 t;

    public g90(String str, String str2, pz0.f40 f40Var) {
        k71.k.g(str2, "notificationId");
        this.r = str;
        this.s = str2;
        this.t = f40Var;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.w5.a;
        List list2 = kz0.w5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g90)) {
            return false;
        }
        g90 g90Var = (g90) obj;
        return k71.k.b(this.r, g90Var.r) && k71.k.b(this.s, g90Var.s) && this.t == g90Var.t;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.iv.a, false);
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
