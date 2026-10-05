package ic;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a9 extends k5.f {
    public final FrameLayout N;
    public final ImageView O;
    public final TextView P;
    public final ProgressBar Q;

    public a9(i4 i4Var, View view, FrameLayout frameLayout, ImageView imageView, TextView textView, ProgressBar progressBar) {
        super(0, view, i4Var);
        this.N = frameLayout;
        this.O = imageView;
        this.P = textView;
        this.Q = progressBar;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class i4<T1,T2,T3,T4> {
        public i4() {
        }
    }
}
