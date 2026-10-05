package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gc implements aa.w0 {
    public static final cc Companion = new cc();
    public final String r;

    public gc(String str) {
        k71.k.g(str, "ownerName");
        this.r = str;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.a1.a;
        List list2 = kz0.a1.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gc) && k71.k.b(this.r, ((gc) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.c8.a, false);
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
