package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jz implements aaShadow.v0 {
    public final nz a;

    public jz(nz nzVar) {
        this.a = nzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jz) && k71.k.b(this.a, ((jz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
