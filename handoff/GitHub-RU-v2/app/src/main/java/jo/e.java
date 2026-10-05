package jo;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements aa.n0 {
    public static final c Companion = new c();
    public final String r;
    public final ArrayList s;
    public final aa1.b t;

    public e(String str, ArrayList arrayList, aa1.b bVar) {
        k71.k.g(str, "assignableId");
        this.r = str;
        this.s = arrayList;
        this.t = bVar;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.a.a;
        List list2 = h10.a.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.r, eVar.r) && this.s.equals(eVar.s) && this.t.equals(eVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.c.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + no.a.b(this.s, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "148448079881a3ee49d9fc8fe255cb1115c9a2e9e399db25ac4b7843e053fdc8";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddAssigneesToAssignableMutation($assignableId: ID!, $assigneeIds: [ID!]!, $agentAssignment: AgentAssignmentInput) { addAssigneesToAssignable(input: { assignableId: $assignableId assigneeIds: $assigneeIds agentAssignment: $agentAssignment } ) { assignable { __typename ...AssignableFragment } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }  fragment AssigneeFragment on Assignable { __typename ...NodeIdFragment assignedActors(first: 25) { __typename totalCount nodes { __typename ...actorFields } } }  fragment AssignableFragment on Assignable { __typename ... on Issue { __typename id ...AssigneeFragment } ... on PullRequest { __typename id ...AssigneeFragment } }";
    }

    public final String name() {
        return "AddAssigneesToAssignableMutation";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("assignableId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("assigneeIds");
        aa.c.a(bVar).e(fVar, wVar, this.s);
        aa.u0 u0Var = this.t;
        if (u0Var instanceof aa.u0) {
            fVar.z0("agentAssignment");
            aa.c.d(aa.c.b(aa.c.c(n10.a.c, false))).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return f1.e.k(com.github.rudroid.m0.p("AddAssigneesToAssignableMutation(assignableId=", this.r, ", assigneeIds=", this.s, ", agentAssignment="), this.t, ")");
    }
}
