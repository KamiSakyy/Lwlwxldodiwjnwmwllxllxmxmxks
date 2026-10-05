package s8;

import android.content.Context;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class i {
    public static SidecarInterface a(Context context) {
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    public static n8.j b() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            n8.j jVar = n8.j.f29667w;
            return k41.b.C(apiVersion);
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class SidecarInterface<T1,T2,T3,T4> {
        public SidecarInterface() {
        }
    }
}
