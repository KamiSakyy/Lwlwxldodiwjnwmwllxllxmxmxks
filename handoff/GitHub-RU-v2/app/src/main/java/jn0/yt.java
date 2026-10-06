package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yt implements aaShadow.m0 {
    public zt a;

    public yt(zt ztVar) {
        this.a = ztVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yt) && k71.k.b(this.a, ((yt) obj).a);
    }

    public final int hashCode() {
        zt ztVar = this.a;
        if (ztVar == null) {
            return 0;
        }
        return ztVar.hashCode();
    }

    public final String toString() {
        return "Data(removeStar=" + this.a + ")";
    }
}
