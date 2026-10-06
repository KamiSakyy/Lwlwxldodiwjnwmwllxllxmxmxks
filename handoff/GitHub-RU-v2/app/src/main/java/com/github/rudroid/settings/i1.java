package com.github.rudroid.settings;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i1 extends androidx.lifecycle.a {
    public static final a Companion = new a();
    public final com.github.rudroid.fragments.onboarding.notifications.usecase.s A;
    public final com.github.rudroid.activities.util.c B;
    public v71.q1 C;
    public v71.q1 D;
    public final y71.y1 E;
    public final y71.i1 F;
    public final y71.y1 G;
    public final y71.i1 H;
    public final y71.y1 I;
    public final y71.i1 J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final boolean N;
    public final l51.h t;
    public final l7.x1 u;
    public final sm.g v;
    public final l51.h w;
    public final rm.c x;
    public final sm.e y;
    public final com.github.rudroid.notifications.domain.q z;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(Application application, l51.h hVar, l7.x1 x1Var, mm.u uVar, sm.g gVar, l51.h hVar2, rm.c cVar, sm.e eVar, com.github.rudroid.notifications.domain.q qVar, com.github.rudroid.fragments.onboarding.notifications.usecase.s sVar, com.github.rudroid.activities.util.c cVar2) {
        super(application);
        k71.k.g(uVar, "updateDirectMentionsSettingForGHESUseCase");
        k71.k.g(gVar, "updatePushNotificationSettingUseCase");
        k71.k.g(cVar, "refreshWeekNotificationSchedules");
        k71.k.g(eVar, "refreshPushNotificationSettings");
        k71.k.g(qVar, "updateLocalNotificationWorkerStatusUseCase");
        k71.k.g(sVar, "setNotificationsOnboardingShownUseCase");
        k71.k.g(cVar2, "accountHolder");
        this.t = hVar;
        this.u = x1Var;
        this.v = gVar;
        this.w = hVar2;
        this.x = cVar;
        this.y = eVar;
        this.z = qVar;
        this.A = sVar;
        this.B = cVar2;
        y71.y1 c = y71.n1.c(x61.s.r);
        this.E = c;
        this.F = new y71.i1(c);
        pm.c.Companion.getClass();
        y71.y1 c2 = y71.n1.c(pm.c.g);
        this.G = c2;
        this.H = new y71.i1(c2);
        y71.y1 c3 = y71.n1.c(Boolean.FALSE);
        this.I = c3;
        this.J = new y71.i1(c3);
        float f = com.github.rudroid.utilities.g.a;
        Application P = P();
        boolean z = false;
        try {
            PackageInfo packageInfo = P.getPackageManager().getPackageInfo(P.getPackageName(), 0);
            if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                fi.c cVar3 = fi.d.Companion;
                Application P2 = P();
                cVar3.getClass();
                if (!fi.c.b(P2).getBoolean("releases_settings_shown", false)) {
                    z = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            P.getPackageName();
        }
        this.N = z;
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new h1(this, null), 3);
    }

    public final void O() {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new p1(this, null), 3);
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.G;
        runtimeFeatureFlag.getClass();
        if (RuntimeFeatureFlag.a(cVar)) {
            fi.c cVar2 = fi.d.Companion;
            Application P = P();
            cVar2.getClass();
            SharedPreferences.Editor edit = fi.c.b(P).edit();
            edit.putBoolean("releases_settings_shown", true);
            edit.apply();
        }
        this.z.a();
    }
}
