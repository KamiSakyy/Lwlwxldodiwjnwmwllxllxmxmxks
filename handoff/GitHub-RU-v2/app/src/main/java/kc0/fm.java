package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fm implements aa.v0 {
    public final im a;

    public fm(im imVar) {
        this.a = imVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm) && k71.k.b(this.a, ((fm) obj).a);
    }

    public final int hashCode() {
        im imVar = this.a;
        if (imVar == null) {
            return 0;
        }
        return imVar.hashCode();
    }

    public final String toString() {
        return "Data(organization=" + this.a + ")";
    }
}
