package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f70 {
    public String a;
    public String b;
    public a70.a c;

    public f70(String str, String str2, a70.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f70)) {
            return false;
        }
        f70 f70Var = (f70) obj;
        return k71.k.b(this.a, f70Var.a) && k71.k.b(this.b, f70Var.b) && k71.k.b(this.c, f70Var.c);
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
    public f70(String p1, String p2, Object p3) {
    }
}
