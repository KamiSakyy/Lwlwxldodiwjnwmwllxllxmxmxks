package a61;

import android.content.Context;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r extends k71.l implements j71.a {
    public final /* synthetic */ int s;
    public final /* synthetic */ Context t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Context context, int i) {
        super(0);
        this.s = i;
        this.t = context;
    }

    @Override // j71.a
    public final Object a() {
        switch (this.s) {
            case 0:
                return k21.f.z(this.t, e0.b);
            default:
                return k21.f.z(this.t, e0.a);
        }
    }
}
