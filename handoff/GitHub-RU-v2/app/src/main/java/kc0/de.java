package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class de implements aaShadow.v0 {
    public je a;

    public de(je jeVar) {
        this.a = jeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof de) && k71.k.b(this.a, ((de) obj).a);
    }

    public final int hashCode() {
        je jeVar = this.a;
        if (jeVar == null) {
            return 0;
        }
        return jeVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
