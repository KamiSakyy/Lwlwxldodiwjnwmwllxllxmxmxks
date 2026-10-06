package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sr implements aaShadow.v0 {
    public final wr a;

    public sr(wr wrVar) {
        this.a = wrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sr) && k71.k.b(this.a, ((sr) obj).a);
    }

    public final int hashCode() {
        wr wrVar = this.a;
        if (wrVar == null) {
            return 0;
        }
        return wrVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
