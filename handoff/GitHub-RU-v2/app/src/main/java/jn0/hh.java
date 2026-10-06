package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hh {
    public String a;
    public hz0.e b;

    public hh(String str, hz0.e eVar) {
        this.a = str;
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh)) {
            return false;
        }
        hh hhVar = (hh) obj;
        return k71.k.b(this.a, hhVar.a) && k71.k.b(this.b, hhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", globalCodeSearchFragment=" + this.b + ")";
    }
}
