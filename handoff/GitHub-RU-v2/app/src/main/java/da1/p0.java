package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class p0 extends q0 {
    @Override // da1.q0, da1.s0
    /* renamed from: m */
    public final q0 f() {
        super.f();
        this.g = null;
        return this;
    }

    public final String toString() {
        String str = this.f ? "/>" : ">";
        ca1.bShadow bVar = this.g;
        if (bVar == null || bVar.size() <= 0) {
            return "<" + n() + str;
        }
        return "<" + n() + " " + this.g.toString() + str;
    }

    public p0(Object... a) {
    }
}
