package com.github.rudroid.utilities;

import android.util.SparseArray;
import android.view.View;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends a5.b {
    public final /* synthetic */ SparseArray u;

    public a(SparseArray sparseArray) {
        this.u = sparseArray;
    }

    public final void d(View view, b5.f fVar) {
        k71.k.g(view, "v");
        ((a5.b) this).r.onInitializeAccessibilityNodeInfo(view, fVar.a);
        SparseArray sparseArray = this.u;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            fVar.b(new b5.b(sparseArray.keyAt(i), (CharSequence) sparseArray.valueAt(i)));
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class RecyclerView {
        public RecyclerView() {
        }
    }

    public a(Object... a) {
    }
    public Object ordinal() { return null; }
}
