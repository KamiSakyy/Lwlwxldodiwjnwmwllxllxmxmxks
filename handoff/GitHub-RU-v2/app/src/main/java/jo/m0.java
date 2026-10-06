package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 implements aaShadow.n0 {
    public static final h0 Companion = new h0();
    public String r;
    public m10.z00 s;

    public m0(String str, m10.z00 z00Var) {
        k71.k.g(str, "subject_id");
        this.r = str;
        this.s = z00Var;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.g.a;
        List list2 = h10.g.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return k71.k.b(this.r, m0Var.r) && this.s == m0Var.s;
    }

    public static final aa.p0 g() {
        return aa.c.c(ep.v.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public static final String i() {
        return "dda3db2a03db6307f30985ca309283b56e94dfe86a70f4837fb88324be216072";
    }

    public static final String j() {
        Companion.getClass();
        return "mutation AddReactionMutation($subject_id: ID!, $content: ReactionContent!) { addReaction(input: { subjectId: $subject_id content: $content } ) { subject { __typename ...ReactionFragment } reaction { reactable { __typename ...ReactionFragment } id __typename } } }  fragment ReactionFragment on Reactable { __typename id viewerCanReact reactionGroups { __typename viewerHasReacted reactors(first: 1) { __typename totalCount } content } }";
    }

    public final String name() {
        return "AddReactionMutation";
    }

    public static final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("subject_id");
        aa.c.a.b(fVar, wVar, this.r);
        fVar.z0("content");
        fVar.I(this.s.r);
    }

    public final String toString() {
        return "AddReactionMutation(subject_id=" + this.r + ", content=" + this.s + ")";
    }
    public static Object A(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object a(Object p1, Object p2, Object p3) { return null; }
    public static Object b(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object e(Object p1, Object p2, Object p3) { return null; }
    public static Object f(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object g(Object p1, Object p2, Object p3) { return null; }
    public static Object h(Object p1, Object p2, Object p3) { return null; }
    public Object i(Object p1, Object p2, Object p3) { return null; }
    public Object j(Object p1, Object p2, Object p3) { return null; }
    public static Object l(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object m(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object n(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object o(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object p(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
