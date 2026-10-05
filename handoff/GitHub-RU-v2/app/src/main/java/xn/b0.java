package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 {
    public final c0 a;
    public final String b;

    public b0(c0 c0Var, String str) {
        k71.k.g(c0Var, "state");
        k71.k.g(str, "confirmation");
        this.a = c0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.a == b0Var.a && k71.k.b(this.b, b0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatMessageClientConfirmation(state=" + this.a + ", confirmation=" + this.b + ")";
    }
}
