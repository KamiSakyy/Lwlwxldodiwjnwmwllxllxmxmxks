package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z70 {
    public final String a;
    public final String b;
    public final dw.r6 c;

    public z70(String str, String str2, dw.r6 r6Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = r6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z70)) {
            return false;
        }
        z70 z70Var = (z70) obj;
        return k71.k.b(this.a, z70Var.a) && k71.k.b(this.b, z70Var.b) && k71.k.b(this.c, z70Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        dw.r6 r6Var = this.c;
        return i + (r6Var == null ? 0 : r6Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", subIssueListFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
