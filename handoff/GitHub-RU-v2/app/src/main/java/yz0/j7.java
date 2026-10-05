package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j7 extends s7 {
    public final com.github.service.models.response.a a;
    public final String b;
    public final String c;
    public final ZonedDateTime d;

    public j7(com.github.service.models.response.a aVar, String str, String str2, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "reviewerDisplayName");
        this.a = aVar;
        this.b = str;
        this.c = str2;
        this.d = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return k71.k.b(this.a, j7Var.a) && k71.k.b(this.b, j7Var.b) && k71.k.b(this.c, j7Var.c) && k71.k.b(this.d, j7Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return this.d.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "TimelineReviewRequestedEvent(author=" + this.a + ", reviewerDisplayName=" + this.b + ", orgLogin=" + this.c + ", createdAt=" + this.d + ")";
    }
}
