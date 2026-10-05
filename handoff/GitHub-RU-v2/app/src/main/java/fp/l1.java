package fp;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l1 implements aa.w0 {
    public static final a1 Companion = new a1();
    public final String r;
    public final String s;
    public final aa1.b t;
    public final int u;

    public l1(int i, aa1.b bVar, String str, String str2) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        this.r = str;
        this.s = str2;
        this.t = bVar;
        this.u = i;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = jp.g.a;
        List list2 = jp.g.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return k71.k.b(this.r, l1Var.r) && k71.k.b(this.s, l1Var.s) && this.t.equals(l1Var.t) && this.u == l1Var.u;
    }

    public final aa.p0 g() {
        return aa.c.c(gp.x.a, false);
    }

    public final int hashCode() {
        return Integer.hashCode(this.u) + f1.e.a(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "33494ca98f09e2339a34d2b1f420d03fccc2ea6c7bdf05bcbdf19c633f7a10fe";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerRepositorySessionCreationMetadata($repoOwner: String!, $repoName: String!, $after: String, $first: Int!) { repository(owner: $repoOwner, name: $repoName) { id defaultBranchRef { __typename ...RepoBranchFragment id } isCopilotAgentEnabled owner { __typename ...avatarFragment } viewerCodingAgents(first: 1) { totalCount nodes { __typename ...CodingAgentFragment } } __typename } viewer { repositoryCustomAgents(owner: $repoOwner, name: $repoName, after: $after, first: $first) { totalCount nodes { __typename ...SubagentFragment } pageInfo { hasNextPage hasPreviousPage endCursor } } id __typename } id __typename }  fragment RepoBranchFragment on Ref { id name target { id oid } repository { id __typename } __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment CodingAgentFragment on CodingAgent { avatarUrl bot { id __typename } displayName integrationId slug isCopilot }  fragment SubagentFragment on CopilotCustomAgent { name displayName description }";
    }

    public final String name() {
        return "ViewerRepositorySessionCreationMetadata";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("repoOwner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repoName");
        bVar.b(fVar, wVar, this.s);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        fVar.z0("first");
        fVar.z(this.u);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ViewerRepositorySessionCreationMetadataQuery(repoOwner=", this.r, ", repoName=", this.s, ", after=");
        o.append(this.t);
        o.append(", first=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }
}
