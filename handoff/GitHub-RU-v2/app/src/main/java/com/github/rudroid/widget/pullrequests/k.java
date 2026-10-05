package com.github.rudroid.widget.pullrequests;

import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

@c71.e(c = "com.github.rudroid.widget.pullrequests.PullRequestsWidgetWorker", f = "PullRequestsWidgetWorker.kt", l = {70, 74, 93, 113, 118, 129, 137}, m = "doWork", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k extends c71.c {
    public String A;
    public int B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ PullRequestsWidgetWorker F;
    public int G;
    public List u;
    public SharedPreferences v;
    public LinkedHashSet w;
    public Map x;
    public Collection y;
    public Iterator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(PullRequestsWidgetWorker pullRequestsWidgetWorker, c71.c cVar) {
        super(cVar);
        this.F = pullRequestsWidgetWorker;
    }

    public final Object v(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.c(this);
    }
}
