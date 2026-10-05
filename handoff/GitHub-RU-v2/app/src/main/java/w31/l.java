package w31;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l extends i {
    public static final int[] E = {2130969772, 2130969774};
    public final AccessibilityManager C;
    public boolean D;

    public l(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.C = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static l k(ViewGroup viewGroup, String str, int i) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3 = null;
        while (true) {
            if (viewGroup instanceof CoordinatorLayout) {
                viewGroup2 = (ViewGroup) viewGroup;
                break;
            }
            if (viewGroup instanceof FrameLayout) {
                if (viewGroup.getId() == 16908290) {
                    viewGroup2 = (ViewGroup) viewGroup;
                    break;
                }
                viewGroup3 = viewGroup;
            }
            if (viewGroup != 0) {
                Object parent = viewGroup.getParent();
                viewGroup = parent instanceof View ? (View) parent : 0;
            }
            if (viewGroup == 0) {
                viewGroup2 = viewGroup3;
                break;
            }
        }
        if (viewGroup2 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup2.getContext();
        LayoutInflater from = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(E);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate((resourceId == -1 || resourceId2 == -1) ? 2131558763 : 2131559327, viewGroup2, false);
        l lVar = new l(context, viewGroup2, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) lVar.i.getChildAt(0)).getMessageView().setText(str);
        lVar.k = i;
        return lVar;
    }

    @Override // w31.i
    public final void a() {
        b(3);
    }

    @Override // w31.i
    public final int d() {
        int i = this.k;
        if (i != -2) {
            int i2 = Build.VERSION.SDK_INT;
            AccessibilityManager accessibilityManager = this.C;
            if (i2 >= 29) {
                return accessibilityManager.getRecommendedTimeoutMillis(i, (this.D ? 4 : 0) | 3);
            }
            if (!this.D || !accessibilityManager.isTouchExplorationEnabled()) {
                return i;
            }
        }
        return -2;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class CoordinatorLayout<T1,T2,T3,T4> {
        public CoordinatorLayout() {
        }
    }
}
