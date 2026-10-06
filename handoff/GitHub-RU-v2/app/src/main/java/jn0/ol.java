package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ol {
    public String a;
    public qs0.d b;

    public ol(String str, qs0.d dVar) {
        this.a = str;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ol)) {
            return false;
        }
        ol olVar = (ol) obj;
        return k71.k.b(this.a, olVar.a) && k71.k.b(this.b, olVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", mentionableItem=" + this.b + ")";
    }
}
