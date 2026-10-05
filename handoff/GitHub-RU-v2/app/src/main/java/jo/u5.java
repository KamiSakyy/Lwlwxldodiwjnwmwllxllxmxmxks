package jo;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u5 {
    public final t5 a;
    public final String b;
    public final int c;
    public final ArrayList d;

    public u5(t5 t5Var, String str, int i, ArrayList arrayList) {
        this.a = t5Var;
        this.b = str;
        this.c = i;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return k71.k.b(this.a, u5Var.a) && this.b.equals(u5Var.b) && this.c == u5Var.c && this.d.equals(u5Var.d);
    }

    public final int hashCode() {
        t5 t5Var = this.a;
        return this.d.hashCode() + a0.s0.b(this.c, com.github.rudroid.copilot.h1.i((t5Var == null ? 0 : t5Var.hashCode()) * 31, this.b, 31), 31);
    }

    public final String toString() {
        return "Node(language=" + this.a + ", path=" + this.b + ", matchCount=" + this.c + ", snippets=" + this.d + ")";
    }
}
