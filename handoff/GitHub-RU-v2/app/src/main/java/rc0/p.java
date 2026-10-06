package rc0;

import gn0.rn;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements aa.w0 {
    public static final d Companion = new d();
    public String r;
    public aa1.b s;
    public aa1.b t;
    public aa1.b u;
    public aa1.b v;

    public p(String str, aa.u0 u0Var, aa.u0 u0Var2, int i) {
        int i2 = i & 4;
        aa.u0 u0Var3 = aa.t0.d;
        u0Var2 = i2 != 0 ? u0Var3 : u0Var2;
        k71.k.g(str, "id");
        this.r = str;
        this.s = u0Var;
        this.t = u0Var2;
        this.u = u0Var3;
        this.v = u0Var3;
    }

    public final aa.m d() {
        rn.Companion.getClass();
        aa.q0 q0Var = rn.z;
        k71.k.g(q0Var, "type");
        List list = dd0.a.a;
        List list2 = dd0.a.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.r, pVar.r) && k71.k.b(this.s, pVar.s) && k71.k.b(this.t, pVar.t) && k71.k.b(this.u, pVar.u) && k71.k.b(this.v, pVar.v);
    }

    public final aa.p0 g() {
        return aa.c.c(sc0.d.a, false);
    }

    public final int hashCode() {
        return this.v.hashCode() + f1.e.a(this.u, f1.e.a(this.t, f1.e.a(this.s, this.r.hashCode() * 31, 31), 31), 31);
    }

    public final String i() {
        return "f79c7e4c7f9c2eebecb806489427e9935bf59e87fe34bf4019f258f0ebb995e2";
    }

    public final String j() {
        Companion.getClass();
        return "query CheckRunById($id: ID!, $first: Int, $afterSteps: String = null , $pullRequestId: ID = null , $checkRequired: Boolean = false ) { node(id: $id) { __typename ... on CheckRun { __typename ...WorkFlowCheckRunFragment checkSuite { id branch { id name __typename } rerunnable repository { id name owner { __typename ...actorFields } viewerPermission __typename } workflowRun { id runNumber workflow { id name __typename } __typename } app { id logoUrl name __typename } __typename } steps(first: $first, after: $afterSteps) { totalCount pageInfo { hasNextPage endCursor hasPreviousPage } nodes { __typename ...CheckStepFragment } } } ...StatusContextFragment ... on RequiredStatusCheck { id context description createdAt state } id } }  fragment WorkFlowCheckRunFragment on CheckRun { id fullDatabaseId name status conclusion duration title summary startedAt completedAt permalink isRequired(pullRequestId: $pullRequestId) @include(if: $checkRequired) __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }  fragment CheckStepFragment on CheckStep { externalId name conclusion status startedAt completedAt secondsToCompletion number }  fragment StatusContextFragment on StatusContext { id context avatarUrl targetUrl commit { id repository { id name owner { id login } __typename } __typename } description creator { __typename ...NodeIdFragment login } state isRequired(pullRequestId: $pullRequestId) @include(if: $checkRequired) __typename }";
    }

    public final String name() {
        return "CheckRunById";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
        aa.u0 u0Var = this.s;
        if (u0Var instanceof aa.u0) {
            fVar.z0("first");
            aa.c.d(aa.c.b(od0.b.a)).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.t;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("afterSteps");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("afterSteps");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
        aa.u0 u0Var3 = this.u;
        if (u0Var3 instanceof aa.u0) {
            fVar.z0("pullRequestId");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var3);
        } else if (z) {
            fVar.z0("pullRequestId");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
        aa.u0 u0Var4 = this.v;
        if (u0Var4 instanceof aa.u0) {
            fVar.z0("checkRequired");
            aa.c.d(aa.c.k).d(fVar, wVar, u0Var4);
        } else if (z) {
            fVar.z0("checkRequired");
            aa.c.l.b(fVar, wVar, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder o = f1.e.o(this.s, "CheckRunByIdQuery(id=", this.r, ", first=", ", afterSteps=");
        f1.e.w(o, this.t, ", pullRequestId=", this.u, ", checkRequired=");
        return f1.e.k(o, this.v, ")");
    }
}
