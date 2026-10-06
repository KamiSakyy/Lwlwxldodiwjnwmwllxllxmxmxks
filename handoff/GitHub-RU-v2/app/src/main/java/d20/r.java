package d20;

import aa.p0;
import aa.q0;
import aa.w;
import aa.w0;
import hc0.bl;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r implements w0 {
    public static final n Companion = new n();
    public String r;
    public bl s;

    public r(String str, bl blVar) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = blVar;
    }

    public final aa.m d() {
        pm.Companion.getClass();
        q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = f20.d.a;
        List list2 = f20.d.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.r, rVar.r) && this.s == rVar.s;
    }

    public final p0 g() {
        return aa.c.c(e20.h.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "2d1e3f5d208a392c35d447df6eac4ae31c970eb92cc6ac141d8cd903fc330733";
    }

    public final String j() {
        Companion.getClass();
        return "query PullRequestUpdateChannel($id: ID!, $topic: PullRequestPubSubTopic!) { node(id: $id) { __typename ... on PullRequest { id databaseId updatesChannel(name: $topic) } id } }";
    }

    public final String name() {
        return "PullRequestUpdateChannel";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
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
