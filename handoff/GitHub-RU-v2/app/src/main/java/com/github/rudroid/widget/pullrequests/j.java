package com.github.rudroid.widget.pullrequests;

import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.widget.pullrequests.PullRequestsWidgetSettingsActivity$setWidgetTypeWaiting$2$1", f = "PullRequestsWidgetSettingsActivity.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class j extends c71.j implements j71.e {
    public final /* synthetic */ PullRequestsWidgetModel v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PullRequestsWidgetModel pullRequestsWidgetModel, a71.c cVar) {
        super(2, cVar);
        this.v = pullRequestsWidgetModel;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new j(this.v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (PullRequestsWidgetModel) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        y.j(obj);
        return this.v;
    }
}
