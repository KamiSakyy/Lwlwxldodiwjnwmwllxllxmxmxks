package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class st implements aaShadow.n0 {
    public static final mt Companion = new mt();
    public final String r;
    public final pz0.cv s;

    public st(String str, pz0.cv cvVar) {
        k71.k.g(str, "subject_id");
        this.r = str;
        this.s = cvVar;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.n3.a;
        List list2 = kz0.n3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st)) {
            return false;
        }
        st stVar = (st) obj;
        return k71.k.b(this.r, stVar.r) && this.s == stVar.s;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.kk.a, false);
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
