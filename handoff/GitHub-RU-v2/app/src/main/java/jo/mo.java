package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mo {
    public no a;

    public mo(no noVar) {
        this.a = noVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mo) && k71.k.b(this.a, ((mo) obj).a);
    }

    public final int hashCode() {
        no noVar = this.a;
        if (noVar == null) {
            return 0;
        }
        return noVar.hashCode();
    }

    public final String toString() {
        return "MinimizeComment(minimizedComment=" + this.a + ")";
    }
}
