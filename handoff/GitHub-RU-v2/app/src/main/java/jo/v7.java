package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v7 {
    public boolean a;
    public String b;

    public v7(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7)) {
            return false;
        }
        v7 v7Var = (v7) obj;
        return this.a == v7Var.a && k71.k.b(this.b, v7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return com.github.rudroid.m0.f("Copilot(success=", ", message=", this.b, ")", this.a);
    }
}
