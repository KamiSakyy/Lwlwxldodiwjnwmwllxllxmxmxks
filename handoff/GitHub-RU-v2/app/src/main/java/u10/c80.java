package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c80 implements aa.n0 {
    public static final y70 Companion = new y70();
    public final String r;
    public final hc0.ev s;
    public final aa1.b t;

    public c80(String str, hc0.ev evVar, aa1.b bVar) {
        k71.k.g(str, "id");
        k71.k.g(evVar, "state");
        k71.k.g(bVar, "types");
        this.r = str;
        this.s = evVar;
        this.t = bVar;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.w5.a;
        List list2 = fc0.w5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c80)) {
            return false;
        }
        c80 c80Var = (c80) obj;
        return k71.k.b(this.r, c80Var.r) && this.s == c80Var.s && k71.k.b(this.t, c80Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.fu.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + ((this.s.hashCode() + (this.r.hashCode() * 31)) * 31);
    }

    public final String i() {
        return "4d220c3c6f17fa55af0c36b10280a15b4020eec276597fab4137bee1302561f7";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateSubscription($id: ID!, $state: SubscriptionState!, $types: [CustomSubscriptionType!]) { updateSubscription(input: { subscribableId: $id state: $state types: $types } ) { subscribable { __typename ...SubscribableFragment } } }  fragment SubscribableFragment on Subscribable { __typename id viewerSubscription viewerCanSubscribe ... on Repository { viewerSubscriptionTypes } }";
    }

    public final String name() {
        return "UpdateSubscription";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("state");
        hc0.ev evVar = this.s;
        k71.k.g(evVar, "value");
        fVar.I(evVar.r);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aa.u0) {
            fVar.z0("types");
            aa.c.d(aa.c.b(aa.c.a(ic0.a.i))).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateSubscriptionMutation(id=");
        sb.append(this.r);
        sb.append(", state=");
        sb.append(this.s);
        sb.append(", types=");
        return f1.e.k(sb, this.t, ")");
    }



}
