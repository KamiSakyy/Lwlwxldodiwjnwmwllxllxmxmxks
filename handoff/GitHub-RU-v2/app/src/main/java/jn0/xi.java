package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xi {
    public final String a;
    public final String b;
    public final dj c;
    public final er0.i d;

    public xi(String str, String str2, dj djVar, er0.i iVar) {
        this.a = str;
        this.b = str2;
        this.c = djVar;
        this.d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi)) {
            return false;
        }
        xi xiVar = (xi) obj;
        return k71.k.b(this.a, xiVar.a) && k71.k.b(this.b, xiVar.b) && k71.k.b(this.c, xiVar.c) && k71.k.b(this.d, xiVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        dj djVar = this.c;
        return this.d.hashCode() + ((i + (djVar == null ? 0 : djVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Answer(__typename=", this.a, ", id=", this.b, ", replyTo=");
        o.append(this.c);
        o.append(", discussionCommentFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
