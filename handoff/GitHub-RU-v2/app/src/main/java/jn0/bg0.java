package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bg0 {
    public String a;
    public boolean b;
    public String c;

    public bg0(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg0)) {
            return false;
        }
        bg0 bg0Var = (bg0) obj;
        return k71.k.b(this.a, bg0Var.a) && this.b == bg0Var.b && k71.k.b(this.c, bg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(com.github.rudroid.m0.o("Repository(id=", this.a, ", viewerCanPush=", ", __typename=", this.b), this.c, ")");
    }
}
