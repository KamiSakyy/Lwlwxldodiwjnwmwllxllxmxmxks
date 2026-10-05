package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jt implements aa.m0 {
    public final kt a;

    public jt(kt ktVar) {
        this.a = ktVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jt) && k71.k.b(this.a, ((jt) obj).a);
    }

    public final int hashCode() {
        kt ktVar = this.a;
        if (ktVar == null) {
            return 0;
        }
        return ktVar.hashCode();
    }

    public final String toString() {
        return "Data(deleteUserDashboardPin=" + this.a + ")";
    }
}
