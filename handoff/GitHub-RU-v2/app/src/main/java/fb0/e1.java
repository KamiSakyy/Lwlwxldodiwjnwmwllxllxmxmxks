package fb0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e1 {
    public b1 a;
    public d1 b;
    public String c;
    public String d;

    public e1(b1 b1Var, d1 d1Var, String str, String str2) {
        this.a = b1Var;
        this.b = d1Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return k71.k.b(this.a, e1Var.a) && k71.k.b(this.b, e1Var.b) && k71.k.b(this.c, e1Var.c) && k71.k.b(this.d, e1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h1.i((this.b.hashCode() + (Integer.hashCode(this.a.a) * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(inbox=");
        sb.append(this.a);
        sb.append(", notificationFilters=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
