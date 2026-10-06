package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ik implements aaShadow.n0 {
    public static final dk Companion = new dk();
    public String r;
    public hc0.yo s;

    public ik(String str, hc0.yo yoVar) {
        k71.k.g(str, "subjectId");
        this.r = str;
        this.s = yoVar;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.j2.a;
        List list2 = fc0.j2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ik)) {
            return false;
        }
        ik ikVar = (ik) obj;
        return k71.k.b(this.r, ikVar.r) && this.s == ikVar.s;
    }

    public final aa.p0 g() {
        return aa.c.c(p20.kd.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "bdc9f25437796e64021bb84e08bc442c4fd35f440ebaa369c256318f4391ee78";
    }

    public final String j() {
        Companion.getClass();
        return "mutation MinimizeComment($subjectId: ID!, $classifier: ReportedContentClassifiers!) { minimizeComment(input: { subjectId: $subjectId classifier: $classifier } ) { minimizedComment { __typename ... on Node { id } ...MinimizableCommentFragment } } }  fragment NodeIdFragment on Node { id __typename }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }";
    }

    public final String name() {
        return "MinimizeComment";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("subjectId");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("classifier");
        fVar.I(this.s.r);
    }

    public final String toString() {
        return "MinimizeCommentMutation(subjectId=" + this.r + ", classifier=" + this.s + ")";
    }
}
