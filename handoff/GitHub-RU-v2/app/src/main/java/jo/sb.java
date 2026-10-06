package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sb {
    public final String a;
    public final String b;
    public final ks.b c;

    public sb(String str, String str2, ks.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb)) {
            return false;
        }
        sb sbVar = (sb) obj;
        return k71.k.b(this.a, sbVar.a) && k71.k.b(this.b, sbVar.b) && k71.k.b(this.c, sbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DiscussionCategory(__typename=", this.a, ", id=", this.b, ", discussionCategoryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
