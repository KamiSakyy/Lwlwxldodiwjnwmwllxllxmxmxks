package m00;

import aa.p0;
import aa.q0;
import aa.w0;
import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements w0 {
    public static final a Companion = new a();
    public final String r;
    public final String s;

    public d(String str, String str2) {
        k71.k.g(str, "ownerLogin");
        k71.k.g(str2, "repositoryName");
        this.r = str;
        this.s = str2;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = r00.a.a;
        List list2 = r00.a.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.r, dVar.r) && k71.k.b(this.s, dVar.s);
    }

    public final p0 g() {
        return aa.c.c(n00.a.a, false);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String i() {
        return "12a1560764a96f77ad7538f2d5151db5dfe16d604a330d6ddfbb9e6625fff899";
    }

    public final String j() {
        Companion.getClass();
        return "query CheckRepositoryReady($ownerLogin: String!, $repositoryName: String!) { repository(owner: $ownerLogin, name: $repositoryName) { id isEmpty __typename } id __typename }";
    }

    public final String name() {
        return "CheckRepositoryReady";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("ownerLogin");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, this.r);
        fVar.z0("repositoryName");
        bVar.b(fVar, wVar, this.s);
    }

    public final String toString() {
        return x.i.g("CheckRepositoryReadyQuery(ownerLogin=", this.r, ", repositoryName=", this.s, ")");
    }
}
