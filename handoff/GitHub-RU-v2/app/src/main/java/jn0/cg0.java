package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cg0 implements aaShadow.w0 {
    public static final zf0 Companion = new zf0();
    public String r;
    public String s;

    public cg0(String str, String str2) {
        k71.k.g(str, "owner");
        k71.k.g(str2, "name");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.b7.a;
        List list2 = kz0.b7.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cg0)) {
            return false;
        }
        cg0 cg0Var = (cg0) obj;
        return k71.k.b(this.r, cg0Var.r) && k71.k.b(this.s, cg0Var.s);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.wz.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "d734abc2bb53ea482e62222cace6a75af93ee1b5be1452643d05dd072dcee9a7";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerCanPushToRepository($owner: String!, $name: String!) { repository(owner: $owner, name: $name) { id viewerCanPush __typename } id __typename }";
    }

    public final String name() {
        return "ViewerCanPushToRepository";
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
        return x.i.g("ViewerCanPushToRepositoryQuery(owner=", this.r, ", name=", this.s, ")");
    }
}
