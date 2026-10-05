package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oj implements aa.w0 {
    public static final kj Companion = new kj();
    public final String r;

    public oj(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        hc0.pm.Companion.getClass();
        aa.q0 q0Var = hc0.pm.r;
        k71.k.g(q0Var, "type");
        List list = fc0.g2.a;
        List list2 = fc0.g2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oj) && k71.k.b(this.r, ((oj) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.xc.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "ef8fb82454c6833ba7e5ecdadd2c94b470754dc18cdd18803d3722ec3109edb3";
    }

    public final String j() {
        Companion.getClass();
        return "query MergeBoxMessageQuery($id: ID!) { node(id: $id) { __typename ... on PullRequest { __typename id mergeHeadline: viewerMergeHeadlineText(mergeType: MERGE) mergeBody: viewerMergeBodyText(mergeType: MERGE) squashHeadline: viewerMergeHeadlineText(mergeType: SQUASH) squashBody: viewerMergeBodyText(mergeType: SQUASH) } id } }";
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
