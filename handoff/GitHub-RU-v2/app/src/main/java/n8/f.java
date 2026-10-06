package n8;

import androidx.window.extensions.WindowExtensionsProvider;
import k71.xShadow;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class f {
    static {
        xShadow.a(f.class).c();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            int i = c.f29652a;
            i iVar = i.f29665r;
            return 0;
        } catch (NullPointerException unused2) {
            int i10 = c.f29652a;
            i iVar2 = i.f29665r;
            return 0;
        } catch (UnsupportedOperationException unused3) {
            int i11 = c.f29652a;
            i iVar3 = i.f29665r;
            return 0;
        }
    }
    public f(Object p1, Object p2) {
    }
}
