package a5;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final WindowInsets f395a = p2.f461b.g();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f396b = false;

    public static WindowInsets a(View view, WindowInsets windowInsets) {
        Object tag = view.getTag(2131363396);
        Object tag2 = view.getTag(2131363406);
        final View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = tag instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag : tag2 instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag2 : null;
        WindowInsets windowInsets2 = f395a;
        final WindowInsets[] windowInsetsArr = {windowInsets2};
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: a5.d1
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets3) {
                View.OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                windowInsetsArr[0] = onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, windowInsets3) : view2.onApplyWindowInsets(windowInsets3);
                return f1.f395a;
            }
        });
        view.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view.getTag(2131363391);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets3 = windowInsetsArr[0];
        if (windowInsets3 != null && !windowInsets3.isConsumed() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a(viewGroup.getChildAt(i), windowInsetsArr[0]);
            }
        }
        WindowInsets windowInsets4 = windowInsetsArr[0];
        return windowInsets4 != null ? windowInsets4 : windowInsets2;
    }
}
