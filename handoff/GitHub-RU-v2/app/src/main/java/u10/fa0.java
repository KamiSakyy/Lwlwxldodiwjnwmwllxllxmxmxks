package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fa0 {
    public boolean a;
    public String b;
    public String c;

    public fa0(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa0)) {
            return false;
        }
        fa0 fa0Var = (fa0) obj;
        return this.a == fa0Var.a && k71.k.b(this.b, fa0Var.b) && k71.k.b(this.c, fa0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(Boolean.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.copilot.h1.t("Viewer(hasCreatedLists=", ", id=", this.b, ", __typename=", this.a), this.c, ")");
    }
}
