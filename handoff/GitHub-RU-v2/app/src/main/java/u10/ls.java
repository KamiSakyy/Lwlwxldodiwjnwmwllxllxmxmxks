package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ls {
    public final ns a;

    public ls(ns nsVar) {
        this.a = nsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ls) && k71.k.b(this.a, ((ls) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(stargazers=" + this.a + ")";
    }
}
