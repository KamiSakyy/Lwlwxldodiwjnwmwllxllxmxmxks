package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qg0 implements aa.n0 {
    public static final mg0 Companion = new mg0();
    public final String r;
    public final m10.ya0 s;
    public final aa1.b t;

    public qg0(String str, m10.ya0 ya0Var, aa1.b bVar) {
        k71.k.g(str, "id");
        k71.k.g(ya0Var, "state");
        k71.k.g(bVar, "types");
        this.r = str;
        this.s = ya0Var;
        this.t = bVar;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.a7.a;
        List list2 = h10.a7.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg0)) {
            return false;
        }
        qg0 qg0Var = (qg0) obj;
        return k71.k.b(this.r, qg0Var.r) && this.s == qg0Var.s && k71.k.b(this.t, qg0Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.l00.a, false);
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
        m10.ya0 ya0Var = this.s;
        k71.k.g(ya0Var, "value");
        fVar.I(ya0Var.r);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aa.u0) {
            fVar.z0("types");
            aa.c.d(aa.c.b(aa.c.a(n10.a.u))).d(fVar, wVar, u0Var);
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
