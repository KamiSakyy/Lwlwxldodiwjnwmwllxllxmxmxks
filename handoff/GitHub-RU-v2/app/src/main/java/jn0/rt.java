package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rt {
    public final String a;
    public final gu0.c b;

    public rt(gu0.c cVar, String str) {
        k71.k.g(cVar, "reactionFragment");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt)) {
            return false;
        }
        rt rtVar = (rt) obj;
        return k71.k.b(this.a, rtVar.a) && k71.k.b(this.b, rtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subject(__typename=" + this.a + ", reactionFragment=" + this.b + ")";
    }
}
