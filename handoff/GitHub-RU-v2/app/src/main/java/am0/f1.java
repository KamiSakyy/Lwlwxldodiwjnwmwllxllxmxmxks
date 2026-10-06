package am0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f1Shadow {
    public c1 a;
    public e1 b;
    public String c;
    public String d;

    public Object f1(c1 c1Var, e1 e1Var, String str, String str2) {
        this.a = c1Var;
        this.b = e1Var;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1Shadow)) {
            return false;
        }
        f1Shadow f1Var = (f1Shadow) obj;
        return k71.k.b(this.a, f1Var.a) && k71.k.b(this.b, f1Var.b) && k71.k.b(this.c, f1Var.c) && k71.k.b(this.d, f1Var.d);
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
