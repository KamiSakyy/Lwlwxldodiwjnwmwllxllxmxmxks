package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c9 implements aaShadow.m0 {
    public d9 a;

    public c9(d9 d9Var) {
        this.a = d9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c9) && k71.k.b(this.a, ((c9) obj).a);
    }

    public final int hashCode() {
        d9 d9Var = this.a;
        if (d9Var == null) {
            return 0;
        }
        return d9Var.hashCode();
    }

    public final String toString() {
        return "Data(deleteMobileDeviceToken=" + this.a + ")";
    }
}
