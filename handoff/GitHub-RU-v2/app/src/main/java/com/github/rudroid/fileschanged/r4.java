package com.github.rudroid.fileschanged;

import com.github.rudroid.utilities.ui.g1;
import com.github.service.models.response.type.PullRequestReviewEvent;

/* loaded from: /home/user/work/p/classes.dex */
final /* synthetic */ class r4 extends k71.i implements j71.c {
    public final Object k(Object obj) {
        PullRequestReviewEvent pullRequestReviewEvent = (PullRequestReviewEvent) obj;
        k71.k.g(pullRequestReviewEvent, "p0");
        a5 a5Var = (a5) ((k71.c) this).s;
        a5Var.getClass();
        y71.y1 y1Var = a5Var.f13087w;
        z4 z4Var = (z4) y1Var.getValue();
        g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
        p4 Q = a5Var.Q(((z4) y1Var.getValue()).f13644c, pullRequestReviewEvent);
        aVar.getClass();
        y1Var.k((Object) null, z4.a(z4Var, new com.github.rudroid.utilities.ui.h0(Q), pullRequestReviewEvent, null, 4));
        return w61.a0.a;
    }
}
