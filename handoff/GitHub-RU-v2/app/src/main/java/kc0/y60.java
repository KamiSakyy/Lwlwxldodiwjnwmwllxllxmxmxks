package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y60 implements aaShadow.n0 {
    public static final u60 Companion = new u60();
    public String r;
    public String s;

    public y60(String str, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "title");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.r5.a;
        List list2 = en0.r5.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y60)) {
            return false;
        }
        y60 y60Var = (y60) obj;
        return k71.k.b(this.r, y60Var.r) && k71.k.b(this.s, y60Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.lt.a, false);
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
