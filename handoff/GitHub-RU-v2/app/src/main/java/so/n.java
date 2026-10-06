package so;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import m10.p00;
import m10.ui;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements w0 {
    public static final j Companion = new j();
    public String r;
    public ui s;

    public n(String str, ui uiVar) {
        this.r = str;
        this.s = uiVar;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = uo.c.a;
        List list2 = uo.c.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.r, nVar.r) && this.s == nVar.s;
    }

    public final p0 g() {
        return aa.c.c(to.f.a, false);
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
