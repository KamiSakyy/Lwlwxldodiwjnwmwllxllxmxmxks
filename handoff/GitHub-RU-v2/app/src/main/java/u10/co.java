package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class co {
    public String a;
    public String b;
    public ea0.q0 c;

    public co(String str, String str2, ea0.q0 q0Var) {
        this.a = str;
        this.b = str2;
        this.c = q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co)) {
            return false;
        }
        co coVar = (co) obj;
        return k71.k.b(this.a, coVar.a) && k71.k.b(this.b, coVar.b) && k71.k.b(this.c, coVar.c);
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
