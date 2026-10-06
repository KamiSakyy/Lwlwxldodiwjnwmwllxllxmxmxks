package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pp implements aaShadow.v0 {
    public final up a;

    public pp(up upVar) {
        this.a = upVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pp) && k71.k.b(this.a, ((pp) obj).a);
    }

    public final int hashCode() {
        up upVar = this.a;
        if (upVar == null) {
            return 0;
        }
        return upVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
