package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q7 {
    public boolean a;
    public String b;
    public String c;
    public String d;
    public String e;

    public q7(String str, String str2, String str3, String str4, boolean z) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj;
        return this.a == q7Var.a && k71.k.b(this.b, q7Var.b) && k71.k.b(this.c, q7Var.c) && k71.k.b(this.d, q7Var.d) && k71.k.b(this.e, q7Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder t = com.github.rudroid.copilot.h1.t("RequestedBy(isViewer=", ", login=", this.b, ", avatarUrl=", this.a);
        f1.e.x(t, this.c, ", id=", this.d, ", __typename=");
        return com.github.rudroid.copilot.h1.p(t, this.e, ")");
    }
}
