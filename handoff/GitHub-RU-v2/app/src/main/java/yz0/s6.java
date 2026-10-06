package yz0;

import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.TimelineItem$LinkedItemConnectorType;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s6 extends s7 {
    public final TimelineItem$LinkedItemConnectorType a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final ZonedDateTime f;
    public final PullRequestState g;
    public final boolean h;
    public final boolean i;

    public s6(TimelineItem$LinkedItemConnectorType timelineItem$LinkedItemConnectorType, String str, int i, String str2, String str3, ZonedDateTime zonedDateTime, PullRequestState pullRequestState, boolean z, boolean z2) {
        k71.k.g(timelineItem$LinkedItemConnectorType, "connectorType");
        k71.k.g(str, "actorDisplayName");
        k71.k.g(str2, "title");
        k71.k.g(str3, "url");
        k71.k.g(zonedDateTime, "createdAt");
        k71.k.g(pullRequestState, "state");
        this.a = timelineItem$LinkedItemConnectorType;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = zonedDateTime;
        this.g = pullRequestState;
        this.h = z;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        return this.a == s6Var.a && k71.k.b(this.b, s6Var.b) && this.c == s6Var.c && k71.k.b(this.d, s6Var.d) && k71.k.b(this.e, s6Var.e) && k71.k.b(this.f, s6Var.f) && this.g == s6Var.g && this.h == s6Var.h && this.i == s6Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + x.i.e((this.g.hashCode() + com.github.rudroid.m0.a(this.f, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31), this.e, 31), 31)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineLinkedPullRequestEvent(connectorType=");
        sb.append(this.a);
        sb.append(", actorDisplayName=");
        sb.append(this.b);
        sb.append(", number=");
        x.i.r(this.c, ", title=", this.d, ", url=", sb);
        com.github.rudroid.copilot.h1.A(this.e, ", createdAt=", ", state=", sb, this.f);
        sb.append(this.g);
        sb.append(", isDraft=");
        sb.append(this.h);
        sb.append(", isInMergeQueue=");
        return jo.f4.s(sb, this.i, ")");
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class TimelineItem$LinkedItemConnectorType {
        public TimelineItem$LinkedItemConnectorType() {
        }
    }

    public s6(Object... a) {
    }
}
