package com.github.rudroid.widget.pullrequests;

import com.github.rudroid.widget.pullrequests.PullRequestsWidgetWorker;
import java.util.Iterator;

@c71.e(c = "com.github.rudroid.widget.pullrequests.PullRequestsWidgetWorker", f = "PullRequestsWidgetWorker.kt", l = {153, 160}, m = "setWidgetState", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class l extends c71.c {
    public PullRequestsWidgetModel u;
    public Iterator v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ PullRequestsWidgetWorker y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(PullRequestsWidgetWorker pullRequestsWidgetWorker, c71.c cVar) {
        super(cVar);
        this.y = pullRequestsWidgetWorker;
    }

    public final Object v(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        PullRequestsWidgetWorker.a aVar = PullRequestsWidgetWorker.Companion;
        return this.y.e(null, null, this);
    }
}
