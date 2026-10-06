package d20;

import aa.p0;
import aa.q0;
import aa.w;
import aa.w0;
import hc0.hc;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements w0 {
    public static final f Companion = new f();
    public final String r;
    public final hc s;

    public j(String str, hc hcVar) {
        this.r = str;
        this.s = hcVar;
    }

    public final aa.m d() {
        pm.Companion.getClass();
        q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = f20.b.a;
        List list2 = f20.b.a;
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
        return aa.c.c(e20.d.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "1eff0fe9ef89923ab1a219b9ed0cfa00cf1f310240d40723713404eb37e2f440";
    }

    public final String j() {
        Companion.getClass();
        return "query IssueUpdateChannel($id: ID!, $topic: IssuePubSubTopic!) { node(id: $id) { __typename ... on Issue { id fullDatabaseId updatesChannel(name: $topic) } id } }";
    }

    public final String name() {
        return "IssueUpdateChannel";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
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
