package com.github.rudroid.viewmodels.notifications;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.domain.searchandfilter.filters.data.NotificationFilterFilter;
import com.github.domain.searchandfilter.filters.data.NotificationImportantFilter;
import com.github.domain.searchandfilter.filters.data.notification.StatusNotificationFilter;
import com.github.rudroid.common.logging.LogTag;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.viewmodel.e;
import com.github.rudroid.utilities.viewmodel.g;
import com.github.rudroid.viewmodels.v3;
import com.github.service.models.response.type.MobileAppElement;
import com.github.service.models.response.type.MobileEventContext;
import com.github.service.models.response.type.SubscriptionState;
import dd.a;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import y71.w1;
import y71.y1;

@LogTag(tag = "NotificationsViewModel")
/* loaded from: /home/user/work/p/classes3.dex */
public final class s extends androidx.lifecycle.a implements v3, com.github.rudroid.utilities.viewmodel.e<String>, com.github.rudroid.utilities.viewmodel.g, com.github.rudroid.utilities.viewmodel.b {
    public static final a Companion = new a();
    public final mm.i A;
    public final mm.l B;
    public final mm.g C;
    public final mm.m D;
    public final mm.j E;
    public final mm.o F;
    public final mm.q G;
    public final mm.h H;
    public final mm.n I;
    public final mm.k J;
    public final mm.p K;
    public final mm.s L;
    public final mm.t M;
    public final com.github.rudroid.activities.util.c N;
    public final kj.j O;
    public final qe.a P;
    public final com.github.rudroid.fragments.onboarding.notifications.usecase.s Q;
    public final com.github.rudroid.fragments.onboarding.notifications.usecase.c R;
    public final com.github.rudroid.fragments.onboarding.notifications.usecase.k S;
    public final com.github.rudroid.fragments.onboarding.notifications.usecase.y T;
    public final com.github.rudroid.fragments.onboarding.notifications.usecase.d0 U;
    public String V;
    public final com.github.rudroid.utilities.x0 W;
    public final y1 X;
    public final y1 Y;
    public final y1 Z;
    public final y71.i1 a0;
    public final y1 b0;
    public final y71.i1 c0;
    public final y1 d0;
    public final y1 e0;
    public final y71.i1 f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public v71.q1 j0;
    public v71.q1 k0;
    public x01.i l0;
    public final /* synthetic */ e.b t;
    public final /* synthetic */ g.a u;
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c v;
    public final v71.v w;
    public final v71.v x;
    public final mm.a y;
    public final mm.d z;

    public static final class a {
    }

