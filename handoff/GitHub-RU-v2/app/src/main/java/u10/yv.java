package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yv implements aa.w0 {
    public static final sv Companion = new sv();
    public final String r;
    public final String s;
    public final aa.u0 t;
    public final aa1.b u;

    public yv(aa.u0 u0Var, aa1.b bVar, String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "repo");
        this.r = str;
        this.s = str2;
        this.t = u0Var;
        this.u = bVar;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.y3.a;
        List list2 = fc0.y3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv)) {
            return false;
        }
        yv yvVar = (yv) obj;
        return k71.k.b(this.r, yvVar.r) && k71.k.b(this.s, yvVar.s) && this.t.equals(yvVar.t) && this.u.equals(yvVar.u);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ul.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + jo.f4.a(this.t, com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "37c3e17030f2f593f7763fa460452f853ebf09a1c744092b3996f7fcfbf34878";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryMilestones($owner: String!, $repo: String!, $after: String, $query: String) { repository(owner: $owner, name: $repo) { milestones(first: 50, states: [OPEN], query: $query, orderBy: { direction: ASC field: DUE_DATE } , after: $after) { pageInfo { hasNextPage endCursor } nodes { __typename ...MilestoneFragment id } } id __typename } }  fragment MilestoneFragment on Milestone { __typename id title state progressPercentage dueOn }";
    }

    public final String name() {
        return "RepositoryMilestones";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repo");
        bVar.b(fVar, wVar, this.s);
        fVar.z0("after");
        aa.o0 o0Var = aa.c.i;
        aa.c.d(o0Var).d(fVar, wVar, this.t);
        aa.u0 u0Var = this.u;
        if (u0Var instanceof aa.u0) {
            fVar.z0("query");
            aa.c.d(o0Var).d(fVar, wVar, u0Var);
        }
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryMilestonesQuery(owner=", this.r, ", repo=", this.s, ", after=");
        o.append(this.t);
        o.append(", query=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }
}
