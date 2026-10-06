package so;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import m10.p00;
import m10.xy;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 implements w0 {
    public static final w Companion = new w();
    public String r;
    public xy s;

    public a0(String str, xy xyVar) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = xyVar;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = uo.f.a;
        List list2 = uo.f.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return k71.k.b(this.r, a0Var.r) && this.s == a0Var.s;
    }

    public final p0 g() {
        return aa.c.c(to.m.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "592ba3e0a79406321bcd7780929617447d93ac2bea66416b7f066781ba92c8b2";
    }

    public final String j() {
        Companion.getClass();
        return "query PullRequestUpdateChannel($id: ID!, $topic: PullRequestPubSubTopic!) { node(id: $id) { __typename ... on PullRequest { id fullDatabaseId updatesChannel(name: $topic) } id } id __typename }";
    }

    public final String name() {
        return "PullRequestUpdateChannel";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("topic");
        fVar.I(this.s.r);
    }

    public final String toString() {
        return "PullRequestUpdateChannelQuery(id=" + this.r + ", topic=" + this.s + ")";
    }
}