    public static final /* synthetic */ class b {
        static {
            int[] iArr = new int[com.github.rudroid.fragments.ui.x0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                com.github.rudroid.fragments.ui.x0 x0Var = com.github.rudroid.fragments.ui.x0.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                com.github.rudroid.fragments.ui.x0 x0Var2 = com.github.rudroid.fragments.ui.x0.r;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                com.github.rudroid.fragments.ui.x0 x0Var3 = com.github.rudroid.fragments.ui.x0.r;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Application application, v71.v vVar, v71.v vVar2, mm.a aVar, mm.d dVar, mm.i iVar, mm.l lVar, mm.g gVar, mm.m mVar, mm.j jVar, mm.o oVar, mm.q qVar, mm.h hVar, mm.n nVar, mm.k kVar, mm.p pVar, mm.s sVar, mm.t tVar, com.github.rudroid.activities.util.c cVar, kj.j jVar2, qe.a aVar2, com.github.rudroid.fragments.onboarding.notifications.usecase.s sVar2, com.github.rudroid.fragments.onboarding.notifications.usecase.c cVar2, com.github.rudroid.fragments.onboarding.notifications.usecase.k kVar2, com.github.rudroid.fragments.onboarding.notifications.usecase.y yVar, com.github.rudroid.fragments.onboarding.notifications.usecase.d0 d0Var, androidx.lifecycle.a1 a1Var, oa.m mVar2) {
        super(application);
        k71.k.g(vVar, "defaultDispatcher");
        k71.k.g(vVar2, "ioDispatcher");
        k71.k.g(aVar, "enableWebNotificationsUseCase");
        k71.k.g(dVar, "fetchNotificationsUseCase");
        k71.k.g(iVar, "markAsSavedUseCase");
        k71.k.g(lVar, "markAsUnsavedUseCase");
        k71.k.g(gVar, "markAsDoneUseCase");
        k71.k.g(mVar, "markNotificationsAsDoneUseCase");
        k71.k.g(jVar, "markAsUndoneUseCase");
        k71.k.g(oVar, "markNotificationsAsUndoneUseCase");
        k71.k.g(qVar, "markSubjectAsReadUseCase");
        k71.k.g(hVar, "markAsReadUseCase");
        k71.k.g(nVar, "markNotificationsAsReadUseCase");
        k71.k.g(kVar, "markAsUnreadUseCase");
        k71.k.g(pVar, "markNotificationsAsUnreadUseCase");
        k71.k.g(sVar, "subscribeToNotificationAndMarkAsUndoneUseCase");
        k71.k.g(tVar, "unSubscribeToNotificationAndMarkAsDoneUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(jVar2, "analyticsUseCase");
        k71.k.g(sVar2, "setNotificationsOnboardingShownUseCase");
        k71.k.g(cVar2, "observeNotificationsOnboardingStateUseCase");
        k71.k.g(kVar2, "continueDismissedUseCase");
        k71.k.g(yVar, "reviewSettingsDismissedUseCase");
        k71.k.g(d0Var, "systemNotificationsGrantedUseCase");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(mVar2, "userManager");
        this.t = new e.b();
        this.u = new g.a();
        this.v = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar2);
        this.w = vVar;
        this.x = vVar2;
        this.y = aVar;
        this.z = dVar;
        this.A = iVar;
        this.B = lVar;
        this.C = gVar;
        this.D = mVar;
        this.E = jVar;
        this.F = oVar;
        this.G = qVar;
        this.H = hVar;
        this.I = nVar;
        this.J = kVar;
        this.K = pVar;
        this.L = sVar;
        this.M = tVar;
        this.N = cVar;
        this.O = jVar2;
        this.P = aVar2;
        this.Q = sVar2;
        this.R = cVar2;
        this.S = kVar2;
        this.T = yVar;
        this.U = d0Var;
        this.V = "";
        this.W = new com.github.rudroid.utilities.x0(new com.github.rudroid.utilities.ui.emojipicker.e(6));
        y1 c = y71.n1.c(g1.a.c(com.github.rudroid.utilities.ui.g1.Companion));
        this.X = c;
        y1 c2 = y71.n1.c(x61.r.r);
        this.Y = c2;
        y1 c3 = y71.n1.c((Object) null);
        this.Z = c3;
        this.a0 = new y71.i1(c3);
        y1 c4 = y71.n1.c((Object) null);
        this.b0 = c4;
        this.c0 = new y71.i1(c4);
        y1 c5 = y71.n1.c(Boolean.FALSE);
        this.d0 = c5;
        a.d dVar2 = a.d.a;
        y1 c6 = y71.n1.c(dVar2);
        this.e0 = c6;
        this.f0 = y71.n1.G(new e1(y71.n1.m(c6, c, c2, c5, new s0(this, null)), this), androidx.lifecycle.d1.k(this), y71.q1.a(3), new com.github.rudroid.utilities.ui.u0(new i(dVar2, null, false, false)));
        x01.i.Companion.getClass();
        this.l0 = x01.i.d;
        th.a.a(this, null, aVar2, new r(this, null), 27);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.github.rudroid.viewmodels.notifications.n] */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.github.rudroid.viewmodels.notifications.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(final s sVar, oa.j jVar, a71.c cVar) {
        t tVar;
        Object obj;
        b71.a aVar;
        int i;
        com.github.rudroid.fragments.onboarding.notifications.usecase.c cVar2;
        Context context;
        oa.j jVar2;
        Context context2;
        oa.j jVar3;
        com.github.rudroid.fragments.onboarding.notifications.usecase.a aVar2;
        com.github.rudroid.fragments.onboarding.notifications.usecase.d0 d0Var = sVar.U;
        y1 y1Var = sVar.e0;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i2 = tVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.z = i2 - Integer.MIN_VALUE;
                obj = tVar.x;
                aVar = b71.a.r;
                i = tVar.z;
                final int i3 = 0;
                w61.a0 a0Var = w61.a0.a;
                if (i != 0) {
                    sy.y.j(obj);
                    Application P = sVar.P();
                    fi.d.Companion.getClass();
                    ZoneOffset zoneOffset = ZoneOffset.UTC;
                    ZonedDateTime now = ZonedDateTime.now(zoneOffset);
                    ZonedDateTime ofInstant = ZonedDateTime.ofInstant(Instant.ofEpochMilli(fi.c.b(P).getLong("notifications_banner_last_shown", 0L)), zoneOffset);
                    k71.k.f(ofInstant, "ofInstant(...)");
                    if (!now.minusDays(7L).isAfter(ofInstant) || fi.c.b(P).getInt("app_launch_countdown_between_banners", 0) != 0) {
                        y1Var.getClass();
                        y1Var.k((Object) null, a.d.a);
                        return a0Var;
                    }
                    cVar2 = sVar.R;
                    com.github.rudroid.activities.util.c cVar3 = sVar.N;
                    tVar.u = jVar;
                    tVar.v = P;
                    tVar.w = cVar2;
                    tVar.z = 1;
                    cVar3.getClass();
                    Object c = com.github.rudroid.activities.util.a.c(cVar3, tVar);
                    if (c != aVar) {
                        context = P;
                        obj = c;
                        jVar2 = jVar;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    context2 = tVar.v;
                    jVar3 = tVar.u;
                    sy.y.j(obj);
                    aVar2 = (com.github.rudroid.fragments.onboarding.notifications.usecase.a) obj;
                    if (aVar2 != null || !aVar2.a) {
                        if (!jVar3.f(com.github.rudroid.common.a.w)) {
                            final int i4 = 1;
                            a.e eVar = new a.e(MobileAppElement.NOTIFICATION_ONBOARDING_NUX_BANNER, new j71.a(sVar) { // from class: com.github.rudroid.viewmodels.notifications.n
                                public final /* synthetic */ s s;

                                {
                                    this.s = sVar;
                                }

                                public final Object a() {
                                    switch (i3) {
                                        case 0:
                                            this.s.j0();
                                            break;
                                        case 1:
                                            this.s.j0();
                                            break;
                                        case 2:
                                            this.s.j0();
                                            break;
                                        case 3:
                                            this.s.S(false);
                                            break;
                                        case 4:
                                            this.s.S(true);
                                            break;
                                        case 5:
                                            s sVar2 = this.s;
                                            sVar2.j0();
                                            sVar2.k0();
                                            break;
                                        case 6:
                                            s sVar3 = this.s;
                                            sVar3.j0();
                                            sVar3.k0();
                                            break;
                                        default:
                                            fi.c cVar4 = fi.d.Companion;
                                            s sVar4 = this.s;
                                            Application P2 = sVar4.P();
                                            cVar4.getClass();
                                            long epochMilli = ZonedDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli();
                                            SharedPreferences.Editor edit = fi.c.b(P2).edit();
                                            edit.putLong("notifications_banner_last_shown", epochMilli);
                                            edit.apply();
                                            SharedPreferences.Editor edit2 = fi.c.b(P2).edit();
                                            edit2.putInt("app_launch_countdown_between_banners", 5);
                                            edit2.apply();
                                            SharedPreferences.Editor edit3 = fi.c.b(P2).edit();
                                            edit3.putBoolean("releases_banner_shown", true);
                                            edit3.apply();
                                            y1 y1Var2 = sVar4.e0;
                                            y1Var2.getClass();
                                            y1Var2.k((Object) null, a.d.a);
                                            break;
                                    }
                                    return w61.a0.a;
                                }
                            }, new j71.a(sVar) { // from class: com.github.rudroid.viewmodels.notifications.n
                                public final /* synthetic */ s s;

                                {
                                    this.s = sVar;
                                }

                                public final Object a() {
                                    switch (i4) {
                                        case 0:
                                            this.s.j0();
                                            break;
                                        case 1:
                                            this.s.j0();
                                            break;
                                        case 2:
                                            this.s.j0();
                                            break;
                                        case 3:
                                            this.s.S(false);
                                            break;
                                        case 4:
                                            this.s.S(true);
                                            break;
                                        case 5:
                                            s sVar2 = this.s;
                                            sVar2.j0();
                                            sVar2.k0();
                                            break;
                                        case 6:
                                            s sVar3 = this.s;
                                            sVar3.j0();
                                            sVar3.k0();
                                            break;
                                        default:
                                            fi.c cVar4 = fi.d.Companion;
                                            s sVar4 = this.s;
                                            Application P2 = sVar4.P();
                                            cVar4.getClass();
                                            long epochMilli = ZonedDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli();
                                            SharedPreferences.Editor edit = fi.c.b(P2).edit();
                                            edit.putLong("notifications_banner_last_shown", epochMilli);
                                            edit.apply();
                                            SharedPreferences.Editor edit2 = fi.c.b(P2).edit();
                                            edit2.putInt("app_launch_countdown_between_banners", 5);
                                            edit2.apply();
                                            SharedPreferences.Editor edit3 = fi.c.b(P2).edit();
                                            edit3.putBoolean("releases_banner_shown", true);
                                            edit3.apply();
                                            y1 y1Var2 = sVar4.e0;
                                            y1Var2.getClass();
                                            y1Var2.k((Object) null, a.d.a);
                                            break;
                                    }
                                    return w61.a0.a;
                                }
                            });
                            y1Var.getClass();
                            y1Var.k((Object) null, eVar);
                            return a0Var;
                        }
                        jVar3.f(com.github.rudroid.common.a.B);
                        final int i5 = 2;
                        j71.a aVar3 = new j71.a(sVar) { // from class: com.github.rudroid.viewmodels.notifications.n
                            public final /* synthetic */ s s;

                            {
                                this.s = sVar;
                            }

                            public final Object a() {
                                switch (i5) {
                                    case 0:
                                        this.s.j0();
                                        break;
                                    case 1:
                                        this.s.j0();
                                        break;
                                    case 2:
                                        this.s.j0();
                                        break;
                                    case 3:
                                        this.s.S(false);
                                        break;
                                    case 4:
                                        this.s.S(true);
                                        break;
                                    case 5:
                                        s sVar2 = this.s;
                                        sVar2.j0();
                                        sVar2.k0();
                                        break;
                                    case 6:
                                        s sVar3 = this.s;
                                        sVar3.j0();
                                        sVar3.k0();
                                        break;
                                    default:
                                        fi.c cVar4 = fi.d.Companion;
                                        s sVar4 = this.s;
                                        Application P2 = sVar4.P();
                                        cVar4.getClass();
                                        long epochMilli = ZonedDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli();
                                        SharedPreferences.Editor edit = fi.c.b(P2).edit();
                                        edit.putLong("notifications_banner_last_shown", epochMilli);
                                        edit.apply();
                                        SharedPreferences.Editor edit2 = fi.c.b(P2).edit();
                                        edit2.putInt("app_launch_countdown_between_banners", 5);
                                        edit2.apply();
                                        SharedPreferences.Editor edit3 = fi.c.b(P2).edit();
                                        edit3.putBoolean("releases_banner_shown", true);
                                        edit3.apply();
                                        y1 y1Var2 = sVar4.e0;
                                        y1Var2.getClass();
                                        y1Var2.k((Object) null, a.d.a);
                                        break;
                                }
                                return w61.a0.a;
                            }
                        };
                        a.b.Companion.getClass();
                        a.b bVar = new a.b(2131954754, 2131954753, MobileAppElement.NOTIFICATIONS_ONBOARDING_BANNER, 2131954752, aVar3);
                        y1Var.getClass();
                        y1Var.k((Object) null, bVar);
                        return a0Var;
                    }
                    com.github.rudroid.common.a aVar4 = com.github.rudroid.common.a.w;
                    if (jVar3.f(aVar4)) {
                        com.github.rudroid.settings.notifications.b bVar2 = aVar2.e;
                        ZonedDateTime zonedDateTime = bVar2.e;
                        com.github.rudroid.fragments.onboarding.notifications.viewmodel.j jVar4 = bVar2.b;
                        boolean z = bVar2.a;
                        boolean z2 = zonedDateTime == null || bVar2.f < 2;
                        if (z && z2 && jVar4 != null) {
                            int ordinal = jVar4.ordinal();
                            com.github.rudroid.fragments.onboarding.notifications.viewmodel.j jVar5 = com.github.rudroid.fragments.onboarding.notifications.viewmodel.j.r;
                            final int i6 = 3;
                            if (ordinal < 3 && d0Var.a()) {
                                final int i7 = 4;
                                a.a aVar5 = new a.a(jVar4, (n) new j71.a(sVar) { // from class: com.github.rudroid.viewmodels.notifications.n
                                    public final /* synthetic */ s s;

                                    {
                                        this.s = sVar;
                                    }

                                    public final Object a() {
                                        switch (i6) {
                                            case 0:
                                                this.s.j0();
                                                break;
                                            case 1:
                                                this.s.j0();
                                                break;
                                            case 2:
                                                this.s.j0();
                                                break;
                                            case 3:
                                                this.s.S(false);
                                                break;
                                            case 4:
                                                this.s.S(true);
                                                break;
                                            case 5:
                                                s sVar2 = this.s;
                                                sVar2.j0();
                                                sVar2.k0();
                                                break;
                                            case 6:
                                                s sVar3 = this.s;
                                                sVar3.j0();
                                                sVar3.k0();
                                                break;
                                            default:
                                                fi.c cVar4 = fi.d.Companion;
                                                s sVar4 = this.s;
                                                Application P2 = sVar4.P();
                                                cVar4.getClass();
                                                long epochMilli = ZonedDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli();
                                                SharedPreferences.Editor edit = fi.c.b(P2).edit();
                                                edit.putLong("notifications_banner_last_shown", epochMilli);
                                                edit.apply();
                                                SharedPreferences.Editor edit2 = fi.c.b(P2).edit();
                                                edit2.putInt("app_launch_countdown_between_banners", 5);
                                                edit2.apply();
                                                SharedPreferences.Editor edit3 = fi.c.b(P2).edit();
                                                edit3.putBoolean("releases_banner_shown", true);
                                                edit3.apply();
                                                y1 y1Var2 = sVar4.e0;
                                                y1Var2.getClass();
                                                y1Var2.k((Object) null, a.d.a);
                                                break;
                                        }
                                        return w61.a0.a;
                                    }
                                }, (n) new j71.a(sVar) { // from class: com.github.rudroid.viewmodels.notifications.n
                                    public final /* synthetic */ s s;

                                    {
                                        this.s = sVar;
                                    }

                                    public final Object a() {
                                        switch (i7) {
                                            case 0:
                                                this.s.j0();
                                                break;
                                            case 1:
                                                this.s.j0();
                                                break;
                                            case 2:
                                                this.s.j0();
                                                break;
                                            case 3:
                                                this.s.S(false);
                                                break;
                                            case 4:
                                                this.s.S(true);
                                                break;
                                            case 5:
                                                s sVar2 = this.s;
                                                sVar2.j0();
                                                sVar2.k0();
                                                break;
                                            case 6:
                                                s sVar3 = this.s;
                                                sVar3.j0();
                                                sVar3.k0();
                                                break;
                                            default:
                                                fi.c cVar4 = fi.d.Companion;
                                                s sVar4 = this.s;
                                                Application P2 = sVar4.P();
                                                cVar4.getClass();
                                                long epochMilli = ZonedDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli();
                                                SharedPreferences.Editor edit = fi.c.b(P2).edit();
                                                edit.putLong("notifications_banner_last_shown", epochMilli);
                                                edit.apply();
                                                SharedPreferences.Editor edit2 = fi.c.b(P2).edit();
                                                edit2.putInt("app_launch_countdown_between_banners", 5);
                                                edit2.apply();
                                                SharedPreferences.Editor edit3 = fi.c.b(P2).edit();
                                                edit3.putBoolean("releases_banner_shown", true);
                                                edit3.apply();
                                                y1 y1Var2 = sVar4.e0;
                                                y1Var2.getClass();
                                                y1Var2.k((Object) null, a.d.a);
                                                break;
                                        }
                                        return w61.a0.a;
                                    }
                                });
                                y1Var.getClass();
                                y1Var.k((Object) null, aVar5);
                                return a0Var;
                            }
                        }
                        if (!z && bVar2.g == null && d0Var.a()) {
                            final int i8 = 5;
                            final int i9 = 6;
                            a.h hVar = new a.h(MobileAppElement.NOTIFICATION_ONBOARDING_REVIEW_BANNER, new j71.a(sVar) { // from class: com.github.rudroid.viewmodels.notifications.n
                                public final /* synthetic */ s s;

                                {
                                    this.s = sVar;
                                }

                                public final Object a() {
                                    switch (i8) {
                                        case 0:
                                            this.s.j0();
                                            break;
                                        case 1:
                                            this.s.j0();
                                            break;
                                        case 2:
                                            this.s.j0();
                                            break;
                                        case 3:
                                            this.s.S(false);
                                            break;
                                        case 4:
                                            this.s.S(true);
                                            break;
                                        case 5:
                                            s sVar2 = this.s;
                                            sVar2.j0();
                                            sVar2.k0();
                                            break;
                                        case 6:
                                            s sVar3 = this.s;
                                            sVar3.j0();
                                            sVar3.k0();
                                            break;
                                        default:
                                            fi.c cVar4 = fi.d.Companion;
                                            s sVar4 = this.s;
                                            Application P2 = sVar4.P();
                                            cVar4.getClass();
                                            long epochMilli = ZonedDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli();
                                            SharedPreferences.Editor edit = fi.c.b(P2).edit();
                                            edit.putLong("notifications_banner_last_shown", epochMilli);
                                            edit.apply();
                                            SharedPreferences.Editor edit2 = fi.c.b(P2).edit();
                                            edit2.putInt("app_launch_countdown_between_banners", 5);
                                            edit2.apply();
                                            SharedPreferences.Editor edit3 = fi.c.b(P2).edit();
                                            edit3.putBoolean("releases_banner_shown", true);
                                            edit3.apply();
                                            y1 y1Var2 = sVar4.e0;
                                            y1Var2.getClass();
                                            y1Var2.k((Object) null, a.d.a);
                                            break;
                                    }
                                    return w61.a0.a;
                                }
                            }, new j71.a(sVar) { // from class: com.github.rudroid.viewmodels.notifications.n
                                public final /* synthetic */ s s;

                                {
                                    this.s = sVar;
                                }

                                public final Object a() {
                                    switch (i9) {
                                        case 0:
                                            this.s.j0();
                                            break;
                                        case 1:
                                            this.s.j0();
                                            break;
                                        case 2:
                                            this.s.j0();
                                            break;
                                        case 3:
                                            this.s.S(false);
                                            break;
                                        case 4:
                                            this.s.S(true);
                                            break;
                                        case 5:
                                            s sVar2 = this.s;
                                            sVar2.j0();
                                            sVar2.k0();
                                            break;
                                        case 6:
                                            s sVar3 = this.s;
                                            sVar3.j0();
                                            sVar3.k0();
                                            break;
                                        default:
                                            fi.c cVar4 = fi.d.Companion;
                                            s sVar4 = this.s;
                                            Application P2 = sVar4.P();
                                            cVar4.getClass();
                                            long epochMilli = ZonedDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli();
                                            SharedPreferences.Editor edit = fi.c.b(P2).edit();
                                            edit.putLong("notifications_banner_last_shown", epochMilli);
                                            edit.apply();
                                            SharedPreferences.Editor edit2 = fi.c.b(P2).edit();
                                            edit2.putInt("app_launch_countdown_between_banners", 5);
                                            edit2.apply();
                                            SharedPreferences.Editor edit3 = fi.c.b(P2).edit();
                                            edit3.putBoolean("releases_banner_shown", true);
                                            edit3.apply();
                                            y1 y1Var2 = sVar4.e0;
                                            y1Var2.getClass();
                                            y1Var2.k((Object) null, a.d.a);
                                            break;
                                    }
                                    return w61.a0.a;
                                }
                            });
                            y1Var.getClass();
                            y1Var.k((Object) null, hVar);
                            return a0Var;
                        }
                    }
                    RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
                    ei.c cVar4 = ei.c.G;
                    runtimeFeatureFlag.getClass();
                    if (RuntimeFeatureFlag.a(cVar4) && jVar3.f(aVar4)) {
                        fi.d.Companion.getClass();
                        k71.k.g(context2, "context");
                        if (!fi.c.b(context2).getBoolean("releases_banner_shown", false)) {
                            final int i11 = 7;
                            a.g gVar = new a.g(2131953511, 2131953510, (MobileAppElement) null, 2131953368, new j71.a(sVar) { // from class: com.github.rudroid.viewmodels.notifications.n
                                public final /* synthetic */ s s;

                                {
                                    this.s = sVar;
                                }

                                public final Object a() {
                                    switch (i11) {
                                        case 0:
                                            this.s.j0();
                                            break;
                                        case 1:
                                            this.s.j0();
                                            break;
                                        case 2:
                                            this.s.j0();
                                            break;
                                        case 3:
                                            this.s.S(false);
                                            break;
                                        case 4:
                                            this.s.S(true);
                                            break;
                                        case 5:
                                            s sVar2 = this.s;
                                            sVar2.j0();
                                            sVar2.k0();
                                            break;
                                        case 6:
                                            s sVar3 = this.s;
                                            sVar3.j0();
                                            sVar3.k0();
                                            break;
                                        default:
                                            fi.c cVar42 = fi.d.Companion;
                                            s sVar4 = this.s;
                                            Application P2 = sVar4.P();
                                            cVar42.getClass();
                                            long epochMilli = ZonedDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli();
                                            SharedPreferences.Editor edit = fi.c.b(P2).edit();
                                            edit.putLong("notifications_banner_last_shown", epochMilli);
                                            edit.apply();
                                            SharedPreferences.Editor edit2 = fi.c.b(P2).edit();
                                            edit2.putInt("app_launch_countdown_between_banners", 5);
                                            edit2.apply();
                                            SharedPreferences.Editor edit3 = fi.c.b(P2).edit();
                                            edit3.putBoolean("releases_banner_shown", true);
                                            edit3.apply();
                                            y1 y1Var2 = sVar4.e0;
                                            y1Var2.getClass();
                                            y1Var2.k((Object) null, a.d.a);
                                            break;
                                    }
                                    return w61.a0.a;
                                }
                            });
                            y1Var.getClass();
                            y1Var.k((Object) null, gVar);
                        }
                    }
                    return a0Var;
                }
                cVar2 = tVar.w;
                context = tVar.v;
                jVar2 = tVar.u;
                sy.y.j(obj);
                c00.g a2 = cVar2.a((oa.j) obj);
                tVar.u = jVar2;
                tVar.v = context;
                tVar.w = null;
                tVar.z = 2;
                obj = y71.n1.v(a2, tVar);
                if (obj != aVar) {
                    context2 = context;
                    jVar3 = jVar2;
                    aVar2 = (com.github.rudroid.fragments.onboarding.notifications.usecase.a) obj;
                    if (aVar2 != null) {
                    }
                    if (!jVar3.f(com.github.rudroid.common.a.w)) {
                    }
                }
                return aVar;
            }
        }
        tVar = new t(sVar, cVar);
        obj = tVar.x;
        aVar = b71.a.r;
        i = tVar.z;
        final int i32 = 0;
        w61.a0 a0Var2 = w61.a0.a;
        if (i != 0) {
        }
        c00.g a22 = cVar2.a((oa.j) obj);
        tVar.u = jVar2;
        tVar.v = context;
        tVar.w = null;
        tVar.z = 2;
        obj = y71.n1.v(a22, tVar);
        if (obj != aVar) {
        }
        return aVar;
    }

    public static final MobileEventContext R(s sVar) {
        Iterable iterable = (Iterable) sVar.Y.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof NotificationImportantFilter) {
                arrayList.add(obj);
            }
        }
        NotificationImportantFilter notificationImportantFilter = (NotificationImportantFilter) x61.m.W(arrayList);
        if (notificationImportantFilter != null && notificationImportantFilter.v) {
            return MobileEventContext.FOCUSED;
        }
        return MobileEventContext.NOT_FOCUSED;
    }

    public static boolean W(List list, com.github.domain.searchandfilter.filters.data.i iVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof NotificationFilterFilter) {
                arrayList.add(obj);
            }
        }
        NotificationFilterFilter notificationFilterFilter = (NotificationFilterFilter) x61.m.W(arrayList);
        if (notificationFilterFilter == null) {
            return false;
        }
        com.github.domain.searchandfilter.filters.data.notification.a aVar = notificationFilterFilter.v;
        return (aVar instanceof StatusNotificationFilter) && k71.k.b(((StatusNotificationFilter) aVar).u, iVar);
    }

    public static androidx.lifecycle.p0 m0(s sVar, List list, f fVar, j71.f fVar2) {
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0();
        fl.f.Companion.getClass();
        p0Var.j(fl.e.b(null));
        th.a.a(sVar, sVar.x, sVar.P, new z0(list, p0Var, sVar, fVar, fVar2, null), 26);
        return p0Var;
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final void D() {
        v71.q1 q1Var = this.j0;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        com.github.rudroid.utilities.w0.g(this.X);
        this.j0 = th.a.a(this, this.w, this.P, new a0(this, null), 26);
    }

    @Override // com.github.rudroid.utilities.viewmodel.g
    public final w1 J() {
        return this.u.s;
    }

    public final void O() {
        v71.q1 q1Var = this.k0;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
    }

    public final void S(boolean z) {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new u(this, z, null), 3);
        y1 y1Var = this.e0;
        y1Var.getClass();
        y1Var.k((Object) null, a.d.a);
    }

    public final void T(fl.b bVar) {
        k71.k.g(bVar, "executionError");
        g.a aVar = this.u;
        aVar.getClass();
        y1 y1Var = aVar.r;
        y1Var.getClass();
        y1Var.k((Object) null, bVar);
    }

    public final void U() {
        th.a.a(this, this.w, this.P, new w(this, null), 26);
    }

    public final void V() {
        y1 y1Var = this.t.r;
        com.github.rudroid.utilities.viewmodel.a.Companion.getClass();
        com.github.rudroid.utilities.viewmodel.a aVar = new com.github.rudroid.utilities.viewmodel.a(x61.t.r, false);
        y1Var.getClass();
        y1Var.k((Object) null, aVar);
    }

    public final void X(boolean z) {
        v71.q1 q1Var = this.j0;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.j0 = th.a.a(this, this.w, this.P, new y(this, z, null), 26);
    }

    public final y71.y Y(j71.c cVar, String str) {
        oa.j d = this.N.d();
        p pVar = new p(cVar, this, str, 7);
        mm.g gVar = this.C;
        gVar.getClass();
        k71.k.g(str, "id");
        return new y71.y(new b0(this, str, null), b31.b.J(((a11.a) gVar.a.a(d)).b(str), d, pVar));
    }

    public final void Z(List list) {
        m0(this, list, new com.github.rudroid.viewmodels.notifications.b(list.size()), new e0(this, null));
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final boolean a() {
        return com.github.rudroid.utilities.ui.h1.g((com.github.rudroid.utilities.ui.g1) this.X.getValue()) && this.l0.a();
    }

    public final y71.y a0(j71.c cVar, String str) {
        oa.j d = this.N.d();
        p pVar = new p(this, cVar, str, 0);
        mm.h hVar = this.H;
        hVar.getClass();
        k71.k.g(str, "id");
        return new y71.y(new f0(this, str, null), b31.b.J(((a11.a) hVar.a.a(d)).a(str), d, pVar));
    }

    public final void b0(List list) {
        m0(this, list, new c(list.size()), new h0(this, null));
    }

    @Override // com.github.rudroid.utilities.viewmodel.g
    public final void c(fl.b bVar) {
        k71.k.g(bVar, "executionError");
        this.u.c(bVar);
    }

    public final y71.y c0(j71.c cVar, String str) {
        oa.j d = this.N.d();
        p pVar = new p(this, cVar, str, 1);
        mm.i iVar = this.A;
        iVar.getClass();
        k71.k.g(str, "id");
        return new y71.y(new i0(this, str, null), b31.b.J(((a11.a) iVar.a.a(d)).g(str), d, pVar));
    }

    public final y71.y d0(j71.c cVar, String str) {
        oa.j d = this.N.d();
        p pVar = new p(cVar, this, str, 4);
        mm.j jVar = this.E;
        jVar.getClass();
        k71.k.g(str, "id");
        return new y71.y(new j0(this, str, null), b31.b.J(((a11.a) jVar.a.a(d)).p(str), d, pVar));
    }

    public final void e0(List list) {
        m0(this, list, new d(list.size()), new l0(this, null));
    }

    public final y71.y f0(j71.c cVar, String str) {
        oa.j d = this.N.d();
        p pVar = new p(this, cVar, str, 2);
        mm.k kVar = this.J;
        kVar.getClass();
        k71.k.g(str, "id");
        return new y71.y(new m0(this, str, null), b31.b.J(((a11.a) kVar.a.a(d)).d(str), d, pVar));
    }

    public final void g0(List list) {
        m0(this, list, new e(list.size()), new o0(this, null));
    }

    public final y71.y h0(j71.c cVar, String str) {
        oa.j d = this.N.d();
        p pVar = new p(this, cVar, str, 6);
        mm.l lVar = this.B;
        lVar.getClass();
        k71.k.g(str, "id");
        return new y71.y(new p0(this, str, null), b31.b.J(((a11.a) lVar.a.a(d)).e(str), d, pVar));
    }

    public final void i0(String str) {
        Boolean bool;
        Object obj;
        k71.k.g(str, "id");
        List list = (List) ((com.github.rudroid.utilities.ui.g1) this.X.getValue()).getData();
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (k71.k.b(((le.s) obj).j.c(), str)) {
                        break;
                    }
                }
            }
            le.s sVar = (le.s) obj;
            if (sVar != null) {
                bool = Boolean.valueOf(sVar.d);
                th.a.a(this, this.w, this.P, new r0(this, str, bool, null), 26);
            }
        }
        bool = null;
        th.a.a(this, this.w, this.P, new r0(this, str, bool, null), 26);
    }

    public final void j0() {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new u0(this, null), 3);
        y1 y1Var = this.e0;
        y1Var.getClass();
        y1Var.k((Object) null, a.d.a);
    }

    public final void k0() {
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new v0(this, null), 3);
        y1 y1Var = this.e0;
        y1Var.getClass();
        y1Var.k((Object) null, a.d.a);
    }

    public final void l0(y71.y yVar, boolean z) {
        th.a.a(this, this.w, this.P, new x0(yVar, z, this, null), 26);
    }

    public final androidx.lifecycle.p0 n0(j71.c cVar, q1 q1Var) {
        androidx.lifecycle.p0 p0Var = new androidx.lifecycle.p0();
        fl.f.Companion.getClass();
        p0Var.j(fl.e.b(null));
        th.a.a(this, this.w, this.P, new b1(cVar, this, p0Var, q1Var, null), 26);
        return p0Var;
    }

    public final void o0(Set set) {
        e.b bVar = this.t;
        bVar.getClass();
        y1 y1Var = bVar.r;
        y1Var.k((Object) null, com.github.rudroid.utilities.viewmodel.a.a((com.github.rudroid.utilities.viewmodel.a) y1Var.getValue(), set));
    }

    public final y71.y p0(String str, String str2, SubscriptionState subscriptionState, j71.c cVar) {
        oa.j d = this.N.d();
        p pVar = new p(this, cVar, str, 5);
        mm.s sVar = this.L;
        sVar.getClass();
        k71.k.g(str2, "notificationId");
        k71.k.g(subscriptionState, "state");
        return new y71.y(new h1(this, str, null), b31.b.J(((z01.k1) sVar.a.a(d)).d(str, str2, subscriptionState), d, pVar));
    }

    public final y71.y q0(String str, String str2, SubscriptionState subscriptionState, j71.c cVar) {
        oa.j d = this.N.d();
        p pVar = new p(this, cVar, str, 3);
        mm.t tVar = this.M;
        tVar.getClass();
        k71.k.g(str2, "notificationId");
        k71.k.g(subscriptionState, "state");
        return new y71.y(new i1(this, str, null), b31.b.J(((z01.k1) tVar.a.a(d)).b(str, str2, subscriptionState), d, pVar));
    }

    public final void r0(y71.g1 g1Var, fl.b bVar, boolean z) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        this.v.a(g1Var, bVar, z);
    }
}
