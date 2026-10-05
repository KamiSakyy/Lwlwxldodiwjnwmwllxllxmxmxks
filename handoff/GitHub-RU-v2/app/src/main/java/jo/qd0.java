package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qd0 implements aa.n0 {
    public static final md0 Companion = new md0();
    public final String r;
    public final String s;

    public qd0(String str, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "title");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.o6.a;
        List list2 = h10.o6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd0)) {
            return false;
        }
        qd0 qd0Var = (qd0) obj;
        return k71.k.b(this.r, qd0Var.r) && k71.k.b(this.s, qd0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.jy.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "5c9b14d0bf4c2a549d1adf94d94a479c7c2bfc1f420e926afef44238fd175551";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateIssueTitleMutation($id: ID!, $title: String!) { updateIssue(input: { id: $id title: $title } ) { issue { id title titleHTML __typename } } }";
    }

    public final String name() {
        return "UpdateIssueTitleMutation";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("title");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("UpdateIssueTitleMutation(id=", this.r, ", title=", this.s, ")");
    }
}
