package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z implements aaShadow.m0 {
    public y a;

    public z(y yVar) {
        this.a = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && k71.k.b(this.a, ((z) obj).a);
    }

    public final int hashCode() {
        y yVar = this.a;
        if (yVar == null) {
            return 0;
        }
        return yVar.hashCode();
    }

    public final String toString() {
        return "Data(createUserDashboardPin=" + this.a + ")";
    }
}
