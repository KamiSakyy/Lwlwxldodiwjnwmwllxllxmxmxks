package im0;

import gn0.rn;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements aa.w0 {
    public static final a Companion = new a();

    public final aa.m d() {
        rn.Companion.getClass();
        aa.q0 q0Var = rn.z;
        k71.k.g(q0Var, "type");
        List list = km0.a.a;
        List list2 = km0.a.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == e.class;
    }

    public final aa.p0 g() {
        return aa.c.c(jm0.a.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(e.class).hashCode();
    }

    public final String i() {
        return "2ffe2aa5da4459006719664db369a9475f7561f4d949dc75b5f4c63855a654a2";
    }

    public final String j() {
        Companion.getClass();
        return "query MobilePushNotificationSettings { viewer { mobilePushNotificationSettings { scheduledNotifications getsDirectMentions getsAssignments getsReviewRequests getsDeploymentRequests getsPullRequestReviews getsCiActivity getsCiFailedOnly getsReleases } id __typename } }";
    }

    public final String name() {
        return "MobilePushNotificationSettings";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
