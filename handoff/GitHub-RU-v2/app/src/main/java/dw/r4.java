package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r4 {
    public final String a;
    public final boolean b;

    public r4(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) obj;
        return k71.k.b(this.a, r4Var.a) && this.b == r4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.n("OnBot(id=", this.a, ", isCopilot=", ")", this.b);
    }
}
