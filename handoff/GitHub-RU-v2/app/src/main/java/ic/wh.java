package ic;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: /home/user/work/p/classes.dex */
public final class wh {
    public static int a(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return resources.getConfiguration().orientation == 1 ? displayMetrics.widthPixels : displayMetrics.heightPixels;
    }
}
