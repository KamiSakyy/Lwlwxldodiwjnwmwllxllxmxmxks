package fp;

import java.util.List;
import jo.f4;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 implements aa.w0 {
    public static final a0 Companion = new a0();
    public final String r;
    public final String s;
    public final aa.u0 t;

    public g0(aa.u0 u0Var, String str, String str2) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        this.r = str;
        this.s = str2;
        this.t = u0Var;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = jp.c.a;
        List list2 = jp.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.r, g0Var.r) && k71.k.b(this.s, g0Var.s) && this.t.equals(g0Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(gp.h.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(30) + f4.a(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "457aabf665a46627e6beb141410fb07d3149e79ec56d51438acd3e334b388108";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryCodingAgents($repoOwner: String!, $repoName: String!, $after: String, $first: Int!) { repository(owner: $repoOwner, name: $repoName) { id viewerCodingAgents(first: $first, after: $after) { totalCount nodes { __typename ...CodingAgentFragment } pageInfo { hasNextPage hasPreviousPage endCursor } } __typename } id __typename }  fragment CodingAgentFragment on CodingAgent { avatarUrl bot { id __typename } displayName integrationId slug isCopilot }";
    }

    public final String name() {
        return "RepositoryCodingAgents";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repoOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repoName");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("after");
        f4.y(aa.c.i, fVar, wVar, this.t, "first");
        fVar.z(30);
    }

    public final String toString() {
        return f1.e.j(a0.s0.o("RepositoryCodingAgentsQuery(repoOwner=", this.r, ", repoName=", this.s, ", after="), this.t, ", first=30)");
    }
}
