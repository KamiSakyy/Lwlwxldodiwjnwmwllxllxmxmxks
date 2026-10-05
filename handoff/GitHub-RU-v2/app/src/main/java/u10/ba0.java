package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ba0 {
    public final String a;
    public final boolean b;
    public final String c;

    public ba0(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba0)) {
            return false;
        }
        ba0 ba0Var = (ba0) obj;
        return k71.k.b(this.a, ba0Var.a) && this.b == ba0Var.b && k71.k.b(this.c, ba0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.m0.o("Repository(id=", this.a, ", viewerCanPush=", ", __typename=", this.b), this.c, ")");
    }
}
