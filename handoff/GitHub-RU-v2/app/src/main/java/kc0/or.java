package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class or {
    public final String a;
    public final aj0.c b;

    public or(aj0.c cVar, String str) {
        k71.k.g(cVar, "reactionFragment");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or)) {
            return false;
        }
        or orVar = (or) obj;
        return k71.k.b(this.a, orVar.a) && k71.k.b(this.b, orVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Subject(__typename=" + this.a + ", reactionFragment=" + this.b + ")";
    }
}
