package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rm implements aaShadow.v0 {
    public um a;

    public rm(um umVar) {
        this.a = umVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rm) && k71.k.b(this.a, ((rm) obj).a);
    }

    public final int hashCode() {
        um umVar = this.a;
        if (umVar == null) {
            return 0;
        }
        return umVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
