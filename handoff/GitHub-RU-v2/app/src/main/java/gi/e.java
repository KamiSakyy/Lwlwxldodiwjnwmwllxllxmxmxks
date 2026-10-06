package gi;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public boolean a;
    public int b;
    public String c;
    public boolean d;
    public ZonedDateTime e;
    public ZonedDateTime f;
    public ZonedDateTime g;
    public ZonedDateTime h;
    public ZonedDateTime i;
    public ZonedDateTime j;
    public ZonedDateTime k;
    public ZonedDateTime l;
    public ZonedDateTime m;
    public ZonedDateTime n;

    public e(boolean z, int i, String str, boolean z2, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ZonedDateTime zonedDateTime3, ZonedDateTime zonedDateTime4, ZonedDateTime zonedDateTime5, ZonedDateTime zonedDateTime6, ZonedDateTime zonedDateTime7, ZonedDateTime zonedDateTime8, ZonedDateTime zonedDateTime9, ZonedDateTime zonedDateTime10) {
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = z2;
        this.e = zonedDateTime;
        this.f = zonedDateTime2;
        this.g = zonedDateTime3;
        this.h = zonedDateTime4;
        this.i = zonedDateTime5;
        this.j = zonedDateTime6;
        this.k = zonedDateTime7;
        this.l = zonedDateTime8;
        this.m = zonedDateTime9;
        this.n = zonedDateTime10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.b == eVar.b && k.b(this.c, eVar.c) && this.d == eVar.d && k.b(this.e, eVar.e) && k.b(this.f, eVar.f) && k.b(this.g, eVar.g) && k.b(this.h, eVar.h) && k.b(this.i, eVar.i) && k.b(this.j, eVar.j) && k.b(this.k, eVar.k) && k.b(this.l, eVar.l) && k.b(this.m, eVar.m) && k.b(this.n, eVar.n);
    }

    public final int hashCode() {
        int e = i.e(h1.i(s0.b(this.b, Boolean.hashCode(this.a) * 31, 31), this.c, 31), 31, this.d);
        ZonedDateTime zonedDateTime = this.e;
        int hashCode = (e + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.f;
        int hashCode2 = (hashCode + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        ZonedDateTime zonedDateTime3 = this.g;
        int hashCode3 = (hashCode2 + (zonedDateTime3 == null ? 0 : zonedDateTime3.hashCode())) * 31;
        ZonedDateTime zonedDateTime4 = this.h;
        int hashCode4 = (hashCode3 + (zonedDateTime4 == null ? 0 : zonedDateTime4.hashCode())) * 31;
        ZonedDateTime zonedDateTime5 = this.i;
        int hashCode5 = (hashCode4 + (zonedDateTime5 == null ? 0 : zonedDateTime5.hashCode())) * 31;
        ZonedDateTime zonedDateTime6 = this.j;
        int hashCode6 = (hashCode5 + (zonedDateTime6 == null ? 0 : zonedDateTime6.hashCode())) * 31;
        ZonedDateTime zonedDateTime7 = this.k;
        int hashCode7 = (hashCode6 + (zonedDateTime7 == null ? 0 : zonedDateTime7.hashCode())) * 31;
        ZonedDateTime zonedDateTime8 = this.l;
        int hashCode8 = (hashCode7 + (zonedDateTime8 == null ? 0 : zonedDateTime8.hashCode())) * 31;
        ZonedDateTime zonedDateTime9 = this.m;
        int hashCode9 = (hashCode8 + (zonedDateTime9 == null ? 0 : zonedDateTime9.hashCode())) * 31;
        ZonedDateTime zonedDateTime10 = this.n;
        return hashCode9 + (zonedDateTime10 != null ? zonedDateTime10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemDataStorePreferencePref(upsellBannerDismissed=");
        sb.append(this.a);
        sb.append(", lastBottomTab=");
        sb.append(this.b);
        sb.append(", pushNotPermissionDialogStatus=");
        m0.x(sb, this.c, ", pushNotificationsOnboardingShown=", this.d, ", notificationsDisabledBannerDismissedOn=");
        h1.B(sb, this.e, ", notificationPermissionRequestedOn=", this.f, ", missedTwoFactorBannerDismissedOn=");
        h1.B(sb, this.g, ", notificationsContinueSetupBannerDismissedOn=", this.h, ", notificationsReviewSetupBannerDismissedOn=");
        h1.B(sb, this.i, ", copilotReviewerBannerDismissedOn=", this.j, ", copilotCodingAgentBannerDismissedOn=");
        h1.B(sb, this.k, ", draftBannerDismissedOn=", this.l, ", agentTaskSkipPrBannerDismissedOn=");
        sb.append(this.m);
        sb.append(", vscodeSessionBannerDismissedOn=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
    public Object Q(Object p1) { return null; }
    public Object a(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; }
    public Object j(Object p1) { return null; }
    public Object u(Object p1) { return null; }
    public Object z(Object p1) { return null; }
    public Object Q(Object) { return null; }
    public Object j(Object) { return null; }
    public Object u(Object) { return null; }
    public Object z(Object) { return null; }
}
