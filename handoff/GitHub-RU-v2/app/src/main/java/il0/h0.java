package il0;

import aa.n0;
import aa.p0;
import aa.q0;
import gn0.m00;
import gn0.wh;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h0 implements n0 {
    public static final a0 Companion = new a0();
    public final m00 r;

    public h0(m00 m00Var) {
        this.r = m00Var;
    }

    public final aa.m d() {
        wh.Companion.getClass();
        q0 q0Var = wh.e1;
        k71.k.g(q0Var, "type");
        List list = kl0.f.a;
        List list2 = kl0.f.a;
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
        return aa.c.c(jl0.q.a, false);
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
        aa.c.c(hn0.b.s, false).b(fVar, wVar, this.r);
    }

    public final String toString() {
        return "UpdateUserListsForItemMutation(input=" + this.r + ")";
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p0<T1,T2,T3,T4> {
        public p0() {
        }
    }
}
