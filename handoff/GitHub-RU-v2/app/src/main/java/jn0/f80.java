package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f80 implements aa.n0 {
    public static final b80 Companion = new b80();
    public final String r;

    public f80(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.s5.a;
        List list2 = kz0.s5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f80) && k71.k.b(this.r, ((f80) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.qu.a, false);
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
