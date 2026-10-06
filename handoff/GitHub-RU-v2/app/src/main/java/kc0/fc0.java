package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fc0 {
    public boolean a;
    public String b;
    public String c;

    public fc0(String str, String str2, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc0)) {
            return false;
        }
        fc0 fc0Var = (fc0) obj;
        return this.a == fc0Var.a && k71.k.b(this.b, fc0Var.b) && k71.k.b(this.c, fc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(Boolean.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.copilot.h1.t("Viewer(hasCreatedLists=", ", id=", this.b, ", __typename=", this.a), this.c, ")");
    }
}
