package is;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q {
    public String a;
    public wu.a b;

    public q(String str, wu.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PageInfo(__typename=" + this.a + ", reversedPageInfo=" + this.b + ")";
    }
}
