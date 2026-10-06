package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gh {
    public final String a;
    public final String b;
    public final mh c;
    public final yf0.i d;

    public gh(String str, String str2, mh mhVar, yf0.i iVar) {
        this.a = str;
        this.b = str2;
        this.c = mhVar;
        this.d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh)) {
            return false;
        }
        gh ghVar = (gh) obj;
        return k71.k.b(this.a, ghVar.a) && k71.k.b(this.b, ghVar.b) && k71.k.b(this.c, ghVar.c) && k71.k.b(this.d, ghVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        mh mhVar = this.c;
        return this.d.hashCode() + ((i + (mhVar == null ? 0 : mhVar.hashCode())) * 31);
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
