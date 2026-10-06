package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hd {
    public String a;
    public wq0.a b;

    public hd(String str, wq0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd)) {
            return false;
        }
        hd hdVar = (hd) obj;
        return k71.k.b(this.a, hdVar.a) && k71.k.b(this.b, hdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
