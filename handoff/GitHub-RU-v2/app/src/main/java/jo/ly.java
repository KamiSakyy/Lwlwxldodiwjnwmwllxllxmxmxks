package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ly {
    public final ny a;

    public ly(ny nyVar) {
        this.a = nyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ly) && k71.k.b(this.a, ((ly) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(stargazers=" + this.a + ")";
    }
}
