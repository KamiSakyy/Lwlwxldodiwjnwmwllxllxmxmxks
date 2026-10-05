package ba1;

import java.lang.ref.SoftReference;
import java.util.ArrayDeque;
import java.util.IdentityHashMap;
import java.util.function.Supplier;

/* loaded from: /home/user/work/p/classes5.dex */
public final /* synthetic */ class b implements Supplier {
    public final /* synthetic */ int a;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new SoftReference(new ArrayDeque());
            case 1:
                return new StringBuilder(1024);
            case 2:
                return new char[2];
            case 3:
                return new String[512];
            case 4:
                return new char[2048];
            default:
                return new IdentityHashMap();
        }
    }
}
