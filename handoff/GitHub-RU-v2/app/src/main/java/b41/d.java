package b41;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements c41.c {
    public final /* synthetic */ int r;
    public y51.c s;

    public /* synthetic */ d(y51.c cVar, int i) {
        this.r = i;
        this.s = cVar;
    }

    @Override // c41.c
    public final Object c() {
        switch (this.r) {
            case 0:
                return new c(((a7.d) this.s.s).a);
            default:
                return new l(((a7.d) this.s.s).a);
        }
    }
}
