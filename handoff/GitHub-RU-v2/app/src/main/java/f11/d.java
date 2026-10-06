package f11;

import java.time.ZonedDateTime;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public ZonedDateTime a;

    public d(ZonedDateTime zonedDateTime) {
        this.a = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && k.b(this.a, ((d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MobileAuthResponse(expirationDate=" + this.a + ")";
    }
}
