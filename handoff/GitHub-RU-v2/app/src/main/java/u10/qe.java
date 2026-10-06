package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qe implements aaShadow.m0 {
    public final re a;

    public qe(re reVar) {
        this.a = reVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qe) && k71.k.b(this.a, ((qe) obj).a);
    }

    public final int hashCode() {
        re reVar = this.a;
        if (reVar == null) {
            return 0;
        }
        return reVar.hashCode();
    }

    public final String toString() {
        return "Data(followUser=" + this.a + ")";
    }
}
