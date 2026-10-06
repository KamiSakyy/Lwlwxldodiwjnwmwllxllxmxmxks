package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class r0 extends q0 {
    public boolean k;

    @Override // da1.q0
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ q0 f() {
        f();
        return this;
    }

    @Override // da1.q0, da1.s0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void f_dup() {
        super.f();
        this.k = true;
    }

    public final String toString() {
        boolean z = this.k;
        String str = z ? "<!" : "<?";
        String str2 = z ? ">" : "?>";
        ca1.bShadow bVar = this.g;
        if (bVar == null || bVar.size() <= 0) {
            StringBuilder p = f1.e.p(str);
            p.append(n());
            p.append(str2);
            return p.toString();
        }
        StringBuilder p2 = f1.e.p(str);
        p2.append(n());
        p2.append(" ");
        p2.append(this.g.toString());
        p2.append(str2);
        return p2.toString();
    }

    public r0(Object... a) {
    }
}
