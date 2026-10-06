package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mn implements aaShadow.w0 {
    public static final in Companion = new in();

    public final aa.m d() {
        pz0.su.Companion.getClass();
        aa.q0 q0Var = pz0.su.z;
        k71.k.g(q0Var, "type");
        List list = kz0.v2.a;
        List list2 = kz0.v2.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == mn.class;
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.sf.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(mn.class).hashCode();
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
