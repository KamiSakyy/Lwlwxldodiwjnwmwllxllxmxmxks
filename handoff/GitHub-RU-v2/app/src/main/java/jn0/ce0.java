package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ce0 implements aaShadow.n0 {
    public static final yd0 Companion = new yd0();
    public String r;
    public pz0.f40 s;
    public aa1.b t;

    public ce0(String str, pz0.f40 f40Var, aa1.b bVar) {
        k71.k.g(str, "id");
        k71.k.g(f40Var, "state");
        k71.k.g(bVar, "types");
        this.r = str;
        this.s = f40Var;
        this.t = bVar;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.r6.a;
        List list2 = kz0.r6.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce0)) {
            return false;
        }
        ce0 ce0Var = (ce0) obj;
        return k71.k.b(this.r, ce0Var.r) && this.s == ce0Var.s && k71.k.b(this.t, ce0Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.qy.a, false);
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
        pz0.f40 f40Var = this.s;
        k71.k.g(f40Var, "value");
        fVar.I(f40Var.r);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("types");
            aa.c.d(aa.c.b(aa.c.a(qz0.a.j))).d(fVar, wVar, u0Var);
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
