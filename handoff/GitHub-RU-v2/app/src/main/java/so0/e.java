package so0;

import aa.m;
import aa.p0;
import aa.q0;
import aa.w;
import aa.w0;
import com.github.rudroid.m0;
import ea.f;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import pz0.su;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements w0 {
    public static final a Companion = new a();
    public ArrayList r;

    public e(ArrayList arrayList) {
        this.r = arrayList;
    }

    public final m d() {
        su.Companion.getClass();
        q0 q0Var = su.z;
        k.g(q0Var, "type");
        List list = uo0.a.a;
        List list2 = uo0.a.a;
        k.g(list2, "selections");
        r rVar = r.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.r.equals(((e) obj).r);
    }

    public final p0 g() {
        return aa.c.c(to0.a.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "c3a2097d093a211a2ee946eebf4d31d82bcd5aad42e4571e2705da5f953abf20";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerFeatureFlags($flags: [String!]!) { viewer { featureFlags(flags: $flags) { name enabled } id __typename } id __typename }";
    }

    public final String name() {
        return "ViewerFeatureFlags";
    }

    public final void o(f fVar, w wVar, boolean z) {
        k.g(wVar, "customScalarAdapters");
        fVar.z0("flags");
        aa.c.a(aa.c.a).e(fVar, wVar, this.r);
    }

    public final String toString() {
        return m0.g("ViewerFeatureFlagsQuery(flags=", ")", this.r);
    }
}
