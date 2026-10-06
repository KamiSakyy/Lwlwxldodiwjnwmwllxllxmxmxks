package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oc0 implements aaShadow.n0 {
    public static final kc0 Companion = new kc0();
    public String r;
    public String s;

    public oc0(String str, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "title");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.j6.a;
        List list2 = h10.j6.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc0)) {
            return false;
        }
        oc0 oc0Var = (oc0) obj;
        return k71.k.b(this.r, oc0Var.r) && k71.k.b(this.s, oc0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.qxShadow.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "ca645854844fbbba2ca83a6b31e77e262969dd699e230863addda52c639d27df";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateDiscussionTitleMutation($id: ID!, $title: String!) { updateDiscussion(input: { discussionId: $id title: $title } ) { discussion { id title __typename } } }";
    }

    public final String name() {
        return "UpdateDiscussionTitleMutation";
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
        return x.i.g("UpdateDiscussionTitleMutation(id=", this.r, ", title=", this.s, ")");
    }
}
