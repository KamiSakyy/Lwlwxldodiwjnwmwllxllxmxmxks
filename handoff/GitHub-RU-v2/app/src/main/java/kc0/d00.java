package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d00 implements aaShadow.v0 {
    public h00 a;

    public d00(h00 h00Var) {
        this.a = h00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d00) && k71.k.b(this.a, ((d00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(search=" + this.a + ")";
    }
}
