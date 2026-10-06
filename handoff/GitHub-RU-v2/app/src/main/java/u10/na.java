package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class na {
    public String a;
    public String b;
    public e50.p c;

    public na(String str, String str2, e50.p pVar) {
        this.a = str;
        this.b = str2;
        this.c = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na)) {
            return false;
        }
        na naVar = (na) obj;
        return k71.k.b(this.a, naVar.a) && k71.k.b(this.b, naVar.b) && k71.k.b(this.c, naVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", discussionCommentsFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
