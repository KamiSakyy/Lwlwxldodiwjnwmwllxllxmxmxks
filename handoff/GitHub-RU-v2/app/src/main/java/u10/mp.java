package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mp {
    public pp a;

    public mp(pp ppVar) {
        this.a = ppVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mp) && k71.k.b(this.a, ((mp) obj).a);
    }

    public final int hashCode() {
        pp ppVar = this.a;
        if (ppVar == null) {
            return 0;
        }
        return ppVar.hashCode();
    }

    public final String toString() {
        return "Tagger(user=" + this.a + ")";
    }
}
