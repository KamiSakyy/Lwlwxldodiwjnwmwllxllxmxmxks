package ey;

import a0.s0;
import aa.p0;
import aa.q0;
import aa.u0;
import aa.w;
import aa.w0;
import java.util.List;
import jo.f4;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u implements w0 {
    public static final k Companion = new k();
    public final String r;
    public final aa1.b s;

    public u(String str, aa1.b bVar) {
        k71.k.g(str, "nodeId");
        this.r = str;
        this.s = bVar;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = gy.b.a;
        List list2 = gy.b.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.r, uVar.r) && this.s.equals(uVar.s);
    }

    public final p0 g() {
        return aa.c.c(fy.i.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + s0.b(30, this.r.hashCode() * 31, 31);
    }

    public final String i() {
        return "09b8250df7fcacf2afb6a01826a930cf3f32901848aa17ae95dd0ec6ebe245d4";
    }

    public final String j() {
        Companion.getClass();
        return "query StatusChecksAndRollups($nodeId: ID!, $first: Int!, $after: String) { node(id: $nodeId) { __typename ... on PullRequest { id pullRequestStatus(includeMergeCommit: false) { statusRollup { summary { count state } } statusChecks(first: $first, after: $after) { pageInfo { __typename ...PageInfoFragment } nodes { __typename ...StatusCheckFragment id } } } } id } id __typename }  fragment PageInfoFragment on PageInfo { endCursor hasNextPage hasPreviousPage startCursor }  fragment StatusCheckFragment on StatusCheck { id description durationInSeconds stateChangedAt isRequired displayName state targetUrl avatarUrl additionalContext underlyingContext { __typename ... on CheckRun { id } ... on StatusContext { id } } __typename }";
    }

    public final String name() {
        return "StatusChecksAndRollups";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("nodeId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("first");
        fVar.z(30);
        u0 u0Var = this.s;
        if (u0Var instanceof u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        return f4.l(this.s, "StatusChecksAndRollupsQuery(nodeId=", this.r, ", first=30, after=", ")");
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p0<T1,T2,T3,T4> {
        public p0() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class w<T1,T2,T3,T4> {
        public w() {
        }
    }
}
