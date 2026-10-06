package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u8 implements aaShadow.m0 {
    public final v8 a;

    public u8(v8 v8Var) {
        this.a = v8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8) && k71.k.b(this.a, ((u8) obj).a);
    }

    public final int hashCode() {
        v8 v8Var = this.a;
        if (v8Var == null) {
            return 0;
        }
        return v8Var.a.hashCode();
    }

    public final String toString() {
        return "Data(deleteDiscussion=" + this.a + ")";
    }
}
