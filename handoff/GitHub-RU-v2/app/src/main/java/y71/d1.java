package y71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d1 implements i {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ i[] s;
    public final /* synthetic */ c71.j t;

    public d1(i[] iVarArr, j71.h hVar) {
        this.s = iVarArr;
        this.t = (c71.j) hVar;
    }

    @Override // y71.i
    public final Object b(j jVar, a71.c cVar) {
        switch (this.r) {
            case 0:
                Object a = z71.b.a(cVar, e1.r, new c1((a71.c) null, (j71.h) this.t), jVar, this.s);
                if (a != b71.a.r) {
                    break;
                }
                break;
            default:
                Object a2 = z71.b.a(cVar, e1.r, new c1((a71.c) null, (j71.i) this.t), jVar, this.s);
                if (a2 != b71.a.r) {
                    break;
                }
                break;
        }
        return w61.a0.a;
    }

    public d1(i[] iVarArr, j71.i iVar) {
        this.s = iVarArr;
        this.t = (c71.j) iVar;
    }
}
