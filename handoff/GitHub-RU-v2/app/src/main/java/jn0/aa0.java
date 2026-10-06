package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class aa0 implements aaShadow.n0 {
    public static final w90 Companion = new w90();
    public String r;
    public String s;

    public aa0(String str, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "title");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.a6.a;
        List list2 = kz0.a6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa0)) {
            return false;
        }
        aa0 aa0Var = (aa0) obj;
        return k71.k.b(this.r, aa0Var.r) && k71.k.b(this.s, aa0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.vv.a, false);
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
