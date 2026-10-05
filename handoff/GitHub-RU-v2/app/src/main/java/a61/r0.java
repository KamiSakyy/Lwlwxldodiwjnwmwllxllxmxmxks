package a61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r0 {
    public final z0 a;
    public final b b;

    public r0(z0 z0Var, b bVar) {
        this.a = z0Var;
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.a.equals(r0Var.a) && this.b.equals(r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (n.s.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + n.s + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
