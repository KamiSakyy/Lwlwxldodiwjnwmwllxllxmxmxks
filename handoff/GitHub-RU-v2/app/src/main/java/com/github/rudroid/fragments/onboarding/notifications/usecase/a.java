package com.github.rudroid.fragments.onboarding.notifications.usecase;

import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14189a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14190b;

    /* renamed from: c, reason: collision with root package name */
    public final ZonedDateTime f14191c;

    /* renamed from: d, reason: collision with root package name */
    public final ZonedDateTime f14192d;

    /* renamed from: e, reason: collision with root package name */
    public final com.github.rudroid.settings.notifications.b f14193e;

    public a(boolean z10, boolean z11, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, com.github.rudroid.settings.notifications.b bVar) {
        k71.k.g(bVar, "userSettings");
        this.f14189a = z10;
        this.f14190b = z11;
        this.f14191c = zonedDateTime;
        this.f14192d = zonedDateTime2;
        this.f14193e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f14189a == aVar.f14189a && this.f14190b == aVar.f14190b && k71.k.b(this.f14191c, aVar.f14191c) && k71.k.b(this.f14192d, aVar.f14192d) && k71.k.b(this.f14193e, aVar.f14193e);
    }

    public final int hashCode() {
        int e5 = x.i.e(Boolean.hashCode(this.f14189a) * 31, 31, this.f14190b);
        ZonedDateTime zonedDateTime = this.f14191c;
        int hashCode = (e5 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.f14192d;
        return this.f14193e.hashCode() + ((hashCode + (zonedDateTime2 != null ? zonedDateTime2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder u8 = h1.u("NotificationsOnboardingState(onboardingShown=", this.f14189a, ", reminderDismissed=", this.f14190b, ", expiredAuthRequestDismissedOn=");
        h1.B(u8, this.f14191c, ", permissionLastRequestedOn=", this.f14192d, ", userSettings=");
        u8.append(this.f14193e);
        u8.append(")");
        return u8.toString();
    }
}
