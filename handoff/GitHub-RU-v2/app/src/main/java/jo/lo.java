package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lo implements aaShadow.m0 {
    public final mo a;

    public lo(mo moVar) {
        this.a = moVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo) && k71.k.b(this.a, ((lo) obj).a);
    }

    public final int hashCode() {
        mo moVar = this.a;
        if (moVar == null) {
            return 0;
        }
        return moVar.hashCode();
    }

    public final String toString() {
        return "Data(minimizeComment=" + this.a + ")";
    }
}
