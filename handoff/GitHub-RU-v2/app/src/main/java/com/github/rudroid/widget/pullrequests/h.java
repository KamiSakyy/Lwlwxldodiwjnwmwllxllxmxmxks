package com.github.rudroid.widget.pullrequests;

import android.content.Context;
import sy.y;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.widget.pullrequests.PullRequestsWidgetSettingsActivity$savePrefsAndUpdateWidget$1", f = "PullRequestsWidgetSettingsActivity.kt", l = {317}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class h extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ PullRequestsWidgetSettingsActivity w;
    public final /* synthetic */ Context x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PullRequestsWidgetSettingsActivity pullRequestsWidgetSettingsActivity, Context context, a71.c cVar) {
        super(2, cVar);
        this.w = pullRequestsWidgetSettingsActivity;
        this.x = context;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new h(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            y.j(obj);
            this.v = 1;
            if (PullRequestsWidgetSettingsActivity.s0(this.w, this.x, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
        }
        return a0.a;
    }
}
