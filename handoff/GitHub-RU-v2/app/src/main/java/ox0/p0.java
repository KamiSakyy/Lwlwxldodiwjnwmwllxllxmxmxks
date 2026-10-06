package ox0;

import fw0.j2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p0 {
    public String a;
    public g b;
    public String c;
    public j2 d;

    public p0(String str, g gVar, String str2, j2 j2Var) {
        this.a = str;
        this.b = gVar;
        this.c = str2;
        this.d = j2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return k71.k.b(this.a, p0Var.a) && k71.k.b(this.b, p0Var.b) && k71.k.b(this.c, p0Var.c) && k71.k.b(this.d, p0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "Viewer(__typename=" + this.a + ", notificationThreads=" + this.b + ", id=" + this.c + ", webNotificationsEnabled=" + this.d + ")";
    }
}
