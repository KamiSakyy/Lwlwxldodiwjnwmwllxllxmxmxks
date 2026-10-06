package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mc {
    public String a;
    public String b;
    public is.r c;

    public mc(String str, String str2, is.r rVar) {
        this.a = str;
        this.b = str2;
        this.c = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc)) {
            return false;
        }
        mc mcVar = (mc) obj;
        return k71.k.b(this.a, mcVar.a) && k71.k.b(this.b, mcVar.b) && k71.k.b(this.c, mcVar.c);
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
