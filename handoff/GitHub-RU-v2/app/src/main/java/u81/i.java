package u81;

import com.google.android.gms.measurement.internal.s;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i extends t81.a {
    public final /* synthetic */ r e;
    public final /* synthetic */ s f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, r rVar, s sVar) {
        super(str, true);
        this.e = rVar;
        this.f = sVar;
    }

    @Override // t81.a
    public final long a() {
        q qVar;
        r rVar = this.e;
        try {
            qVar = rVar.e();
        } catch (Throwable th) {
            qVar = new q(rVar, th, 2);
        }
        s sVar = this.f;
        if (!((CopyOnWriteArrayList) sVar.w).contains(rVar)) {
            return -1L;
        }
        ((LinkedBlockingDeque) sVar.x).put(qVar);
        return -1L;
    }

    public i(Object... a) {
    }
}
