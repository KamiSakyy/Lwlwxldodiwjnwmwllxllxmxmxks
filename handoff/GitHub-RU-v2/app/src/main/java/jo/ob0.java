package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ob0 implements aaShadow.n0 {
    public static final jb0 Companion = new jb0();
    public String r;

    public ob0(String str) {
        k71.k.g(str, "subjectId");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.e6.a;
        List list2 = h10.e6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ob0) && k71.k.b(this.r, ((ob0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.zw.a, false);
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
