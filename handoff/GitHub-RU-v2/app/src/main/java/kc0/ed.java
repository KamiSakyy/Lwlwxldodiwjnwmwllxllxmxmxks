package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ed implements aaShadow.v0 {
    public ld a;

    public ed(ld ldVar) {
        this.a = ldVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed) && k71.k.b(this.a, ((ed) obj).a);
    }

    public final int hashCode() {
        ld ldVar = this.a;
        if (ldVar == null) {
            return 0;
        }
        return ldVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
