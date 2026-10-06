package com.github.rudroid.fragments.onboarding.notifications.viewmodel;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.fragments.onboarding.notifications.viewmodel.r0;
import com.github.service.models.response.type.MobileAppElement;
import y71.n1Shadow;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class u0 extends k1 {

    /* renamed from: s, reason: collision with root package name */
    public gi.c f14340s;

    /* renamed from: t, reason: collision with root package name */
    public kj.j f14341t;

    /* renamed from: u, reason: collision with root package name */
    public com.github.rudroid.fragments.onboarding.notifications.usecase.d0 f14342u;

    /* renamed from: v, reason: collision with root package name */
    public com.github.rudroid.fragments.onboarding.notifications.usecase.u f14343v;

    /* renamed from: w, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f14344w;

    /* renamed from: x, reason: collision with root package name */
    public y1 f14345x;

    public u0(gi.c cVar, kj.j jVar, com.github.rudroid.fragments.onboarding.notifications.usecase.d0 d0Var, com.github.rudroid.fragments.onboarding.notifications.usecase.u uVar, com.github.rudroid.activities.util.c cVar2) {
        k71.k.g(cVar, "systemPreferences");
        k71.k.g(jVar, "analyticsUseCase");
        k71.k.g(d0Var, "systemNotificationsGrantedUseCase");
        k71.k.g(uVar, "setNotificationsPermissionsRequestedUseCase");
        k71.k.g(cVar2, "accountHolder");
        this.f14340s = cVar;
        this.f14341t = jVar;
        this.f14342u = d0Var;
        this.f14343v = uVar;
        this.f14344w = cVar2;
        this.f14345x = n1Shadow.c(new r0.d());
    }

    public final void P(boolean z10, boolean z11) {
        y1 y1Var = this.f14345x;
        r0 r0Var = (r0) y1Var.getValue();
        gi.c cVar = this.f14340s;
        cVar.getClass();
        String str = (String) v71.b0.D(a71.i.r, new gi.a(cVar, (a71.c) null, 1));
        if (k71.k.b(str, "permission_dialog_will_show_once_more") && !z11) {
            cVar.c("permission_dialog_will_not_show");
            v71.b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new t0(this, z10 ? MobileAppElement.PUSH_NOTIFICATIONS_PERMISSION_DIALOG_ALLOW : MobileAppElement.PUSH_NOTIFICATIONS_PERMISSION_DIALOG_DENY, null), 3);
        } else if (!r0Var.a() && z10 && k71.k.b(str, "permission_dialog_never_shown")) {
            cVar.c("permission_dialog_will_not_show");
            v71.b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new t0(this, z10 ? MobileAppElement.PUSH_NOTIFICATIONS_PERMISSION_DIALOG_ALLOW : MobileAppElement.PUSH_NOTIFICATIONS_PERMISSION_DIALOG_DENY, null), 3);
        } else if (z10) {
            cVar.c("permission_dialog_will_not_show");
        } else if (z11) {
            cVar.c("permission_dialog_will_show_once_more");
        }
        r0.a aVar = new r0.a(z10, z11);
        y1Var.getClass();
        y1Var.k((Object) null, aVar);
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new s0(this, null), 3);
    }
}
