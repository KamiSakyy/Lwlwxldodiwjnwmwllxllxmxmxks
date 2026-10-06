package kc0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n00 implements aaShadow.n0 {
    public static final k00 Companion = new k00();
    public String r;
    public ArrayList s;

    public n00(String str, ArrayList arrayList) {
        k71.k.g(str, "assignableId");
        this.r = str;
        this.s = arrayList;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.q4.a;
        List list2 = en0.q4.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n00)) {
            return false;
        }
        n00 n00Var = (n00) obj;
        return k71.k.b(this.r, n00Var.r) && this.s.equals(n00Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.cp.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "6d30ef5135d6cec5ec96af460405559df285a5a5a56ee7f5f4bc99e66bcb7632";
    }

    public final String j() {
        Companion.getClass();
        return "mutation SetAssigneesForAssignableMutation($assignableId: ID!, $assigneeIds: [ID!]!) { replaceAssigneesForAssignable(input: { assignableId: $assignableId assigneeIds: $assigneeIds } ) { assignable { __typename ...AssignableFragment } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment AssigneeFragment on Assignable { __typename ...NodeIdFragment assignees(first: 25) { __typename totalCount nodes { __typename id name login ...avatarFragment } } }  fragment AssignableFragment on Assignable { __typename ... on Issue { __typename id ...AssigneeFragment } ... on PullRequest { __typename id ...AssigneeFragment } }";
    }

    public final String name() {
        return "SetAssigneesForAssignableMutation";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("assignableId");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("assigneeIds");
        aa.c.a(bVar).e(fVar, wVar, this.s);
    }

    public final String toString() {
        return "SetAssigneesForAssignableMutation(assignableId=" + this.r + ", assigneeIds=" + this.s + ")";
    }
}
