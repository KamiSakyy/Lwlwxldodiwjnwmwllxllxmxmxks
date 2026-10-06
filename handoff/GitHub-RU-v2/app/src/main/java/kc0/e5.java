package kc0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e5 {
    public final d5 a;
    public final String b;
    public final int c;
    public final ArrayList d;

    public e5(d5 d5Var, String str, int i, ArrayList arrayList) {
        this.a = d5Var;
        this.b = str;
        this.c = i;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        return k71.k.b(this.a, e5Var.a) && this.b.equals(e5Var.b) && this.c == e5Var.c && this.d.equals(e5Var.d);
    }

    public final int hashCode() {
        d5 d5Var = this.a;
        return this.d.hashCode() + a0.s0.b(this.c, com.github.rudroid.copilot.h1.i((d5Var == null ? 0 : d5Var.hashCode()) * 31, this.b, 31), 31);
    }

    public final String toString() {
        return "Node(language=" + this.a + ", path=" + this.b + ", matchCount=" + this.c + ", snippets=" + this.d + ")";
    }
}
