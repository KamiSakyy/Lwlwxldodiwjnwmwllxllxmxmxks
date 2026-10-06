package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bh implements aaShadow.m0 {
    public ch a;

    public bh(ch chVar) {
        this.a = chVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bh) && k71.k.b(this.a, ((bh) obj).a);
    }

    public final int hashCode() {
        ch chVar = this.a;
        if (chVar == null) {
            return 0;
        }
        return chVar.hashCode();
    }

    public final String toString() {
        return "Data(followUser=" + this.a + ")";
    }
}
