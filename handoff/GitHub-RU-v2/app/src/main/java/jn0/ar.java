package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ar {
    public final yq a;
    public final String b;
    public final String c;

    public ar(yq yqVar, String str, String str2) {
        this.a = yqVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        return k71.k.b(this.a, arVar.a) && k71.k.b(this.b, arVar.b) && k71.k.b(this.c, arVar.c);
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
