package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bk {
    public vj a;

    public bk(vj vjVar) {
        this.a = vjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bk) && k71.k.b(this.a, ((bk) obj).a);
    }

    public final int hashCode() {
        vj vjVar = this.a;
        if (vjVar == null) {
            return 0;
        }
        return vjVar.hashCode();
    }

    public final String toString() {
        return "OnDiscussion(mentionableItems=" + this.a + ")";
    }
}
