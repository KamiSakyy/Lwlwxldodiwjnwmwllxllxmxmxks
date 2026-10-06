package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class eg {
    public String a;
    public String b;
    public kg c;
    public i50.h d;

    public eg(String str, String str2, kg kgVar, i50.h hVar) {
        this.a = str;
        this.b = str2;
        this.c = kgVar;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg)) {
            return false;
        }
        eg egVar = (eg) obj;
        return k71.k.b(this.a, egVar.a) && k71.k.b(this.b, egVar.b) && k71.k.b(this.c, egVar.c) && k71.k.b(this.d, egVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        kg kgVar = this.c;
        return this.d.hashCode() + ((i + (kgVar == null ? 0 : kgVar.hashCode())) * 31);
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
