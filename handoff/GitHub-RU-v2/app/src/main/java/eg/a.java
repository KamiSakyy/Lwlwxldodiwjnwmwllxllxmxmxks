package eg;

import java.time.ZonedDateTime;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public String a;
    public ZonedDateTime b;

    public a(String str, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CopilotChatMonthlyLicenseDetails(copilotChatMonthlyFormattedPrice=" + this.a + ", copilotChatMonthlyLicenseExpirationDate=" + this.b + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a() {
        this("", r0);
        ZonedDateTime now = ZonedDateTime.now();
        k.f(now, "now(...)");
    }
}
