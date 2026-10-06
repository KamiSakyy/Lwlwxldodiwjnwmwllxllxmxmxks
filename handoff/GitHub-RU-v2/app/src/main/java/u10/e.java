package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public final String a;
    public final String b;
    public final y50.a c;

    public e(String str, String str2, y50.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", issueCommentFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
