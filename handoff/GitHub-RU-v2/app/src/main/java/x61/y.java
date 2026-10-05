package x61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y extends b {
    public int t;
    public int u;
    public final /* synthetic */ z v;

    public y(z zVar) {
        this.v = zVar;
        this.t = zVar.u;
        this.u = zVar.t;
    }

    @Override // x61.b
    public final void a() {
        int i = this.t;
        if (i == 0) {
            this.r = 2;
            return;
        }
        z zVar = this.v;
        Object[] objArr = zVar.r;
        int i2 = this.u;
        this.s = objArr[i2];
        this.r = 1;
        this.u = (i2 + 1) % zVar.s;
        this.t = i - 1;
    }
}
