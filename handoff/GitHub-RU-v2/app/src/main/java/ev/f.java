package ev;

import a0.s0;
import aa.m;
import aa.p0;
import aa.q0;
import aa.w;
import aa.w0;
import com.github.rudroid.copilot.h1;
import java.util.List;
import m10.p00;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements w0 {
    public static final a Companion = new a();
    public String r;
    public String s;
    public int t;

    public f(String str, int i, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
        this.t = i;
    }

    public final m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = iv.a.a;
        List list2 = iv.a.a;
        k71.k.g(list2, "selections");
        rShadow rVar = rShadow.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.r, fVar.r) && k71.k.b(this.s, fVar.s) && this.t == fVar.t;
    }

    public final p0 g() {
        return aa.c.c(fv.a.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.t) + h1.i(this.rShadow.hashCode() * 31, this.s, 31);
    }

    public final String i() {
        return "a3e75cf564b814c7d224195124dc7d24859c09473be29ff51fc88f065c4446ff";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchIssueOrPullRequestId($owner: String!, $name: String!, $number: Int!) { repository(owner: $owner, name: $name) { id issueOrPullRequest(number: $number) { __typename ... on Node { id } } __typename } id __typename }";
    }

    public final String name() {
        return "FetchIssueOrPullRequestId";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("number");
        fVar.z(this.t);
    }

    public final String toString() {
        return s0.l(s0.o("FetchIssueOrPullRequestIdQuery(owner=", this.r, ", name=", this.s, ", number="), this.t, ")");
    }



}
