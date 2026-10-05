package com.github.rudroid.widget.contribution;

import android.content.Context;
import v71.z;
import w61.a0;

@c71.e(c = "com.github.rudroid.widget.contribution.ContributionWidgetSettingsActivity$savePrefAndUpdateWidget$1", f = "ContributionWidgetSettingsActivity.kt", l = {99}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class p extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ ContributionWidgetSettingsActivity w;
    public final /* synthetic */ Context x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ContributionWidgetSettingsActivity contributionWidgetSettingsActivity, Context context, a71.c cVar) {
        super(2, cVar);
        this.w = contributionWidgetSettingsActivity;
        this.x = context;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new p(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (z) obj).v(a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            this.v = 1;
            if (ContributionWidgetSettingsActivity.v0(this.w, this.x, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return a0.a;
    }
}
