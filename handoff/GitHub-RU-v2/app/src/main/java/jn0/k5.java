package jn0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k5 {
    public j5 a;
    public String b;
    public int c;
    public ArrayList d;

    public k5(j5 j5Var, String str, int i, ArrayList arrayList) {
        this.a = j5Var;
        this.b = str;
        this.c = i;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        return k71.k.b(this.a, k5Var.a) && this.b.equals(k5Var.b) && this.c == k5Var.c && this.d.equals(k5Var.d);
    }

    public final int hashCode() {
        j5 j5Var = this.a;
        return this.d.hashCode() + a0.s0.b(this.c, com.github.rudroid.copilot.h1.i((j5Var == null ? 0 : j5Var.hashCode()) * 31, this.b, 31), 31);
    }

    public final String toString() {
        return "Node(language=" + this.a + ", path=" + this.b + ", matchCount=" + this.c + ", snippets=" + this.d + ")";
    }
}
