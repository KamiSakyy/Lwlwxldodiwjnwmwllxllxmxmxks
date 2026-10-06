package lz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public ZonedDateTime a;

    public a(ZonedDateTime zonedDateTime) {
        this.a = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && k71.k.b(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        ZonedDateTime zonedDateTime = this.a;
        if (zonedDateTime == null) {
            return 0;
        }
        return zonedDateTime.hashCode();
    }

    public final String toString() {
        return "AddMobileDevicePublicKey(expiresAt=" + this.a + ")";
    }
}
