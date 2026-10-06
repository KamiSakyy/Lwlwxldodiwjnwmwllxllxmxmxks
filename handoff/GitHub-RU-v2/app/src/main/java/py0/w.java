package py0;

import a0.s0;
import aa.p0;
import aa.q0;
import aa.u0;
import aa.w0;
import com.github.rudroid.copilot.h1;
import java.util.List;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w implements w0 {
    public static final q Companion = new q();
    public String r;
    public String s;
    public aa1.b t;
    public aa1.b u;

    public w(aa1.b bVar, aa1.b bVar2, String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        k71.k.g(bVar, "first");
        k71.k.g(bVar2, "after");
        this.r = str;
        this.s = str2;
        this.t = bVar;
        this.u = bVar2;
    }

    public final aa.m d() {
        su.Companion.getClass();
        q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = uy0.d.a;
        List list2 = uy0.d.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.r, wVar.r) && k71.k.b(this.s, wVar.s) && k71.k.b(this.t, wVar.t) && k71.k.b(this.u, wVar.u);
    }

    public final p0 g() {
        return aa.c.c(qy0.h.a, false);
    }

    public final int hashCode() {
        return this.u.hashCode() + f1.e.a(this.t, h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String i() {
        return "15afaf4024dae6d50984861e64618e725e637db96ae79c7c5a2485b455b916b3";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryIssueTypes($owner: String!, $name: String!, $first: Int = 30 , $after: String = null ) { repository(owner: $owner, name: $name) { issueTypes(first: $first, after: $after) { pageInfo { endCursor hasNextPage hasPreviousPage } nodes { __typename ...IssueTypeFragment id } } id __typename } id __typename }  fragment IssueTypeFragment on IssueType { id name description isEnabled color __typename }";
    }

    public final String name() {
        return "RepositoryIssueTypes";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
        u0 u0Var = this.t;
        if (u0Var instanceof u0) {
            fVar.z0("first");
            aa.c.d(aa.c.b(ro0.a.a)).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("first");
            aa.c.l.b(fVar, wVar, 30);
        }
        u0 u0Var2 = this.u;
        if (u0Var2 instanceof u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("after");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
    }

    public final String toString() {
        return f1.e.l(s0.o("RepositoryIssueTypesQuery(owner=", this.r, ", name=", this.s, ", first="), this.t, ", after=", this.u, ")");
    }
}
