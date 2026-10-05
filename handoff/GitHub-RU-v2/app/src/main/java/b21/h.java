package b21;

import com.google.android.gms.internal.measurement.h0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements b {
    public final /* synthetic */ d a;

    public h(d dVar) {
        this.a = dVar;
    }

    @Override // b21.b
    public final void a(boolean z) {
        h0 h0Var = this.a.D;
        h0Var.sendMessage(h0Var.obtainMessage(1, Boolean.valueOf(z)));
    }
}
