package v41;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ l b;

    public k(l lVar, long j) {
        this.b = lVar;
        this.a = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.a);
        this.b.k.h(bundle);
        return null;
    }
}
