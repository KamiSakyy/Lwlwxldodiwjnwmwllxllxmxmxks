package sn0;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import pz0.bt;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w implements w0 {
    public static final s Companion = new s();
    public String r;
    public bt s;

    public w(String str, bt btVar) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = btVar;
    }

    public final aa.m d() {
        su.Companion.getClass();
        q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = un0.e.a;
        List list2 = un0.e.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.r, wVar.r) && this.s == wVar.s;
    }

    public final p0 g() {
        return aa.c.c(tn0.k.a, false);
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
