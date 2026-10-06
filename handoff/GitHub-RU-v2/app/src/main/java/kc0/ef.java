package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ef implements aaShadow.m0 {
    public final ff a;

    public ef(ff ffVar) {
        this.a = ffVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ef) && k71.k.b(this.a, ((ef) obj).a);
    }

    public final int hashCode() {
        ff ffVar = this.a;
        if (ffVar == null) {
            return 0;
        }
        return ffVar.hashCode();
    }

    public final String toString() {
        return "Data(followUser=" + this.a + ")";
    }
}
