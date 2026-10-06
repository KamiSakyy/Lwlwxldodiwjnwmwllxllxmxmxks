package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class va {
    public final String a;
    public final String b;
    public final cr0.b c;

    public va(String str, String str2, cr0.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof va)) {
            return false;
        }
        va vaVar = (va) obj;
        return k71.k.b(this.a, vaVar.a) && k71.k.b(this.b, vaVar.b) && k71.k.b(this.c, vaVar.c);
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
