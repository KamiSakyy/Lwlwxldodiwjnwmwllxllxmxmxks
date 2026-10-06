package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ud implements aaShadow.w0 {
    public static final rd Companion = new rd();
    public String r;
    public String s;

    public ud(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.h1.a;
        List list2 = en0.h1.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud)) {
            return false;
        }
        ud udVar = (ud) obj;
        return k71.k.b(this.r, udVar.r) && k71.k.b(this.s, udVar.s);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.d9.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "1880da53edc9e2fb39cd6b72d208d57cc8f1a712df2b7bb48fe84c716062adb2";
    }

    public final String j() {
        Companion.getClass();
        return "query FetchRepoListsSelectedByActiveUser($owner: String!, $name: String!) { repository(owner: $owner, name: $name) { __typename ...UserListMetadataForRepositoryFragment id } }  fragment UserListFragment on UserList { id name isPrivate description items { totalCount } slug __typename }  fragment UserListMetadataForRepositoryFragment on Repository { id lists(first: 100, onlyOwnedByViewer: true) { nodes { __typename ...UserListFragment id } } __typename }";
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
