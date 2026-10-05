package oy0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import pz0.jk;
import pz0.pd;
import pz0.td;
import pz0.w80;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        pd.Companion.getClass();
        x xVar = pd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List r = l.r(new m[]{new m("scheduledNotifications", b, (String) null, rVar, rVar, rVar), new m("getsDirectMentions", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsAssignments", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsReviewRequests", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsDeploymentRequests", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsPullRequestReviews", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsCiActivity", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsCiFailedOnly", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsReleases", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        jk.Companion.getClass();
        q0 q0Var = jk.a;
        k.g(q0Var, "type");
        m mVar = new m("mobilePushNotificationSettings", q0Var, (String) null, rVar, rVar, r);
        td.Companion.getClass();
        x xVar2 = td.a;
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar3 = xd.a;
        List r2 = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        w80.Companion.getClass();
        a = l.r(new m[]{new m("viewer", l0.b(w80.W), (String) null, rVar, rVar, r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
