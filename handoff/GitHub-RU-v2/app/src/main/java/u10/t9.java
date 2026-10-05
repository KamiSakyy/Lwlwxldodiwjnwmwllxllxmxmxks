package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t9 {
    public final String a;
    public final String b;
    public final g50.b c;

    public t9(String str, String str2, g50.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) obj;
        return k71.k.b(this.a, t9Var.a) && k71.k.b(this.b, t9Var.b) && k71.k.b(this.c, t9Var.c);
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
