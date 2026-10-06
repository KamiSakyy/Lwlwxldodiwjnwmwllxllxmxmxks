package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ca0 implements aaShadow.n0 {
    public static final y90 Companion = new y90();
    public final String r;
    public final gn0.kw s;
    public final aa1.b t;

    public ca0(String str, gn0.kw kwVar, aa1.b bVar) {
        k71.k.g(str, "id");
        k71.k.g(kwVar, "state");
        k71.k.g(bVar, "types");
        this.r = str;
        this.s = kwVar;
        this.t = bVar;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.d6.a;
        List list2 = en0.d6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca0)) {
            return false;
        }
        ca0 ca0Var = (ca0) obj;
        return k71.k.b(this.r, ca0Var.r) && this.s == ca0Var.s && k71.k.b(this.t, ca0Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.rv.a, false);
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
        gn0.kw kwVar = this.s;
        k71.k.g(kwVar, "value");
        fVar.I(kwVar.r);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aaShadow.u0) {
            fVar.z0("types");
            aa.c.d(aa.c.b(aa.c.a(hn0.a.i))).d(fVar, wVar, u0Var);
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
