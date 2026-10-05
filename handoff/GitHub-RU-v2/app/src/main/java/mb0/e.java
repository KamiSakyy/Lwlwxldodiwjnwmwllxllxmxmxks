package mb0;

import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements aa.w0 {
    public static final a Companion = new a();

    public final aa.m d() {
        pm.Companion.getClass();
        aa.q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = ob0.a.a;
        List list2 = ob0.a.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == e.class;
    }

    public final aa.p0 g() {
        return aa.c.c(nb0.a.a, false);
    }

    public final int hashCode() {
        return k71.x.a(e.class).hashCode();
    }

    public final String i() {
        return "e097e15ec876e4e2cdeae4df16dedd97e80458e08f708c4d1e4132beab1d3953";
    }

    public final String j() {
        Companion.getClass();
        return "query MobilePushNotificationSettings { viewer { mobilePushNotificationSettings { scheduledNotifications getsDirectMentions getsAssignments getsReviewRequests getsDeploymentRequests getsPullRequestReviews getsCiActivity getsCiFailedOnly } id __typename } }";
    }

    public final String name() {
        return "MobilePushNotificationSettings";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
