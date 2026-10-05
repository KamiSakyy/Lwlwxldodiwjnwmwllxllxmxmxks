package q;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        Object obj = Boolean.FALSE;
        try {
            obj = b1.d("getHorizontallyScrolling").invoke(textView, null);
        } catch (Exception unused) {
        }
        return ((Boolean) obj).booleanValue();
    }
}
