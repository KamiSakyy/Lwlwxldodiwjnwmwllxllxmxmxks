package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wc implements aaShadow.m0 {
    public xc a;

    public wc(xc xcVar) {
        this.a = xcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wc) && k71.k.b(this.a, ((wc) obj).a);
    }

    public final int hashCode() {
        xc xcVar = this.a;
        if (xcVar == null) {
            return 0;
        }
        return xcVar.hashCode();
    }

    public final String toString() {
        return "Data(enablePullRequestAutoMerge=" + this.a + ")";
    }
}
