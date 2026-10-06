package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g6 extends s7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ZonedDateTime e;

    public g6(String str, String str2, String str3, String str4, ZonedDateTime zonedDateTime) {
        k71.k.g(str2, "actorDisplayName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6)) {
            return false;
        }
        g6 g6Var = (g6) obj;
        return k71.k.b(this.a, g6Var.a) && k71.k.b(this.b, g6Var.b) && k71.k.b(this.c, g6Var.c) && k71.k.b(this.d, g6Var.d) && k71.k.b(this.e, g6Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        return this.e.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("TimelineCopilotWorkStartedEvent(id=", this.a, ", actorDisplayName=", this.b, ", agentDisplayName=");
        f1.e.x(o, this.c, ", sessionId=", this.d, ", createdAt=");
        return com.github.rudroid.copilot.h1.q(o, this.e, ")");
    }
}
