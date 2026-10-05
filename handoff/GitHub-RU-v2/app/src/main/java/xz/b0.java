package xz;

import java.time.LocalDate;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 {
    public final LocalDate a;

    public b0(LocalDate localDate) {
        this.a = localDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && k71.k.b(this.a, ((b0) obj).a);
    }

    public final int hashCode() {
        LocalDate localDate = this.a;
        if (localDate == null) {
            return 0;
        }
        return localDate.hashCode();
    }

    public final String toString() {
        return "OnProjectV2GroupDateValue(date=" + this.a + ")";
    }
}
