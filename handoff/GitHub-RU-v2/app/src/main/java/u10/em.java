package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class em implements aaShadow.v0 {
    public final im a;

    public em(im imVar) {
        this.a = imVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof em) && k71.k.b(this.a, ((em) obj).a);
    }

    public final int hashCode() {
        im imVar = this.a;
        if (imVar == null) {
            return 0;
        }
        return imVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
