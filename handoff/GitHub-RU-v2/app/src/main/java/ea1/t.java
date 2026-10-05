package ea1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class t extends y {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(n nVar, int i) {
        super(nVar);
        this.c = i;
    }

    @Override // ea1.n
    public final int a() {
        switch (this.c) {
        }
        return this.a.a() + 2;
    }

    public final String toString() {
        switch (this.c) {
            case 0:
                return String.format("%s ", this.a);
            case 1:
                return String.format(":is(%s)", this.a);
            default:
                return String.format(":not(%s)", this.a);
        }
    }
}
