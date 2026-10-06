package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ij0 {
    public boolean a;
    public String b;
    public String c;

    public ij0(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij0)) {
            return false;
        }
        ij0 ij0Var = (ij0) obj;
        return this.a == ij0Var.a && k71.k.b(this.b, ij0Var.b) && k71.k.b(this.c, ij0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(Boolean.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.copilot.h1.t("Viewer(isEmployee=", ", id=", this.b, ", __typename=", this.a), this.c, ")");
    }
}
