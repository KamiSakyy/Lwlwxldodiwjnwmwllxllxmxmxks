package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ws implements aaShadow.v0 {
    public final at a;

    public ws(at atVar) {
        this.a = atVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ws) && k71.k.b(this.a, ((ws) obj).a);
    }

    public final int hashCode() {
        at atVar = this.a;
        if (atVar == null) {
            return 0;
        }
        return atVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
