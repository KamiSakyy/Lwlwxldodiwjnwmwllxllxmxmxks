package am0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 {
    public String a;
    public d0 b;
    public String c;
    public String d;

    public i0(String str, d0 d0Var, String str2, String str3) {
        this.a = str;
        this.b = d0Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return k71.k.b(this.a, i0Var.a) && k71.k.b(this.b, i0Var.b) && k71.k.b(this.c, i0Var.c) && k71.k.b(this.d, i0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository1(name=");
        sb.append(this.a);
        sb.append(", owner=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
