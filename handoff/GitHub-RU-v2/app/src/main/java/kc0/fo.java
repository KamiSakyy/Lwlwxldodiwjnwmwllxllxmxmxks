package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fo {
    public String a;
    public qf0.a b;

    public fo(String str, qf0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo)) {
            return false;
        }
        fo foVar = (fo) obj;
        return k71.k.b(this.a, foVar.a) && k71.k.b(this.b, foVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine1(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
