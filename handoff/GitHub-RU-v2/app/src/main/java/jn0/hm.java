package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hm implements aaShadow.w0 {
    public static final dm Companion = new dm();
    public String r;

    public hm(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.q2.a;
        List list2 = kz0.q2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hm) && k71.k.b(this.r, ((hm) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.we.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "c68ada403c86e1216e0c0b952e383937149e0bc3c23be5fd6d6cf506012c3448";
    }

    public final String j() {
        Companion.getClass();
        return "query MergeBoxMessageQuery($id: ID!) { node(id: $id) { __typename ... on PullRequest { __typename id mergeHeadline: viewerMergeHeadlineText(mergeType: MERGE) mergeBody: viewerMergeBodyText(mergeType: MERGE) squashHeadline: viewerMergeHeadlineText(mergeType: SQUASH) squashBody: viewerMergeBodyText(mergeType: SQUASH) } id } id __typename }";
    }

    public final String name() {
        return "MergeBoxMessageQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("MergeBoxMessageQuery(id=", this.r, ")");
    }
}
