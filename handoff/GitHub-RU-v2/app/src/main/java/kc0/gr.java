package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gr implements aa.m0 {
    public final hr a;

    public gr(hr hrVar) {
        this.a = hrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gr) && k71.k.b(this.a, ((gr) obj).a);
    }

    public final int hashCode() {
        hr hrVar = this.a;
        if (hrVar == null) {
            return 0;
        }
        return hrVar.hashCode();
    }

    public final String toString() {
        return "Data(deleteUserDashboardPin=" + this.a + ")";
    }
}
