package m00;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements w0 {
    public static final k Companion = new k();
    public final String r;
    public final String s;

    public n(String str, String str2) {
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = r00.c.a;
        List list2 = r00.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.r, nVar.r) && k71.k.b(this.s, nVar.s);
    }

    public final p0 g() {
        return aa.c.c(n00.f.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "7f7ea12c9be28a33610044b55d0c89bec8dd5831b23ab41e4bcd8c4898473069";
    }

    public final String j() {
        Companion.getClass();
        return "query RepositoryEmptyAndArchivedStatus($owner: String!, $name: String!) { repository(owner: $owner, name: $name) { id isArchived isEmpty __typename } id __typename }";
    }

    public final String name() {
        return "RepositoryEmptyAndArchivedStatus";
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
        return x.i.g("RepositoryEmptyAndArchivedStatusQuery(owner=", this.r, ", name=", this.s, ")");
    }
}
