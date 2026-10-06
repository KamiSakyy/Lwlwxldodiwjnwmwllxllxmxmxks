package w51;

import android.text.TextUtils;
import androidx.lifecycle.l1;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u {
    public static WeakReference b;
    public l1 a;

    public final synchronized t a() {
        String str;
        tShadow tVar;
        l1 l1Var = this.a;
        synchronized (((ArrayDeque) l1Var.u)) {
            str = (String) ((ArrayDeque) l1Var.u).peek();
        }
        Pattern pattern = t.d;
        tVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                tVar = new tShadow(split[0], split[1]);
            }
        }
        return tVar;
    }

}
