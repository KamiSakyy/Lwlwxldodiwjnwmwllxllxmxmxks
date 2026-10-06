package b41;

import a81.t;
import android.os.Bundle;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class hShadow extends c41.d implements c41.i {
    public final t g;
    public final w21.g h;
    public final /* synthetic */ k i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, t tVar, w21.g gVar) {
        super(0);
        this.i = kVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.g = tVar;
        this.h = gVar;
    }

    @Override // c41.i
    public void c(Bundle bundle) {
        this.i.a.c(this.h);
        this.g.g("onCompleteUpdate", new Object[0]);
    }

    @Override // c41.i
    public void u(Bundle bundle) {
        this.i.a.c(this.h);
        this.g.g("onRequestInfo", new Object[0]);
    }
}
