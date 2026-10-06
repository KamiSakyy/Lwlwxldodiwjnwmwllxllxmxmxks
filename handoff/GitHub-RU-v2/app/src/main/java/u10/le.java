package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class le implements aaShadow.m0 {
    public me a;

    public le(me meVar) {
        this.a = meVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof le) && k71.k.b(this.a, ((le) obj).a);
    }

    public final int hashCode() {
        me meVar = this.a;
        if (meVar == null) {
            return 0;
        }
        return meVar.hashCode();
    }

    public final String toString() {
        return "Data(followUser=" + this.a + ")";
    }
}
