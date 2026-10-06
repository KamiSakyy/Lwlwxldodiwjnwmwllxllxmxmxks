package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ei {
    public final String a;
    public final e10.e b;

    public ei(String str, e10.e eVar) {
        this.a = str;
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei)) {
            return false;
        }
        ei eiVar = (ei) obj;
        return k71.k.b(this.a, eiVar.a) && k71.k.b(this.b, eiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", globalCodeSearchFragment=" + this.b + ")";
    }
}
