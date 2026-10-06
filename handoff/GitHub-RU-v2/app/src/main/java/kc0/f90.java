package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f90 {
    public String a;
    public String b;
    public sh0.a c;

    public f90(String str, String str2, sh0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f90)) {
            return false;
        }
        f90 f90Var = (f90) obj;
        return k71.k.b(this.a, f90Var.a) && k71.k.b(this.b, f90Var.b) && k71.k.b(this.c, f90Var.c);
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
