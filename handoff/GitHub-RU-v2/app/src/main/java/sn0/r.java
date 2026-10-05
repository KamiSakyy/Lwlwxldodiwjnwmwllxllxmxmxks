package sn0;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements w0 {
    public static final n Companion = new n();
    public final String r;

    public r(String str) {
        k71.k.g(str, "id");
        this.r = str;
    }

    public final aa.m d() {
        su.Companion.getClass();
        q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = un0.d.a;
        List list2 = un0.d.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && k71.k.b(this.r, ((r) obj).r);
    }

    public final p0 g() {
        return aa.c.c(tn0.h.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "963172b0543a3df62882f5294856798319b387f9f0c98d9fc657b9994afec863";
    }

    public final String j() {
        Companion.getClass();
        return "query ProjectUpdateChannel($id: ID!) { node(id: $id) { __typename ... on ProjectV2 { id databaseId updatesChannel } id } id __typename }";
    }

    public final String name() {
        return "ProjectUpdateChannel";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("ProjectUpdateChannelQuery(id=", this.r, ")");
    }
}
