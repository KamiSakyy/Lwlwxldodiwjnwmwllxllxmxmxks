package m11;

import com.google.android.gms.measurement.internal.h2;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import z70.m3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements o11.b {
    public final /* synthetic */ int a;

    @Override // v61.a
    public final Object get() {
        switch (this.a) {
            case 0:
                return new h2(2, Executors.newSingleThreadExecutor());
            default:
                m3 m3Var = new m3(8);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(j11.d.r, new s11.c(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(j11.d.t, new s11.c(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(s11.d.s)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(j11.d.s, new s11.c(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < j11.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new s11.b(m3Var, hashMap);
        }
    }
}
