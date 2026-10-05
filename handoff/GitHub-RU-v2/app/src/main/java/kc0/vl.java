package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vl implements aa.w0 {
    public static final rl Companion = new rl();

    public final aa.m d() {
        gn0.rn.Companion.getClass();
        aa.q0 q0Var = gn0.rn.z;
        k71.k.g(q0Var, "type");
        List list = en0.p2.a;
        List list2 = en0.p2.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == vl.class;
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.me.a, false);
    }

    public final int hashCode() {
        return k71.x.a(vl.class).hashCode();
    }

    public final String i() {
        return "f7dddadb33f3a6b035a735942af78d6adb58bd3dd4a547223329c03c91e3f388";
    }

    public final String j() {
        Companion.getClass();
        return "query NotificationSettingsQuery { viewer { notificationSettings { getsDirectMentionMobilePush } id __typename } }";
    }

    public final String name() {
        return "NotificationSettingsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
