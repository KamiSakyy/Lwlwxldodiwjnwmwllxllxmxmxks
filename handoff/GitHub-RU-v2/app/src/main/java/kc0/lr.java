package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lr {
    public String a;
    public aj0.c b;

    public lr(aj0.c cVar, String str) {
        k71.k.g(cVar, "reactionFragment");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr)) {
            return false;
        }
        lr lrVar = (lr) obj;
        return k71.k.b(this.a, lrVar.a) && k71.k.b(this.b, lrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Reactable(__typename=" + this.a + ", reactionFragment=" + this.b + ")";
    }
}
