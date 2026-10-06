package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fd0 {
    public final String a;
    public final String b;
    public final ct0.a c;

    public fd0(String str, String str2, ct0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd0)) {
            return false;
        }
        fd0 fd0Var = (fd0) obj;
        return k71.k.b(this.a, fd0Var.a) && k71.k.b(this.b, fd0Var.b) && k71.k.b(this.c, fd0Var.c);
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
