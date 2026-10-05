package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mf implements aa.w0 {
    public static final jf Companion = new jf();
    public final String r;
    public final String s;

    public mf(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.n1.a;
        List list2 = kz0.n1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf)) {
            return false;
        }
        mf mfVar = (mf) obj;
        return k71.k.b(this.r, mfVar.r) && k71.k.b(this.s, mfVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.ia.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "3263e776f420b09cb87cc07f6fa91b03f636be1ffb4d9297be6c372094e4d0e8";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchRepoListsSelectedByActiveUser($owner: String!, $name: String!) { repository(owner: $owner, name: $name) { __typename ...UserListMetadataForRepositoryFragment id } id __typename }  fragment UserListFragment on UserList { id name isPrivate description items { totalCount } slug __typename }  fragment UserListMetadataForRepositoryFragment on Repository { id lists(first: 100, onlyOwnedByViewer: true) { nodes { __typename ...UserListFragment id } } __typename }";
    }

    public final String name() {
        return "FetchRepoListsSelectedByActiveUser";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("owner");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("name");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("FetchRepoListsSelectedByActiveUserQuery(owner=", this.r, ", name=", this.s, ")");
    }
}
