package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bm {
    public yl a;

    public bm(yl ylVar) {
        this.a = ylVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bm) && k71.k.b(this.a, ((bm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(mentionableUsers=" + this.a + ")";
    }
}
