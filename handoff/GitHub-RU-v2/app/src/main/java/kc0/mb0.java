package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mb0 {
    public String a;
    public String b;
    public ci0.i c;

    public mb0(String str, String str2, ci0.i iVar) {
        this.a = str;
        this.b = str2;
        this.c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb0)) {
            return false;
        }
        mb0 mb0Var = (mb0) obj;
        return k71.k.b(this.a, mb0Var.a) && k71.k.b(this.b, mb0Var.b) && k71.k.b(this.c, mb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Organization(__typename=", this.a, ", id=", this.b, ", organizationFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
