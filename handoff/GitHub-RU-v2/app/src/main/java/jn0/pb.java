package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pb {
    public final String a;
    public final String b;
    public final ar0.r c;

    public pb(String str, String str2, ar0.r rVar) {
        this.a = str;
        this.b = str2;
        this.c = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb)) {
            return false;
        }
        pb pbVar = (pb) obj;
        return k71.k.b(this.a, pbVar.a) && k71.k.b(this.b, pbVar.b) && k71.k.b(this.c, pbVar.c);
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
