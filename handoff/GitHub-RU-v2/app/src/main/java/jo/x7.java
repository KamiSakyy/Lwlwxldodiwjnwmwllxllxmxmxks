package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x7 {
    public final boolean a;
    public final String b;

    public x7(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7)) {
            return false;
        }
        x7 x7Var = (x7) obj;
        return this.a == x7Var.a && k71.k.b(this.b, x7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return com.github.rudroid.m0.f("CopilotProPlus(success=", ", message=", this.b, ")", this.a);
    }
}
