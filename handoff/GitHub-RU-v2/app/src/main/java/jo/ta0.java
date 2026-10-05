package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ta0 implements aa.n0 {
    public static final oa0 Companion = new oa0();
    public final String r;

    public ta0(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.b6.a;
        List list2 = h10.b6.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ta0) && k71.k.b(this.r, ((ta0) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.kw.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "473c2e2bd96acfaea816b3f2f061a372d572fdfe868942bc74a092633a77a7d5";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UnlockLockable($id: ID!) { unlockLockable(input: { lockableId: $id } ) { actor { __typename login ... on Bot { displayName id } ...NodeIdFragment } unlockedRecord { __typename activeLockReason ...LockableFragment } } }  fragment NodeIdFragment on Node { id __typename }  fragment LockableFragment on Lockable { __typename locked ... on PullRequest { id viewerCanReact } ... on Issue { id viewerCanReact } ... on Discussion { repository { id viewerPermission __typename } id viewerCanReact viewerCanUpvote } }";
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
