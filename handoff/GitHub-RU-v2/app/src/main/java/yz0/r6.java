package yz0;

import com.github.service.models.response.TimelineItem$LinkedItemConnectorType;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.type.IssueState;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r6 extends s7 {
    public final TimelineItem$LinkedItemConnectorType a;
    public String b;
    public int c;
    public String d;
    public String e;
    public ZonedDateTime f;
    public IssueState g;
    public CloseReason h;

    public r6(TimelineItem$LinkedItemConnectorType timelineItem$LinkedItemConnectorType, String str, int i, String str2, String str3, ZonedDateTime zonedDateTime, IssueState issueState, CloseReason closeReason) {
        k71.k.g(timelineItem$LinkedItemConnectorType, "connectorType");
        k71.k.g(str, "actorDisplayName");
        k71.k.g(str2, "title");
        k71.k.g(str3, "url");
        k71.k.g(zonedDateTime, "createdAt");
        k71.k.g(issueState, "state");
        this.a = timelineItem$LinkedItemConnectorType;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = zonedDateTime;
        this.g = issueState;
        this.h = closeReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6)) {
            return false;
        }
        r6 r6Var = (r6) obj;
        return this.a == r6Var.a && k71.k.b(this.b, r6Var.b) && this.c == r6Var.c && k71.k.b(this.d, r6Var.d) && k71.k.b(this.e, r6Var.e) && k71.k.b(this.f, r6Var.f) && this.g == r6Var.g && this.h == r6Var.h;
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + com.github.rudroid.m0.a(this.f, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31), this.e, 31), 31)) * 31;
        CloseReason closeReason = this.h;
        return hashCode + (closeReason == null ? 0 : closeReason.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineLinkedIssueEvent(connectorType=");
        sb.append(this.a);
        sb.append(", actorDisplayName=");
        sb.append(this.b);
        sb.append(", number=");
        x.i.r(this.c, ", title=", this.d, ", url=", sb);
        com.github.rudroid.copilot.h1.A(this.e, ", createdAt=", ", state=", sb, this.f);
        sb.append(this.g);
        sb.append(", issueCloseReason=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class TimelineItem$LinkedItemConnectorType {
        public TimelineItem$LinkedItemConnectorType() {
        }
    }
}
