package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v70 {
    public final String a;
    public final String b;
    public final k90.v c;

    public v70(String str, String str2, k90.v vVar) {
        this.a = str;
        this.b = str2;
        this.c = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v70)) {
            return false;
        }
        v70 v70Var = (v70) obj;
        return k71.k.b(this.a, v70Var.a) && k71.k.b(this.b, v70Var.b) && k71.k.b(this.c, v70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Shortcut(__typename=", this.a, ", id=", this.b, ", shortcutFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }



}
