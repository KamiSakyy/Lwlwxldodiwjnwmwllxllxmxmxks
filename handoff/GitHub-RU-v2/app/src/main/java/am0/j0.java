package am0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j0 {
    public String a;
    public String b;
    public e0 c;
    public String d;

    public j0(String str, String str2, e0 e0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = e0Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return k71.k.b(this.a, j0Var.a) && k71.k.b(this.b, j0Var.b) && k71.k.b(this.c, j0Var.c) && k71.k.b(this.d, j0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository2(id=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
