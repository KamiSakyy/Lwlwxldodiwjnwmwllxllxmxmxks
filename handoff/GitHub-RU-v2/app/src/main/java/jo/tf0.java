package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tf0 {
    public final String a;
    public final String b;
    public final lu.a c;

    public tf0(String str, String str2, lu.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf0)) {
            return false;
        }
        tf0 tf0Var = (tf0) obj;
        return k71.k.b(this.a, tf0Var.a) && k71.k.b(this.b, tf0Var.b) && k71.k.b(this.c, tf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("MobilePushNotificationSchedule(__typename=", this.a, ", id=", this.b, ", pushNotificationSchedulesFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
