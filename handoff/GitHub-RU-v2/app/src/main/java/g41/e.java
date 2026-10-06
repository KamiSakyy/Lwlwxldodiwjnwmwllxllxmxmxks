package g41;

import a81.t;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e extends c41.d {
    public final t g;
    public final w21.g h;
    public final /* synthetic */ f i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, w21.g gVar) {
        super(2);
        t tVar = new t("OnRequestInstallCallback", 5);
        this.i = fVar;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.g = tVar;
        this.h = gVar;
    }
    public Object z(Object p1, Object p2, Object p3) { return null; }
}
