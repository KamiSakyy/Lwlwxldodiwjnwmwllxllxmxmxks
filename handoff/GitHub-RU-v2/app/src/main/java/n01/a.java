package n01;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Boolean j;

    public /* synthetic */ a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i) {
        this((i & 1) != 0 ? false : z, z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) != 0 ? false : z7, (i & 128) != 0 ? false : z8, (i & 256) != 0 ? false : z9, (Boolean) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && k.b(this.j, aVar.j);
    }

    public final int hashCode() {
        int e = i.e(i.e(i.e(i.e(i.e(i.e(i.e(i.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        Boolean bool = this.j;
        return e + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder u = h1.u("PushNotificationSettings(scheduledNotifications=", this.a, ", directMentionsEnabled=", this.b, ", reviewRequestedEnabled=");
        m0.A(u, this.c, ", assignedEnabled=", this.d, ", deploymentApprovalEnabled=");
        m0.A(u, this.e, ", prReviewedEnabled=", this.f, ", ciActivityEnabled=");
        m0.A(u, this.g, ", ciActivityFailedOnlyEnabled=", this.h, ", releasesActivity=");
        u.append(this.i);
        u.append(", liveActivityCopilotCodingAgent=");
        u.append(this.j);
        u.append(")");
        return u.toString();
    }

    public a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Boolean bool) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = bool;
    }
}
