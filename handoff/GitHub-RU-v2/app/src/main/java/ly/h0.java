package ly;

import aa.n0;
import aa.p0;
import aa.q0;
import java.util.List;
import m10.lf0;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 implements n0 {
    public static final a0 Companion = new a0();
    public lf0 r;

    public h0(lf0 lf0Var) {
        this.r = lf0Var;
    }

    public final aa.m d() {
        vp.Companion.getClass();
        q0 q0Var = vp.A1;
        k71.k.g(q0Var, "type");
        List list = ny.f.a;
        List list2 = ny.f.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && k71.k.b(this.r, ((h0) obj).r);
    }

    public final p0 g() {
        return aa.c.c(my.q.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "323f838ffa09fdd88c35f3439e63484fccd8e6916de64f787393a74576dc9d01";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UpdateUserListsForItem($input: UpdateUserListsForItemInput!) { updateUserListsForItem(input: $input) { item { __typename ...UserListMetadataForRepositoryFragment } user { id lists(first: 100, after: null) { nodes { __typename ...UserListFragment id } } __typename } } }  fragment UserListFragment on UserList { id name isPrivate description items { totalCount } slug __typename }  fragment UserListMetadataForRepositoryFragment on Repository { id lists(first: 100, onlyOwnedByViewer: true) { nodes { __typename ...UserListFragment id } } __typename }";
    }

    public final String name() {
        return "UpdateUserListsForItem";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("input");
        aa.c.c(n10.c.i, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "UpdateUserListsForItemMutation(input=" + this.r + ")";
    }
}
