package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bx {
    public fx a;
    public String b;

    public bx(fx fxVar, String str) {
        this.a = fxVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx)) {
            return false;
        }
        bx bxVar = (bx) obj;
        return k71.k.b(this.a, bxVar.a) && k71.k.b(this.b, bxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnUser(repositories=" + this.a + ", id=" + this.b + ")";
    }
}
