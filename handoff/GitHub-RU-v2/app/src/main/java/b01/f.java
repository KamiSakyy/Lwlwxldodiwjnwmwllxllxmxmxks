package b01;

import com.github.rudroid.copilot.h1;
import com.github.service.models.response.discussions.type.DiscussionStateReason;
import java.time.ZonedDateTime;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public boolean a;
    public boolean b;
    public boolean c;
    public ZonedDateTime d;
    public DiscussionStateReason e;

    public f(boolean z, boolean z2, boolean z3, ZonedDateTime zonedDateTime, DiscussionStateReason discussionStateReason) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = zonedDateTime;
        this.e = discussionStateReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.b == fVar.b && this.c == fVar.c && k71.k.b(this.d, fVar.d) && this.e == fVar.e;
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        ZonedDateTime zonedDateTime = this.d;
        int hashCode = (e + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        DiscussionStateReason discussionStateReason = this.e;
        return hashCode + (discussionStateReason != null ? discussionStateReason.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = h1.u("DiscussionClosedState(isClosed=", this.a, ", viewerCanClose=", this.b, ", viewerCanReopen=");
        f4Shadow.B(", closedAt=", ", stateReason=", u, this.d, this.c);
        u.append(this.e);
        u.append(")");
        return u.toString();
    }
}
