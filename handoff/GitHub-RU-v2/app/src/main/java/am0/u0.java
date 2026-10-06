package am0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u0 {
    public int a;
    public int b;
    public t0 c;

    public u0(int i, int i2, t0 t0Var) {
        this.a = i;
        this.b = i2;
        this.c = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.a == u0Var.a && this.b == u0Var.b && k71.k.b(this.c, u0Var.c);
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
