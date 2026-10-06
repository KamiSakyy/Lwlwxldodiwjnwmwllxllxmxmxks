package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pr implements aaShadow.n0 {
    public static final jr Companion = new jr();
    public String r;
    public gn0.bo s;

    public pr(String str, gn0.bo boVar) {
        k71.k.g(str, "subject_id");
        this.r = str;
        this.s = boVar;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.g3.a;
        List list2 = en0.g3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr)) {
            return false;
        }
        pr prVar = (pr) obj;
        return k71.k.b(this.r, prVar.r) && this.s == prVar.s;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.wi.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "fd28e410c9115514957be4ff1056b1786318fe1321b40259d2df2ad345ec8057";
    }

    public final String j() {
        Companion.getClass();
        return "mutation RemoveReactionMutation($subject_id: ID!, $content: ReactionContent!) { removeReaction(input: { subjectId: $subject_id content: $content } ) { subject { __typename ...ReactionFragment } reaction { reactable { __typename ...ReactionFragment } id __typename } } }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }";
    }

    public final String name() {
        return "RemoveReactionMutation";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("subject_id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("content");
        fVar.I(this.s.r);
    }

    public final String toString() {
        return "RemoveReactionMutation(subject_id=" + this.r + ", content=" + this.s + ")";
    }
}
