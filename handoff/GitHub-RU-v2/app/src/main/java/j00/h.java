package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
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

    public h(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Boolean bool) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b == hVar.b && this.c == hVar.c && this.d == hVar.d && this.e == hVar.e && this.f == hVar.f && this.g == hVar.g && this.h == hVar.h && this.i == hVar.i && k71.k.b(this.j, hVar.j);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        Boolean bool = this.j;
        return e + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder u = com.github.rudroid.copilot.h1.u("MobilePushNotificationSettings(scheduledNotifications=", this.a, ", getsDirectMentions=", this.b, ", getsAssignments=");
        com.github.rudroid.m0.A(u, this.c, ", getsReviewRequests=", this.d, ", getsDeploymentRequests=");
        com.github.rudroid.m0.A(u, this.e, ", getsPullRequestReviews=", this.f, ", getsCiActivity=");
        com.github.rudroid.m0.A(u, this.g, ", getsCiFailedOnly=", this.h, ", getsReleases=");
        u.append(this.i);
        u.append(", getsLiveActivityCopilotCodingAgentV2=");
        u.append(this.j);
        u.append(")");
        return u.toString();
    }

    public Object i;
}
