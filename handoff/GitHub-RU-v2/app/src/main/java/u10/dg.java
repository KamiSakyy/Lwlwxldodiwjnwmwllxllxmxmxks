package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dg implements aaShadow.n0 {
    public static final zf Companion = new zf();
    public String r;

    public dg(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.p1.a;
        List list2 = fc0.p1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dg) && k71.k.b(this.r, ((dg) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ua.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "e9ee789af3546408665c6ca08073904d503ed5ce757a333790a8dc902dac87f1";
    }

    public final String j() {
        Companion.getClass();
        return "mutation LockLockable($id: ID!) { lockLockable(input: { lockableId: $id } ) { actor { __typename ...NodeIdFragment login } lockedRecord { __typename activeLockReason ...LockableFragment } } }  fragment NodeIdFragment on Node { id __typename }  fragment LockableFragment on Lockable { __typename locked ... on PullRequest { id viewerCanReact } ... on Issue { id viewerCanReact } ... on Discussion { repository { id viewerPermission __typename } id viewerCanReact viewerCanUpvote } }";
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
