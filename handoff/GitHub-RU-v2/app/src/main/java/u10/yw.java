package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yw {
    public final String a;
    public final String b;
    public final w50.l c;

    public yw(String str, String str2, w50.l lVar) {
        this.a = str;
        this.b = str2;
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw)) {
            return false;
        }
        yw ywVar = (yw) obj;
        return k71.k.b(this.a, ywVar.a) && k71.k.b(this.b, ywVar.b) && k71.k.b(this.c, ywVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Issue(__typename=", this.a, ", id=", this.b, ", issueListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
