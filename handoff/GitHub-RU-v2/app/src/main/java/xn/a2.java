package xn;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a2 {
    public final c2 a;
    public final b2 b;
    public final String c;
    public final ArrayList d;

    public a2(c2 c2Var, b2 b2Var, String str, ArrayList arrayList) {
        this.a = c2Var;
        this.b = b2Var;
        this.c = str;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return this.a == a2Var.a && this.b == a2Var.b && this.c.equals(a2Var.c) && this.d.equals(a2Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        return "FunctionCall(type=" + this.a + ", state=" + this.b + ", query=" + this.c + ", references=" + this.d + ")";
    }
}
