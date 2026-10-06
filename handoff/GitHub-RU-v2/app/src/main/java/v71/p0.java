package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class p0 implements a1 {
    public boolean r;

    public p0(boolean z) {
        this.r = z;
    }

    @Override // v71.a1
    public final boolean f() {
        return this.r;
    }

    @Override // v71.a1
    public final l1 g() {
        return null;
    }

    public final String toString() {
        return a0.s0.m(new StringBuilder("Empty{"), this.r ? "Active" : "New", '}');
    }
}
