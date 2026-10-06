package fb0;

import com.github.rudroid.copilot.h1;
import ea0.j2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 {
    public String a;
    public g b;
    public String c;
    public j2 d;

    public n0(String str, g gVar, String str2, j2 j2Var) {
        this.a = str;
        this.b = gVar;
        this.c = str2;
        this.d = j2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return k71.k.b(this.a, n0Var.a) && k71.k.b(this.b, n0Var.b) && k71.k.b(this.c, n0Var.c) && k71.k.b(this.d, n0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "Viewer(__typename=" + this.a + ", notificationThreads=" + this.b + ", id=" + this.c + ", webNotificationsEnabled=" + this.d + ")";
    }
}
