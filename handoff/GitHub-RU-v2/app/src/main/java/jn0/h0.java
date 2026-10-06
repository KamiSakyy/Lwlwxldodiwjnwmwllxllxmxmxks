package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h0 implements aaShadow.n0 {
    public static final c0 Companion = new c0();
    public String r;
    public pz0.cv s;

    public h0(String str, pz0.cv cvVar) {
        k71.k.g(str, "subject_id");
        this.r = str;
        this.s = cvVar;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.f.a;
        List list2 = kz0.f.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return k71.k.b(this.r, h0Var.r) && this.s == h0Var.s;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.s.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "dda3db2a03db6307f30985ca309283b56e94dfe86a70f4837fb88324be216072";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddReactionMutation($subject_id: ID!, $content: ReactionContent!) { addReaction(input: { subjectId: $subject_id content: $content } ) { subject { __typename ...ReactionFragment } reaction { reactable { __typename ...ReactionFragment } id __typename } } }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }";
    }

    public final String name() {
        return "AddReactionMutation";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("subject_id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("content");
        fVar.I(this.s.r);
    }

    public final String toString() {
        return "AddReactionMutation(subject_id=" + this.r + ", content=" + this.s + ")";
    }
}
