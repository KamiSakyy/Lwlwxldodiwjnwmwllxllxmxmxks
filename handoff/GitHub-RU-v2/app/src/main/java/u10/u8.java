package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u8 {
    public final String a;
    public final String b;
    public final z70.e c;

    public u8(String str, String str2, z70.e eVar) {
        this.a = str;
        this.b = str2;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8)) {
            return false;
        }
        u8 u8Var = (u8) obj;
        return k71.k.b(this.a, u8Var.a) && k71.k.b(this.b, u8Var.b) && k71.k.b(this.c, u8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node3(__typename=", this.a, ", id=", this.b, ", deploymentReviewAssociatedPr=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
