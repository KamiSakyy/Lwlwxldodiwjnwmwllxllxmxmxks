package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yj {
    public final String a;
    public final gh0.d b;

    public yj(String str, gh0.d dVar) {
        this.a = str;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj)) {
            return false;
        }
        yj yjVar = (yj) obj;
        return k71.k.b(this.a, yjVar.a) && k71.k.b(this.b, yjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node2(__typename=" + this.a + ", mentionableItem=" + this.b + ")";
    }
}
