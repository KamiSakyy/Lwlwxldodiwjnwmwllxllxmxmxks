package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xs {
    public final vs a;
    public final String b;
    public final String c;

    public xs(vs vsVar, String str, String str2) {
        this.a = vsVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs)) {
            return false;
        }
        xs xsVar = (xs) obj;
        return k71.k.b(this.a, xsVar.a) && k71.k.b(this.b, xsVar.b) && k71.k.b(this.c, xsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(mobilePushNotificationSchedules=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
