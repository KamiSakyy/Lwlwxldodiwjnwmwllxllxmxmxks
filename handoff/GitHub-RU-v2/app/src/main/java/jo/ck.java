package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ck {
    public String a;
    public String b;
    public ik c;
    public ms.i d;

    public ck(String str, String str2, ik ikVar, ms.i iVar) {
        this.a = str;
        this.b = str2;
        this.c = ikVar;
        this.d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck)) {
            return false;
        }
        ck ckVar = (ck) obj;
        return k71.k.b(this.a, ckVar.a) && k71.k.b(this.b, ckVar.b) && k71.k.b(this.c, ckVar.c) && k71.k.b(this.d, ckVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ik ikVar = this.c;
        return this.d.hashCode() + ((i + (ikVar == null ? 0 : ikVar.hashCode())) * 31);
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
