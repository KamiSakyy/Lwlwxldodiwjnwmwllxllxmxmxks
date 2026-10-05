package w2;

import android.content.Context;
import android.os.Build;
import android.os.Vibrator;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class n1 {
    public static boolean a(Context context) {
        return Build.VERSION.SDK_INT >= 31 && ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
    }
}
