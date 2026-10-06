package n51;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;
import p41.o;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class b implements p41.d {
    public final /* synthetic */ int r;
    public final /* synthetic */ o s;

    public /* synthetic */ b(o oVar, int i) {
        this.r = i;
        this.s = oVar;
    }

    @Override // p41.d
    public final Object f(androidx.lifecycle.b bVar) {
        FirebaseMessaging lambda$getComponents$0;
        switch (this.r) {
            case 0:
                return new d((Context) bVar.a(Context.class), ((k41.g) bVar.a(k41.g.class)).d(), bVar.g(o.a(e.class)), bVar.e(y51.b.class), (Executor) bVar.b(this.s));
            default:
                lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(this.s, bVar);
                return lambda$getComponents$0;
        }
    }
    public Object a(Object p1) { return null; }
    public Object b(Object p1) { return null; }
    public Object e(Object p1) { return null; }
    public Object g(Object p1) { return null; }
}
