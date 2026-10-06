package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bk implements aaShadow.n0 {
    public static final wj Companion = new wj();
    public final String r;

    public bk(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.d2.a;
        List list2 = h10.d2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bk) && k71.k.b(this.r, ((bk) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.od.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "39354d5309108dce2a7a571cdb34e20f28d5cd76e90aa9e52cf671904b92d05a";
    }

    public final String j() {
        Companion.getClass();
        return "mutation LockLockable($id: ID!) { lockLockable(input: { lockableId: $id } ) { actor { __typename ...NodeIdFragment login ... on Bot { displayName id } } lockedRecord { __typename activeLockReason ...LockableFragment } } }  fragment NodeIdFragment on Node { id __typename }  fragment LockableFragment on Lockable { __typename locked ... on PullRequest { id viewerCanReact } ... on Issue { id viewerCanReact } ... on Discussion { repository { id viewerPermission __typename } id viewerCanReact viewerCanUpvote } }";
    }

    public final String name() {
        return "LockLockable";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("LockLockableMutation(id=", this.r, ")");
    }
}
