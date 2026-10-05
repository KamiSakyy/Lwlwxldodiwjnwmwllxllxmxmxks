package com.github.rudroid.utilities;

import com.github.rudroid.agents.sessionevents.c;
import com.github.rudroid.agents.sessionevents.q4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w1 {
    public static final /* synthetic */ int a = 0;

    static {
        sy.w.t(new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(16));
        x61.l.j0(new String[]{"environment", "email"});
        x61.l.r(new com.github.rudroid.agents.sessionevents.d[]{new com.github.rudroid.agents.sessionevents.d("environment", "Environment", "Select the target deployment environment", new c.f(x61.l.r(new String[]{"Development", "Staging", "Production"}), "Development")), new com.github.rudroid.agents.sessionevents.d("strategy", "Deployment strategy", (String) null, new c.g(x61.l.r(new com.github.rudroid.agents.sessionevents.n[]{new com.github.rudroid.agents.sessionevents.n("rolling", "Rolling update"), new com.github.rudroid.agents.sessionevents.n("blue_green", "Blue-green deployment"), new com.github.rudroid.agents.sessionevents.n("canary", "Canary release")}), (String) null)), new com.github.rudroid.agents.sessionevents.d("email", "Notification email", "Email address for deployment notifications", new c.h(q4.r, (Integer) null, (Integer) null, (String) null)), new com.github.rudroid.agents.sessionevents.d("auto_rollback", "Auto rollback", "Automatically roll back on failure", new c.c(Boolean.TRUE)), new com.github.rudroid.agents.sessionevents.d("replicas", "Number of replicas", (String) null, new c.d(1, 10, 3)), new com.github.rudroid.agents.sessionevents.d("features", "Feature flags", "Select features to enable", new c.b(x61.l.r(new String[]{"Dark mode", "Beta features", "Analytics"}), (Integer) null, (Integer) null, x61.r.r))});
    }



}
