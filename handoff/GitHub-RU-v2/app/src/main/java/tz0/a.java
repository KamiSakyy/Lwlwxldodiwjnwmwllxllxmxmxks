package tz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public d a;
    public int b;

    public a(d dVar, int i) {
        this.a = dVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CheckStateRollup(state=" + this.a + ", count=" + this.b + ")";
    }
}
