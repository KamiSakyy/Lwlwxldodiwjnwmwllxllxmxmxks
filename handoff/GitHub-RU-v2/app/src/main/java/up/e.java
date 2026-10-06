package up;

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
import m10.p00;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements w0 {
    public static final a Companion = new a();
    public ArrayList r;

    public e(ArrayList arrayList) {
        this.r = arrayList;
    }

    public final m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k.g(q0Var, "type");
        List list = wp.a.a;
        List list2 = wp.a.a;
        k.g(list2, "selections");
        rShadow rVar = rShadow.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.rShadow.equals(((e) obj).r);
    }

    public final p0 g() {
        return aa.c.c(vp.a.a, false);
    }

    public final int hashCode() {
        return this.rShadow.hashCode();
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
