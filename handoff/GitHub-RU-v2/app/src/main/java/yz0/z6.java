package yz0;

import com.github.service.models.response.Avatar;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z6 extends s7 {
    public String a;
    public String b;
    public Avatar c;
    public ZonedDateTime d;

    public z6(String str, String str2, Avatar avatar, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = avatar;
        this.d = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        return k71.k.b(this.a, z6Var.a) && k71.k.b(this.b, z6Var.b) && k71.k.b(this.c, z6Var.c) && k71.k.b(this.d, z6Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.j(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("TimelinePullRequestCommit(id=", this.a, ", messageHeadline=", this.b, ", avatar=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
