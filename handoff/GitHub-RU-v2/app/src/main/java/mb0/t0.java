package mb0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t0 {
    public String a;
    public r0 b;
    public String c;
    public ja0.a d;

    public t0(String str, r0 r0Var, String str2, ja0.a aVar) {
        this.a = str;
        this.b = r0Var;
        this.c = str2;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return k71.k.b(this.a, t0Var.a) && k71.k.b(this.b, t0Var.b) && k71.k.b(this.c, t0Var.c) && k71.k.b(this.d, t0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r0 r0Var = this.b;
        return this.d.hashCode() + h1.i((hashCode + (r0Var == null ? 0 : Boolean.hashCode(r0Var.a))) * 31, this.c, 31);
    }

    public final String toString() {
        return "User(__typename=" + this.a + ", mobilePushNotificationSettings=" + this.b + ", id=" + this.c + ", nodeIdFragment=" + this.d + ")";
    }
}
