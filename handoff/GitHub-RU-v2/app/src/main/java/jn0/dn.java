package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dn implements aaShadow.n0 {
    public static final ym Companion = new ym();
    public String r;
    public pz0.hx s;

    public dn(String str, pz0.hx hxVar) {
        k71.k.g(str, "subjectId");
        this.r = str;
        this.s = hxVar;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.t2.a;
        List list2 = kz0.t2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn)) {
            return false;
        }
        dn dnVar = (dn) obj;
        return k71.k.b(this.r, dnVar.r) && this.s == dnVar.s;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.mf.a, false);
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
