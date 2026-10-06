package sn0;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import pz0.su;
import pz0.ze;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements w0 {
    public static final f Companion = new f();
    public String r;
    public ze s;

    public j(String str, ze zeVar) {
        this.r = str;
        this.s = zeVar;
    }

    public final aa.m d() {
        su.Companion.getClass();
        q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = un0.b.a;
        List list2 = un0.b.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.r, jVar.r) && this.s == jVar.s;
    }

    public final p0 g() {
        return aa.c.c(tn0.d.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "7bda59c4b05f1ecd12a703877bdcdb93e02dfb47a21d0f8b26787186718ed78d";
    }

    public final String j() {
        Companion.getClass();
        return "query IssueUpdateChannel($id: ID!, $topic: IssuePubSubTopic!) { node(id: $id) { __typename ... on Issue { id fullDatabaseId updatesChannel(name: $topic) } id } id __typename }";
    }

    public final String name() {
        return "IssueUpdateChannel";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("topic");
        fVar.I(this.s.r);
    }

    public final String toString() {
        return "IssueUpdateChannelQuery(id=" + this.r + ", topic=" + this.s + ")";
    }
}
