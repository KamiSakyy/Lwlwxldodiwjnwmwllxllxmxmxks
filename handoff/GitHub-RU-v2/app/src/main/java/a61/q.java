package a61;

import androidx.datastore.core.CorruptionException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q extends k71.l implements j71.c {
    public static final q t;
    public static final q u;
    public final /* synthetic */ int s;

    static {
        int i = 1;
        t = new q(i, 0);
        u = new q(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i, int i2) {
        super(i);
        this.s = i2;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        switch (this.s) {
            case 0:
                k71.k.g((CorruptionException) obj, "ex");
                d0.b();
                break;
            default:
                k71.k.g((CorruptionException) obj, "ex");
                d0.b();
                break;
        }
        return b41.b.n();
    }
}
