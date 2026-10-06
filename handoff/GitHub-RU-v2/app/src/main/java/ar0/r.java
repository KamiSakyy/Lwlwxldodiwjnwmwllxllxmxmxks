package ar0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements aa.h0 {
    public String a;
    public String b;
    public o c;
    public gu0.c d;

    public r(String str, String str2, o oVar, gu0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
        this.d = cVar;
    }

    public static r a(r rVar, o oVar) {
        return new r(rVar.a, rVar.b, oVar, rVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c) && k71.k.b(this.d, rVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DiscussionCommentsFragment(__typename=", this.a, ", id=", this.b, ", comments=");
        o.append(this.c);
        o.append(", reactionFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
