package rm0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s1 implements y71.i {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.i s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ int v;

    public /* synthetic */ s1(y71.i iVar, String str, String str2, int i, int i2) {
        this.r = i2;
        this.s = iVar;
        this.t = str;
        this.u = str2;
        this.v = i;
    }

    public final Object b(y71.j jVar, a71.c cVar) {
        switch (this.r) {
            case 0:
                Object b = this.s.b(new r1(jVar, this.t, this.u, this.v, 0), cVar);
                if (b != b71.a.r) {
                    break;
                }
                break;
            case 1:
                Object b2 = this.s.b(new r1(jVar, this.t, this.u, this.v, 1), cVar);
                if (b2 != b71.a.r) {
                    break;
                }
                break;
            case 2:
                Object b3 = this.s.b(new r1(jVar, this.t, this.u, this.v, 2), cVar);
                if (b3 != b71.a.r) {
                    break;
                }
                break;
            default:
                Object b4 = this.s.b(new r1(jVar, this.t, this.u, this.v, 3), cVar);
                if (b4 != b71.a.r) {
                    break;
                }
                break;
        }
        return w61.a0.a;
    }
}
