package j00;

import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements aa.w0 {
    public static final f Companion = new f();

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = l00.b.a;
        List list2 = l00.b.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == j.class;
    }

    public final aa.p0 g() {
        return aa.c.c(k00.d.a, false);
    }

    public final int hashCode() {
        return k71.x.a(j.class).hashCode();
    }

    public final String i() {
        return "4e0378c3fc5566f15f2c0c0a0780d9860b7ce15f632ed1a6d9740d8c7b9ca4b0";
    }

    public final String j() {
        Companion.getClass();
        return "query MobilePushNotificationSettings { viewer { mobilePushNotificationSettings { scheduledNotifications getsDirectMentions getsAssignments getsReviewRequests getsDeploymentRequests getsPullRequestReviews getsCiActivity getsCiFailedOnly getsReleases getsLiveActivityCopilotCodingAgentV2 } id __typename } id __typename }";
    }

    public final String name() {
        return "MobilePushNotificationSettings";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
    }
}
