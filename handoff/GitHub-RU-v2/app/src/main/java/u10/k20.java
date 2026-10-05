package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k20 implements aa.n0 {
    public static final g20 Companion = new g20();
    public final String r;

    public k20(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.z4.a;
        List list2 = fc0.z4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k20) && k71.k.b(this.r, ((k20) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.gq.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "de895627707329c19267cf95800d50e35a129b0caf3deea209828d0e7bbf2566";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UnlockLockable($id: ID!) { unlockLockable(input: { lockableId: $id } ) { actor { __typename login ...NodeIdFragment } unlockedRecord { __typename activeLockReason ...LockableFragment } } }  fragment NodeIdFragment on Node { id __typename }  fragment LockableFragment on Lockable { __typename locked ... on PullRequest { id viewerCanReact } ... on Issue { id viewerCanReact } ... on Discussion { repository { id viewerPermission __typename } id viewerCanReact viewerCanUpvote } }";
    }

    public final String name() {
        return "UnlockLockable";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("UnlockLockableMutation(id=", this.r, ")");
    }
}
