package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e6 extends s7 {
    public String a;
    public String b;
    public String c;
    public String d;
    public ZonedDateTime e;

    public e6(String str, String str2, String str3, String str4, ZonedDateTime zonedDateTime) {
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
        if (!(obj instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj;
        return k71.k.b(this.a, e6Var.a) && k71.k.b(this.b, e6Var.b) && k71.k.b(this.c, e6Var.c) && k71.k.b(this.d, e6Var.d) && k71.k.b(this.e, e6Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        return this.e.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("TimelineCopilotWorkFinishedEvent(id=", this.a, ", actorDisplayName=", this.b, ", agentDisplayName=");
        f1.e.x(o, this.c, ", sessionId=", this.d, ", createdAt=");
        return com.github.rudroid.copilot.h1.q(o, this.e, ")");
    }
}
