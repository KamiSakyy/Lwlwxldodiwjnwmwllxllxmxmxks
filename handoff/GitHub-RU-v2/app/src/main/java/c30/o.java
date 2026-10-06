package c30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o {
    public String a;
    public o50.a b;

    public o(String str, o50.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MarkDownFileLine(__typename=" + this.a + ", fileLineFragment=" + this.b + ")";
    }
}
