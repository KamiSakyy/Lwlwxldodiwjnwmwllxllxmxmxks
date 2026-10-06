package com.github.rudroid.widget.contribution;

import com.github.rudroid.widget.contribution.ContributionWidgetWorker;
import java.util.Iterator;

@c71.e(c = "com.github.rudroid.widget.contribution.ContributionWidgetWorker", f = "ContributionWidgetWorker.kt", l = {148, 155}, m = "setWidgetState", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class t extends c71.c {
    public ContributionWidgetModel u;
    public Iterator v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ ContributionWidgetWorker y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ContributionWidgetWorker contributionWidgetWorker, c71.c cVar) {
        super(cVar);
        this.y = contributionWidgetWorker;
    }

    public final Object v(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        ContributionWidgetWorker.a aVar = ContributionWidgetWorker.Companion;
        return this.y.e(null, null, this);
    }
    public Object L(Object p1) { return null; }
}
