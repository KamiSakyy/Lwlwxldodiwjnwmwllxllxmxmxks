package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pv implements aa.n0 {
    public static final jv Companion = new jv();
    public final String r;
    public final m10.z00 s;

    public pv(String str, m10.z00 z00Var) {
        k71.k.g(str, "subject_id");
        this.r = str;
        this.s = z00Var;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.u3.a;
        List list2 = h10.u3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv)) {
            return false;
        }
        pv pvVar = (pv) obj;
        return k71.k.b(this.r, pvVar.r) && this.s == pvVar.s;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.sl.a, false);
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

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c<T1,T2,T3,T4> {
        public c() {
        }
    }
}
