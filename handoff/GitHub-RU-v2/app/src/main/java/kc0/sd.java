package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class sd implements aaShadow.v0 {
    public final td a;

    public sd(td tdVar) {
        this.a = tdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd) && k71.k.b(this.a, ((sd) obj).a);
    }

    public final int hashCode() {
        td tdVar = this.a;
        if (tdVar == null) {
            return 0;
        }
        return tdVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
