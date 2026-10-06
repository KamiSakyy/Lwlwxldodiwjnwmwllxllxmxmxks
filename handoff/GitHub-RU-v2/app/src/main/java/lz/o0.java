package lz;

import com.github.rudroid.copilot.h1;
import qx.l2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 {
    public String a;
    public f b;
    public String c;
    public l2 d;

    public o0(String str, f fVar, String str2, l2 l2Var) {
        this.a = str;
        this.b = fVar;
        this.c = str2;
        this.d = l2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return k71.k.b(this.a, o0Var.a) && k71.k.b(this.b, o0Var.b) && k71.k.b(this.c, o0Var.c) && k71.k.b(this.d, o0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "Viewer(__typename=" + this.a + ", notificationThreads=" + this.b + ", id=" + this.c + ", webNotificationsEnabled=" + this.d + ")";
    }
}
