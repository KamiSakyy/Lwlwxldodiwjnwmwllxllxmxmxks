package com.github.rudroid.viewmodels.notifications;

import android.content.Context;

@c71.e(c = "com.github.rudroid.viewmodels.notifications.NotificationsViewModel", f = "NotificationsViewModel.kt", l = {438, 439}, m = "checkForBannerAndOnboarding", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class t extends c71.c {
    public oa.j u;
    public Context v;
    public com.github.rudroid.fragments.onboarding.notifications.usecase.c w;
    public /* synthetic */ Object x;
    public final /* synthetic */ s y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(s sVar, a71.c cVar) {
        super(cVar);
        this.y = sVar;
    }

    public final Object v(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return s.Q(this.y, null, this);
    }
}
