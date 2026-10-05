package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class je0 implements aa.m0 {
    public final le0 a;

    public je0(le0 le0Var) {
        this.a = le0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof je0) && k71.k.b(this.a, ((je0) obj).a);
    }

    public final int hashCode() {
        le0 le0Var = this.a;
        if (le0Var == null) {
            return 0;
        }
        return le0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateUserDashboardNavLinks=" + this.a + ")";
    }
}
