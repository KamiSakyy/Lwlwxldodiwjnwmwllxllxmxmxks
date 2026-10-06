package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hp {
    public final String a;
    public final String b;
    public final wk0.q0 c;

    public hp(String str, String str2, wk0.q0 q0Var) {
        this.a = str;
        this.b = str2;
        this.c = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        return k71.k.b(this.a, hpVar.a) && k71.k.b(this.b, hpVar.b) && k71.k.b(this.c, hpVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("User(__typename=", this.a, ", id=", this.b, ", simpleUserListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
