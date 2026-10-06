package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l0 implements aaShadow.m0 {
    public final i0 a;

    public l0(i0 i0Var) {
        this.a = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && k71.k.b(this.a, ((l0) obj).a);
    }

    public final int hashCode() {
        i0 i0Var = this.a;
        if (i0Var == null) {
            return 0;
        }
        return i0Var.hashCode();
    }

    public final String toString() {
        return "Data(addDiscussionComment=" + this.a + ")";
    }
}
