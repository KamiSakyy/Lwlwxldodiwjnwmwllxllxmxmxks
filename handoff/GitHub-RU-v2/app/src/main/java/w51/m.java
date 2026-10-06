package w51;

import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class m implements w21.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ FirebaseMessaging s;

    public /* synthetic */ m(FirebaseMessaging firebaseMessaging, int i) {
        this.r = i;
        this.s = firebaseMessaging;
    }

    @Override // w21.e
    public final void e(Object obj) {
        boolean z;
        switch (this.r) {
            case 0:
                w wVar = (w) obj;
                if (!this.s.e.h() || wVar.h.a() == null) {
                    return;
                }
                synchronized (wVar) {
                    z = wVar.g;
                }
                if (zShadow) {
                    return;
                }
                wVar.f(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.s;
                y11.a aVar = (y11.a) obj;
                n51.h hVar = FirebaseMessaging.k;
                firebaseMessaging.getClass();
                if (aVar != null) {
                    sy.s.k(aVar.r);
                    firebaseMessaging.h();
                    return;
                }
                return;
        }
    }
}
