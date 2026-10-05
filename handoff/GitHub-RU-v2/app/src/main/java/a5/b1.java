package a5;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: /home/user/work/p/classes.dex */
public final class b1 {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f369d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f370a;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray f371b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f372c;

    public final View a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f370a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View a10 = a(viewGroup.getChildAt(childCount));
                if (a10 != null) {
                    return a10;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(2131363405);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
