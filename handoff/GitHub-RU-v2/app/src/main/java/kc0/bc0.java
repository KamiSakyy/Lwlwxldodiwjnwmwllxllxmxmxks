package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bc0 {
    public String a;
    public boolean b;
    public String c;

    public bc0(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc0)) {
            return false;
        }
        bc0 bc0Var = (bc0) obj;
        return k71.k.b(this.a, bc0Var.a) && this.b == bc0Var.b && k71.k.b(this.c, bc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.m0.o("Repository(id=", this.a, ", viewerCanPush=", ", __typename=", this.b), this.c, ")");
    }
}
