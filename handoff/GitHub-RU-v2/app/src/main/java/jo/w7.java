package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w7 {
    public final boolean a;
    public final String b;

    public w7(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        return this.a == w7Var.a && k71.k.b(this.b, w7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return com.github.rudroid.m0.f("CopilotMax(success=", ", message=", this.b, ")", this.a);
    }
}
