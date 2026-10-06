package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f7 extends s7 {
    public final com.github.service.models.response.a a;
    public final String b;
    public final String c;
    public final ZonedDateTime d;

    public f7(com.github.service.models.response.a aVar, String str, String str2, ZonedDateTime zonedDateTime) {
        this.a = aVar;
        this.b = str;
        this.c = str2;
        this.d = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7)) {
            return false;
        }
        f7 f7Var = (f7) obj;
        return k71.k.b(this.a, f7Var.a) && k71.k.b(this.b, f7Var.b) && k71.k.b(this.c, f7Var.c) && k71.k.b(this.d, f7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "TimelineRenamedTitleEvent(author=" + this.a + ", previousTitle=" + this.b + ", currentTitle=" + this.c + ", createdAt=" + this.d + ")";
    }
}
