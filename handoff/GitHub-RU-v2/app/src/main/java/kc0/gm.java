package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gm {
    public String a;
    public String b;
    public hm c;

    public gm(String str, String str2, hm hmVar) {
        this.a = str;
        this.b = str2;
        this.c = hmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm)) {
            return false;
        }
        gm gmVar = (gm) obj;
        return k71.k.b(this.a, gmVar.a) && k71.k.b(this.b, gmVar.b) && k71.k.b(this.c, gmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", onDiscussion=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
