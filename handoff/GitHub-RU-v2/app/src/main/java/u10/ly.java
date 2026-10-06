package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ly {
    public String a;
    public i30.c b;

    public ly(String str, i30.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ly)) {
            return false;
        }
        ly lyVar = (ly) obj;
        return k71.k.b(this.a, lyVar.a) && k71.k.b(this.b, lyVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Assignable(__typename=" + this.a + ", assignableFragment=" + this.b + ")";
    }
    public ly(String p1, Object p2) {
    }
}
