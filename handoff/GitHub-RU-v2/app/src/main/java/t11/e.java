package t11;

import android.content.Context;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements o11.b {
    public final /* synthetic */ int a;
    public v61.a b;

    public /* synthetic */ e(v61.a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // v61.a
    public final Object get() {
        switch (this.a) {
            case 0:
                String packageName = ((Context) this.b.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new k(Integer.valueOf(k.u).intValue(), (Context) this.b.get(), "com.google.android.datatransport.events");
        }
    }
}
