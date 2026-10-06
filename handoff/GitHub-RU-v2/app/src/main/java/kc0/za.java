package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class za implements aaShadow.v0 {
    public final bb a;

    public za(bb bbVar) {
        this.a = bbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za) && k71.k.b(this.a, ((za) obj).a);
    }

    public final int hashCode() {
        bb bbVar = this.a;
        if (bbVar == null) {
            return 0;
        }
        return bbVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
