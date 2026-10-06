package my0;

import java.util.List;
import pz0.su;

/* loaded from: /home/user/work/p/classes4.dex */
public class e implements aa.w0 {
    public static final a Companion = new a();

    public final aa.m d() {
        su.Companion.getClass();
        aa.q0 q0Var = su.z;
        k71.k.g(q0Var, "type");
        List list = oy0.a.a;
        List list2 = oy0.a.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == e.class;
    }

    public final aa.p0 g() {
        return aa.c.c(ny0.a.a, false);
    }

    public final int hashCode() {
        return k71.xShadow.a(e.class).hashCode();
    }

    public final String i() {
        return "e69e40d2b1c596aecf5030e43d4cd0ae0ca42a6a67de5c7ea81246e08ab3a68a";
    }

    public final String j() {
        Companion.getClass();
        return "query MobilePushNotificationSettings { viewer { mobilePushNotificationSettings { scheduledNotifications getsDirectMentions getsAssignments getsReviewRequests getsDeploymentRequests getsPullRequestReviews getsCiActivity getsCiFailedOnly getsReleases } id __typename } id __typename }";
    }

    public final String name() {
        return "MobilePushNotificationSettings";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
