package p41;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class e implements p51.b {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // p51.b
    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                return null;
            case 2:
                k kVar = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                detectNetwork.detectResourceMismatches();
                detectNetwork.detectUnbufferedIo();
                return new q41.g(Executors.newFixedThreadPool(4, new q41.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                k kVar2 = ExecutorsRegistrar.a;
                return new q41.g(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new q41.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                k kVar3 = ExecutorsRegistrar.a;
                return new q41.g(Executors.newCachedThreadPool(new q41.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 5:
                k kVar4 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new q41.a("Firebase Scheduler", 0, null));
            default:
                n51.h hVar = FirebaseMessaging.k;
                return null;
        }
    }
    public Object z(Object p1, Object p2, Object p3) { return null; }
}
