package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v {
    public final String a;
    public final String b;
    public final os.i c;

    public v(String str, String str2, os.i iVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b) && k71.k.b(this.c, vVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Poll(__typename=", this.a, ", id=", this.b, ", discussionPollFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
