package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ss implements aaShadow.v0 {
    public final ts a;

    public ss(ts tsVar) {
        this.a = tsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ss) && k71.k.b(this.a, ((ss) obj).a);
    }

    public final int hashCode() {
        ts tsVar = this.a;
        if (tsVar == null) {
            return 0;
        }
        return tsVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
