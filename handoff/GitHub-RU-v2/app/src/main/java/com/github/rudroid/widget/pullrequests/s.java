package com.github.rudroid.widget.pullrequests;

import com.github.service.models.response.PullRequestWidgetData;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class s implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ z5.n s;
    public final /* synthetic */ PullRequestWidgetData t;
    public final /* synthetic */ m6.e u;

    public /* synthetic */ s(z5.n nVar, PullRequestWidgetData pullRequestWidgetData, m6.e eVar, int i, int i2) {
        this.r = i2;
        this.s = nVar;
        this.t = pullRequestWidgetData;
        this.u = eVar;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                u.a(this.s, this.t, this.u, sVar, androidx.compose.runtime.t.L(1));
                break;
            default:
                u.b(this.s, this.t, this.u, sVar, androidx.compose.runtime.t.L(7));
                break;
        }
        return a0.a;
    }
}
