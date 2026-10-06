package my0;

import com.github.rudroid.copilot.h1;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h && this.i == cVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder u = h1.u("MobilePushNotificationSettings(scheduledNotifications=", this.a, ", getsDirectMentions=", this.b, ", getsAssignments=");
        com.github.rudroid.m0.A(u, this.c, ", getsReviewRequests=", this.d, ", getsDeploymentRequests=");
        com.github.rudroid.m0.A(u, this.e, ", getsPullRequestReviews=", this.f, ", getsCiActivity=");
        com.github.rudroid.m0.A(u, this.g, ", getsCiFailedOnly=", this.h, ", getsReleases=");
        return f4Shadow.s(u, this.i, ")");
    }

    public Object i;
    public Object c(Object p1, Object p2) { return null; }
    public static final Object k = null;
}
