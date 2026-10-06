package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kw {
    public mw a;

    public kw(mw mwVar) {
        this.a = mwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kw) && k71.k.b(this.a, ((kw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(stargazers=" + this.a + ")";
    }
}
