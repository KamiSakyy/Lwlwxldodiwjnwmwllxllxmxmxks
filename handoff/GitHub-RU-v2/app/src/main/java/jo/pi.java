package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pi {
    public String a;
    public e10.e b;

    public pi(String str, e10.e eVar) {
        this.a = str;
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi)) {
            return false;
        }
        pi piVar = (pi) obj;
        return k71.k.b(this.a, piVar.a) && k71.k.b(this.b, piVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node5(__typename=" + this.a + ", globalCodeSearchFragment=" + this.b + ")";
    }
}
