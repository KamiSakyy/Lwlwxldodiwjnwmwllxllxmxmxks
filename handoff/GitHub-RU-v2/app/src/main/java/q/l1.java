package q;

import android.widget.AbsListView;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class l1 {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z10) {
        absListView.setSelectedChildViewEnabled(z10);
    }
}
