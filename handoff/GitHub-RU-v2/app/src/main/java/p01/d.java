package p01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public String a;
    public String b;
    public ZonedDateTime c;

    public d(String str, String str2, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "name");
        k71.k.g(str2, "tagName");
        k71.k.g(zonedDateTime, "timestamp");
        this.a = str;
        this.b = str2;
        this.c = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return h1.q(s0.o("LatestRelease(name=", this.a, ", tagName=", this.b, ", timestamp="), this.c, ")");
    }
}
