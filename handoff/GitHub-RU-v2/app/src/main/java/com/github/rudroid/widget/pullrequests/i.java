package com.github.rudroid.widget.pullrequests;

import android.content.Context;
import java.util.Iterator;

@c71.e(c = "com.github.rudroid.widget.pullrequests.PullRequestsWidgetSettingsActivity", f = "PullRequestsWidgetSettingsActivity.kt", l = {328, 335, 343}, m = "setWidgetTypeWaiting", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class i extends c71.c {
    public int A;
    public Context u;
    public PullRequestsWidgetModel v;
    public Iterator w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ PullRequestsWidgetSettingsActivity z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PullRequestsWidgetSettingsActivity pullRequestsWidgetSettingsActivity, c71.c cVar) {
        super(cVar);
        this.z = pullRequestsWidgetSettingsActivity;
    }

    public final Object v(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return PullRequestsWidgetSettingsActivity.s0(this.z, null, this);
    }
    public Object d(Object p1, Object p2, Object p3) { return null; }
}
