package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cf0 implements aaShadow.m0 {
    public jf0 a;

    public cf0(jf0 jf0Var) {
        this.a = jf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf0) && k71.k.b(this.a, ((cf0) obj).a);
    }

    public final int hashCode() {
        jf0 jf0Var = this.a;
        if (jf0Var == null) {
            return 0;
        }
        return jf0Var.hashCode();
    }

    public final String toString() {
        return "Data(requestReviews=" + this.a + ")";
    }
}
