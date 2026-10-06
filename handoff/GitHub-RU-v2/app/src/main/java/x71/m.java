package x71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class m extends n {
    public Throwable a;

    public m(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return k71.k.b(this.a, ((m) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // x71.n
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
