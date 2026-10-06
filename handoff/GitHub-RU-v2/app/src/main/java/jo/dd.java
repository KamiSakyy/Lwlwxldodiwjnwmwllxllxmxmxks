package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dd implements aaShadow.w0 {
    public static final zc Companion = new zc();
    public String r;

    public dd(String str) {
        k71.k.g(str, "ownerName");
        this.r = str;
    }

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.d1.a;
        List list2 = h10.d1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd) && k71.k.b(this.r, ((dd) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.s8.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "e075de81e970c820774f83d38227fd8684e1d5cb1b04c8faff3d70ba962a9b21";
    }

    public final String j() {
        Companion.getClass();
        return "query DiscussionRepositoryName($ownerName: String!) { organization(login: $ownerName) { organizationDiscussionsRepository { name id __typename } id __typename } id __typename }";
    }

    public final String name() {
        return "DiscussionRepositoryName";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("ownerName");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("DiscussionRepositoryNameQuery(ownerName=", this.r, ")");
    }
}
