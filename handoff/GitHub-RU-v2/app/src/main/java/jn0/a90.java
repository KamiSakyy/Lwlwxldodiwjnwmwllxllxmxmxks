package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a90 implements aaShadow.n0 {
    public static final v80 Companion = new v80();
    public String r;

    public a90(String str) {
        k71.k.g(str, "subjectId");
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.v5.a;
        List list2 = kz0.v5.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a90) && k71.k.b(this.r, ((a90) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ev.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "a78cface1337bdd24115e5627fed1bf79a6ccc56aaeda56eeee00eca7669747f";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UnminimizeComment($subjectId: ID!) { unminimizeComment(input: { subjectId: $subjectId } ) { unminimizedComment { __typename ... on Node { id } ...MinimizableCommentFragment } } }  fragment NodeIdFragment on Node { id __typename }  fragment MinimizableCommentFragment on Minimizable { __typename ...NodeIdFragment isMinimized minimizedReason viewerCanMinimize }";
    }

    public final String name() {
        return "UnminimizeComment";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("subjectId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("UnminimizeCommentMutation(subjectId=", this.r, ")");
    }
}
