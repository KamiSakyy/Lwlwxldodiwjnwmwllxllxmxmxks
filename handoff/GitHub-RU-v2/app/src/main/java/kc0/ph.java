package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ph implements aaShadow.m0 {
    public qh a;

    public ph(qh qhVar) {
        this.a = qhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ph) && k71.k.b(this.a, ((ph) obj).a);
    }

    public final int hashCode() {
        qh qhVar = this.a;
        if (qhVar == null) {
            return 0;
        }
        return qhVar.hashCode();
    }

    public final String toString() {
        return "Data(markFileAsViewed=" + this.a + ")";
    }
}
