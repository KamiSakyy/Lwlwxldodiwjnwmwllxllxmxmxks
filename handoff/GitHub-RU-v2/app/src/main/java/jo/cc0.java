package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cc0 implements aaShadow.m0 {
    public dc0 a;

    public cc0(dc0 dc0Var) {
        this.a = dc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc0) && k71.k.b(this.a, ((cc0) obj).a);
    }

    public final int hashCode() {
        dc0 dc0Var = this.a;
        if (dc0Var == null) {
            return 0;
        }
        return dc0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDiscussionComment=" + this.a + ")";
    }
}
