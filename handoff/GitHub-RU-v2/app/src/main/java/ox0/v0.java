package ox0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v0 {
    public int a;
    public int b;
    public u0 c;

    public v0(int i, int i2, u0 u0Var) {
        this.a = i;
        this.b = i2;
        this.c = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.a == v0Var.a && this.b == v0Var.b && k71.k.b(this.c, v0Var.c);
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
