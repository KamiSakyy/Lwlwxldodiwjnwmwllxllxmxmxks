package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v7 {
    public String a;
    public String b;
    public qu0.c c;

    public v7(String str, String str2, qu0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7)) {
            return false;
        }
        v7 v7Var = (v7) obj;
        return k71.k.b(this.a, v7Var.a) && k71.k.b(this.b, v7Var.b) && k71.k.b(this.c, v7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Ref(__typename=", this.a, ", id=", this.b, ", repoBranchFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
