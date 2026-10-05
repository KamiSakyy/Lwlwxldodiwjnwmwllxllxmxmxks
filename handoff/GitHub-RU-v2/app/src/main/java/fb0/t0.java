package fb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t0 {
    public final int a;
    public final int b;
    public final s0 c;

    public t0(int i, int i2, s0 s0Var) {
        this.a = i;
        this.b = i2;
        this.c = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.a == t0Var.a && this.b == t0Var.b && k71.k.b(this.c, t0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a0.s0.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = x.i.m(this.a, this.b, "Node(unreadCount=", ", count=", ", list=");
        m.append(this.c);
        m.append(")");
        return m.toString();
    }
}
