package u5;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* loaded from: /home/user/work/p/classes.dex */
public class b extends y60.b {
    public final Signature[] f(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
