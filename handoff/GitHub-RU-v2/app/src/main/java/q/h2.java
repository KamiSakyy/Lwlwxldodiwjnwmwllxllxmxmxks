package q;

/* loaded from: /home/user/work/p/classes.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public int f30595a;

    /* renamed from: b, reason: collision with root package name */
    public int f30596b;

    /* renamed from: c, reason: collision with root package name */
    public int f30597c;

    /* renamed from: d, reason: collision with root package name */
    public int f30598d;

    /* renamed from: e, reason: collision with root package name */
    public int f30599e;

    /* renamed from: f, reason: collision with root package name */
    public int f30600f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30601g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30602h;

    public final void a(int i, int i10) {
        this.f30597c = i;
        this.f30598d = i10;
        this.f30602h = true;
        if (this.f30601g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f30595a = i10;
            }
            if (i != Integer.MIN_VALUE) {
                this.f30596b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f30595a = i;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f30596b = i10;
        }
    }
}
