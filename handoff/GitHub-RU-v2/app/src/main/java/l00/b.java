package l00;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.kp;
import m10.rf0;
import m10.wg;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        wg.Companion.getClass();
        x xVar = wg.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List r = x61.l.r(new m[]{new m("scheduledNotifications", b, (String) null, rVar, rVar, rVar), new m("getsDirectMentions", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsAssignments", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsReviewRequests", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsDeploymentRequests", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsPullRequestReviews", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsCiActivity", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsCiFailedOnly", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsReleases", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsLiveActivityCopilotCodingAgentV2", xVar, (String) null, rVar, rVar, rVar)});
        kp.Companion.getClass();
        q0 q0Var = kp.a;
        k71.k.g(q0Var, "type");
        m mVar = new m("mobilePushNotificationSettings", q0Var, (String) null, rVar, rVar, r);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar3 = eh.a;
        List r2 = x61.l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        rf0.Companion.getClass();
        a = x61.l.r(new m[]{new m("viewer", l0.b(rf0.g0), (String) null, rVar, rVar, r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
