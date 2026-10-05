package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xj {
    public final String a;
    public final gh0.d b;

    public xj(String str, gh0.d dVar) {
        this.a = str;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj)) {
            return false;
        }
        xj xjVar = (xj) obj;
        return k71.k.b(this.a, xjVar.a) && k71.k.b(this.b, xjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", mentionableItem=" + this.b + ")";
    }
}
