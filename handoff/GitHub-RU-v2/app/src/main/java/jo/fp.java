package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fp implements aaShadow.w0 {
    public static final bp Companion = new bp();

    public final aa.m d() {
        m10.p00.Companion.getClass();
        aa.q0 q0Var = m10.p00.F;
        k71.k.g(q0Var, "type");
        List list = h10.b3.a;
        List list2 = h10.b3.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == fp.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ep.xg.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(fp.class).hashCode();
    }

    public final String i() {
        return "6ef43db7caca89acaf33d67935cce5c3aaaeb45673a5e679908966fcc812db0d";
    }

    public final String j() {
        Companion.getClass();
        return "query NotificationSettingsQuery { viewer { notificationSettings { getsDirectMentionMobilePush } id __typename } id __typename }";
    }

    public final String name() {
        return "NotificationSettingsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
