package e9;

import android.content.ComponentName;
import android.content.Context;
import v8.x;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class k {
    static {
        x.b("PackageManagerHelper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        v8.x.a().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, Class cls, boolean z10) {
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z11 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z11 = true;
            }
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            x.a().getClass();
        } catch (Exception unused) {
            x.a().getClass();
        }
    }



}
