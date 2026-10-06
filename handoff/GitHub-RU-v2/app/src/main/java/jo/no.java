package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class no {
    public String a;
    public oo b;
    public ju.a c;

    public no(String str, oo ooVar, ju.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = ooVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no)) {
            return false;
        }
        no noVar = (no) obj;
        return k71.k.b(this.a, noVar.a) && k71.k.b(this.b, noVar.b) && k71.k.b(this.c, noVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        oo ooVar = this.b;
        return this.c.hashCode() + ((hashCode + (ooVar == null ? 0 : ooVar.a.hashCode())) * 31);
    }

    public final String toString() {
        return "MinimizedComment(__typename=" + this.a + ", onNode=" + this.b + ", minimizableCommentFragment=" + this.c + ")";
    }
}
