package e2;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class m implements i {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21892r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f21893s;

    public /* synthetic */ m(q qVar, int i) {
        this.f21892r = i;
        this.f21893s = qVar;
    }

    @Override // e2.i
    public final double c(double d10) {
        switch (this.f21892r) {
            case k5.f.J /* 0 */:
                return aa1.b.t(this.f21893s.f21907k.c(d10), r10.f21902e, r10.f21903f);
            default:
                return this.f21893s.f21908n.c(aa1.b.t(d10, r0.f21902e, r0.f21903f));
        }
    }
}
