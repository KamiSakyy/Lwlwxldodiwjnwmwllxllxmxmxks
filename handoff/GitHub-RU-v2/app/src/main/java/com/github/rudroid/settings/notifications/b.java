package com.github.rudroid.settings.notifications;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.fragments.onboarding.notifications.viewmodel.j;
import java.time.ZonedDateTime;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final boolean a;
    public final j b;
    public final ZonedDateTime c;
    public final ZonedDateTime d;
    public final ZonedDateTime e;
    public final int f;
    public final ZonedDateTime g;

    public b(boolean z, j jVar, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ZonedDateTime zonedDateTime3, int i, ZonedDateTime zonedDateTime4) {
        this.a = z;
        this.b = jVar;
        this.c = zonedDateTime;
        this.d = zonedDateTime2;
        this.e = zonedDateTime3;
        this.f = i;
        this.g = zonedDateTime4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && k.b(this.c, bVar.c) && k.b(this.d, bVar.d) && k.b(this.e, bVar.e) && this.f == bVar.f && k.b(this.g, bVar.g);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        j jVar = this.b;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.c;
        int hashCode3 = (hashCode2 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.d;
        int hashCode4 = (hashCode3 + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        ZonedDateTime zonedDateTime3 = this.e;
        int b = s0.b(this.f, (hashCode4 + (zonedDateTime3 == null ? 0 : zonedDateTime3.hashCode())) * 31, 31);
        ZonedDateTime zonedDateTime4 = this.g;
        return b + (zonedDateTime4 != null ? zonedDateTime4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationOnboardingSettings(pushNotificationsOnboardingShown=");
        sb.append(this.a);
        sb.append(", lastOnboardingPageVisited=");
        sb.append(this.b);
        sb.append(", notificationsDisabledBannerDismissedOn=");
        h1.B(sb, this.c, ", missedTwoFactorBannerDismissedOn=", this.d, ", notificationsContinueSetupBannerDismissedOn=");
        sb.append(this.e);
        sb.append(", notificationsContinueSetupBannerDismissedCount=");
        sb.append(this.f);
        sb.append(", notificationsReviewSetupBannerDismissedOn=");
        return h1.q(sb, this.g, ")");
    }
}
