package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ui0 implements aa.w0 {
    public static final ri0 Companion = new ri0();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.l7.a;
        List list2 = h10.l7.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == ui0.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.t10.a, false);
    }

    public final int hashCode() {
        return k71.x.a(ui0.class).hashCode();
    }

    public final String i() {
        return "06821a3766a0ea8cf55ab2e0f606f5f20b49df3ee30ad7b98c549056ea4d97cf";
    }

    public final String j() {
        Companion.getClass();
        return "query ViewerCopilotLicenseTypeQuery { viewer { copilotLicenseType id __typename } id __typename }";
    }

    public final String name() {
        return "ViewerCopilotLicenseTypeQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
