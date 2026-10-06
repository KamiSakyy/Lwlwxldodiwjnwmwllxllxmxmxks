package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m8 implements aaShadow.m0 {
    public final n8 a;

    public m8(n8 n8Var) {
        this.a = n8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8) && k71.k.b(this.a, ((m8) obj).a);
    }

    public final int hashCode() {
        n8 n8Var = this.a;
        if (n8Var == null) {
            return 0;
        }
        return n8Var.hashCode();
    }

    public final String toString() {
        return "Data(deleteRef=" + this.a + ")";
    }
}
